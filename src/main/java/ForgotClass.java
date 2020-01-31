import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotClass extends LoginClass {

    public ForgotClass(WebDriver driver) {
        super(driver);
    }

    WebDriver driver;
    By forgetPasswordPageText = By.cssSelector("div[id='content']");
    By forgetPassLink = By.linkText(("Forgot Password"));
    By emailBy = (By.id("email"));
    By submit = By.id("form_submit");
    By actualMissingEmailForgetPageText = By.cssSelector("body");

    public String getForgetPasswordPageText() {
        //    System.out.println(getText(forgetPasswordPageText));
        return getText(forgetPasswordPageText);
    }

    public void forgetPassClick() {
        click(forgetPassLink);
    }

    public void fogetSubmitClick() {
        click(submit);
    }

    public String getWrongFordatPassText() {
        //  System.out.println(getText(actualUserNameAnfPass));

        return getText(actualMissingEmailForgetPageText);
    }

    public void getEmailadress(String email) {
        sendKeys(emailBy, email);
        click(submit);
    }
}