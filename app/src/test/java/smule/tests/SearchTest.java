package smule.tests;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import smule.BasePage;
import smule.pages.Home.HomePage;
import smule.pages.Login.LoginPage;
import utils.ConfigLoader;
import utils.FilePaths;

import java.util.Map;

public class SearchTest {
    AppiumDriver androidDriver;
    HomePage homePage;
    Map credentials = new ConfigLoader().getJSON(FilePaths.CREDENTIALS);
    @Test(groups = {"sanity","regression"})
    public void searchSongTest() {
        androidDriver = new BasePage().getDriver();
        homePage = homePage.login((String) credentials.get("email"), (String) credentials.get("password"));
        homePage.clearAllPopUps();
        homePage.searchSong();
    }

}
