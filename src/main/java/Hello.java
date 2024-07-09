import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class Hello {

    public static void main(String[] args) throws InterruptedException {

        //setting path chromedriver.exe //D:\dev-dwiki\WebDriver\ChromeDriver\chromedriver-win64
        //System.setProperty("webdriver.chrome.driver","D:\\dev-dwiki\\WebDriver\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
        //create an obnject to new chromedriver
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice");

        /*
        Type2 locators yang dapat diambil oleh selenium
        By ID
        By Xpath
        By Css Selector
        By name
        By Tag Name
        By Link Text
        By Partial Link Text
         */

        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Dwiki");
        driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='chkboxOne']")).click();
        driver.findElement(By.xpath("//input[@name='chkboxTwo']")).click();
        driver.findElement(By.xpath("//button[contains(text(),\"Sign In\")]")).click();
        Thread.sleep(5000);
        String validations = driver.findElement(By.xpath("//p[@class='error']")).getText();
        System.out.println(validations);
        if (validations.equals(driver.findElement(By.xpath("//p[@class='error']")).getText())){
            System.out.println("validations Success");
        }

    }
}
