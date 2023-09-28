package smule.pages.Home;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import smule.actions.PageActions;

public class HomePage extends HomeLocators{
    PageActions actions ;
    @Step("Denying access for location")
    public void clearAllPopUps(){
        new HomeLocators();
        noThanksButton.click();
    }

    @Step("Search for song")
    public void searchSong(){
        new HomeLocators();
        actions = new PageActions();
        actions.tap(1002,375);
        searchElement.click();
        searchInputElement.sendKeys("chaleya");
    }

}
