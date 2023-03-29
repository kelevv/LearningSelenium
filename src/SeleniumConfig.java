import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class SeleniumConfig {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "\\Users\\vikentii.kelevich\\IdeaProjects\\LearningSelenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options); //launch Chrome browser
        driver.get("https://www.facebook.com/");

        //get all links with 'a' tagName
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for (WebElement l : links) {
            System.out.println(l.getText());
        }
        //xPath contains() feature
        driver.findElement(By.xpath("//*[contains(text(),'Log In')]")).click();

        System.out.println();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.quit();
    }
}
