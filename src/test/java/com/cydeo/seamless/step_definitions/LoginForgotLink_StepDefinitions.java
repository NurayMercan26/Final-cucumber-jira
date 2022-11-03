package com.cydeo.seamless.step_definitions;

import com.cydeo.seamless.pages.SeamlessPage;
import com.cydeo.seamless.utilities.ConfigurationReader;
import com.cydeo.seamless.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginForgotLink_StepDefinitions {
    SeamlessPage seamlessPage = new SeamlessPage();

    @Given("User should go to login page")
    public void user_should_go_to_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("seamlessly.url"));
    }
    @When("User see on the Forgot Password? link and click")
    public void user_see_on_the_forgot_password_link_and_click() {
     seamlessPage.forgotPassword.click();
    }
    @When("user clicks Reset Password button")
    public void user_clicks_reset_password_button() {
     seamlessPage.resetPassword.click();
    }


    @Then("User can see username or email")
    public void user_can_see_username_or_email() {
        Assert.assertTrue(seamlessPage.placeHolderName.getAttribute("aria-label").contains("Kullanıcı adı ya da e-posta"));
        System.out.println("User can see username or email");
    }

}
