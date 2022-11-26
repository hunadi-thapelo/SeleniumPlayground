package browserMiscTopics;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class takeScreenshot {
    public static void main (String[] args) throws IOException {

        System.setProperty("chromedriver", "/usr/local/bin/");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(src,new File("/Users/hunadimapulane/Pictures/screenshot1.png"));
        FileHandler.copy(src,new File("/Users/hunadimapulane/Pictures/seleniumScreenshots/screenshot.png"));


    }
}
