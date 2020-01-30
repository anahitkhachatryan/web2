import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {


    @Test
    public void validLoginPage() {
        LoginClass loginTest = new LoginClass(driver);
        loginTest.openUrl();
        String actualOpenPageText = loginTest.getOpenPageText();
        String expectedOpenPageText="Welcome to the-internet";
        Assert.assertEquals(expectedOpenPageText,actualOpenPageText,"is opening wrong page");}
    @Test
    public void validLoginAndPass() {


        LoginClass loginTest = new LoginClass(driver);
        loginTest.openUrl();
        loginTest.formAuthentication();
        loginTest.loginPage("tomsmith", "SuperSecretPassword!");
        String actualLoginPageOpenPage=loginTest.getOpenLoginText();
        String expectedLoginPageOpenPage="You logged into a secure area!\n"+
"×";
        Assert.assertEquals(actualLoginPageOpenPage, expectedLoginPageOpenPage,"user don't login");
    }

//    @Test
//    public void inValidUserNameOrPass() {
//        LoginClass loginTest = new LoginClass(driver);
//
//        loginTest.loginPage("aaaa", "SuperSecretPassword!");
   //     loginTest.loginPage("tomsmith", "SuperSecretPassword");

     //   loginTest.verifyLoginAndPass("Your username is invalid!\n" +
       //         "×");
     //   loginTest.verifyLoginAndPass("Your password is invalid!\n" +
      //          "×");
    }
//}

