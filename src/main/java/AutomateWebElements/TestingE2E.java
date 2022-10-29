package AutomateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingE2E {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("chromedriver", "/usr/local/bin/");
        ///Webdriver is an interface
        //driver is a reference variable
        //Chromedriver() is a constructor (subroutine called to create an object)
        //new Chromedriver() is an object
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        System.out.println(driver.getTitle());

        //1. Select DEPARTURE CITY and ARRIVAL CITY
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        driver.findElement(By.xpath("//a[@value='BKK']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[@value='JAI'])[2]")).click();

        //2. Select current date from calendar
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

        //3. Validate RETURN DATE is disabled
        driver.findElement(By.id("Div1")).getAttribute("Style").contains("0.5");
        //.contains("0.5");

        if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("0.5"))
        {
            System.out.println("Return Date is disabled.");
        } else
        {
            System.out.println("Return Date is enabled.");
        }

        //Use loop to handle iteration for adding 4 passengers
        //****************FOR LOOP****************//
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for(int j =1; j<4; j++)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        driver.findElement(By.id("btnclosepaxoption")).click();

        //From Currency dropdown list select 'AED'
        WebElement OptionsList = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select Options = new Select(OptionsList);
        Options.selectByIndex(2);

        //Select 'Friends and Family' checkbox
        driver.findElement(By.cssSelector("input[name*='friendsandfamily'")).click();
        //isSelected to know if checkbox is selected on not
        //True for 'Yes' and False for 'Not Selected'
        System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily'")).isSelected());

        //Submit booking by clicking 'Search' button
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

        driver.close();

    }
}
