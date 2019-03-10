package extentreport;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import log4jtutorial.TestNG_TestCase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


import java.util.concurrent.TimeUnit;

public class SeleniumLoginTest {
    private WebDriver driver;
    private String baseUrl;
    ExtentReports reports;
    ExtentTest test;

    private static final Logger log = LogManager.getLogger(TestNG_TestCase.class.getName());

    @BeforeMethod
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","/Applications/Google Chrome.app/Contents/MacOS/chromedriver");
        baseUrl="https://mail.qq.com/cgi-bin/loginpage";
        reports = new ExtentReports("./target/report_out/login.html");
        test=reports.startTest("Welcome text");
        driver = new ChromeDriver();
        test.log(LogStatus.INFO,"浏览器打开了");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        test.log(LogStatus.INFO,"浏览器最大化");
        log.info("浏览器最大化");
        driver.get(baseUrl);
        test.log(LogStatus.INFO,"Web打开了");
        log.info("打开应用程序");
    }
    @Test
    public void test1_validLOgTest() throws InterruptedException {
        driver.switchTo().frame("login_frame");
        WebElement element = driver.findElement(By.id("u"));
        element.sendKeys("424255751");

        WebElement element1 = driver.findElement(By.id("p"));
        element1.sendKeys("123456");

        WebElement gobutton = driver.findElement(By.id("login_button"));
        gobutton.click();
        Thread.sleep(6000);

        WebElement webElement = null;
        try{
            webElement =driver.findElement(By.xpath("//b[text()='Diana']"));
        }catch (NoSuchElementException e){
            Assert.assertTrue(webElement != null);
        }

    }
    @AfterMethod
    public void afterClass(){
        driver.quit();
        reports.endTest(test);
        reports.flush();
    }
}
