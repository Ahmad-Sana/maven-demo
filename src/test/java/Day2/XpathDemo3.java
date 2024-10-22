import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class XpathDemo3 {

    public static void main(String[] args) throws InterruptedException {


        // Given I am on Sign Up Page
        // When I enter an invalid email and hit enter
        // Then I should get an error message "Enter a valid email address."

        WebDriver driver = new ChromeDriver();

        // Implicit wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        driver.get("https://www.instagram.com/");

//        Thread.sleep(2000);

        driver.findElement(By.linkText("Sign up")).click();


        driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']"))
                .sendKeys("hgsdhvcd", Keys.ENTER);


        Assert.assertTrue(driver.findElement(By.xpath("//div[.='Enter a valid email address.']")).isDisplayed());









    }
}
