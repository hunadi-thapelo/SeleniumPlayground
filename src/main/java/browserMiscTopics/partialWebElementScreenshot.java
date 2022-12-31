package browserMiscTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialWebElementScreenshot {
    public static void main(String[] args)
    {
        System.setProperty("chromedriver", "/usr/local/bin/");

        //Class   //object of class = //new package
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
        nameEditBox.sendKeys("Hello");
        nameEditBox.getScreenshotAs(OutputType.FILE);
        

    }
}
