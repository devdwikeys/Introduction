package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class dragAndDropPointer {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        Actions actions = new Actions(driver);

        WebElement frame = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(frame);
        WebElement dragable  = driver.findElement(By.xpath("//*[@id='draggable']"));
        actions.dragAndDrop(dragable, driver.findElement(By.xpath("//*[@id='droppable']"))).build().perform();
        driver.switchTo().defaultContent();






    }
}
