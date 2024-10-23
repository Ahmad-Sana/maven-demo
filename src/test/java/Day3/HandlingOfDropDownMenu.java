package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandlingOfDropDownMenu {

    @Test
    public void testcase() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.carfax.com/");
        driver.findElement(By.linkText("Used Car Values")).click();

        WebElement dropDown = driver.findElement(By.cssSelector("#us-state"));

        Select dropDownMenu = new Select(dropDown);
        //1st: SelectByValue
//        dropDownMenu.selectByValue("VA");

        //2nd: SelectByVisbileText
//        dropDownMenu.selectByVisibleText("IL");

        //3rd: SelectByIndex
//        dropDownMenu.selectByIndex(1);

        //in one line, i can write the same code
//      new Select( driver.findElement(By.cssSelector("#us-state")) ).selectByVisibleText("IL");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        //There are deselect methods but they only work with multi-select option
//        dropDownMenu.deselectByVisibleText("January"); //UnsupportedOperationException: You may only deselect options of a multi-select

        Select menu = new Select( driver.findElement(By.cssSelector("#us-state")) );
        WebElement firstText = menu.getFirstSelectedOption();
        System.out.println( "text inside teh firstSelectedOption: " + firstText.getText() );






    }
}
