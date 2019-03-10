package log4jtutorial;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_TestCase {
    private WebDriver driver;
    private String baseUrl;
    private static final Logger log = LogManager.getLogger(TestNG_TestCase.class.getName());

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","/Applications/Google Chrome.app/Contents/MacOS/chromedriver");
        driver = new ChromeDriver();
        baseUrl="http://www.baidu.com";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        log.info("浏览器最大化");
    }
    @Test
    public void testMethod(){
        driver.get(baseUrl);
        log.info("打开应用程序");
    }
    @AfterClass
    public void afterClass(){
        driver.close();
    }
}
