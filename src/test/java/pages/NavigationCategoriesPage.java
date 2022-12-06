package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class NavigationCategoriesPage {
    WebDriver driver;

    public NavigationCategoriesPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@id='itemc'][2]")
    public WebElement clickLaptops;

    @FindBy(xpath = "//*[text()='Sony vaio i5']")
    public WebElement Laptops1;

    @FindBy(xpath = "//*[text()='Cart']")
    public WebElement cartButton;

    @FindBy(xpath  = "//a[contains(text(),'Sony vaio i7')]")
    public WebElement Laptops2;

    @FindBy(xpath  = "//a[contains(text(),'Add to cart')]")
    public WebElement addToChart;

    @FindBy(css = "div#tbodyid > div:nth-of-type(2) img")
    public WebElement item;

    @FindBy(css = "div#more-information > strong")
    public WebElement itemDesc;

    @FindBy(css = ".btn.btn-lg.btn-success")
    public WebElement addToCartButton;

    @FindBy(css = ".btn.btn-success")
    public WebElement placeOrderButton;

    @FindBy(css = "div#orderModal > div[role='document'] .btn.btn-primary")
    public WebElement purchaseButton;

    @FindBy(xpath = "/html//input[@id='name']")
    public WebElement nameField;

    @FindBy(xpath = "/html//input[@id='country']")
    public WebElement countryField;

    @FindBy(xpath = "/html//input[@id='city']")
    public WebElement cityField;

    @FindBy(css = ".showSweetAlert.sweet-alert.visible > h2")
    public WebElement thankYouMessage;

    @FindBy(css = ".btn.btn-lg.btn-primary.confirm")
    public WebElement okButton;

    @FindBy(xpath = "/html//tbody[@id='tbodyid']//a[@href='#']")
    public WebElement deleteLink;


    @FindBy(xpath = "//div[@id='orderModal']/div[@role='document']//div[@class='modal-footer']/button[1]")
    public WebElement closeButton;

    @FindBy(linkText = "Sony vaio i5")
    public WebElement sonyi5;

    @FindBy(linkText = "MacBook Pro")
    public WebElement macPro;

    @FindBy(xpath = "//*[@id='tbodyid']/tr/td[4]/a")
    public WebElement xButton;

    @FindBy(xpath = "/html//input[@id='card']")
    public WebElement creditCardField;

    @FindBy(xpath = "//*[text()='Delete']")
    public WebElement delete;






    public NavigationCategoriesPage (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



}
