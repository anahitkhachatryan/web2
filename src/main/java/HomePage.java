import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HomePage extends BaseClass {
    private WebDriver driver;
    public HomePage(WebDriver driver)
   {
       super(driver);
   }
    String url="https://the-internet.herokuapp.com/";
//    By userName= By.id("username");
//    By pass=By.id("password");
//    By submit=By.className("radius");
    public HomePage homePage(){

        driver = new ChromeDriver();
        driver.get(url);
        return this;
    }
}
