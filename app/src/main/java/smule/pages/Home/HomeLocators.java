package smule.pages.Home;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smule.BasePage;

public class HomeLocators extends BasePage {

    public HomeLocators() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.smule.singandroid:id/noButton")
    public WebElement noThanksButton;
    @AndroidFindBy(id = "com.smule.singandroid:id/pre_search_title_text_view")
    public WebElement searchElement;
    @AndroidFindBy(id = "com.smule.singandroid:id/search_edit_text")
    public WebElement searchInputElement;

    @AndroidFindBy(accessibility = "Feed, New notification")
    public WebElement feedButton;
    @AndroidFindBy(accessibility = "Explore")
    public WebElement exploreButton;
    @AndroidFindBy(accessibility = "Activity")
    public WebElement activityButton;
    @AndroidFindBy(accessibility = "Profile, New notification")
    public WebElement profileButton;
    @AndroidFindBy(accessibility = "Songbook")
    public WebElement songBookButton;

}
