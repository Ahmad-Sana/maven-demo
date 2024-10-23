package Day3;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class HandlingOfDropDownMenu2 {

    @Test
    public void testcase() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.autotrader.com/");

        Select dropDown = new Select( driver.findElement(By.cssSelector("select[name='makeCode']")) );

//        String actaulFromWebPage = dropDown.getFirstSelectedOption().getText();
//        String expectedText = "Any Make";
//
//        Assert.assertEquals(actaulFromWebPage, expectedText);


        //task: verify 'Any Model' and 'Air' is present
        //Step 1: select Lucid from dropDown menu
        //Step 2: get all the options from second drop down menu
        //Step 3: verify if 'Any Model' and 'Air' is present on DOM

        //Step 1:
        dropDown.selectByVisibleText("Lucid");

        //step 2:
        Select secondDropMenu = new Select( driver.findElement(By.cssSelector("select[name='ModelCode']")) );
        List<WebElement> allOptions =  secondDropMenu.getOptions();

        List<String> actualOptionsAsText = new ArrayList<>();

        for ( WebElement eachOption : allOptions ){
            System.out.println(eachOption.getText());
            actualOptionsAsText.add( eachOption.getText() );
        }

        //Step 3:
        List<String> expectedList = List.of("Any Model");
        Assert.assertEquals( actualOptionsAsText, expectedList);


    }
}
