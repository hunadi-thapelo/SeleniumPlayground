package AutomateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class DropdownLoopingUI {
    public static void main(String[] args) throws InterruptedException {
        //invoke the browser
        System.setProperty("chromedriver", "/usr/local/bin/");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //Test case for Passengers: Add 8 passengers
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        //Use loop to handle iteration for adding 8 passengers
        //****************WHILE LOOP****************//
  /*      int i = 1;
        while(i<8)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        driver.findElement(By.id("btnclosepaxoption")).click();
*/
        //Use loop to handle iteration for adding 3 passengers
        //****************FOR LOOP****************//
        for(int j =1; j<3; j++)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        driver.findElement(By.id("btnclosepaxoption")).click();

        driver.close();
    }



}
