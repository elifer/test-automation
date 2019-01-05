package com.getir.pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class ProductsPage extends BasePage {

    By txtProduct = By.id("product_name");
    By btnBasket = By.id("basket");
    By titleProduct = By.className("android.widget.TextView");

    public void iClickProduct(String product) {
        boolean isFound = false;
        List<MobileElement> productList = driver.findElements(txtProduct);

        for (MobileElement element : productList) {
            if (element.getText().equalsIgnoreCase(product)) {
                element.click();
                isFound = true;
                break;
            }
            isFound = false;
        }
        assertThat(product + "is not found!", isFound);
    }

    public void iClickBasketButton() {
        driver.findElement(btnBasket).click();
    }

    public void iShownProductsPage(String title) {
        assertThat("Product page is not showen!", isElementPresent(driver.findElement(titleProduct),10) &&  driver.findElement(titleProduct).getText().equalsIgnoreCase(title));
        waitForVisibilityOf(txtProduct);
        List<MobileElement> productList = driver.findElements(txtProduct);
        assertThat(title + "product table is not showen!", productList.size() > 0);
    }
}
