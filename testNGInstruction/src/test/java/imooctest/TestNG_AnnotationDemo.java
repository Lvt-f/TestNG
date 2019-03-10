package imooctest;

import org.testng.annotations.*;

/**
 * 1。什么是注解及它的作用
 * 注解，也叫元数据，一种代码级别的说明。
 * JAVA注解是附加在代码中的一些元信息，用于一些工具在编译，运行时进行解析和使用，
 * 起到的说明、配置的功能。
 * 注解不会也不影响代码的实际逻辑，仅仅起辅助性的作用
 * 2。基本结构及用在什么地方？
 * @ 是java的注解，即annotation
 * 在类或方法上写：@XXX
 * */

public class TestNG_AnnotationDemo {

    @BeforeClass
    public void setUp(){
        System.out.println("BeforeClass--在类里所有注解的方法运行之前跑");
    }
    @AfterClass
    public void clearUp(){
        System.out.println("AfterClass--在类里所有注解的方法运行之后跑");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod--每一个test跑之前会运行此方法");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod--每一个test跑之后会运行此方法");
    }

    @Test
    public void testMethod1(){
        System.out.println("testMethod1");
    }
    @Test
    public void testMethod2(){
        System.out.println("testMethod2");
    }

}
