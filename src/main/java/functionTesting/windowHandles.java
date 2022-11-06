package functionTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.Set;


public class windowHandles {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("chromedriver", "/usr/local/bin/");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.cssSelector(".blinkingText")).click();
        //the two windows ids are sitting in the 'window' object
        Set<String> window = driver.getWindowHandles(); //parentwindow id , childwindow id
        Iterator<String> Id = window.iterator(); //Id object can get ids available in window set collection
        String parentID = Id.next(); //by default it is outside the two windows - this method will then go to the first = parent window
        //System.out.println(driver.getTitle()); //debug
        String childId = Id.next(); //the control moves to child window
        driver.switchTo().window(childId);
        //System.out.println(driver.getTitle()); //debug
        //Thread.sleep(3000);
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());



    }
}
