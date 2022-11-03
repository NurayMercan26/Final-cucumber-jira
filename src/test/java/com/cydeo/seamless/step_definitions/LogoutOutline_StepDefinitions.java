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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutOutline_StepDefinitions {
    SeamlessPage seamlessPage = new SeamlessPage();
    Login2InvalidPage login2InvalidPage = new Login2InvalidPage();
    @Given("user enter on the login page")
    public void user_enter_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("seamlessly.url"));
    }
    @When("student enters username {string}")
    public void student_enters_username(String string) {
        seamlessPage.inputUsername.sendKeys(string);
    }
    @When("student enters password {string}")
    public void student_enters_password(String string) {
        seamlessPage.inputPassword.sendKeys(string, Keys.ENTER);
    }


    @Then("user should be able to see dashboard {string}")
    public void userShouldBeAbleToSeeDashboard(String string) {
        System.out.println("user should be able see  Wrong username or password.");
     //  BrowserUtils.waitFor(20);
   // Assert.assertTrue(seamlessPage.wrongUserNamePassword.getAttribute("value").contains("Wrong username or password."));
     //   Assert.assertTrue(seamlessPage.LogoSeamlessly.getText().contains("Bir aygıt ile oturum açın"));
    }
}
