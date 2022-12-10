package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class relativeLocators {
    public static void main(String[] args){

        System.setProperty("chromedriver", "usr/local/bin");
        WebDriver driver = new ChromeDriver(); //WebDriver is Selenium interface invoke Chrome browser

        driver.get("https://rahulshettyacademy.com/angularpractice/");
        //functionality brings a new way to locate elements to help
        // you find the ones that are nearby other elements

        WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());



    }

}
