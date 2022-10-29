package AutomateWebElements;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsQuiz {
    {

        System.setProperty("chromedriver", "/usr/local/bin");
        WebDriver driver = new ChromeDriver();

        //From Rahul Shetty - Selenium with Java - Udemy
        System.out.println("Q1: In order to identify static dropdowns, what class and methods are used in Selenium Web Driver?");
        System.out.println("A: Class - Select&&Method - selectByVisibleText()");

        System.out.println("Q2: In a webpage, if there are three elements with same xpath value, how do we explicitly identify the third element on the page with the help of index. " +
                "Let us consider, the matching xpath be //input[@name=’Selenium’]");
        System.out.println("A: (//input[@name='Selenium'][3]");

        System.out.println("Q3: How do count number of checkboxes on a webpage?");
        System.out.println("A: driver.findElements(By.cssSelector("input[type='checkbox']")).size()";

        System.out.println("Q4: How do we capture the message visible on the alerts?");
        System.out.println("A: driver.switchTo().alert.getText()");

        System.out.println("Q5: Identify the method used in Selenium WebDriver to get the status of the radio buttons or checkboxes (selected or not).");
        System.out.println("A: Class - Select&&Method - selectByVisibleText()");

        System.out.println("Q6: In order to identify static dropdowns, what class and methods are used in Selenium Web Driver?");
        System.out.println("A: isSelected()");

        System.out.println("Q7: Identify the method used in Selenium WebDriver to verify the presence of a web element within the web page.");
        System.out.println("A: isDisplayed()");

    }
}
