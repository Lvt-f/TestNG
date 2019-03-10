package testclasses;

import org.testng.annotations.DataProvider;
/**
 * 封装DataProvider
 * */
public class TestData {
    @DataProvider(name="inputs")
    public Object[][] getData(){
        return new Object[][]{
                {"Apple","red"},
                {"WaterMelon","Green"},
                {"Orange","yellow"},
        };
    }
}
