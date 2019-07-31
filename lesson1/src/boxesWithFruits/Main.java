package boxesWithFruits;

public class Main {
    public static void main(String[] args){
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> boxWithApples = new Box<>();
        Box<Apple> boxWithApples2 = new Box<>();
        Box<Orange> boxWithOranges = new Box<>();
        Box<Orange> boxWithOranges2 = new Box<>();

        System.out.println(String.format("Weights of boxWithApples: %s", boxWithApples.getWeight().toString()));
        System.out.println(String.format("Weights of boxWithApples2: %s", boxWithApples2.getWeight().toString()));
        System.out.println(String.format("Weights of boxWithOranges: %s", boxWithOranges.getWeight().toString()));
        System.out.println(String.format("Weights of boxWithOranges2: %s", boxWithOranges2.getWeight().toString()));

        System.out.println("Add some fruits");

        boxWithApples.addFruit(apple);
        boxWithApples.addFruit(apple);
        boxWithApples.addFruit(apple);

        boxWithOranges.addFruit(orange);
        boxWithOranges.addFruit(orange);

        System.out.println(String.format("Weights of boxWithApples: %s", boxWithApples.getWeight().toString()));
        System.out.println(String.format("Weights of boxWithApples2: %s", boxWithApples2.getWeight().toString()));
        System.out.println(String.format("Weights of boxWithOranges: %s", boxWithOranges.getWeight().toString()));
        System.out.println(String.format("Weights of boxWithOranges2: %s", boxWithOranges2.getWeight().toString()));

        System.out.println("Compare boxes");
        System.out.println(String.format("Is weights of boxWithApples and boxWithApples2 equals? %s",
                boxWithApples.compare(boxWithApples2)));
        System.out.println(String.format("Is weights of boxWithApples2 and boxWithOranges2 equals? %s",
                boxWithApples2.compare(boxWithOranges2)));
        System.out.println(String.format("Is weights of boxWithApples and boxWithOranges equals? %s",
                boxWithApples.compare(boxWithOranges)));
        System.out.println(String.format("Is weights of boxWithApples2 and boxWithOranges equals? %s",
                boxWithApples2.compare(boxWithOranges)));

        System.out.println("Pour fruits");

        boxWithApples.pourTo(boxWithApples2);

        System.out.println(String.format("Weights of boxWithApples: %s", boxWithApples.getWeight().toString()));
        System.out.println(String.format("Weights of boxWithApples2: %s", boxWithApples2.getWeight().toString()));
        System.out.println(String.format("Weights of boxWithOranges: %s", boxWithOranges.getWeight().toString()));
        System.out.println(String.format("Weights of boxWithOranges2: %s", boxWithOranges2.getWeight().toString()));

        System.out.println(String.format("Is weights of boxWithApples and boxWithApples2 equals? %s",
                boxWithApples.compare(boxWithApples2)));
        System.out.println(String.format("Is weights of boxWithApples2 and boxWithOranges2 equals? %s",
                boxWithApples2.compare(boxWithOranges2)));
        System.out.println(String.format("Is weights of boxWithApples and boxWithOranges equals? %s",
                boxWithApples.compare(boxWithOranges)));
        System.out.println(String.format("Is weights of boxWithApples2 and boxWithOranges equals? %s",
                boxWithApples2.compare(boxWithOranges)));
    }
}
