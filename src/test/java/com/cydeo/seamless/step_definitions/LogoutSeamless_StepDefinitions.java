package com.cydeo.seamless.step_definitions;

import com.cydeo.seamless.pages.SeamlessPage;
import com.cydeo.seamless.utilities.BrowserUtils;
import com.cydeo.seamless.utilities.ConfigurationReader;
import com.cydeo.seamless.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LogoutSeamless_StepDefinitions {

    SeamlessPage seamlessPage = new SeamlessPage();
    @Given("user is go to the logout page")
    public void user_is_go_to_the_logout_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("seamlessly.url"));
    }
    @Then("User can not go to home page again by clicking step back")
    public void user_can_not_go_to_home_page_again_by_clicking_step_back() {

        System.out.println("User should be able see seamlessly logo in login page ");
    }
    @Given("user go to  the logout page")
    public void user_go_to_the_logout_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("seamlessly.url"));
    }


    @When("user  write usarname")
    public void user_write_usarname() {
        seamlessPage.inputUsername.sendKeys("Employee111");
    }
    @When("user write password")
    public void user_write_password() {
       seamlessPage.inputPassword.sendKeys("Employee123",Keys.ENTER);
    }


    @Then("user can see seamlessy logo")
    public void user_can_see_seamlessy_logo() {

        System.out.println("librarian should be able see seamlessy logo");
    }

}
