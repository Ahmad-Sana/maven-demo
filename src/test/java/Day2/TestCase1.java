import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestCase1 {


    public static void main(String[] args) throws InterruptedException {


        // Open the Chrome Browser
        WebDriver driver = new ChromeDriver();
        // Go to homepage
        driver.get("https://www.instagram.com/");
        //ADD A WAIT
        Thread.sleep(2000);
        // Click on the Sign up link
        WebElement link = driver.findElement(By.linkText("Sign up"));
        link.click();
        // Verify that I am on sign up page
        String currentURL = driver.getCurrentUrl();
        String expectedURL = "https://www.instagram.com/accounts/emailsignup/";
        Assert.assertEquals(currentURL, expectedURL);
        // Close the browser
        driver.quit();

    }
}
