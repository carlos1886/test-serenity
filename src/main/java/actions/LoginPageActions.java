package actions;

import locators.LoginPageLocators;
import org.openqa.selenium.support.PageFactory;
import utils.HelperClass;

public class LoginPageActions {
    LoginPageLocators loginPageLocators = null;

    public LoginPageActions() {

        this.loginPageLocators = new LoginPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), loginPageLocators);
    }

    public void clear() {
        loginPageLocators.userName.clear();
        loginPageLocators.password.clear();
    }

    public void login(String strUserName, String strPassword) {

        // Fill user name
        loginPageLocators.userName.sendKeys(strUserName);

        // Fill password
        loginPageLocators.password.sendKeys(strPassword);

        // Click Login button
        loginPageLocators.login.click();

    }

    // Get the error message when invalid credentials are provided
    public String getErrorMessage() {
        return loginPageLocators.errorMessage.getText();
    }

    // Get the error message when username is blank
    public String getMissingUsernameText() {
        return loginPageLocators.errorMessage.getText();
    }
}
