package smule.pages.Login;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import smule.BasePage;
import org.openqa.selenium.support.PageFactory;

public class LoginLocators extends BasePage {
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='English' and @index='0']")
    public WebElement engLang;

    @AndroidFindBy(id = "com.smule.singandroid:id/yesButton")
    public WebElement okButton;

    @AndroidFindBy(id = "com.smule.singandroid:id/email_button_view")
    public WebElement signInWithGoogle;

    public LoginLocators(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }
}
