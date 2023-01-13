package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
    @FindBy(name = "Username")
    public WebElement userName;

    @FindBy(name = "Password")
    public WebElement password;

    @FindBy(xpath = "//button[@id='LoginPanel0_LoginButton']")
    public WebElement login;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement errorMessage;


}
