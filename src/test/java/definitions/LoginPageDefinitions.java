package definitions;

import actions.HomePageActions;
import actions.LoginPageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.HelperClass;

import java.sql.Struct;

public class LoginPageDefinitions {

    LoginPageActions objLogin = new LoginPageActions();
    HomePageActions objHomePage = new HomePageActions();

    @Given("User is on HRMLogin page {string}")
    public void loginTest(String url) {

        HelperClass.openPage(url);
    }

    @When("User enters username as {string} and password as {string}")
    public void goToHomePage(String userName, String passWord) {
        objLogin.clear();
        objLogin.login(userName, passWord);
    }

    @Then("User should be on {string} page")
    public void verifyLogin(String page) {

        Assert.assertTrue(objHomePage.getHomePageText().contains(page));
    }

    @Then("User should be able to see error message {string}")
    public void verifyErrorMessageForInvalidCredentials(String expectedErrorMessage) {

        Assert.assertEquals(expectedErrorMessage, objLogin.getErrorMessage());
    }

    @Then("User should be able to see error message for empty username as {string}")
    public void verifyErrorMessageForEmptyUsername(String expectedErrorMessage) {

        Assert.assertEquals(expectedErrorMessage, objLogin.getErrorMessage());

    }
}
