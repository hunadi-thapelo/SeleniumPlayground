package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorTechniques {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("chromedriver", "/usr/local/bin");
        ChromeDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//global implicit wait applies to all actions below

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        //System.out.println("Get Title of the page:");
        System.out.println(driver.getTitle());

        driver.findElement(By.id("inputUsername")).sendKeys("hmap@gmail.com");
        driver.findElement(By.name("inputPassword")).sendKeys("pa$$w0rd123");
        driver.findElement(By.className("signInBtn")).click();
        //System.out.println("Get error text and print to console:");
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());//get error text and print to console
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000); //A Java method - 1000 equals 1 second...etc
        //xpath url =//tagname[@atrribute='value']
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Jane Dos");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("janedos@email.com");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[placeholder='Email']:nth-child(3)")).sendKeys("123janedos@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("27712090123");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        //System.out.println("Get info message and print to console:");
        System.out.println(driver.findElement(By.className("infoMsg")).getText());
        driver.findElement(By.cssSelector("button[class*='login']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("inputUsername")).sendKeys("Mary");
        driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        //driver.findElement(By.xpath("//input[contains(@class,'signInBtn')]")).click();
        driver.findElement(By.className("signInBtn")).click();













    }
}
