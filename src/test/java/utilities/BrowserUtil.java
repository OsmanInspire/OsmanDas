package utilities;

import org.openqa.selenium.WebDriver;
import stepDefinitions.NavigationCategoriesStepDefs;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class BrowserUtil {
    private WebDriver driver;

    NavigationCategoriesStepDefs navigationCategoriesStepDefs;

    public BrowserUtil (NavigationCategoriesStepDefs navigationCategoriesStepDefs) {
        this.driver = (WebDriver) navigationCategoriesStepDefs;
    }

    public void goToUrl(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(2000);
    }

    public String getCurrentPageUrl() {
        return driver.getCurrentUrl();
    }

    public String getCurrentPageTitle() {
        return driver.getTitle();
    }

    public void quitWebDriver() {
        driver.quit();
    }

    public static void sendKeys() throws InterruptedException, AWTException {
        Robot rb = new Robot();
        rb.keyPress(KeyEvent.VK_ENTER);

        Thread.sleep(3000);
    }

}
