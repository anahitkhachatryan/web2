import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BaseClass {
    private WebDriver driver;
    private WebDriverWait wait;



    public  BaseClass (WebDriver driver){
        this.driver = driver;

    }


    public void click (By elementBy) {

        driver.findElement(elementBy).click();

    }
    public void sendKeys (By elementBy, String text) {
        driver.findElement(elementBy).sendKeys(text);
    }
    public String getText (By elementBy) {
        return driver.findElement(elementBy).getText();
    }
    public void assertEquals (By elementBy, String expectedText) {

        Assert.assertEquals(getText(elementBy), expectedText);

    }
}

