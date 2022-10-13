package AutomateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingStaticDropdowns {
    public static void main(String[] args)
    {
        System.setProperty("chromedriver", "/usr/local/bin/");

        //Class   //object of class = //new package
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //identify the web element - dropdown with select tag - always static (select options are fixed)
        WebElement StaticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        //pass web element to Select class
        Select DropdownElement = new Select(StaticDropdown);

        //Method: Select by Index
        DropdownElement.selectByIndex(1);
        //print selected text to console
        System.out.println(DropdownElement.getFirstSelectedOption().getText());

        //Method: Select by Visible Text
        DropdownElement.selectByVisibleText("AED");
        System.out.println(DropdownElement.getFirstSelectedOption().getText());

        //Method: Select by value (attribute)
        //Example: <option value="USD">USD</option>
        DropdownElement.selectByValue("USD");
        System.out.println(DropdownElement.getFirstSelectedOption().getText());

    }

}
