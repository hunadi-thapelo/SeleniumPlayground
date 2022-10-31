package functionTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class loginAddToCartAssessment {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromedriver", "/usr/local/bin/");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");

        String userName = "rahulshettyacademy", password = "learning";
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        //radio button
        driver.findElement(By.cssSelector("input[value='user']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("okayBtn")).click();
        //Static select dropdown
        WebElement dropDown = driver.findElement(By.cssSelector("select.form-control"));
        Select userType = new Select(dropDown);
        userType.selectByVisibleText("Consultant");
        //checkbox
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        //explicit wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.my-4")));
        //System.out.println("Shop Name"); - confirm next web page loads

        //driver.findElement(By.className("btn-info")).click();
        List<WebElement> cart = driver.findElements(By.className("btn-info"));

        for(int i=0;i<cart.size();i++)
        {
            //find the add to cart buttons and click
            cart.get(i).click();
            if(i==cart.size())
                break;
        }

        driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();


    }
}
