package Samples;

import MyUnit.AfterSuite;
import MyUnit.BeforeSuite;
import MyUnit.Test;

public class TestClass {
    public TestClass(){}

    @BeforeSuite
    public void init(){
        System.out.println("This is init method");
    }

    @Test(weight = 1)
    public void testA(){
        System.out.println("This is testA method");
    }

    @Test(weight = 10)
    public void testB(){
        System.out.println("This is testB method");
    }

    @Test(weight = 5)
    public void testC(){
        System.out.println("This is testC method");
    }

    @Test
    public void testD(){
        System.out.println("This is testD method");
    }

    @AfterSuite
    public void clear(){
        System.out.println("This is clear method");
    }
}
