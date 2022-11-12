package exerciseTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksCount {

    public static void main (String[] args){

        System.setProperty("chromedriver", "/usr/local/bin");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        //Test case 1: Give me count of links on webpage
        System.out.println(driver.findElements(By.tagName("a")).size());

        //Test case 2: Give me count of links on webpage footer section
            //limit drive scope to footer section
            //create driver sublet
        WebElement footer = driver.findElement(By.id("gf-BIG"));

        System.out.println(footer.findElements(By.tagName("a")).size());


    }

}
