package com.getir.steps;

import com.getir.pages.BasePage;
import com.getir.pages.BasketPage;
import com.getir.pages.CategoriesPage;
import com.getir.pages.LoginPage;
import com.getir.pages.ProductsPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class GetirTestSteps {

    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage() {
        new LoginPage().iAmOnTheLoginPage();
    }

    @And("^I type email \"([^\"]*)\"$")
    public void iTypeEmail(String email) {
        new LoginPage().iTypeEmail(email);
    }

    @And("^I type password \"([^\"]*)\"$")
    public void iTypePassword(String password) {
        new LoginPage().iTypePassword(password);
    }

    @When("^I click login button$")
    public void iClickLoginButton() {
        new LoginPage().iClickLoginButton();
    }

    @Then("^I shown categories page$")
    public void iShownCategoriesPage() {
        new CategoriesPage().iShownCategoriesPage();
    }

    @When("^I click \"([^\"]*)\" category$")
    public void iClickCategory(String category) {
        new CategoriesPage().iClickCategory(category);
    }

    @And("^I click \"([^\"]*)\" product$")
    public void iClickProduct(String product) {
        new ProductsPage().iClickProduct(product);
    }

    @And("^I click basket button$")
    public void iClickBasketButton() {
        new ProductsPage().iClickBasketButton();
    }

    @And("^I validate \"([^\"]*)\" check in basket$")
    public void iValidateCheckInBasket(String product) {
        new BasketPage().iValidateCheckInBasket(product);
    }

    @When("^I click back button$")
    public void iClickBackButton() {
        new BasePage().backButton();
    }

    @Then("^I shown \"([^\"]*)\" products page$")
    public void iShownProductsPage(String title) {
        new ProductsPage().iShownProductsPage(title);
    }

    @And("^I delete product in basket$")
    public void iDeleteProductInBasket() {
        new BasketPage().iDeleteProductInBasket();
    }

    @And("^I check that the basket is empty$")
    public void iCheckThatTheBasketIsEmpty() {
        new BasketPage().iCheckThatTheBasketIsEmpty();
    }
}
