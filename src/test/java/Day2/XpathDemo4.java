import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class XpathDemo4 {

    public static void main(String[] args) throws InterruptedException {


        // Given I am on Sign Up Page
        // When I enter an invalid mobile number and hit enter
        // Then I should get an error message "Looks like your phone number may be incorrect. Please try entering your full number, including the country code."

        WebDriver driver = new ChromeDriver();

        // Implicit wait
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        driver.get("https://www.instagram.com/");

//        Thread.sleep(2000);

        driver.findElement(By.linkText("Sign up")).click();


        driver.findElement(By.xpath("//input[@aria-label='Mobile Number or Email']"))
                .sendKeys("12345", Keys.ENTER);


//        Assert.assertTrue(driver.findElement(By.xpath("//div[.='Looks like your phone number may be incorrect. Please try entering your full number, including the country code.']")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(), 'Please try')]")).isDisplayed());









    }
}
