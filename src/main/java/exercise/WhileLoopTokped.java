package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WhileLoopTokped {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://seller.tokopedia.com/edu/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,300)");

        WebElement cookie = driver.findElement(By.xpath("//button[text()='Atur Cookie']"));
        if (cookie.isDisplayed()){
            cookie.click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("//button[@id='close-pc-btn-handler']")).click();
        }
        List<WebElement> tabButton = driver.findElements(By.xpath("//*[contains(@data-testid,'icnSellereduSelectedtopicDynamicIcon')]"));
        System.out.println(tabButton.size());

//        for (WebElement clickTabButton : tabButton){
//            Actions ctrl = new Actions(driver);
//            ctrl.moveToElement(clickTabButton).keyDown(Keys.CONTROL).click().build().perform();
//            Thread.sleep(3000);
//        }
        for (WebElement clickTabButton2 : tabButton){
            String link = clickTabButton2.getAttribute("href");
            js.executeScript("window.open('"+link+"','_blank','_blank');" );
            Thread.sleep(3000);
        }
        for (String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
            String infolink = driver.getCurrentUrl();
            System.out.println(infolink);
        }
    }

}
