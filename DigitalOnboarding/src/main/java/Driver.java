import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by c07nw8xpg1hw on 5/19/17.
 */
public class Driver {

    public DesiredCapabilities capabilities = new DesiredCapabilities();
    public AppiumDriver driver;

    @Before
    public void beforeTest() throws MalformedURLException {
        File appDir = new File(Constant.FILE_PATH);
        File app = new File(appDir, Constant.APP_NAME);
        capabilities.setCapability("device", Constant.DEVICE_IOS);
        capabilities.setCapability("platformName", Constant.PLATFORM_NAME);
        capabilities.setCapability("deviceName", Constant.DEVICE_NAME);
        capabilities.setCapability("automationName", Constant.AUTOMATION_NAME);
        capabilities.setCapability("platformVersion", Constant.PLATFORM_VERSION);
        capabilities.setCapability("launchTimeOut", Constant.LAUNCH_TIME_OUT);
        capabilities.setCapability("app", app.getAbsolutePath());
        driver = new IOSDriver(new URL(Constant.APPIUM_SERVER_URL), capabilities);
    }
}
