package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class LocatorsTechniques2 {
    public static void main(String[] args) throws InterruptedException {
        String name = "Meg";

        System.setProperty("chromedriver", "/usr/local/bin");
        ChromeDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//global implicit wait applies to all actions below

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        //System.out.println("Get Title of the page:");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Rahul Shetty Academy - Login page");

        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello "+name +",");
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in." );
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        System.out.println("Test passed");
        driver.close();







    }
}
