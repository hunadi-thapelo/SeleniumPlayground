package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildToParentXpath {
    public static void main (String[] args)
    {
        System.setProperty("chromedriver", "/usr/local/bin");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //traversing from child to parent
        //traversing methods are not possible in CSS
        System.out.println(driver.findElement(By.xpath("//header/div/button[3]/parent::div/button[1]")).getText());
    }
}
