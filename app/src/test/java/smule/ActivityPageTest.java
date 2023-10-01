package smule;

import io.appium.java_client.AppiumDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import smule.actions.PageActions;
import smule.pages.Explore.ActivityPage;
import smule.pages.Home.HomePage;
import utils.ConfigLoader;
import utils.FilePaths;

import java.util.Map;

import static java.lang.Thread.sleep;

public class ActivityPageTest {
    HomePage homePage;
    AppiumDriver androidDriver;
    Map credentials = new ConfigLoader().getJSON(FilePaths.CREDENTIALS);
    ActivityPage activityPage;
    PageActions actions;

    @Test
    public void exploreActivityPage() throws InterruptedException {
        actions = new PageActions();
        androidDriver = new BasePage().getDriver();
        homePage = new HomePage().login((String) credentials.get("email"), (String) credentials.get("password"));
        homePage.clearAllPopUps();
        sleep(2000);
        homePage.navigateToPage("activity");
        sleep(2000);
        actions.tap(300, 300);
        sleep(2000);
//        Assert.assertEquals(activityPage.titleName(),"Activity");
        activityPage = new ActivityPage();
        activityPage
                .switchToNotificationsPage()
                .switchToNewsPage();
    }
}
