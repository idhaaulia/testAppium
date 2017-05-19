
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Istiana on 5/19/17.
 */
public class summaryTest {
    public DesiredCapabilities capabilities = new DesiredCapabilities();
    public AppiumDriver driver;

    @Test
    public void TC_01() throws InterruptedException, MalformedURLException {
        File appDir = new File("/Users/c07nw8xpg1hw/Documents");
        File app = new File(appDir, "DigitalOnboarding.app" );
        capabilities.setCapability("device", "iOS");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName", "iPhone 6");
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("platformVersion","10.3");
        capabilities.setCapability("launchTimeOut", "300000");
        capabilities.setCapability("app", app.getAbsolutePath());
        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        Thread.sleep(50000);
        WebElement summaryHeader = driver.findElement(By.xpath("//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[1]"));
        Assert.assertEquals("Different Message", "SUMMARY" , summaryHeader.getText());
    }


}
