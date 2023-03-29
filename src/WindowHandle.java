import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "\\Users\\vikentii.kelevich\\IdeaProjects\\LearningSelenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(options); //launch Chrome browser

        String url = "http://omayo.blogspot.com";
        driver.get(url);

        String handle1 = driver.getWindowHandle();
        System.out.println("Handle of window1: " + handle1);

        driver.findElement(By.linkText("SeleniumTutorial")).click();

        Set<String> handleAll = driver.getWindowHandles();
        System.out.println("Handles of all windows: " + handleAll);

        driver.switchTo().window(handle1);
        handleAll.remove(handle1);
        handle1 = handleAll.iterator().next();
        driver.switchTo().window(handle1);
        driver.quit();
    }
}
