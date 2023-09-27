package smule.pages.Login;

import io.qameta.allure.Step;
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
        okButton.click();
       return this;
    }

    @Step("Sign in with Google")
    public void signInWithEmail(){
        signInWithEmailButton.click();

//        min8Char1Num
    }
public void enterCredentials(String email,String password){
        emailInputElement.sendKeys(email);
        nextButton.click();
    LoginLocators loginLocators = new LoginLocators();
    passwordInputElement.sendKeys(password);
        nextButton.click();
}

}
