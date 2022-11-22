package browserMiscTopics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class httpsCert {
    public static void main (String[] args)
    {

        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true); //behavior options object for browser
        System.setProperty("chromedriver", "usr/local/bin");
        WebDriver driver = new ChromeDriver(options); //chrome driver to get info on how to behave

        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());


    }
}
