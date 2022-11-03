package com.cydeo.seamless.step_definitions;

import com.cydeo.seamless.pages.SeamlessPage;
import com.cydeo.seamless.utilities.ConfigurationReader;
import com.cydeo.seamless.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPlaceHolder_StepDefinitions {
    SeamlessPage seamlessPage = new SeamlessPage();


    @When("User see on placeholders on Username")
    public void user_see_on_placeholders_on_username() {
        System.out.println("User see on placeholders on Username");
    }
    @When("user User see on placeholders on password")
    public void user_user_see_on_placeholders_on_password() {
        System.out.println("User see on placeholders on password");
    }
    @Then("User can  verify that placeholder username or email")
    public void user_can_verify_that_placeholder_username_or_email() {
     Assert.assertTrue(seamlessPage.placeHolderName.getAttribute("aria-label").contains("Kullanıcı adı ya da e-posta"));
        System.out.println("User can  verify that placeholder username or email");
    }

}
