import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginClass extends BaseClass {


    public LoginClass(WebDriver driver) {
        super(driver);
    }

    WebDriver driver;
    String url = "https://the-internet.herokuapp.com/";
    By getLoginedPageText =By.cssSelector("div[class='flash success']");
    By getText=By.cssSelector("h1[class='heading']");
    By userNameBy = By.id("username");
    By passBy = By.id("password");
    By submit = By.className("radius");
    By formAuthentication = By.linkText("Form Authentication");
    By actualUserNameAnfPass = By.cssSelector("div[class='flash error']");

    public void openUrl() {

        driver = new ChromeDriver();
        getUrl(url);
       // driver.get(url);
    }
    public String getOpenPageText(){
        System.out.println(getText(getText));
       return   getText(getText);
    }
    public String getOpenLoginText(){
        System.out.println(getText(getLoginedPageText));
        return getText(getLoginedPageText);
    }

    public void formAuthentication() {
        click(formAuthentication);
    }

    public void loginPage(String username, String pass) {
        sendKeys(userNameBy, username);
        sendKeys(passBy, pass);
        click(submit);


    }

}
