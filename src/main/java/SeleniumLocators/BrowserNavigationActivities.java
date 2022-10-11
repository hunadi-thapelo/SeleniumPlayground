package SeleniumLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigationActivities {
    public static void main(String[] args)
    {
        //invoke the browser
        System.setProperty("chromedriver", "/usr/local/bin/");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.google.com/"); //waits for page to load
        driver.navigate().to("https://za.pinterest.com/"); //does not wait for page elements (e.g images) to fully load
        driver.navigate().back(); //goes back - same as clicking on back arrow manually

    }
}
