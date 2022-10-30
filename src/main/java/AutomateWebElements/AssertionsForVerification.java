package AutomateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class AssertionsForVerification {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("chromedriver", "/usr/local/bin/");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
            Thread.sleep(2000);
        driver.findElement(By.id("hrefIncAdt")).click();
        driver.findElement(By.id("btnclosepaxoption")).click();

        //ASSERT CHECKBOXES
        //Assert to verify False, True & Expected text from Web Element

        //1 AssertFalse and print
        Assert.assertFalse(driver.findElement(By.cssSelector("input[name*='StudentDiscount'")).isSelected());
        System.out.println(driver.findElement(By.cssSelector("input[name*='StudentDiscount'")).isSelected());

        // Click on Student Discount Checkbox
        driver.findElement(By.cssSelector("input[name*='StudentDiscount'")).click();

        //2 AssertTrue & print
        Assert.assertTrue(driver.findElement(By.cssSelector("input[name*='StudentDiscount'")).isSelected());
        System.out.println(driver.findElement(By.cssSelector("input[name*='StudentDiscount'")).isSelected());
        driver.findElement(By.cssSelector("input[name*='StudentDiscount'")).click();

        // AssertEquals verify with text
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "2 Adult");

    }

}
