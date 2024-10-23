package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandlingCheckboxes {

    @Test
    public void testcase() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.carfax.com/");
        driver.findElement(By.linkText("Used Car Values")).click();

        driver.findElement( By.cssSelector(".checkbox-input_box") ).click();
        Thread.sleep(2000);
       // ElementClickInterceptedException: happens when an element is covered by another element
        //one way to fix it is to click on the other element that is covering it
        //second way is to use JavaScript click - JSExecutor

        WebElement checkBox = driver.findElement( By.cssSelector(".checkbox-input_box") );
       if (! checkBox.isSelected() ){
           System.out.println("checkbox was not selected, so I clicked on it");
           checkBox.click();
       }


    }


}
