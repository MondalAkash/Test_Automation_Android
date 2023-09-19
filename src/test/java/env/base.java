package env;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.android.nativekey.AndroidKey.HOME;

public class base {
    public static AndroidDriver driver;
    @BeforeTest
    public void installAppFirstTimeOnly() throws MalformedURLException
    {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "13");
        cap.setCapability("udid", "R3CN90P9TKR");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("app", "C:\\Users\\am114\\Downloads\\nopstationCart_4.40.apk");
        cap.setCapability("appPackage", "com.nopstation.nopcommerce.nopstationcart");
        cap.setCapability("noReset", "true");
        cap.setCapability("fullReset", "false");
        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(url, cap);
        String sessionId = driver.getSessionId().toString();
        System.out.println(sessionId);
        //driver.pressKey(new KeyEvent(HOME));
    }
//    @BeforeTest
//    public void openApp()
//    {
//        dr
//
//    }
    @AfterTest
    public void closeApp()
    {
        driver.closeApp();
    }

}
