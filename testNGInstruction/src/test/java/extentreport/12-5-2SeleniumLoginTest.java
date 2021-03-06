package extentreport;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utilities.Screenshots;

public class SeleniumLoginTest {
	
	private WebDriver driver;
	private String baseUrl;
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void beforeClass() {
		baseUrl = "https://mail.qq.com";
		report = new ExtentReports("D:\\Reports\\logintest.html");
		test = report.startTest("Verify if login successfully");
		driver = new ChromeDriver();
		test.log(LogStatus.INFO, "Browser started...");

		// Maximize the browser's window
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser Maximized...");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		test.log(LogStatus.INFO, "Web Application Opened");
	}
	
	@Test
	public void test1_validLoginTest() throws Exception {
		driver.switchTo().frame("login_frame");
		WebElement emailField = driver.findElement(By.id("u"));
		emailField.sendKeys("5159045688");
		test.log(LogStatus.INFO, "Enter User Name");
		
		WebElement passwordField = driver.findElement(By.id("p"));
		passwordField.sendKeys("123");
		test.log(LogStatus.INFO, "Enter Password");
		
		WebElement goButton = driver.findElement(By.id("login_button"));
		goButton.click();
		test.log(LogStatus.INFO, "Clicked on login button");
		
		Thread.sleep(3000);
		
		WebElement welcomeText = null;
		
		try {
			welcomeText = driver.findElement(By.xpath("//b[text()='Diana']"));
		}
		catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		Assert.assertTrue(welcomeText != null);
		test.log(LogStatus.PASS, "Verified Login Successfully");
	}
	@AfterMethod
	public void tearDown(ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			String path = Screenshots.takeScreenshot(driver, testResult.getName());
			String imagePath = test.addScreenCapture(path);
			test.log(LogStatus.FAIL, "Verified Login failed",imagePath);
		}
		driver.quit();
		report.endTest(test);
		report.flush();
	}
	
}