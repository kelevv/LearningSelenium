import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;

public class WebElements {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "\\Users\\vikentii.kelevich\\IdeaProjects\\LearningSelenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options); //launch Chrome browser

        driver.get("https://facebook.com");

        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("testmail@mail.com");

        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("QAA!@!!1");
        password.submit();

        WebElement login = driver.findElement(By.name("login"));
        //login.submit();
        Thread.sleep(3000);
        driver.quit();


    }
}
