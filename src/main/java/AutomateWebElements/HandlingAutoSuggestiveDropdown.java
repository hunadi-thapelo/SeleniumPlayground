package AutomateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HandlingAutoSuggestiveDropdown {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("chromedriver", "/usr/local/bin/");
        //WebDriver: open source tool for automated testing of webapps across many browsers
        //ChromeDriver is a standalone server that implements the W3C WebDriver standard
        //obvious functions of the ChromeDriver is to initiate Google Chrome.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        //Thread.sleep(3000);

        //traverse parent to child in CSS = @tagname[@class='value'] space @childtagename
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        //add for loop to iterate over each and every dropdown option to see if it matches with requirements
        //WebElement is the return type of the option //Java basics

        for(WebElement option :options)
        {
        System.out.println(String.format("%s Options is --> %s addional tesx", options ,option.getText()));
        System.out.printf("%s Options is --> %s addional tesx", options ,option.getText());
        System.out.println("Options is --> " + option.getText() + "fddfsdfdf");
            if(option.getText().equalsIgnoreCase("India"))
            {
                System.out.println("I clicked");
                //Thread.sleep(2000);
                option.click();
                //Thread.sleep(2000);
                //System.out.println(driver.findElement(By.id("autosuggest")));
                break;
            }
            //else {
            //System.out.println("noot");
        //}
        }











    }
}
