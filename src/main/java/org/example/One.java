package org.example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class One {
    @Test
    public void test()
    {
        System.out.println("hi 10");
         System.out.println("hi 3");
        System.out.println("hi 9");
         System.out.println("hi 2");
    }

    @BeforeTest
    public void test7()
    {
        System.out.println("before test ");
        System.out.println("before test added ");
    }

    @AfterTest
    public void test3()
    {
        System.out.println("after test ");
    }

    @Test
    public void test1()
    {
        System.out.println("bye 1");
    }
}
