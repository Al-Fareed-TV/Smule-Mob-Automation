package smule.pages.Message;

import io.qameta.allure.Step;
import smule.pages.Home.HomePage;

public class SendMessage extends MessageLocators {
    @Step("Click on chat Icon")
    public SendMessage clickNewChatIcon() throws InterruptedException {
        Thread.sleep(8000);
        new MessageLocators();
        messageIcon.click();
        Thread.sleep(8000);
        new MessageLocators();
        newChatIconLocator.click();
        return this;
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
