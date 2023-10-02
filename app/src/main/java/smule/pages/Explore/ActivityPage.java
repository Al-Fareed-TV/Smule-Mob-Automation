package smule.pages.Explore;

import io.qameta.allure.Step;

import static java.lang.Thread.sleep;

public class ActivityPage extends ActivityPageLocators {

    @Step("switch to notification page")
    public ActivityPage switchToNotificationsPage() {
        try{
            sleep(2000);
            notificationsPageButton.click();
        }catch (Exception e){
            System.out.println("Couldn't find the element");
        }
        return this;
    }

    @Step("switch to news page")
    public void switchToNewsPage() {
        newsPageButton.click();
    }
}
