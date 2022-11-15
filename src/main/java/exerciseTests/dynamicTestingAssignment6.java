package exerciseTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dynamicTestingAssignment6 {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("chromedriver", "/usr/local/bin/");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        WebElement checkboxOption = driver.findElement(By.id("checkBoxOption1"));
        checkboxOption.click();
        System.out.println("Test2 is "+checkboxOption.getAttribute("value"));
        //String optionSelected = driver.findElement(By.id("checkBoxOption1")).getText();

        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
        Select dropdownElement = new Select(dropdown);
        dropdownElement.selectByVisibleText("Option2");











    }

}
