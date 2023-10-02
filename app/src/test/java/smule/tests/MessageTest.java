package smule.tests;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;
import smule.BasePage;
import smule.pages.Home.HomePage;
import smule.pages.Message.SendMessage;
import utils.ConfigLoader;
import utils.FilePaths;

import java.util.Map;

public class MessageTest {
    HomePage homePage;
    AppiumDriver androidDriver;
    Map credentials = new ConfigLoader().getJSON(FilePaths.CREDENTIALS);
    SendMessage message;


    @Test(groups = {"sanity","regression"})
    public void testMessaging()  {
        androidDriver = new BasePage().getDriver();
        homePage = new HomePage().login((String) credentials.get("email"), (String) credentials.get("password"));
        homePage.clearAllPopUps();

        message = new SendMessage();
        message.clickNewChatIcon().
                searchUser("kbaganna")
                .selectUser()
                .clickOnNextButton()
                .sendMessage("Hello");
    }

}
