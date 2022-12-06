package com.saucedemo.testsuite;


import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage=new LoginPage();
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        loginPage.entervalidUserName();
        loginPage.entervalidPassword();
        loginPage.clickonLoginButton();
        Assert.assertEquals(loginPage.verifyTextProducts(),"PRODUCTS","Error message not displayed");

    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        loginPage.entervalidUserName();
        loginPage.entervalidPassword();
        loginPage.clickonLoginButton();
        loginPage.verifydisplayproduts();

    }

}



