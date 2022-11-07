package functionTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class assignmentHandlingWindows {
    public static void main(String[] args)
    {
        System.setProperty("chromedriver", "/usr/local/bin/");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.xpath("//a[@href='/windows/new']")).click();
        Set<String> windows = driver.getWindowHandles(); //retrieve window handles set string
        Iterator<String> id = windows.iterator(); //object to iterate
        String parentId = id.next();
        String childId = id.next(); //to move drive control to child window
        driver.switchTo().window(childId); //switch control to child window
        System.out.println(driver.findElement(By.cssSelector("h3")).getText());
        driver.switchTo().window(parentId);//switch control to parent window
        System.out.println(driver.findElement(By.cssSelector("h3")).getText());

    }
}
