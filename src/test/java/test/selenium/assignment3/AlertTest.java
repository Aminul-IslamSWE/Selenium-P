package test.selenium.assignment3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class AlertTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver=new FirefoxDriver();
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));

        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(1500);
        driver.switchTo().alert().accept();
        Thread.sleep(1500);

         //Confirmation alert

        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(1500);
        driver.switchTo().alert().dismiss();
        Thread.sleep(1500);

        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(1500);
        driver.switchTo().alert().accept();
        Thread.sleep(1500);

    //prompt alert
        driver.findElement(By.id("promtButton")).click();

        Alert alert=driver.switchTo().alert();
        alert.sendKeys("Hi! My name is Aminul Islam Raju");
        Thread.sleep(1500);
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(1500);


        driver.quit();
    }
}
