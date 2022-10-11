package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingswithXpathTraverse {
    public static void main(String[] args){
        System.setProperty("chromedriver", "/usr/local/bin");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //Correct first try:
        // System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
        //traversing methods are not possible in CSS

        //from parent to child
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]")).getText());
        //from parent to child to sibling
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());

    }
}
