package smule.pages.Message;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smule.BasePage;

public class MessageLocators extends BasePage {

    public MessageLocators() {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(accessibility = "Messages")
    WebElement messageIcon;
    @AndroidFindBy(id = "com.smule.singandroid:id/custom_views_container")
    WebElement newChatIconLocator;
    @AndroidFindBy(id = "com.smule.singandroid:id/search_edit_text")
    WebElement searchUserLocator;
    @AndroidFindBy(xpath = "(//android.widget.ListView[@resource-id='com.smule.singandroid:id/user_list']/android.widget.LinearLayout)[1]")
    WebElement userNameLocator;
    @AndroidFindBy(id = "com.smule.singandroid:id/action_next")
    WebElement nextBtnLocator;
    @AndroidFindBy(id = "com.smule.singandroid:id/inputBox")
    WebElement messageInputLocator;
    @AndroidFindBy(id = "com.smule.singandroid:id/send_button")
    WebElement sendMessageBtnLocator;
}
