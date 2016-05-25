package pageObject;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {

    protected WebDriver driver;

    @BeforeClass
    public void start() {
        if (driver == null) {
            //driver = initDriver();
            driver.manage().timeouts().implicitlyWait(
                    //Long.valueOf(Context.timeout), TimeUnit.MILLISECONDS);
                    20, TimeUnit.MILLISECONDS);
        }
    }

    @AfterClass
    public void stop() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    protected HomePage getHomePage() {
        String url = "get it from somewhere";
        driver.navigate().to(url);
        return new HomePage(driver);
    }

}
