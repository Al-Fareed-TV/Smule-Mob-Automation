package smule.actions;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;
import smule.BasePage;

public class PageActions extends BasePage {

    public WebElement scrollToText(String scrollTillText) {
        return getDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textContains(\"" + scrollTillText + "\"))"));
    }
}
