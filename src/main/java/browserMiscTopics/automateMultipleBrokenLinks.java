package browserMiscTopics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class automateMultipleBrokenLinks {
    public static void main(String[] args) throws IOException {
        System.setProperty("chromedriver", "usr/local/bin");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        SoftAssert sa = new SoftAssert(); //to validate all links without failing execution when broken link is tested

        for(WebElement link: links){

            //Step1: Get URL tied up to the link
            String url = link.getAttribute("href");
            //Step2: Java methods to call URLs and get status code
            HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
            conn.setRequestMethod("HEAD"); //using HEAD request http method
            conn.connect(); //connect() method of conn object
            int responseCode= conn.getResponseCode(); //get url connection response code e.g 200, 404
            System.out.println(responseCode);
            sa.assertTrue(responseCode<400,"Link with text " + link.getText() + " is broken with status code " + responseCode);
            /*if(responseCode>400){

                System.out.println("Link with text " + link.getText() + " is broken with status code " + responseCode);
                Assert.assertTrue(false);

            }*/

        }
        sa.assertAll();

    }

}
