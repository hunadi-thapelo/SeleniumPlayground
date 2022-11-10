package functionTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingNestedFrames {
    public static void main (String[] args)
    {
        System.setProperty("chromedriver", "/usr/local/bin/");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/nested_frames");
        //System.out.println(driver.findElements(By.tagName("frame")).size()); //get number of outside frames
        driver.switchTo().frame(driver.findElement(By.name("frame-top")));
        //System.out.println(driver.findElements(By.tagName("frame")).size()); //get number of inside (smaller) frames
        driver.switchTo().frame(1); //locate frame by index - to operate on
        System.out.println(driver.findElement(By.id("content")).getText()); //get text and print to console
        driver.switchTo().defaultContent();

        //instructor's solution:
        //driver.get("http://the-internet.herokuapp.com/");
        //driver.findElement(By.linkText("Nested Frames")).click();
        //driver.switchTo().frame("frame-top");
        //driver.switchTo().frame("frame-middle");
        //System.out.println(driver.findElement(By.id("content")).getText());

    }
}
