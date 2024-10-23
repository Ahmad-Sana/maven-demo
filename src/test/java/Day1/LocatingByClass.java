package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LocatingByClass {

    //There are 8 different locators in Selenium:
    //id, name,
    // className, tagName: - used to get multiple elements at the same time
    // linkText, partialLinkText, - used for link
    // xpath, cssSelector - customizable

    @Test
    public void testCase001(){


        WebDriver driver = null;
        try {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.google.com/");

            driver.findElement( By.name("q") ).sendKeys("dragon", Keys.ENTER);


            driver.findElement( By.linkText("Used Car Values"));

//            System.out.println( driver.findElement( By.className("yuRUbf")).getText() );

            //Get all divs that have ClassName as yuRUbf
            //use FindElements()
            List<WebElement> allDivs = driver.findElements( By.className("LC20lb") );
            for ( WebElement eachDiv : allDivs){
                System.out.println(eachDiv.getText());
            }



        } finally {
            driver.close();

        }

    }



}
