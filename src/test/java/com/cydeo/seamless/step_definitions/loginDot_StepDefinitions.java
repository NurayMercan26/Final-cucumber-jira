package com.cydeo.seamless.step_definitions;

import com.cydeo.seamless.pages.SeamlessPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginDot_StepDefinitions {
    SeamlessPage seamlessPage = new SeamlessPage();
    @When("user look at password button")
    public void user_look_at_password_button() {
        System.out.println("user look at password button");
    }
    @Then("user should see and verify that the password with dots formats as encrtype when password is entered")
    public void user_should_see_and_verify_that_the_password_with_dots_formats_as_encrtype_when_password_is_entered() {
        System.out.println("user should see and verify that the password with dots formats as encrtype when password is entered");
        //Assert.assertTrue(seamlessPage.inputPassword.getAttribute("value").contains("Nuray123"));
        //Assert.assertTrue(seamlessPage.dotPassword.getText().contains("......"));
        Assert.assertTrue(seamlessPage.LogoSeamlessly.getText().contains("Bir aygıt ile oturum açın"));
    }
}
