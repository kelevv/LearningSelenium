import graphql.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PracticeOne {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "\\Users\\vikentii.kelevich\\IdeaProjects\\LearningSelenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.economist.com/");
        String pageTitle = driver.getTitle();
        System.out.println("Page title: " + pageTitle);
        System.out.println("Page title length: " + pageTitle.length());
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.economist.com/"));
        String pageSource = driver.getPageSource();
        System.out.println("Page source length: "+ pageSource.length());
        driver.quit();
    }
}
