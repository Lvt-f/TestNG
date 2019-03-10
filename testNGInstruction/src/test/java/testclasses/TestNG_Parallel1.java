package testclasses;

import org.testng.annotations.Test;
/***
 * 用testng并行执行case
 * */
public class TestNG_Parallel1 {
    @Test
    public void testMethod1() throws InterruptedException {
        System.out.println("TestNG_Parallel1 -> testMethod1");
        Thread.sleep(6000);
        System.out.println("TestNG_Parallel1 -> testMethod1 ->more Steps");
    }
    @Test
    public void testMethod2() throws InterruptedException {
        System.out.println("TestNG_Parallel1 -> testMethod2");
        Thread.sleep(6000);
        System.out.println("TestNG_Parallel1 -> testMethod2 ->more Steps");
    }
}
