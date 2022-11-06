package functionTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingAjaxMouseInteractions {
    public static void main(String[] args)
    {
        System.setProperty("chromedriver", "/usr/local/bin/");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://superbalist.com/");
        Actions a = new Actions(driver);
        WebElement moveAction = driver.findElement(By.xpath("//a[contains(@href,'/women')]"));
        //mouse hover and right click
        a.moveToElement(moveAction).contextClick().build().perform();

        //enter text in upper case and select
        a.moveToElement(driver.findElement(By.id("headerSearch"))).click().keyDown(Keys.SHIFT)
                .sendKeys("green").doubleClick().build().perform();

    }
}
