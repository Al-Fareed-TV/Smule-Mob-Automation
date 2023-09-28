package smule.pages.Login;

import io.qameta.allure.Step;
import smule.actions.PageActions;
import smule.pages.Home.HomePage;

public class LoginPage extends LoginLocators {

    PageActions pageActions = new PageActions();

    @Step("Selecting Language")
    public LoginPage selectLanguage() {
        pageActions.scrollToText("English");
        engLang.click();
        return this;
    }

    @Step("confirm Language")
    public LoginPage confirmLanguage() {
        okButton.click();
        return this;
    }

    @Step("Sign in with Google")
    public LoginPage signInWithEmail() {
        signInWithEmailButton.click();
        return this;
    }

    @Step("Input credentials and sign in")
    public HomePage enterCredentials(String email, String password) {
        emailInputElement.sendKeys(email);
        nextButton.click();
        new LoginLocators();
        passwordInputElement.sendKeys(password);
        nextButton.click();
        return new HomePage();
    }

}
