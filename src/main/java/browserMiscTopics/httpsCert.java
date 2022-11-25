package browserMiscTopics;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class httpsCert {
    public static void main (String[] args)
    {

        ChromeOptions options = new ChromeOptions();
        Proxy proxies = new Proxy();
        proxies.setHttpProxy("ipaddress:123.12.00.22");//example, set to pass the string here
        options.setCapability("proxy", proxies); //setting capability of proxy to chrome behaviour

        options.setAcceptInsecureCerts(true); //behavior options object for browser
        System.setProperty("chromedriver", "usr/local/bin");
        WebDriver driver = new ChromeDriver(options); //chrome driver to get info on how to behave

        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());


    }
}
