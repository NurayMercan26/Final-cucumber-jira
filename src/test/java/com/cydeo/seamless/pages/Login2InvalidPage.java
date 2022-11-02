package com.cydeo.seamless.pages;

import com.cydeo.seamless.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.cydeo.seamless.utilities.BrowserUtils.sleep;
import static com.cydeo.seamless.utilities.BrowserUtils.waitForVisibility;

public class Login2InvalidPage {


    public Login2InvalidPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//input[@id='user']")
    private WebElement inputUsername;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@id='submit-form']")
    private WebElement loginBtn;

    @FindBy(xpath = "//a[@id='nextcloud']")
    private WebElement pageLogo;

    @FindBy(xpath = "//p[normalize-space(text())='Wrong username or password.']")
    private WebElement errorMessageText;

    @FindBy(xpath = "//p[@class='warning throttledMsg']")
    private WebElement warningMessage;


    public void typeUsername(String username) {
        inputUsername.sendKeys(username);
    }

    public void typePassword(String password) {
        inputPassword.sendKeys(password);
    }

   public void userClicksBtn() {

      String clickType = null;
    if (clickType.equalsIgnoreCase("ENTER")) {
            loginBtn.sendKeys(Keys.ENTER);
        } else if (clickType.equalsIgnoreCase("LoginBtn")) {
            loginBtn.click();
        } else {
            loginBtn.click();
        }
    }

    public void userClicksBtn(String clickType,String messageText) {
        boolean isDisableWarningMessage = warningMessage.isDisplayed();
        if (clickType.equalsIgnoreCase("ENTER")) {
            loginBtn.sendKeys(Keys.ENTER);
        } else if (clickType.equalsIgnoreCase("LoginBtn")) {
            loginBtn.click();
        } else {
            loginBtn.click();
        }

        if (isDisableWarningMessage & messageText.contains("Wrong username or password")){
            sleep(2);
            Driver.getDriver().navigate().back();
        }
    }

    public void verifyIsDisplayedPageLogo() {
        Assert.assertTrue(pageLogo.isDisplayed());
    }

    public void verifyErrorOrAlertMessage(String messageText) {

        if (messageText.contains("Wrong username or password.")) {

            sleep(2);
            Assert.assertTrue(waitForVisibility(errorMessageText, 3).getText().contains(messageText));
        }
        else if (messageText.contains("Please fill out this field")) {
            if (waitForVisibility(inputUsername, 1).getAttribute("validationMessage").contains(messageText)) {
                Assert.assertTrue(inputUsername.getAttribute("validationMessage").contains(messageText));
            } else if (waitForVisibility(inputPassword, 1).getAttribute("validationMessage").contains(messageText)) {
                Assert.assertTrue(inputPassword.getAttribute("validationMessage").contains(messageText));
            }
        }
        sleep(3);
    }
}
