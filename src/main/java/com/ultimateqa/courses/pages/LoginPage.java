package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By signinLink=By.xpath("//div[@class='header__wrapper']//a[contains(text(),'Sign')]");
    By welcomeText =By.xpath("//div[@class='sign-in__wrapper']//h1[contains(text(),'Welcome')]");
    By userNameField = By.id("user[email]");
    By passwordField = By.id("user[password]");
    By loginButton = By.xpath("//input[@value='Sign in']");
    By errorMessage = By.xpath("//div[@id='notice']//ul[1]//li[1]");


    public void clickOnSigninLink(){
        clickOnElement(signinLink);
    }
    public String getWelcomeText(){
        return getTextFormElement(welcomeText);
    }
    public void enterUserName(String username){
        sendTextToElement(userNameField,username);

    }
    public void enterPasswordToPasswordField(String password){
        sendTextToElement(passwordField,password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getErrorMessage(){
        return getTextFormElement(errorMessage);
    }

}

