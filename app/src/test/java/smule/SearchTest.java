package smule;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import smule.pages.Home.HomePage;
import smule.pages.Login.LoginPage;
import utils.ConfigLoader;
import utils.FilePaths;

import java.util.Map;

public class SearchTest  {
    AppiumDriver androidDriver;
    HomePage homePage ;
    Map credentials = new ConfigLoader().getJSON(FilePaths.CREDENTIALS);

    @BeforeMethod
    public void login() {
        androidDriver = new BasePage().getDriver();
        LoginPage loginPage = new LoginPage();
        loginPage.selectLanguage();
        loginPage.confirmLanguage();
        loginPage.signInWithEmail();
        homePage = loginPage.enterCredentials((String)credentials.get("email"),(String)credentials.get("password"));
    }
    @Test
    public void searchSongTest() {
        homePage.clearAllPopUps();
        homePage.searchSong();

    }

}
