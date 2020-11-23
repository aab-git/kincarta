package com.amazon.pages;

import com.amazon.utilitiies.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ResponsePage {

    WebDriver driver;

    public ResponsePage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//li[@class='a-normal'][1]")
    public WebElement secondPageButton;

    @FindBy (xpath = "//div[@data-index='2']")
    public WebElement thirdElementOnTheSecondPage;

    @FindBy(xpath = "//a[@class='a-link-normal a-text-normal']")
    public List<WebElement> listOfAllItems;

    @FindBy(xpath = "//input[@name='submit.add-to-cart']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//button[@class=' a-button-close a-declarative']")
    public WebElement popUpWindowCloseButton;




}
