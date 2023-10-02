package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import smule.BasePage;

import java.time.Duration;

public class PageWaits extends BasePage {

    FluentWait<AppiumDriver> wait;

    public PageWaits() {
        this.wait = initWait();
    }

    private FluentWait<AppiumDriver>  initWait(){
        return new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
    }


    public void waitForElement(WebElement element) {
          wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitForElementToBeClickable(WebElement element) {
          wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
