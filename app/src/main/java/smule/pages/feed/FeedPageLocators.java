package smule.pages.feed;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import smule.BasePage;

public class FeedPageLocators extends BasePage {

    public FeedPageLocators() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
}
