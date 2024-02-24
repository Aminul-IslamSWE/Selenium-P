package test.selenium.class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class FindElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");


        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        List< WebElement> WebElements=driver.findElements(By.tagName("input"));
        System.out.println("Total links :" + WebElements.size());

        Thread.sleep(3000);
        driver.quit();
    }
}
