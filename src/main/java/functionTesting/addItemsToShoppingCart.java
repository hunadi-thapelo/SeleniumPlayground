package functionTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;


public class addItemsToShoppingCart {
    public static void main(String[] args)
    {
        System.setProperty("chromedriver", "/usr/local/bin/");
        WebDriver driver = new ChromeDriver();

        //How to handle when multiple products are required
        //Declare an array (Java concept) - *an Array takes less memory compared to an ArrayList
            //hence declaring an arraying first
        String[] productsNeeded = {"Brocolli","Cucumber","Beetroot", "Brinjal"};
        //variable used later as counter - represent 3 productsNeeded in array
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        int j = 0;
        //LOOP: to iterate through the products
        for(int x = 0; x < products.size(); x++)
        {
            //split and trim Selenium method
            //Split turns name into an array e.g Cucumber - 1kg
            String[] name = products.get(x).getText().split("-");
            //System.out.println(name);
            //Trim to remove spaces e.g 'Cucumber '
            String formattedName = name[0].trim();

           //1.Convert array to array list for easy search
            List<String> allProducts = Arrays.asList(productsNeeded);
            //2.Check whether product expected is present in the list or not
            if (allProducts.contains(formattedName))
            {
                //click 'Add to cart'
                //findElements because it is returning multiple web elements
                //get.(index) because current value has the expected product name
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(x).click();

                //what should Selenium do when all products are found and this if block is executed?
                j++;
                //To break;
                if(j==productsNeeded.length)
                    break;

            }
        }


    }
}
