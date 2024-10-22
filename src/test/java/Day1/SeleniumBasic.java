package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBasic {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");

        String currentURLOpended = driver.getCurrentUrl();
        System.out.println(currentURLOpended);

        String currentTitle =  driver.getTitle();
        System.out.println(currentTitle);

//        System.out.println(driver.getPageSource());

        if ( driver.getPageSource().contains("Selenium automates browsers. That's it!") ){
            System.out.println("Test passed.");
        } else {
            System.out.println("Test failed.");
        }

        driver.navigate().to("https://www.duotech.io/");
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().forward();
        Thread.sleep(1000);
        driver.navigate().refresh();



//        driver.quit(); //quits all open tabs and then ends the browser session
//        driver.close(); //only closes the currentyl active tab





    }


}