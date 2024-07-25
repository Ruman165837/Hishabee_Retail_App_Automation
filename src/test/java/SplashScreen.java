import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class SplashScreen {
    @FindBy(id = Setup.PACKAGE_ID+":id/welcomeMobile")
    WebElement btnNumberInput;

    @FindBy(id = Setup.PACKAGE_ID+":id/btnContinue")
    WebElement btnSubmit;

    @FindBy(id = Setup.PACKAGE_ID+":id/loginPassword")
    WebElement btnPin;

    @FindBy(id = Setup.PACKAGE_ID+":id/loginButton")
    WebElement btnlogin;

    @FindBy(xpath = "(//android.widget.Button[@resource-id=\"com.hishabee.business:id/shopListItemSelect\"])[1]")
    WebElement btnShopSelect;

    public SplashScreen(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    public void login() throws InterruptedException {

        btnNumberInput.click();
        btnNumberInput.sendKeys("01786368387");
        btnSubmit.click();

        btnPin.click();
        btnPin.sendKeys("12345");
        btnlogin.click();

        btnShopSelect.click();



    }








}
