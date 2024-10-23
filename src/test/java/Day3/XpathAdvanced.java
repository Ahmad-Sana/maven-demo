package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class XpathAdvanced {

    @Test
    public void testcase() {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.carfax.com/");
        driver.findElement(By.linkText("Used Car Values")).click();
        //locate all a's with class attribute
        //a[@class]
        //locate all a's that do not have class attribute
        //a[not(@class)]


        //Advanced locating strategies based on child, parent and siblings
        //Locate a non-unique element by locating its parent
        //syntax: //parentLocator//childLocator

        driver.findElement(By.xpath("//div[@class='text-input vehicleInputFormStyle_vehicle-input-form__input__plate__gCjxu']//input[@type='text']"))
                .sendKeys("UGA1010");


        //locate a non-unique parent by its unique child
        //syntax: //childLocator//parent::tagName
        //h2[contains(text(), 'Step 1 - Enter your Zip Code')]//parent::div//parent::form

        System.out.println(driver.findElement(By.xpath("//h2[contains(text(), 'Step 1 - Enter your Zip Code')]//parent::div")).getText());

        //locate a non-unique element by its unique sibling BEFORE it
        //syntax: //uniqueSibling//preceding-sibling::tagName
//label[.='Vehicle Identification Number']//preceding-sibling::input

        driver.findElement(By.xpath("//label[.='Vehicle Identification Number']//preceding-sibling::input"))
                .sendKeys("WEHY647NUIISNM231");


        //locate a non-unique element by its unique sibling AFTER it
        //syntax: //uniqueSibling//following-sibling::tagName
        //input[@name='zip']//following-sibling::label
        System.out.println("-----------------------------------");
        String zipLabel = driver.findElement(By.xpath("//input[@name='zip']//following-sibling::label")).getText();
        System.out.println(zipLabel); //ZipCode





    }

}