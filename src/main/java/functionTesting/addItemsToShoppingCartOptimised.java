package functionTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class addItemsToShoppingCartOptimised {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromedriver", "/usr/local/bin/");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        String[] veggiesNeeded = {"Brocolli","Cucumber","Beetroot","Carrot"};
        Thread.sleep(2000);
        addToCart(driver,veggiesNeeded);

        driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        //Explicit Wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode")));
        driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("promoBtn")).click();
        //Explicit Wait
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
        Assert.assertEquals("Code applied ..!",driver.findElement(By.className("promoInfo")).getText());
        System.out.println(driver.findElement(By.className("promoInfo")).getText());
        driver.close();

    }

    public static void addToCart(WebDriver driver, String[] veggiesNeeded)
    {
        int counter = 0;
        //Approach:find all elements to iterate through the 30 items - to get to veggie we want to add to cart
        List<WebElement> listOfItems = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < listOfItems.size(); i++) {
            //Approach: Get name of 30 veggies items
            String[] veggiesNames = listOfItems.get(i).getText().split("-");
            String itemName = veggiesNames[0].trim();
            List<String> allNames = Arrays.asList(veggiesNeeded); //Convert Array to Arraylist for easy search

            if (allNames.contains(itemName)) {
                //add to cart
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                counter++;

                if (counter == veggiesNeeded.length)
                    break;
            }
        }
    }
}
