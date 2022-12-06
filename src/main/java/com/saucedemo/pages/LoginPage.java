package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By validUsername=By.id("user-name");
    By validPassword=By.id("password");
    By loginClick=By.xpath("//input[@type='submit']");
    By ProductsText=By.xpath("//span[@class='title']");
    By displayproducts=By.cssSelector("inventory_item_name");

//	Enter “standard_user” username
    public void entervalidUserName(){
        sendTextToElement(validUsername,"standard_user");
    }
//	Enter “secret_sauce” password
public void entervalidPassword(){
    sendTextToElement(validPassword,"secret_sauce");
}
//	Click on ‘LOGIN’ button
public void clickonLoginButton(){
        clickOnElement(loginClick);
}
//	Verify the text “PRODUCTS”
    public String verifyTextProducts(){
        return getTextFromElement(ProductsText);
    }
    public String verifydisplayproduts() {
        System.out.println("The number of products on page are:" + driver.findElements(displayproducts).size());

        return null;
    }

}
