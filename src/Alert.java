import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "\\Users\\vikentii.kelevich\\IdeaProjects\\LearningSelenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options); //launch Chrome browser

        String url = "https://www.testandquiz.com/selenium/testing.html";
        driver.manage().window().maximize();
        driver.get(url);

        driver.findElement(By.cssSelector("body > div > div:nth-child(22) > div > p:nth-child(1) > button")).click();
        Thread.sleep(3000);

        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("body > div > div:nth-child(22) > div > p:nth-child(1) > button")).click();
        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);

        driver.quit();
    }
}
