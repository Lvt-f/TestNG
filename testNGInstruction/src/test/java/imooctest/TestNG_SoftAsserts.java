package imooctest;
import applicationcode.ClassToBeTested;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
/**
 * 什么是软断言
 * 如果一个断言失败，会继续执行这个断言下的其他语句或者断言
 * 也就是一个用例有多个断言，失败了其中一个，不影响其他断言的运行。
 * */
/**
 * 软断言的场景：
 * 在一个测试方法中有多个断言，一个断言失败了，但是其他断言和语句我还想继续执行
 * 软断言和断言的区别：
 * SoftAsserts是TestNG里面描述好的一个类，若想使用这个类，首先要创建这个类的对象
 * */
public class TestNG_SoftAsserts {
    @Test
    public void testSum(){
        //创建软断言的对象
        SoftAssert softAssert = new SoftAssert();
        System.out.println("\n测试方法->测试两个数相加");
        ClassToBeTested obj = new ClassToBeTested();
        int result= obj.add(1,3);
        //Assert.assertEquals(result,2);
        softAssert.assertEquals(result,3);
        System.out.println("Assert1执行完成");
        softAssert.assertEquals(result,4);
        //Assert.assertEquals(result,4);
        System.out.println("Assert2执行完成");
        //如果有失败，就会暴露出来方法失败
        softAssert.assertAll();
    }
}
