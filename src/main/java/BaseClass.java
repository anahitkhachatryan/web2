import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BaseClass {
    private WebDriver driver;

    public BaseClass(WebDriver driver) {
        this.driver = driver;

    }


    public void click(By elementBy) {
        driver.findElement(elementBy).click();
    }


    public void sendKeys(By elementBy, String text) {
        driver.findElement(elementBy).sendKeys(text);
    }


    public String getText(By elementBy) {
        return driver.findElement(elementBy).getText();
    }

    public void getUrl(String url) {
        driver.get(url);
    }


}


