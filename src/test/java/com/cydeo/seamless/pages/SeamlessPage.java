package com.cydeo.seamless.pages;

import com.cydeo.seamless.utilities.Driver;
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

    @FindBy(xpath = "//div[@class=\"logo\"]")
    public WebElement LogoSeamlessly;

    @FindBy(xpath = "//button[@class='user-status-menu-item__toggle user-status-menu-item__toggle--inline']")
    public WebElement SetStatus;

    @FindBy(xpath = "//img[@src='/index.php/avatar/Employee111/32?v=36']")
    public WebElement dropdownButton;

    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[5]/a")
    public WebElement logout;

    ////*[@id="expanddiv"]/ul/li[5]/a
}
