package base;

import org.testng.annotations.*;

/**
 * @BeforeTest和@AfterTest
 * @BeforeTest：在xml文件中的test标签中的每个test方法运行之前运行
 * @AfterTest：在xml文件中的test标签中的每个test方法运行之后运行
 * */
public class BaseTestSuite {

    @BeforeTest
    public void BeforeTest(){
        System.out.println("\nBaseTestSuite-->BeforeTest");
    }
    @AfterTest
    public void AfterTest(){
        System.out.println("\nBaseTestSuite-->AfterTest");
    }

    @BeforeClass
    public void BeforeClass(){
        System.out.println("\nBaseTestSuite-->BeforeClass");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("\nBaseTestSuite-->AfterClass");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("\nBaseTestSuite-->BeforeSuite");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("\nBaseTestSuite-->AfterSuite");
    }

}
