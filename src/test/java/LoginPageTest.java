import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPageTest extends LoginTest {
    public LoginPageTest(WebDriver driver) {
        super(driver);
    }

    @Test
            public void validLoginPage() {
        LoginTest loginTest = new LoginTest(driver);
        loginTest.loginPage("tomsmith","SuperSecretPassword!");
    }
        @Test
                public void inValidUserNameOrPass(){
            LoginTest loginTest = new LoginTest(driver);
        loginTest.loginPage("aaaa","SuperSecretPassword!");
        loginTest.loginPage("tomsmith","SuperSecretPassword");
        loginTest.verifyLoginAndPass("Your username is invalid!\n"+
                               "×");
        loginTest.verifyLoginAndPass("Your password is invalid!\n"+
                "×");
    }
}

