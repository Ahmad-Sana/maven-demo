package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.security.Key;
import java.time.Duration;
import java.util.List;

public class HandlingCheckboxes2 {

    @Test
    public void testcase() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        driver.findElement(By.cssSelector("#ctl00_MainContent_username")).sendKeys("Tester", Keys.TAB, "test", Keys.ENTER);

       List<WebElement> allCheckBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));

       WebElement fourthBox = driver.findElement(By.cssSelector("#ctl00_MainContent_orderGrid_ctl05_OrderSelector"));

       for (WebElement eachBox : allCheckBoxes ){
           if (! eachBox.getAttribute("id").equals("ctl00_MainContent_orderGrid_ctl07_OrderSelector") ){
            eachBox.click();
           }
       }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
       driver.findElement(By.cssSelector(".btnDeleteSelected")).click();

       driver.findElement( By.cssSelector("a[href='Process.aspx']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.findElement(By.cssSelector("input[value='American Express']")).click();


    }


}
