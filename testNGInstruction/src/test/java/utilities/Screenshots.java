package utilities;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;


public class Screenshots {
    public static void takeScreenshot(WebDriver driver,String fileName){
        fileName = fileName+".png";
        String directory="./target/report_out";
        File sourceFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile,new File(directory+fileName));
    }

}
