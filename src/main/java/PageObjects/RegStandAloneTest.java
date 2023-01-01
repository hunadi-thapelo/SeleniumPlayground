package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class RegStandAloneTest {

    public static void main(String[] args)
    {
        System.setProperty("chromedriver", "/usr/local/bin");

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/client");

        String firstName = "HTest";
        String lastName = "HTestLastName";
        String email = "hautomation@email.com";
        //int phone = 0210001010;
        String password = "P@s$w0rd!";

        //Validate register button works
        driver.findElement(By.className("btn1")).click();

        //Validate you are on Register page form
        String regPage = driver.findElement(By.className("login-title")).getText();
        Boolean verifyRegPage = regPage.equalsIgnoreCase("Register");
        Assert.assertTrue(verifyRegPage, "We are on Register page form");

        //Fill in reg form to Register for an account
        driver.findElement(By.id("firstName")).sendKeys(firstName);
        driver.findElement(By.id("lastName")).sendKeys(lastName);
        driver.findElement(By.id("userEmail")).sendKeys(email);
        //driver.findElement(By.id("userMobile")).sendKeys(String.valueOf(0210001010));
        //driver.findElement(By.id("userMobile")).sendKeys("0210001010");

        //Challenge - phone number text box throwing error "phone number is required"
        //Solution 1 = using JS to send text to the field (Reg form not recognising the input
        //Investigate more and try test again
        WebElement phoneNumber = driver.findElement(By.id("userMobile"));
        JavascriptExecutor jsExec = (JavascriptExecutor) driver;
        jsExec.executeScript("arguments[0].value = 2468101234;", phoneNumber);


        WebElement occupationDropdown = driver.findElement(By.xpath("//*[contains(@class,'custom-select')]"));
        Select occupation = new Select(occupationDropdown);
        occupation.selectByIndex(2);

        driver.findElement(By.cssSelector("input[value='Female']")).click();
        driver.findElement(By.id("userPassword")).sendKeys(password);
        driver.findElement(By.id("confirmPassword")).sendKeys(password);
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        driver.findElement(By.id("login")).click();

    }
}
