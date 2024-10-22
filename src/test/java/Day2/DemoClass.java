import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DemoClass {

    public static void main(String[] args) {

        System.out.println("Hello");
        WebDriver driver = new ChromeDriver();

        Assert.assertEquals(1,2);
    }
}
