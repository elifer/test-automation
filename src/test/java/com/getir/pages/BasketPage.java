package com.getir.pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class BasketPage extends BasePage {

    By txtProduct = By.id("product_name");
    By btnDelete = By.id("imageview_remove");
    By txtEmptyBasket = By.id("empty_textview");

    public void iValidateCheckInBasket(String product) {
        waitForVisibilityOf(txtProduct,30);
        boolean isFound = false;
        List<MobileElement> productList = driver.findElements(txtProduct);

        for (MobileElement element : productList) {
            if (element.getText().equalsIgnoreCase(product)) {
                isFound = true;
                break;
            }
            isFound = false;
        }
        assertThat(product + "not added to basket", isFound);
    }

    public void iDeleteProductInBasket() {
        driver.findElement(btnDelete).click();
    }

    public void iCheckThatTheBasketIsEmpty() {
        assertThat("Basket is not empty!", isElementPresent(driver.findElement(txtEmptyBasket),10));
    }
}
