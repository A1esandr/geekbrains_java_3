package Samples;

import MyUnit.MyUnit;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        System.out.println("Start example");
        MyUnit.start(TestClass.class, null);
        MyUnit.start(null, TestClass.class.getName());
    }
}
