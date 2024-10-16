package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCaseUsingTestNgAnnotations {


    @Test
    public void testCase001(){


        WebDriver driver = null;
        try {
            driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://www.google.com/");

            String searchTerm = "dragon";
            WebElement searchBar = driver.findElement(By.name("q"));
            searchBar.sendKeys(searchTerm, Keys.ENTER); //mimics keyboard function

            String expectedTerm = "dragon";
            String actualTitle = driver.getTitle();
            String expectedTitle = "dragon - Google Search";

            Assert.assertEquals(actualTitle, expectedTitle);//checks if 2 strigns are equal to each other

        } finally {
            driver.close();

        }

    }


    @Test
    public void testCase002(){


        WebDriver driver = null;
        try {
            driver = new ChromeDriver();
            driver.manage().window().maximize();

            driver.get("https://www.google.com/");

            String searchTerm = "dragon";
            WebElement searchBar = driver.findElement(By.name("q"));
            searchBar.sendKeys(searchTerm, Keys.ENTER); //mimics keyboard function

            String expectedTerm = "dragon";
            String actualTitle = driver.getTitle();
            String expectedTitle = "dragon - Google Search333";

            Assert.assertEquals(actualTitle, expectedTitle);//checks if 2 strigns are equal to each other

        } finally {
            driver.close();

        }

    }



}
