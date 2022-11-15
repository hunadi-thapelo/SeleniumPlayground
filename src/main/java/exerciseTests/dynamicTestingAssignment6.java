package exerciseTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class dynamicTestingAssignment6 {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("chromedriver", "/usr/local/bin/");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        //Test case 1: checkbox
        WebElement checkBoxOption = driver.findElement(By.id("checkBoxOption3"));
        checkBoxOption.click();
        String checkboxText = checkBoxOption.getAttribute("value");
        //System.out.println(checkboxText);
        //Test case 2: dropdown select
        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
        Select dropdownElement = new Select(dropdown);
        dropdownElement.selectByValue(checkboxText);
        //Test case 3: Text box input
        driver.findElement(By.id("name")).sendKeys(checkboxText);
        driver.findElement(By.id("alertbtn")).click();
        //Test case 4: Verify is text from test case 1 is present in pop up message
        String alert = driver.switchTo().alert().getText();
        String alertText = alert.split(",")[0].split("Hello")[1].trim();
        //System.out.println(alertText);
        Assert.assertEquals(alertText, "option3");
        driver.switchTo().alert().accept();
        driver.close();











    }

}
