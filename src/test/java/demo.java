import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo {

    public static void main(String[] args) {

//        WebDriver driver = new EdgeDriver();

        Faker faker = new Faker();

        System.out.println(faker.business().creditCardNumber());
        System.out.println(faker.chuckNorris().fact());



    }

}
