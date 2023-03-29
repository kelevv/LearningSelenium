import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Selects {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "\\Users\\vikentii.kelevich\\IdeaProjects\\LearningSelenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options); //launch Chrome browser

        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();

        WebElement contentsDropdown = driver.findElement(By.id("oldSelectMenu"));

        Select oSelect = new Select(contentsDropdown);

        oSelect.selectByVisibleText("Yellow");

        Thread.sleep(5000);
        driver.quit();
    }
}
