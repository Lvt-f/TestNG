package regressionsuite;

import base.BaseTestSuite;
import org.testng.annotations.*;


/**
 * @BeforeSuite和@AfterSUite
 * @BeforeSuite：在test suite中的所有test运行之前运行，只运行一次
 * @AfterSUite：在test suite中的所有test运行之后运行，只运行一次
 * */
public class TestNG_TestClass1 extends BaseTestSuite {
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
