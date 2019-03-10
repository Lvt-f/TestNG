package listenerspackage;

import org.testng.*;

public class CustomListener implements IInvokedMethodListener, ITestListener, ISuiteListener {
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        //在测试类里面每一个方法运行之前运行
        System.out.println("beforeInvocation"+iTestResult.getTestClass().getName()+"-->"
                +iInvokedMethod.getTestMethod().getMethodName());
    }
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        //在测试类里面每一个方法运行之后运行
        System.out.println("afterInvocation"+iTestResult.getTestClass().getName()+"-->"
                +iInvokedMethod.getTestMethod().getMethodName());
    }
    public void onTestStart(ITestResult iTestResult) {
        //测试方法开始时运行此方法
        System.out.println("onTestStart ->test name:"+iTestResult.getName());
    }
    public void onTestSuccess(ITestResult iTestResult) {
        //测试方法执行成功时运行此方法
        System.out.println("onTestSuccess ->test name:"+iTestResult.getName());
    }
    public void onTestFailure(ITestResult iTestResult) {
        //测试方法执行失败时运行此方法
        System.out.println("onTestFailure ->test name:"+iTestResult.getName());

    }
    public void onTestSkipped(ITestResult iTestResult) {
        //测试方法执行跳过时运行此方法
        System.out.println("onTestSkipped ->test name:"+iTestResult.getName());
    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        //忽略
        System.out.println("onTestFailedButWithinSuccessPercentage ->test name:"+iTestResult.getName());
    }
    public void onStart(ITestContext iTestContext) {
        //xml文件test标签运行之前运行
        System.out.println("onTestSkipped ->test tag name:"+iTestContext.getName());
        //返回所有test的名字
        ITestNGMethod methods[] = iTestContext.getAllTestMethods();
        System.out.println("Test标签里面要执行测测试方法");
        for(ITestNGMethod method:methods) {
            System.out.println(method.getMethodName());
        }
    }
    public void onFinish(ITestContext iTestContext) {
        //xml文件test标签运行之后运行
        System.out.println("onTestSkipped ->test tag name:"+iTestContext.getName());
    }
    public void onStart(ISuite iSuite) {
        //当suit标签开始执行时执行此类中代码
        System.out.println("onStart:suite开始执行之前");
    }
    public void onFinish(ISuite iSuite) {
        //当suit标签执行完成后执行此类中代码
        System.out.println("onFinish:suite开始执行之后");
    }
}
