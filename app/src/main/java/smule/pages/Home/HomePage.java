package smule.pages.Home;

import io.qameta.allure.Step;

public class HomePage extends HomeLocators{
    @Step("Denying access for location")
    public void clearAllPopUps(){
        new HomeLocators();
        noThanksButton.click();
    }

    @Step("Search for song")
    public void searchSong(){
        new HomeLocators();
        searchElement.click();
        searchElement.sendKeys("chaleya");
    }

}
