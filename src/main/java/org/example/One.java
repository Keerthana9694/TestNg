package org.example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class One {
    @Test
    public void test()
    {
        System.out.println("hi 1");
    }

    @BeforeTest
    public void test7()
    {
        System.out.println("before test ");
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
