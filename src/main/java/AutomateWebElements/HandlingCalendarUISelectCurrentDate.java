package AutomateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingCalendarUISelectCurrentDate {

        public static void main(String[] arg) throws InterruptedException {

            System.setProperty("chromedriver", "/usr/local/bin");
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
            driver.manage().window().maximize();

            //Test case:
            // Click Departure field down arrow
            // From 'Departure' dropdown, select 'Bangkok'
            // From 'To' dropdown, select 'Jaipur'

            driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();

            //Thread.sleep(2000);
            driver.findElement(By.xpath("//a[@value='BKK']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//a[@value='JAI'])[2]")).click();
            Thread.sleep(2000);

            //Handle calendar UI - Select current date
            driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
            System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));//before clicking Round trip radio button
            driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
            System.out.println(driver.findElement(By.id("Div1")).getAttribute("Style"));//after clicking Round trip radio button

            /*if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("0.5"))
            {
                System.out.println("Is disabled");
            }
            else
            {
                System.out.println("Is enabled");
            }*/

            //driver.close();

        }
    }


