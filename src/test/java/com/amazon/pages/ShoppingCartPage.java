package com.amazon.pages;

import com.amazon.utilitiies.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

    WebDriver driver;

    public ShoppingCartPage () {
        driver = Driver.getDriver();

        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//span[@class='a-size-medium sc-product-title a-text-bold']")
    public WebElement itemInCart;

}
