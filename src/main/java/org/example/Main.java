package org.example;

import org.testng.Assert;
import org.testng.annotations.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    @Parameters({"URL"})
    @AfterTest(groups = {"Smoke"})
    public void test5(String url)
    {
        System.out.println("Im after test");
        System.out.println(url);
    }
    @BeforeTest
    public void test6()
    {
        System.out.println("Im before test");
    }
    @AfterClass(groups ={"smoke"})
    public void test7()
    {
        System.out.println("Im after class");
    }
    @BeforeClass(groups={"smoke"})
    public void test8()
    {
        System.out.println("Im before class");
    }
    @BeforeSuite(groups={"smoke"})
    public void test9()
    {
        System.out.println("Im before suite");
    }
    @BeforeMethod(groups={"smoke"})
    public void test10()
    {
        System.out.println("Im before method");
    }
    @AfterSuite(groups={"smoke"})
    public void test11()
    {
        System.out.println("Im after suite");
    }
    @AfterMethod (groups={"smoke"}
    )
    public void test12()
    {
        System.out.println("Im after method");
    }
    @Test(groups = {"Smoke"})
    public void test()
    {
        System.out.println("hellp");
    }
    @Test(groups = {"Smoke"})
    public void test1()
    {
        System.out.println("hellp1");
    }

    @Test(dataProvider ="ImData",groups = {"Smoke"})
    public void test13(String one , String two , String three)
    {

        System.out.println("hellp13");
        System.out.print(one);
        System.out.print(two);
        System.out.print(three);
    }

    @Test(dependsOnMethods = {"test13"})
    public void test2()
    {
        System.out.println("hellp122");
        Assert.fail();
    }

    @DataProvider
    public Object[][] ImData()
    {
        Object[][] ob = {{"name","keerthana", "CA"},{"name2", "Baargav", "Doc"},{"name3", "sasi", "CA"}};

        return ob;
    }

}