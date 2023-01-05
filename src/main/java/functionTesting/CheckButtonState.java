package functionTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckButtonState {

    public static void main(String[] args)
    {

        System.setProperty("chromedriver", "/usr/local/bin");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");
        //driver.manage().window().maximize();

        //get state of button - should be disabled
        // button_module_isDisabled__ee8dc7c3

      // WebElement buttonState = driver.findElement(By.xpath("//button[contains(@class,'button_module_isDisabled__ee8dc7c3')]"));
      // System.out.println(buttonState.isEnabled());

        WebElement submitBtn =  driver.findElement(By.className("btn-success"));
        boolean submitBtnState = submitBtn.isEnabled();
        System.out.println(submitBtnState);










    }
}
