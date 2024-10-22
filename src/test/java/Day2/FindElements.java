import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElements {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.instagram.com/");

        Thread.sleep(2000);

//        WebElement inputBox = driver.findElement(By.className("_aa4b"));//locates the first matching element in the HTML
//
//        inputBox.sendKeys("Hello");


        List<WebElement> elements = driver.findElements(By.className("_aa4b"));

        for (WebElement element : elements) {
            element.sendKeys("Hello");
        }



    }
}
