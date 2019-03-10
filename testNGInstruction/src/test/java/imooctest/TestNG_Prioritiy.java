package imooctest;

import org.testng.annotations.*;

public class TestNG_Prioritiy {
    /**
     * 测试执行顺序
     * 有时候需要某一个特定的测试用例优先执行，另一个再执行，这个时候就用到了有依赖关系的测试用例---优先级；
     * @Test(priority = 1)从0 开始
     * */

    @BeforeClass
    public void setUp(){
        System.out.println("TestNG_Prioritiy--BeforeClass");
    }
    @AfterClass
    public void clearUp(){
        System.out.println("TestNG_Prioritiy--AfterClass");
    }


    @Test(priority = 1)
    public void testMethod1(){
        System.out.println("TestNG_Prioritiy->testMethod1");
    }
    @Test(priority = 2)
    public void testMethod2(){
        System.out.println("TestNG_Prioritiy->testMethod2");
    }
    @Test(priority = 0)
    public void testMethod3(){
        System.out.println("TestNG_Prioritiy->testMethod3");
    }


}
