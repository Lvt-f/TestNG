package imooctest;

import applicationcode.ClassToBeTested;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestAnnotation {
/**
 * 1.运行顺序是按照字母顺序
 * 2.什么是断言：
 * 断言一个表达式结果为真，不为真就通过抛异常或者其他方式使测试用例失败。
 * 断言一词来自逻辑学，在逻辑学中，"断言"是"断定一个特定前提为真的陈述"，在软件测试中也有类似的含义
 * 3.断言的作用和应用场景
 * 断言用来表达对条件的假设，看到断言，就应该想起，这个功能必须在这种条件下运行。
 * 是否加入断言的条件就是，如果断言所只是的约束条件不满足，代码是否仍然运行出你想要的结果？如果可以，就不应该使用断言。
 *
 * */
    @Test
    public void testMethod1() {
        ClassToBeTested test =new ClassToBeTested();
        int result = test.add(1,4);
        System.out.println("这是第一个测试方法"+result);
    }
    @Test
    public void testMethod2() {
        System.out.println("这是第2个测试方法");
    }
    @Test
    public void testMethod3() {
        System.out.println("这是第3个测试方法");
    }
}