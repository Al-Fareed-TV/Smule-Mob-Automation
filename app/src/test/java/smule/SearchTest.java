package smule;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import smule.pages.Home.HomePage;

public class SearchTest extends LoginTest {
    AppiumDriver androidDriver;
    HomePage homePage = new HomePage();

    @BeforeClass
    public void login() {
        androidDriver = new BasePage().getDriver();
        shouldLogin();
    }


    @Test
    public void searchSongTest() {
        homePage.clearAllPopUps();
        homePage.searchSong();

    }

}
