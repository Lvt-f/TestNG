package imooctest;

import org.testng.annotations.*;


/**
 * Testcase和Test类怎样创建
 * TestSuite举例
 * 1.TestSuite可以有冒烟测试的测试套件
 * 2。TestSuite可以有回归测试的测试套件
 * 问：如何一次运行多个测试类？
 *
 *
 * */
public class TestNG_TestClass1 {
    @BeforeClass
    public void setUp(){
        System.out.println("\nTestNG_TestClass1-->BeforeClass--在类里所有注解的方法运行之前跑");
    }
    @AfterClass
    public void clearUp(){
        System.out.println("\nTestNG_TestClass1-->AfterClass--在类里所有注解的方法运行之后跑");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("\nTestNG_TestClass1-->beforeMethod--每一个test跑之前会运行此方法");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("\nTestNG_TestClass1-->afterMethod--每一个test跑之后会运行此方法");
    }

    @Test
    public void testMethod1(){
        System.out.println("\nTestNG_TestClass1-->testMethod1->第一个测试方法运行");
    }
    @Test
    public void testMethod2(){
        System.out.println("\nTestNG_TestClass1-->testMethod2->第2个测试方法运行");
    }
}
