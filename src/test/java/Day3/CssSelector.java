package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class CssSelector {

    @Test
    public void test01(){

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.carfax.com/");
        driver.findElement(By.linkText("Used Car Values")).click();
//        driver.findElement(By.xpath("//input[@class='dswcd']")); //xpath expression
        //xpath expression
        //div[@class='text-input']

        //css selector expression
        // dot represents class attribute
        // tagName.valueOfClass
        //div.text-input - > there is a div with class = text-input
        //for multiple classes, use more than dot -> div.vehicleInputFormStyle_vehicle-input-form__input__zip-container__8pmYn.text-input
        List<WebElement> allLinks = driver.findElements( By.cssSelector("a.cgh__drop-menu-item") ); //css expression

        for (WebElement eachLink : allLinks){
            System.out.println( eachLink.getAttribute("href") );
        }


        //css selector expression
        // # represents id attribute
        // #vin
        driver.findElement(By.cssSelector("#plate")).sendKeys("UFA1010");


        //css expression for all attributes expect class and id
        //attribute is aria-label
        //tagName[attribute='value']
        //  input[aria-label='Vehicle Identification Number']

        driver.findElement( By.cssSelector("input[aria-label='License Plate Number']") ).clear();
        driver.findElement( By.cssSelector("input[aria-label='License Plate Number']") ).sendKeys("HELLO");


        //CSS expression
        //FOR DYNAMIC ELEMENTS, find the static/constant
        //starts with -> input[name^='name'] -> name83475384
        //end with -> input[name$='altemaile')] -> 873g38475altemaile
        //contains -> input[name*='empolyee'] -> 3sdf3432employee283ij39


    }



}
