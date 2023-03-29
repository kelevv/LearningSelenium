import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frame {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "\\Users\\vikentii.kelevich\\IdeaProjects\\LearningSelenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options); //launch Chrome browser

        driver.get("http:omayo.blogspot.com");
        driver.switchTo().frame("navbar-iframe");
        driver.findElement(By.id("searchthis")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.cssSelector(".has-sub")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
