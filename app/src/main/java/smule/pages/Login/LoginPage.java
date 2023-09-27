package smule.pages.Login;

import io.qameta.allure.Step;
import smule.actions.PageActions;

public class LoginPage extends LoginLocators {

    PageActions pageActions = new PageActions();

    @Step("Selecting Language")
    public void selectLanguage() {
        pageActions.scrollToText("English");
        engLang.click();
    }

    @Step("confirm Language")
    public void confirmLanguage() {
        okButton.click();
    }

    @Step("Sign in with Google")
    public void signInWithEmail() {
        signInWithEmailButton.click();
    }

    @Step("Input credentials and sign in")
    public void enterCredentials(String email, String password) {
        emailInputElement.sendKeys(email);
        nextButton.click();
        new LoginLocators();
        passwordInputElement.sendKeys(password);
        nextButton.click();
    }

}
