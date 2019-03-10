package imooctest;

import org.testng.annotations.Test;
/**
 * 维持测试用例循序
 * **/
public class TestNG_Preserve1 {
    @Test
    public void testMethod1(){
        System.out.println("TestNG_Preserve1 ->testMethod1");
    }
    @Test
    public void testMethod2(){
        System.out.println("TestNG_Preserve1 ->testMethod2");
    }
}
