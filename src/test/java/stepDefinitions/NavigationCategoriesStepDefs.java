package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;
import utilities.BrowserUtil;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.Utils;

import java.awt.*;

public class NavigationCategoriesStepDefs {
    Utils utils;


    @And("the user navigate to Laptops Page")
    public void the_user_navigate_to_laptops_page() {
        if (utils.sonyi5().isDisplayed() && utils.macPro().isDisplayed()) {
            System.out.println("Link navigates successfully");
        } else {
            System.out.println("Link does not navigate as expected");
        }
    }
    @When("the user click on an item")
    public void the_user_click_on_an_item() throws InterruptedException {
        utils.clickOnItem();
    }
    @Then("the user add item to cart")
    public void the_user_add_item_to_cart() throws InterruptedException {
        utils.clickOnAddToCart();
    }

    @Then("the user hit return on the keyboard")
    public void the_user_hit_return_on_the_keyboard() throws AWTException, InterruptedException {
        BrowserUtil.sendKeys();
    }

    @Then("the user navigate to Cart Page")
    public void the_user_navigate_to_cart_page() {
            String expUrl = "https://www.demoblaze.com/cart.html";
            String actUrl = utils.getCurrentPageUrl();
            if (!expUrl.equals(actUrl)) {
                System.out.println ("Link does not navigate to expected page");
            } else {
                System.out.println("Link navigates successfully");
            }

    }

    @When("the user click on the Place Order Button")
    public void the_user_click_on_the_place_order_button() throws InterruptedException {
              utils.clickOnPlaceOrderButton();

    }

    @Then("the user click on x button")
    public void the_user_click_on_x_button() throws InterruptedException {
        utils.clickOnXButton();

    }

    @Then("the user click on Close button")
    public void the_user_click_on_close_button() {


    }

    @Then("the user navigate to {string} Page")
    public void the_user_navigate_to_page(String string) {


    }

    @Then("the user fill in all the information {string} {string} {string} {string}")
    public void the_user_fill_in_all_the_information(String name, String country, String city, String creditCard) {
        utils.nameField(name);
        utils.countryField(country);
        utils.cityField(city);
        utils.creditCardField(creditCard);

    }

    @Then("Click Purchase Button")
    public void click_purchase_button() throws InterruptedException{
        utils.clickOnPurchaseButton();
        if (utils.thankYouMessage().isDisplayed() && utils.okButton().isDisplayed()) {
            System.out.println("Purchase was successful");
        } else {
            System.out.println("Purchase failed");
        }
        String expectedTitle = "STORE";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

    }


    @And("the user click {string}")
    public void theUserClick(String Laptops) throws InterruptedException {
       Driver.get().wait();
        utils.clickLaptops();
    }

    @And("the user click on {string} and click add to cart")
    public void theUserClickOnAndClickAddToCart(String SonyVaioi5) throws InterruptedException {
        utils.sonyi5().click();
        utils.clickOnAddToCart();
        utils.clickOnItem();
        utils.clickOnAddToCart();
    }


    @Then("the user click on {string}")
    public void theUserClickOn(String Cart) throws InterruptedException {
        utils.clickOnAddToCart();
    }

    @Then("the user click on Delete")
    public void theUserClickOnDelete() {

    }
}



