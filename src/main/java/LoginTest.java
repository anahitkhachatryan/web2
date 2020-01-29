import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest extends BaseClass {


    public LoginTest(WebDriver driver) {
        super(driver);
    }
    WebDriver driver;
    By userNameBy= By.id("username");
    By passBy=By.id("password");
    By submit=By.className("radius");
    By actualUserNameAnfPass=By.cssSelector("div[class='flash error']");

    public void loginPage(String username, String pass){
        sendKeys(userNameBy,username);
        sendKeys(passBy,pass);
        click(submit);


    }
    public void verifyLoginAndPass(String expectedText){

        assertEquals(actualUserNameAnfPass, expectedText);

    }
}
