package smule.pages.Home;

import io.qameta.allure.Step;
import smule.actions.PageActions;
import smule.pages.Login.LoginPage;

public class HomePage extends HomeLocators {
    PageActions actions;

    @Step("Login")
    public HomePage login(String email, String password) {
        new LoginPage()
                .selectLanguage()
                .confirmLanguage()
                .signInWithEmail()
                .enterCredentials(email, password);
        return new HomePage();
    }

    @Step("Denying access for location")
    public void clearAllPopUps() {
        new HomeLocators();
        noThanksButton.click();
        actions = new PageActions();
        actions.tap(1002, 375);
    }

    @Step("Search for song")
    public void searchSong() {
        new HomeLocators();
        searchElement.click();
        searchInputElement.sendKeys("chaleya");
    }

    @Step("Navigating to different pages")
    public void navigateToPage(String page){
        switch (page.toLowerCase()){
            case "feed" -> feedButton.click();
            case "explore" -> exploreButton.click();
            case "activity" -> activityButton.click();
            case "profile" -> profileButton.click();
            default -> songBookButton.click();
        }
    }

}
