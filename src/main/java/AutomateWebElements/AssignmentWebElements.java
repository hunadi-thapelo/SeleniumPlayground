package AutomateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AssignmentWebElements {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("chromedriver", "/usr/local/bin/");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/angularpractice/");

        //Find element with locators and send keys
        driver.findElement(By.name("name")).sendKeys("Nana");
        driver.findElement(By.cssSelector(".form-control.ng-untouched.ng-pristine.ng-invalid")).sendKeys("nana@email.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("Password123");

        //Find elements and perform click action
        driver.findElement(By.id("exampleCheck1")).click();
        driver.findElement(By.id("exampleFormControlSelect1")).click();

        //Handling static dropdown
        WebElement Selection = driver.findElement(By.id("exampleFormControlSelect1"));
        Select option = new Select(Selection);
        option.selectByVisibleText("Female");

        //Handling employment status radio button
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("2000-10-19");
        driver.findElement(By.cssSelector(".btn.btn-success")).click();
        Thread.sleep(2000);

        //Get success message and print to console
        System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());

       /* ---Tutor's solution code
            driver.findElement(By.name("name")).sendKeys("rahul");
            driver.findElement(By.name("email")).sendKeys("hello@abc.com");

            driver.findElement(By.id("exampleInputPassword1")).sendKeys("123456");
            driver.findElement(By.id("exampleCheck1")).click();

            WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
            Select abc = new Select(dropdown);
            abc.selectByVisibleText("Female");
            driver.findElement(By.id("inlineRadio1")).click();
            driver.findElement(By.name("bday")).sendKeys("02/02/1992");
            driver.findElement(By.cssSelector(".btn-success")).click();
            System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
        */


    }
}
