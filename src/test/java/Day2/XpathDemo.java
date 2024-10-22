import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class XpathDemo {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.instagram.com/");

        Thread.sleep(2000);

       driver.findElement(By.name("username")).sendKeys("invalidUsername");
       driver.findElement(By.name("password")).sendKeys("pass123");

       driver.findElement(By.xpath("//button[@type='submit']")).click();

       //nameOftheTag[@attr='value']

        Thread.sleep(1000);
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='_ab2z']")).isDisplayed());

    }
}
