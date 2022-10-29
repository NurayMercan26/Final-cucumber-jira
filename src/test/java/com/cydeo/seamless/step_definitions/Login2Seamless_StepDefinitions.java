package com.cydeo.seamless.step_definitions;

import com.cydeo.seamless.pages.Login2InvalidPage;
import com.cydeo.seamless.pages.SeamlessPage;
import com.cydeo.seamless.utilities.BrowserUtils;
import com.cydeo.seamless.utilities.ConfigurationReader;
import com.cydeo.seamless.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Login2Seamless_StepDefinitions {
    SeamlessPage seamlessPage = new SeamlessPage();
   Login2InvalidPage login2InvalidPage = new Login2InvalidPage();
    @Given("user can on the login page")
    public void user_can_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("seamlessly.url"));
    }
    @When("user is incorrect usarname")
    public void user_is_incorrect_usarname() {
        seamlessPage.inputUsername.sendKeys("Employee");
    }
    @When("user  correct password")
    public void user_correct_password() {
        seamlessPage.inputPassword.sendKeys("Employee123", Keys.ENTER);
    }
    @Then("user should able see  {string}")
    public void user_should_able_see(String messageText) {

        login2InvalidPage.verifyErrorOrAlertMessage(messageText);
    }


    @When("user is correct usarname")
    public void user_is_correct_usarname() {
        seamlessPage.inputUsername.sendKeys("Employee111");
    }
    @When("user  incorrect password")
    public void user_incorrect_password() {
        seamlessPage.inputPassword.sendKeys("Employee", Keys.ENTER);
    }


    @When("user  empty password")
    public void user_empty_password() {
        seamlessPage.inputPassword.sendKeys("", Keys.ENTER);
    }

    @When("user is empty usarname")
    public void user_is_empty_usarname() {
        seamlessPage.inputUsername.sendKeys("");
    }


    @Then("User clicks {string} {string}")
    public void user_clicks(String clickType,String messageText) {
        login2InvalidPage.userClicksBtn(clickType,messageText);
    }



}
