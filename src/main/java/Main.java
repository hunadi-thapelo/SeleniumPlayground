import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        // Setting path to where on the computer the chrome driver is saved
        // first argument is the name of the file second argument is the location
        System.setProperty("chromedriver", "/usr/local/bin");

        // creating an instance of the Chromedriver Class and calling it driver
        ChromeDriver driver = new ChromeDriver();

        // We set to full screen
        driver.manage().window().maximize();

        // here we access the browser
        driver.get("https:www.youtube.com");
        System.out.println(driver.getTitle());
        // closes the current window or the window originally opened
        driver.close();
        // quits the browser, closing all associated windows
        driver.quit();
    }
}