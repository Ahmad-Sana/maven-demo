package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicElements {

    @Test
    public void testcase() {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

        driver.findElement(By.xpath("//input[starts-with(@name, 'name')]")).sendKeys("John Doe");

        //to work with dynamic elements, we need to get an attribute that stays static/constant and use the method
        //input[starts-with(@name, 'name')] -> name83475384
        //input[ends-with(@name, 'altemaile')] -> 873g38475altemaile
        //input[contains(@id, 'employee')] -> 3sdf3432employee283ij39

        //CSS expression
            //FOR DYNAMIC ELEMENTS, find the static/constant
        //input[name^='name'] -> name83475384
        //input[name$='altemaile')] -> 873g38475altemaile
        //input[name*='empolyee'] -> 3sdf3432employee283ij39



}
}
