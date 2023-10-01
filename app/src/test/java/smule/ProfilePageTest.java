package smule;

import io.appium.java_client.AppiumDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import smule.pages.Home.HomePage;
import smule.pages.Profile.ProfilePage;
import utils.ConfigLoader;
import utils.FilePaths;

import java.util.Map;

import static java.lang.Thread.sleep;

public class ProfilePageTest {
    HomePage homePage;
    AppiumDriver androidDriver;
    Map credentials = new ConfigLoader().getJSON(FilePaths.CREDENTIALS);
    ProfilePage profilePage;

    @Test
    public void testProfilePage() throws InterruptedException {
        androidDriver = new BasePage().getDriver();
        homePage = new HomePage().login((String) credentials.get("email"), (String) credentials.get("password"));
        homePage.clearAllPopUps();
        sleep(2000);
        homePage.navigateToPage("profile");
        profilePage = new ProfilePage();
        Assert.assertEquals(profilePage.getProfileName(),"alfareedTV");
        profilePage
                .switchToInvitePage()
                .switchToPlaylistPage()
                .switchToAboutPage();
    }

}
