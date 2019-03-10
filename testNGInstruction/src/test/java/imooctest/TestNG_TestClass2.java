package imooctest;

import org.testng.annotations.*;

public class TestNG_TestClass2 {
    @BeforeClass
    public void setUp(){
        System.out.println("\nTestNG_TestClass2-->BeforeClass--在类里所有注解的方法运行之前跑");
    }
    @AfterClass
    public void clearUp(){
        System.out.println("\nTestNG_TestClass2-->AfterClass--在类里所有注解的方法运行之后跑");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("\nTestNG_TestClass2-->beforeMethod--每一个test跑之前会运行此方法");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("\nTestNG_TestClass2-->afterMethod--每一个test跑之后会运行此方法");
    }

    @Test
    public void testMethod1(){
        System.out.println("\nTestNG_TestClass2-->testMethod1->第一个测试方法运行");
    }
    @Test
    public void testMethod2(){
        System.out.println("\nTestNG_TestClass2-->testMethod2->第2个测试方法运行");
    }
}
