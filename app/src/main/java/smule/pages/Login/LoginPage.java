package smule.pages.Login;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import smule.actions.PageActions;

public class LoginPage extends LoginLocators {
    PageActions pageActions = new PageActions();
    @Step("Selecting Language")
    public LoginPage selectLanguage(){
        pageActions.scrollToText("English");
        engLang.click();
       return this;
    }
    @Step("confirm Language")
    public LoginPage confirmLanguage(){
//        LoginLocators loginLocators = new LoginLocators();
        okButton.click();
       return this;
    }

    @Step("Sign in with Google")
    public void signInWithGoogle(){
        signInWithGoogle.click();
//        min8Char1Num
    }


}
