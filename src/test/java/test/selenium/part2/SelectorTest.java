package test.selenium.part2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class SelectorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Relative xpath
        driver.findElement(By.xpath("//input[@type='text]")).sendKeys("Razukhan");
        Thread.sleep(2000);
        //Name
        driver.findElement(By.name("password")).sendKeys("123456");
        Thread.sleep(3000);

        //linkTest
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(2000);

        //partial link test
        driver.findElement(By.partialLinkText("n info?")).click();
        Thread.sleep(2000);

        //css selector
        driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("Aminul islam");
        driver.findElement(By.id("lastName")).sendKeys("Raju");
        driver.findElement(By.id("address.state")).sendKeys("Dhaka Badda");

        List< WebElement> webElements = driver.findElements(By.tagName("a"));
        for (WebElement webElement :webElements){
            System.out.println(webElement.getText() + " " +webElement.getAttribute("href"));
        }
        driver.quit();
    }
}