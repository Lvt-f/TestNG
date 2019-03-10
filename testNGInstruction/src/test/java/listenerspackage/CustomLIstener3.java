package listenerspackage;

import org.testng.*;

public class CustomLIstener3 implements ISuiteListener {


    public void onStart(ISuite iSuite) {
        //当suit标签开始执行时执行此类中代码
        System.out.println("onStart:suite开始执行之前");
    }

    public void onFinish(ISuite iSuite) {
    //当suit标签执行完成后执行此类中代码
        System.out.println("onFinish:suite开始执行之后");
    }
}
