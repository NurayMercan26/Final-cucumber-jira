package com.cydeo.seamless.step_definitions;

import com.cydeo.seamless.pages.SeamlessPage;
import com.cydeo.seamless.utilities.BrowserUtils;
import com.cydeo.seamless.utilities.ConfigurationReader;
import com.cydeo.seamless.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSeamless_StepDefinitions {

    SeamlessPage seamlessPage = new SeamlessPage();


    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("seamlessly.url"));
    }

    @When("user is write correct usarname")
    public void user_is_write_correct_usarname() {
        seamlessPage.inputUsername.sendKeys("Employee111");
    }

    @When("user is correct password")
    public void user_is_correct_password() {
        seamlessPage.inputPassword.sendKeys("Employee123", Keys.ENTER);

    }

    @Then("user should able see  dashboard")
    public void user_should_able_see_dashboard() {
        BrowserUtils.waitForVisibilityOf(seamlessPage.SetStatus);

        String actualResult = seamlessPage.SetStatus.getText();
        //System.out.println(actualResult);
        String expectedResult = "Set status";
        Assert.assertEquals(expectedResult, actualResult);
        System.out.println("librarian should be able see set status");

    }


    @When("user is write usarname {string}")
    public void user_is_write_usarname(String string) {
        seamlessPage.inputUsername.sendKeys(string);
    }

    @And("user writes {string} in password")
    public void userWritesInPassword(String string) {
        seamlessPage.inputPassword.sendKeys(string);
    }

    @When("user is click button")
    public void user_is_click_button() {
        seamlessPage.loginButton.click();

    }



    @Then("user is see  seamlessly in  URL")
    public void user_is_see_seamlessly_in_url() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains("seamlessly"));

        BrowserUtils.verifyURLContains("seamlessly");
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("seamlessly"));
    }

    @And("user is click dropdown")
    public void userIsClickDropdown() {
      seamlessPage.dropdownButton.click();
    }

    @And("user is logout")
    public void userIsLogout() {
        seamlessPage.logout.click();
    }
}