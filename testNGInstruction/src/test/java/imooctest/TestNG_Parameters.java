package imooctest;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
/**
 * 读取XML文件中的参数Parameters
 * 说明：一个方法可以读多个参数，也可以只读一个参数
 * */
public class TestNG_Parameters {
    @BeforeClass
    @Parameters({"browser","platform"})
    public void setUp(String browser,String platform){
        System.out.println("TestNG_Parameters -> Setup");
        System.out.println("1.Parameters value from xml file:"+browser);
        System.out.println("2.Parameters value from xml file:"+platform);
    }
    @Test
    @Parameters({"response"})
    public void testMethod1(String response){
        String[] stringArray = response.split(",");
        System.out.println("TestNG_Parameters -> testMethod1");
        System.out.println("Response from xml file:"+response);
        System.out.println("stringArray[0] from xml file:"+stringArray[0]);
        System.out.println("stringArray[1] from xml file:"+stringArray[1]);
    }
}
