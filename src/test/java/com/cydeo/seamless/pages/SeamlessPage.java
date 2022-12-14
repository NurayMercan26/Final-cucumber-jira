package com.cydeo.seamless.pages;

import com.cydeo.seamless.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeamlessPage {

    public SeamlessPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "user")
    public WebElement inputUsername;

    @FindBy(id = "password")
    public WebElement inputPassword;

    @FindBy(id = "submit-form")
    public WebElement loginButton;

    @FindBy(xpath = "//p[@class=\"warning wrongPasswordMsg\"]")
    public WebElement wrongUserNamePassword;

    @FindBy(xpath = "//*[@id='body-login']/div[1]/div/main/div/div/a[2]")
    public WebElement LogoSeamlessly;

    @FindBy(xpath = "//button[@class='user-status-menu-item__toggle user-status-menu-item__toggle--inline']")
    public WebElement SetStatus;

    @FindBy(xpath = "//img[@src='/index.php/avatar/Employee111/32?v=36']")
    public WebElement dropdownButton;

    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[5]/a")
    public WebElement logout;


    @FindBy(xpath = "//p[normalize-space(text())='Wrong username or password.']")
    private WebElement errorMessageText;

    @FindBy(xpath = "//p[@class='warning throttledMsg']")
    private WebElement warningMessage;
    @FindBy(xpath = "//img[@src='/core/img/actions/toggle.svg']")
    public WebElement EyeButton;

    @FindBy(id="lost-password")
    public WebElement forgotPassword;

    @FindBy(id="reset-password-submit")
    public WebElement resetPassword;

    @FindBy(xpath = "//input[@required=\"required\"]")
    public WebElement placeHolderName;

    @FindBy(className="password-with-toggle")
    public WebElement dotPassword;



    ////input[@placeholder='Kullanıcı adı ya da e-posta']
//id=lost-password //id=reset-password-submit
//@/core/img/actions/toggle.svg/core/img/actions/toggle.svg
    ////*[@id="expanddiv"]/ul/li[5]/a
}
