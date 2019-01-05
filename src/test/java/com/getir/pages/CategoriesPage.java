package com.getir.pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class CategoriesPage extends BasePage {

    By txtCategory = By.id("category_name");
    By titleCategories = By.className("android.widget.TextView");

    public void iShownCategoriesPage() {
        assertThat("Categories page is not showen!", isElementPresent(driver.findElement(titleCategories),10) && driver.findElement(titleCategories).getText().equalsIgnoreCase("Categories"));
        waitForVisibilityOf(txtCategory);
        List<MobileElement> categoryList = driver.findElements(txtCategory);
        assertThat("Categories table is not showen!", categoryList.size() > 0);
    }

    public void iClickCategory(String category) {
        boolean isFound = false;
        List<MobileElement> categoryList = driver.findElements(txtCategory);

        for (MobileElement element : categoryList) {
            if (element.getText().equalsIgnoreCase(category)) {
                element.click();
                isFound = true;
                break;
            }
            isFound = false;
        }
        assertThat(category + "is not found!", isFound);
    }
}
