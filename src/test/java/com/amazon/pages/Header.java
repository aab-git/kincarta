package com.amazon.pages;

import com.amazon.utilitiies.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header {

    WebDriver driver;

    public Header () {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchButton;

}
