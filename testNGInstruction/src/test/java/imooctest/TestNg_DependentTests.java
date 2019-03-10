package imooctest;

import applicationcode.ClassToBeTested;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
/**
 * 1.若一个case确实依赖其他case执行完毕才能执行，那么给case加上depends属性
 * 2.如果有依赖关系错误一个其他的跳过执行
 * 3.alwaysRun = true出错了也可以执行
 * */

public class TestNg_DependentTests {
    //声明被测试类的对象的引用
    ClassToBeTested obj;
    @BeforeClass
    public void setUp(){
        System.out.println("before class");
        obj= new ClassToBeTested();

    }
    @AfterClass
    public void cleanUp(){
        System.out.println("after class");
    }
    @Test(dependsOnMethods = {"testMethod2"},alwaysRun = true)
    public void testMethod1(){
        System.out.println("testMethod1");
    }
    @Test
    public void testMethod2(){
        System.out.println("testMethod2");
        int result = obj.add(4,5);
        Assert.assertEquals(result,3);
    }
    @Test(dependsOnMethods = {"testMethod1"})
    public void testMethod3(){
        System.out.println("testMethod3");
    }
    @Test
    public void testMethod4(){
        System.out.println("testMethod4");
    }
}
