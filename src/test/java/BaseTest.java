import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    public WebDriver driver;

    @BeforeClass
    public void openPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\anahit.khachatryan\\IdeaProjects\\POMmodel\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @AfterClass
    public void closePage() {
        driver.quit();
    }

}
