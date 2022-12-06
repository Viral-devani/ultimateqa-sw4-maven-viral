package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.LoginPage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        loginPage.clickOnSigninLink();
        String expectedText = "Welcome Back!";
        String actualText = loginPage.getWelcomeText();
        Assert.assertEquals(actualText, expectedText, "correct text");

    }
    @Test
    public void verifyTheErrorMessage(){
        loginPage.clickOnSigninLink();
        loginPage.enterUserName("viral");
        loginPage.enterPasswordToPasswordField("viral123");
        loginPage.clickOnLoginButton();
        String expectedText="Invalid email or password.";
        String actualText=loginPage.getErrorMessage();
        Assert.assertEquals(actualText,expectedText,"correct text");

    }

}
