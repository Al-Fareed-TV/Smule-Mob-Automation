package smule.pages.Profile;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;
import smule.BasePage;

public class ProfilePageLocators extends BasePage {
    public ProfilePageLocators() {
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
    @AndroidFindBy(id = "com.smule.singandroid:id/txt_username")
    public WebElement profileNameLocator;

    @AndroidFindBy(accessibility = "Invites")
    public WebElement invitesButton;
     @AndroidFindBy(accessibility = "Playlists, New notification")
    public WebElement playlistButton;
     @AndroidFindBy(accessibility = "About")
    public WebElement aboutButton;


}
