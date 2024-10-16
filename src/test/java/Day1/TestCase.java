package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class TestCase {

    public static void main(String[] args) {

        //Google search Functionality

        //Step 1: Open chrome browser and also maximise
        WebDriver driver = null;
        try {
            driver = new ChromeDriver();
            driver.manage().window().maximize();

            //Step 2: Go to Google.com
            driver.get("https://www.google.com/");

            //Step 3: Type in searchBar and search for "dragon"
            String searchTerm = "dragon";

            //locates the searchBar element using By()
            WebElement searchBar = driver.findElement(By.name("q"));
            searchBar.sendKeys(searchTerm, Keys.ENTER); //mimics keyboard function

            //chain methods
//        driver.findElement( By.name("q") ).sendKeys("dragon", Keys.ENTER);


            //Step 4: On the search result page, verify the title of the page is the same as search term
            String expectedTerm = "dragon";
            String actualTitle = driver.getTitle();
            String expectedTitle = "dragon - Google Search";


            //Proper verification from TestNG
            Assert.assertEquals(actualTitle, expectedTitle);//checks if 2 strigns are equal to each other
            //does not return anything but it will stop execution if TC fails
            Assert.assertTrue(actualTitle.contains(expectedTitle)); //checks if a condition is true


//         if ( actualTitle.contains(expectedTerm)  ){
//             System.out.println("PASS");
//         }else {
//             throw new AssertionError("Test failed. The actual title was: " + actualTitle +
//                     " the expected term: " + expectedTerm);
//         }
        } finally {
        //Sept 5: close browser
        driver.close();

        }


    }

}
