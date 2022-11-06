package functionTesting;

import org.openqa.selenium.By;
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
        //a.moveToElement(driver.findElement(By.xpath("//li[class='flyout'][1]"))).build().perform();
        a.moveToElement(moveAction).build().perform();

    }
}
