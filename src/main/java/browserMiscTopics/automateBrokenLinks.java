package browserMiscTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;



public class automateBrokenLinks {
    public static void main(String[] args) throws IOException {
        System.setProperty("chromedriver", "usr/local/bin");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        //Step1: Get URL tied up to the link
        String url = driver.findElement(
                By.cssSelector("a[href*='brokenlink']"))
                .getAttribute("href"); //using regular expression
        //Step2: Java methods to call URLs and get status code
        HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
        conn.setRequestMethod("HEAD"); //using HEAD request http method
        conn.connect(); //connect() method of conn object
        int responseCode= conn.getResponseCode(); //get url connection response code e.g 200, 404
        System.out.println(responseCode);

        //Step3: if status code is >400 then that url is not working



    }
}
