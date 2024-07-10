package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MoveToNewWindow {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://seller.tokopedia.com/edu/");

        List<WebElement> tabButton = driver.findElements(By.xpath("//*[contains(@data-testid,'icnSellereduSelectedtopicDynamicIcon')]"));
        System.out.println(tabButton.size());
        for (WebElement clickNewWindow : tabButton){
            JavascriptExecutor js = (JavascriptExecutor) driver;

        }
    }
}
