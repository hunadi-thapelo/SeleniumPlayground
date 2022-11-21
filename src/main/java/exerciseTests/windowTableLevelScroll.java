package exerciseTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class windowTableLevelScroll {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromedriver", "/usr/local/bin/");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        //a class - helps execute javascript related actions
        JavascriptExecutor js = (JavascriptExecutor) driver; //cast your driver
        js.executeScript("window.scrollBy(0,500)");

        Thread.sleep(3000);//3sec pause to see table scroll
        //scroll component in DOM - in example, a table
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=3000");

        //Requirement: Table grid - sum up values in 4th column
        List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)")); //store all values in list
        int total = 0;
        //loop through values to sum up
        for(int i=0; i<values.size(); i++)
        {
            total = total + Integer.parseInt(values.get(i).getText()); //get text - convert test string to in - for summing
        }

        System.out.println("The total is "+ total);

    }
}
