import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotTest extends BaseTest {
    @Test
    public void forgetPasswordPageIsValid() {
        ForgotClass forgotClass = new ForgotClass(driver);
        forgotClass.openUrl();


        forgotClass.forgetPassClick();

        forgotClass.getEmailadress("khachatryan.anahit@gmail.com");
        String actualForgetPageText = forgotClass.getForgetPasswordPageText();
        String expectedForgetPageText = "Your e-mail's been sent!";
        Assert.assertEquals(actualForgetPageText, expectedForgetPageText, "Don't open Forgot Password  page");
    }

    @Test
    public void ForgetPasswordEmptyEmailFildes() {

        ForgotClass forgotClass = new ForgotClass(driver);
        forgotClass.openUrl();


        forgotClass.forgetPassClick();
        forgotClass.fogetSubmitClick();
        String actualMissingEmailForgetPageText= forgotClass.getWrongFordatPassText();
        String expectedMissingEmailForgetPageText ="Internal Server Error";
        Assert.assertEquals(actualMissingEmailForgetPageText, expectedMissingEmailForgetPageText, "DOnt show massig");



    }
}
