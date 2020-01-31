import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginClass extends BaseClass {


    public LoginClass(WebDriver driver) {
        super(driver);
    }

    WebDriver driver;
    String url = "https://the-internet.herokuapp.com/";
    By getLoginedPageText = By.cssSelector("div[class='flash success']");
    By getText = By.cssSelector("h1[class='heading']");
    By userNameBy = By.id("username");
    By passBy = By.id("password");
    By submit = By.className("radius");
    By formAuthentication = By.linkText("Form Authentication");
    By actualUserNameAnfPass = By.cssSelector("div[class='flash error']");
    By logOutBy = By.cssSelector("a[class='button secondary radius']");
    By logOutTexBy = By.cssSelector("div[class='flash success']");

    public void openUrl() {


        getUrl(url);

    }

    public String getOpenPageText() {

        return getText(getText);
    }

    public String getOpenLoginText() {

        return getText(getLoginedPageText);
    }

    public String getWrongLoginOrPassText() {


        return getText(actualUserNameAnfPass);
    }

    public String getLogOutPageText() {

        return getText(logOutTexBy);
    }

    public void formAuthentication() {
        click(formAuthentication);
    }

    public void logOut() {
        click(logOutBy);
    }

    public void loginPage(String username, String pass) {
        sendKeys(userNameBy, username);
        sendKeys(passBy, pass);
        click(submit);
    }

}
