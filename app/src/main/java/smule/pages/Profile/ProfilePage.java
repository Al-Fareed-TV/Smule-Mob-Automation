package smule.pages.Profile;

import io.qameta.allure.Step;

import static java.lang.Thread.sleep;

public class ProfilePage extends ProfilePageLocators{

    @Step("Get the name of the profile")
    public String getProfileName() throws InterruptedException {
        sleep(2000);
        return profileNameLocator.getText();
    }

    @Step("Switch to invites page")
    public ProfilePage switchToInvitePage() throws InterruptedException {
        sleep(2000);
        invitesButton.click();
        return new ProfilePage();
    }
    @Step("Switch to invites page")
    public ProfilePage switchToPlaylistPage() throws InterruptedException {
        sleep(2000);
        playlistButton.click();
        return new ProfilePage();
    }
    @Step("Switch to invites page")
    public void switchToAboutPage() throws InterruptedException {
        sleep(2000);
        aboutButton.click();
    }

}
