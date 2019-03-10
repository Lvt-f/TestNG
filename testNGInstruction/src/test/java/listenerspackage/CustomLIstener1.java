package listenerspackage;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomLIstener1 implements IInvokedMethodListener {

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
}
