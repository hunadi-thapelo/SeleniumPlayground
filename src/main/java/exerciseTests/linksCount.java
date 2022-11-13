package exerciseTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class linksCount {

    public static void main (String[] args) throws InterruptedException {

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

        //Test case 3: Get count of links for first column on footer
        WebElement columnFooter = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columnFooter.findElements(By.tagName("a")).size());

        //Test case 4: Click on all column 1 links and verify links are opening
        int x = columnFooter.findElements(By.tagName("a")).size();
        for(int i=1; i< x; i++)
        {
            String clickOnLinks = Keys.chord(Keys.COMMAND,Keys.ENTER); //COMMAND FOR MAC; CONTROL FOR WINDOWS
            columnFooter.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinks);
            Thread.sleep(5000);
        }//Open all pages on separate tabs

        //Get and print all the window page titles
        Set<String> xyz = driver.getWindowHandles();
        Iterator<String> nextW = xyz.iterator();

        while(nextW.hasNext()) //checks index (windows)
        {
            driver.switchTo().window(nextW.next());
            System.out.println(driver.getTitle());

        }





    }

}
