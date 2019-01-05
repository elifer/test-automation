package com.getir.pages;

import org.openqa.selenium.By;

import static org.hamcrest.MatcherAssert.assertThat;

public class LoginPage extends BasePage {

    By txtLoginEmail = By.id("email");
    By txtLoginPassword = By.id("password");
    By btnSignIn = By.id("email_sign_in_button");

    public void iAmOnTheLoginPage() {
        assertThat("Login page is not showen!", isElementPresent(driver.findElement(btnSignIn),10));
    }

    public void iTypeEmail(String email) {
        driver.findElement(txtLoginEmail).sendKeys(email);
    }

    public void iTypePassword(String password) {
        driver.findElement(txtLoginPassword).sendKeys(password);
    }

    public void iClickLoginButton() {
        driver.findElement(btnSignIn).click();
    }
}

