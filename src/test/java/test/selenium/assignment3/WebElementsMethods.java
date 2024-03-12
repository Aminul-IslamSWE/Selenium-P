package test.selenium.assignment3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.time.Duration;

public class WebElementsMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver=new FirefoxDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        Thread.sleep(2000);

        driver.findElement(By.id("firstName")).sendKeys("Aminul Islam");
        driver.findElement(By.id("lastName")).sendKeys("Raju");
        driver.findElement(By.id("userEmail")).sendKeys("aminulislam.swe@gmail.com");

        driver.findElement(By.cssSelector("label[for='gender-radio-1']")).click();

        WebElement checkBox=driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        System.out.println(checkBox.isDisplayed());
        checkBox.click();
        System.out.println(checkBox.isSelected());
        System.out.println("getTagName :"+checkBox.getTagName());
        System.out.println("getTagName :"+checkBox.getRect().height);
        System.out.println("font-family:"+checkBox.getCssValue("font-family"));
        System.out.println("font-family:"+checkBox.getText());

        driver.quit();
    }
}
