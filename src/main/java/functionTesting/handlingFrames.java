package functionTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingFrames {
    public static void main (String[] args)
    {

        System.setProperty("chromedriver", "/usr/local/bin/");
        WebDriver driver = new ChromeDriver();

        driver.get("https://jqueryui.com/droppable/");
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        driver.switchTo().frame(0); // can use index to find frame / not recommended but another strategy
        //driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
        Actions dragAction = new Actions(driver); // Actions class with driver
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        dragAction.dragAndDrop(source, target).build().perform(); //action object for drag and drop function
        driver.switchTo().defaultContent(); //to switch to default content to continue with other operations


    }
}
