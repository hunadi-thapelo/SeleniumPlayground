package functionTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class addItemsToShoppingCartOptimised {
    public static void main(String[] args)
    {
        System.setProperty("chromedriver", "/usr/local/bin/");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        String[] veggiesNeeded = {"Brocolli","Cucumber","Beetroot","Carrot"};
        addToCart(driver,veggiesNeeded);

        driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
        //driver.findElement(By.xpath("//div[@contains(text(),'PROCEED TO CHECKOUT')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("promoBtn")).click();
        System.out.println(driver.findElement(By.className("promoInfo")).getText());

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
            List allNames = Arrays.asList(veggiesNeeded); //Convert Array to Arraylist for easy search

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
