package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ParseStringMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromedriver", "/usr/local/bin");
        WebDriver driver = new ChromeDriver();
        String name = "Mavis";
        String password = getPassword(driver); //change method to 'static' to be able to call method in main block

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(1000);
        Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello "+name +",");
        //System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in." );
        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        System.out.println("Test passed");
        driver.close();

    }

    public static String getPassword(WebDriver driver) throws InterruptedException {
        //send the Webdriver as an input in the parenthesis to be able to use it the method

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.xpath("//div[@class='forgot-pwd-container']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String passwordText = driver.findElement(By.className("infoMsg")).getText();

        String[] passwordArray = passwordText.split("'");
        String password = passwordArray[1].split("'")[0];
        //String[] passwordArray2 = passwordArray[1].split("'");
        return password;//passwordArray2[0];

    }
}
