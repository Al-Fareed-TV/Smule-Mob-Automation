package smule.actions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.WebElement;
import smule.BasePage;

import java.time.Duration;

public class PageActions extends BasePage {

    public WebElement scrollToText(String scrollTillText) {
        return getDriver().findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textContains(\"" + scrollTillText + "\"))"));
    }
    public void tap(int x,int y){
        new TouchAction((PerformsTouchActions) getDriver()).press(PointOption.point(x,y))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .release()
                .perform();
    }
}
