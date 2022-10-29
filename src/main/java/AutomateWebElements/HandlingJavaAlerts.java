package AutomateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingJavaAlerts {
    public static void main (String[] args)
    {

        System.setProperty("chromedriver", "/usr/local/bin");
        WebDriver driver = new ChromeDriver();

        String NameText = "Linah";
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("name")).sendKeys(NameText);
        driver.findElement(By.cssSelector("[id='alertbtn']")).click();

        //Alert is  Javascript - reason there are no web elements that Selenium can use to automate
        //Selenuium method to switch  context to alerts - Selenium checks for alerts on the web page

        //Alert - SwitchTo
        System.out.println(driver.switchTo().alert().getText());
        //SwitchTo to click on 'OK' on alert box
        driver.switchTo().alert().accept();

        driver.findElement(By.cssSelector("[id='confirmbtn']")).click();
        System.out.println(driver.switchTo().alert().getText());
        //SwitchTo to click on 'Cancel' on alert box
        driver.switchTo().alert().dismiss();

        driver.close();

    }
}
