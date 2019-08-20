package MyUnit;

import java.lang.reflect.Method;
import java.util.*;

public class MyUnit {
    public static void start(Class testClass){
        if(testClass == null){
            throw new RuntimeException("Argument must be not null!");
        }

        Method[] methods = testClass.getDeclaredMethods();

        List<Method> beforeSuites = new ArrayList<>();
        List<Method> afterSuites = new ArrayList<>();
        Map<Integer, List<Method>> tests = new HashMap<>();

        for (Method method : methods) {
            if(method.getAnnotation(Test.class) != null) {
                Test annotation = method.getAnnotation(Test.class);
                int weight = annotation.weight();
                List<Method> testsList = tests.get(weight);
                if(testsList == null){
                    testsList = new ArrayList<>();
                }
                testsList.add(method);
                tests.put(weight, testsList);
            } else if(method.getAnnotation(BeforeSuite.class) != null){
                beforeSuites.add(method);
            } else if(method.getAnnotation(AfterSuite.class) != null){
                afterSuites.add(method);
            }
        }

        if(beforeSuites.size() != 1){
            throw new RuntimeException("Class must have single @BeforeSuite annotated method");
        }
        if(afterSuites.size() != 1){
            throw new RuntimeException("Class must have single @AfterSuite annotated method");
        }

        try {
            Object instance = testClass.newInstance();
            Object[] args = new Object[0];

            beforeSuites.get(0).invoke(instance, args);
            for(int i = 10; i > 0; i--){
                if(tests.get(i) != null && tests.get(i).size() > 0){
                    for(Method m : tests.get(i)){
                        m.invoke(instance, args);
                    }
                }
            }
            afterSuites.get(0).invoke(instance, args);

            System.out.println("Tests passed");
        } catch(Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
