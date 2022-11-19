package exerciseTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class handlingCalendarUI {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromedriver", "/usr/local/bin/");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.flysafair.co.za/");

        ///WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));

        WebElement departCity = driver.findElement(By.id("departureCityDrop"));
        Select departFirstCity = new Select(departCity);
        departFirstCity.selectByValue("JNB");


        WebElement destinationCity = driver.findElement(By.id("arrivalCityDrop"));
        Select arrivalSelection = new Select(destinationCity);
        arrivalSelection.selectByValue("CPT");

        driver.findElement(By.id("departureDate")).click();
        Thread.sleep(5000);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //driver.findElement(By.xpath("//input[@id='departureDate']")).click();

        WebElement depart = driver.findElement(By.xpath("//select[@id='departureDateDay']"));
        Select departDate = new Select(depart);

        departDate.selectByValue("23");



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
