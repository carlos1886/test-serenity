package actions;

import locators.CustomersPageLocators;
import org.openqa.selenium.support.PageFactory;
import utils.HelperClass;

public class CustomersPageActions {

    CustomersPageLocators customersPageLocators = null;

    public CustomersPageActions() {
        this.customersPageLocators = new CustomersPageLocators();
        PageFactory.initElements(HelperClass.getDriver(), customersPageLocators);
    }

    public void searchBy(String text) throws InterruptedException {
        customersPageLocators.searchby.sendKeys(text);
        Thread.sleep(5000);
    }

    public String readId() {
        return customersPageLocators.table.getText();
    }

    public String readCompanyName() {
        return customersPageLocators.companyName.getText();
    }

    public String readContactName() {
        return customersPageLocators.contactName.getText();
    }

    public String readContactTitle() {
        return customersPageLocators.contactTitle.getText();
    }

    public String readRegion() {
        return customersPageLocators.contactRegion.getText();
    }

    public String readPostalCode() {
        return customersPageLocators.postalCode.getText();
    }

    public String readCountry() {
        return customersPageLocators.country.getText();
    }

    public String readCity() {
        return customersPageLocators.city.getText();
    }

    public String readPhone() {
        return customersPageLocators.phone.getText();
    }

    public String readFax() {
        return customersPageLocators.fax.getText();
    }

    public String readRepresentatives() {
        return customersPageLocators.representatives.getText();
    }
}

