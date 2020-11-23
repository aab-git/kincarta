package com.amazon.pages;

import com.amazon.utilitiies.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResponsePage {

    WebDriver driver;

    public ResponsePage() {
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//li[@class='a-normal'][1]")
    public WebElement secondPageButton;



}
