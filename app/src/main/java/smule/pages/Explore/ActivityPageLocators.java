package smule.pages.Explore;

import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smule.BasePage;

public class ActivityPageLocators extends BasePage {
    public ActivityPageLocators() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Notifications\"]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView")
    public WebElement notificationsPageButton;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"News\"]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView")
    public WebElement newsPageButton;
}
