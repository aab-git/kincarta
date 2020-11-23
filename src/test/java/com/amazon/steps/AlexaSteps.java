package com.amazon.steps;

import com.amazon.pages.Header;
import com.amazon.pages.ResponsePage;
import com.amazon.pages.ShoppingCartPage;
import com.amazon.utilitiies.ConfigsReader;
import com.amazon.utilitiies.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class AlexaSteps {

    Header headers = new Header();
    ResponsePage responsePage = new ResponsePage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    String textOfThirdItem;

    @Given("^the user navigates to \"([^\"]*)\" homepage$")
    public void the_user_navigates_to_homepage(String url) throws Throwable {
        Driver.getDriver().navigate().to(ConfigsReader.getProperty(url));
    }

    @Given("^the user searches for \"([^\"]*)\"$")
    public void the_user_searches_for(String alexa) throws Throwable {
        headers.searchButton.sendKeys(alexa + Keys.ENTER);
    }

    @Given("^the user navigates to the second page$")
    public void the_user_navigates_to_the_second_page() throws Throwable {
        responsePage.secondPageButton.click();
    }

    @Given("^the user selects the third item$")
    public void the_user_selects_the_third_item() throws Throwable {
        textOfThirdItem = responsePage.thirdElementOnTheSecondPage.getText();

        responsePage.listOfAllItems.get(2).click();
    }

    @Then("^assert that the user would be able to add item to the cart$")
    public void assert_that_the_user_would_be_able_to_add_item_to_the_cart() throws Throwable {
        responsePage.addToCartButton.click();

        responsePage.popUpWindowCloseButton.click();

        headers.cartButton.click();

        String textOfItemInCart = shoppingCartPage.itemInCart.getText();

        Assert.assertTrue(textOfThirdItem.contains(textOfItemInCart));
    }


}
