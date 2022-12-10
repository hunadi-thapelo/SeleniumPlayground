package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class relativeLocators {
    public static void main(String[] args){

        System.setProperty("chromedriver", "usr/local/bin");
        WebDriver driver = new ChromeDriver(); //WebDriver is Selenium interface invoke Chrome browser

        driver.get("https://rahulshettyacademy.com/angularpractice/");
        //relative locators functionality brings a new way to locate elements to help
        // you find the ones that are nearby other elements

        //Above - relative locator
        WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());

        //Below - relative locator
        WebElement genderBox = driver.findElement(By.cssSelector("[for='exampleFormControlSelect1']"));
        WebElement genderDropdownSelect = driver.findElement(with(By.id("exampleFormControlSelect1")).below(genderBox));
        Select genderSelect = new Select(genderDropdownSelect);
        genderSelect.selectByIndex(1);

        //Left Of - relative locator
        WebElement iceCream = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
        driver.findElement(with(By.id("exampleCheck1")).toLeftOf(iceCream)).click();

    }

}
