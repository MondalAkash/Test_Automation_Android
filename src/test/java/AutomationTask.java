import env.base;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;



public class AutomationTask extends base {
    //AndroidDriver driver;
    @Test
    public void scenario01() throws InterruptedException {

        //driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"NopStation Cart\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnAccept")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Category\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[7]/android.widget.TextView")).click();
        Thread.sleep(2000);
        WebElement findMattressBedroom = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"Mattress Bedroom\"));"));
        Thread.sleep(5000);
        findMattressBedroom.click();
        Thread.sleep(2000);
        WebElement findPlusButton = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"+\"));"));
        findPlusButton.click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnAddToCart")).click();
        Thread.sleep(2000);
        String counter = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/counterText")).getText();
        System.out.println(counter);

    }

    @Test
    public void scenario02()throws InterruptedException
    {
        //driver.launchApp();
        Thread.sleep(5000);
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/menu_cart")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnCheckOut")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnGuestCheckout")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etFirstName")).sendKeys("Abc");
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etLastName")).sendKeys("Def");
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etEmail")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/countrySpinner")).click();
        WebElement findBangladesh = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"Bangladesh\"));"));
        findBangladesh.click();
        Thread.sleep(5000);
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/stateSpinner")).click();
        WebElement findDhaka = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"ঢাকা\"));"));
        findDhaka.click();
        Thread.sleep(2000);
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etCompanyName")).sendKeys("XYZ Ltd.");
        Thread.sleep(2000);
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etCity")).sendKeys("Dhaka");
        Thread.sleep(2000);
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etStreetAddress")).sendKeys("Dhaka");
        Thread.sleep(2000);
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/etZipCode")).sendKeys("1219");
        Thread.sleep(2000);
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout[2]/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/com.bs.ecommerce.customViews.RadioGridGroupforReyMaterial/android.widget.RelativeLayout[4]")).click();
        WebElement findContinue = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"Continue\"));"));
        findContinue.click();
        Thread.sleep(8000);
        WebElement findCheckMoneyOrder = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"Check / Money Order\"));"));
        findCheckMoneyOrder.click();
        WebElement findContinue1 = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"Continue\"));"));
        findContinue1.click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")).click();
        driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/btnContinue")).click();
        String expectedMessage = "Your order has been successfully processed!";
        String actualMessage = driver.findElement(By.id("com.nopstation.nopcommerce.nopstationcart:id/md_text_message")).getText();
        System.out.println(actualMessage);

    }



}
