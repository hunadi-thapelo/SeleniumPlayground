package exerciseTests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowTableLevelScroll {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromedriver", "/usr/local/bin/");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        //a class - helps execute javascript related actions
        JavascriptExecutor js = (JavascriptExecutor) driver; //cast your driver
        js.executeScript("window.scrollBy(0,500)");

    }
}
