package imooctest;

import applicationcode.ClassToBeTested;
import org.testng.Assert;
import org.testng.annotations.Test;
/**
 * TestNG 断言
 * 1:Assert.asserTrue()
 * asserTrue语句如果实际输出是false，测试不通过，并且停止执行
 * 2:Assert.asserFalse()
 * 如果您希望某个元素在页面上不存在时继续执行就可以使用asserFalse，如果元素在页面上存在的话，测试就会失败
 * :Assert.asserEquals()
 * 如果值不等，就会停止执行，如果值相等就会继续执行
 * **/

public class TestNG_Asserts {
    @Test
    public void testNum(){
        System.out.println("测试两个数想家结果正确与否");
        ClassToBeTested obj=new ClassToBeTested();
        int result=obj.add(1,3);
        Assert.assertEquals(result,4);
    }
    @Test
    public void testStrings(){
        System.out.println("比对链接后的字符串");
        String exepectedString ="Hello Word";
        ClassToBeTested obj=new ClassToBeTested();
        String result=obj.addString("Hello","Word");
        Assert.assertEquals(result,exepectedString);
    }
    @Test
    public void testArrays(){
        System.out.println("测试两个数组是否相等");
        int[] expectedArray={1,2,3,4};
        ClassToBeTested obj=new ClassToBeTested();
        int[] result=obj.getArray();
        Assert.assertEquals(result,expectedArray);
        System.out.println("测试完成----》完成");
    }
}
