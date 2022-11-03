package com.cydeo.seamless.step_definitions;

import com.cydeo.seamless.pages.SeamlessPage;
import com.cydeo.seamless.utilities.ConfigurationReader;
import com.cydeo.seamless.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginEye_StepDefinitions {
    SeamlessPage seamlessPage = new SeamlessPage();

    @Given("User go to login page")
    public void user_go_to_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("seamlessly.url"));
    }
    @When("user enters password {string}")
    public void user_enters_password(String string) {
        seamlessPage.inputPassword.sendKeys("blabla");
    }
    @When("user clicks password box eye")
    public void user_clicks_password_box_eye() {
        seamlessPage.EyeButton.click();

    }
    @Then("user can see the password explicitly if needed verify that password seen explicitly")
    public void user_can_see_the_password_explicitly_if_needed_verify_that_password_seen_explicitly() {
        System.out.println("User see can your password blabla");
        Assert.assertTrue(seamlessPage.inputPassword.getAttribute("value").contains("blabla"));
    }

}
