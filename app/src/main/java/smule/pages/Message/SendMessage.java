package smule.pages.Message;

import io.qameta.allure.Step;
import smule.pages.Home.HomePage;
import utils.PageWaits;

import static java.lang.Thread.sleep;

public class SendMessage extends MessageLocators {
    PageWaits waits;
    @Step("Click on chat Icon")
    public SendMessage clickNewChatIcon() {
        try{
            waits = new PageWaits();
            waits.waitForElement(messageIcon);
            new MessageLocators();
            messageIcon.click();
            new MessageLocators();
            sleep(8000);
            newChatIconLocator.click();
            return this;
        }catch (Exception e){
            return null;
        }
    }

    @Step("Enter the username")
    public SendMessage searchUser(String name) {
        searchUserLocator.sendKeys(name);
        searchUserLocator.click();
        return this;
    }

    @Step("Select the user")
    public SendMessage selectUser() {
        userNameLocator.click();
        return this;
    }

    @Step("click on next button to proceed")
    public SendMessage clickOnNextButton() {
        nextBtnLocator.click();
        return this;
    }

    @Step("Enter message in chat and send")
    public void sendMessage(String message) {
        messageInputLocator.sendKeys(message);
        sendMessageBtnLocator.click();
    }
}
