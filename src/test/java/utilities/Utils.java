package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.NavigationCategoriesPage;

public class Utils {
    private WebDriver driver;
    NavigationCategoriesPage navigationCategoriesPage;

    public void clickOnAddToCart() throws InterruptedException {
        navigationCategoriesPage.addToCartButton.click();
        Thread.sleep(2000);
    }

    public void clickLaptops() throws InterruptedException {

        navigationCategoriesPage.clickLaptops.click();


    }

    public WebElement sonyi5() {
        WebElement boxTitle = navigationCategoriesPage.sonyi5;
        return boxTitle;
    }

    public WebElement macPro() {
        WebElement boxTitle = navigationCategoriesPage.macPro;
        return boxTitle;
    }

    public void clickOnItem() throws InterruptedException {
        navigationCategoriesPage.item.click();
        Thread.sleep(5000);
    }

    public void clickCartButton() throws InterruptedException {
        navigationCategoriesPage.cartButton.click();
        Thread.sleep(5000);
    }

    public String getCurrentPageUrl() {
        return driver.getCurrentUrl();
    }

    public String getCurrentPageTitle() {
        return driver.getTitle();
    }

    public void clickOnXButton() throws InterruptedException {
        navigationCategoriesPage.xButton.click();
        Thread.sleep(5000);
    }
    public void clickOnPlaceOrderButton() throws InterruptedException {
        navigationCategoriesPage.placeOrderButton.click();
        Thread.sleep(2000);
    }

    public void nameField(String name) {
        navigationCategoriesPage.nameField.sendKeys(name);
    }

    public void countryField(String country) {
        navigationCategoriesPage.countryField.sendKeys(country);
    }

    public void cityField(String city) {
        navigationCategoriesPage.cityField.sendKeys(city);
    }

    public void creditCardField(String cc) {
        navigationCategoriesPage.creditCardField.sendKeys(cc);
    }

    public void clickOnPurchaseButton() throws InterruptedException {
        navigationCategoriesPage.purchaseButton.click();
        Thread.sleep(3000);
    }

    public WebElement thankYouMessage() {
        WebElement msgTitle = navigationCategoriesPage.thankYouMessage;
        return msgTitle;
    }

    public WebElement okButton() {
        WebElement buttonTitle = navigationCategoriesPage.okButton;
        return buttonTitle;
    }


    public void clickOnCloseButton() {
        navigationCategoriesPage.closeButton.click();
    }

    public void delete() {
        navigationCategoriesPage.delete.click();
    }




}
