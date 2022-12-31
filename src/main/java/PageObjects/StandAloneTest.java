package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StandAloneTest {


    public static void main(String[] args) {
        System.setProperty("chromedriver", "/usr/local/bin");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/client");

        //Get Title and validate
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "Let's Shop");

        //Test 1: Register an account first for login to work
        //Validate login form
        driver.findElement(By.id("userEmail")).sendKeys("loginpage@test.com");
        driver.findElement(By.id("userPassword")).sendKeys("myP@ssword1");
        driver.findElement(By.id("login")).click();



    }




}
