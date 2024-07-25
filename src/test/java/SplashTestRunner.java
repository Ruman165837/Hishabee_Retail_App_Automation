import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SplashTestRunner extends Setup {
    SplashScreen screen;

    @Test(priority = 1, description = "login")

        public void x () throws InterruptedException {

        screen = new SplashScreen(driver);

        screen.login();
        Thread.sleep(5000);


    }
}

