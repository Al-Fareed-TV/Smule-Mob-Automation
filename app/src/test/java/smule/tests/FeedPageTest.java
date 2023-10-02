package smule.tests;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;
import smule.BasePage;
import smule.pages.Home.HomePage;
import smule.pages.feed.FeedPage;
import utils.ConfigLoader;
import utils.FilePaths;

import java.util.Map;

import static java.lang.Thread.sleep;

public class FeedPageTest {
    HomePage homePage;
    AppiumDriver androidDriver;
    Map credentials = new ConfigLoader().getJSON(FilePaths.CREDENTIALS);
    FeedPage feedPage;

    @Test(groups = {"sanity","regression"})
    public void exploreFeedPage() throws InterruptedException {
        feedPage = new FeedPage();
        androidDriver = new BasePage().getDriver();
        homePage = new HomePage().login((String) credentials.get("email"), (String) credentials.get("password"));
        homePage.clearAllPopUps();
        sleep(2000);
        homePage.navigateToPage("feed");

        feedPage.exploreFeed();
        sleep(15000);
        androidDriver.navigate().back();
    }
}
