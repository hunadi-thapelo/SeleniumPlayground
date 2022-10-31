package AutomateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingCheckboxes {
    public static void main(String[] args) throws InterruptedException {
        //invoke the browser
        System.setProperty("chromedriver", "/usr/local/bin");
        //WebDriver: open source tool for automated testing of webapps across many browsers
        //ChromeDriver is a standalone server that implements the W3C WebDriver standard
        //obvious functions of the ChromeDriver is to initiate Google Chrome.
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //Select is a class provided by Selenium - used to work with a dropdown element
        WebElement object =  driver.findElement(By.cssSelector("select[id*='DropDownListCurrency']"));
        Select Dropdown = new Select(object);

        Thread.sleep(2000);
        Dropdown.selectByIndex(3);

        driver.findElement(By.cssSelector("input[name*='StudentDiscount'")).click();
        //isSelected to know if checkbox is selected on not
        //True for 'Yes' and False for 'Not Selected'
        System.out.println(driver.findElement(By.cssSelector("input[name*='StudentDiscount'")).isSelected());

        //How to get size(count) of checkbox elements on the web page
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());



    }
}
