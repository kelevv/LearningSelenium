import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PracticeTwo {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "\\Users\\vikentii.kelevich\\IdeaProjects\\LearningSelenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options); //launch Chrome browser

        driver.navigate().to("https://en.wikipedia.org");
        driver.findElement(By.linkText("Help desk")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("https://en.wikipedia.org");
        driver.navigate().refresh();
        driver.quit();
    }
}
