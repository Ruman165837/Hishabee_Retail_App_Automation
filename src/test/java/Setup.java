import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Setup {
    public static final String PACKAGE_ID="com.hishabee.business";
    AndroidDriver driver;
    @BeforeTest
    public AndroidDriver setUp() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("appium:platformName","Android");
        cap.setCapability("appium:platformVersion","10");
        cap.setCapability("appium:deviceName","Xiaomi M2006C3MI");
        cap.setCapability("appium:appPackage", PACKAGE_ID);
        cap.setCapability("appium:app","C:\\SQA\\APK\\dokan-release.apk");
        cap.setCapability("appium:appActivity", "com.hishabee.business.SplashScreen.SplashScreen");
        cap.setCapability("appium:automationName", "UiAutomator2");
        URL url = new URL("http://127.0.0.1:4723");
        driver = new AndroidDriver(url, cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }

    @AfterTest
    public void quitDriver(){
        driver.quit();
    }
}

