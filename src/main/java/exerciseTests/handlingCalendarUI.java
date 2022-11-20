package exerciseTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class handlingCalendarUI {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromedriver", "/usr/local/bin/");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flysafair.co.za/");

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(100));

        WebElement departCity = driver.findElement(By.id("departureCityDrop"));
        Select departFirstCity = new Select(departCity);
        departFirstCity.selectByValue("JNB");


        WebElement destinationCity = driver.findElement(By.id("arrivalCityDrop"));
        Select arrivalSelection = new Select(destinationCity);
        arrivalSelection.selectByValue("CPT");

        driver.findElement(By.id("departureDate")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/select[@id='departureDateDay']")));

        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //driver.findElement(By.xpath("//input[@id='departureDate']")).click();

        WebElement depart = driver.findElement(By.xpath("//div/select[@id='departureDateDay']"));
        Select departDate = new Select(depart);

        //departDate.selectByVisibleText("23");
        //List<WebElement> dates = departDate.getOptions();
        int counter = departDate.getOptions().size();

        for(int i =0; i<counter;i++) {

            String date = driver.findElements(By.cssSelector("option.value")).get(i).getText();
            if (date.equalsIgnoreCase("25")) {
                driver.findElements(By.cssSelector("option.value")).get(i).click();
                break;
            }
        }

        /*
        List<WebElement> dates = driver.findElements(By.cssSelector("option.value"));
        int counter = driver.findElements(By.cssSelector("option.value")).size();

        for(int i =0; i<counter;i++){

            String date = driver.findElements(By.cssSelector("option.value")).get(i).getText();
            if(date.equalsIgnoreCase("25")){
                driver.findElements(By.cssSelector("option.value")).get(i).click();
                break;
            }

        }

         */


        }
}
