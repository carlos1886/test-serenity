package definitions;

import actions.CustomersPageActions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.bs.I;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class CustomersPageDefinition {

    CustomersPageActions objCustomers = new CustomersPageActions();

    @When("User write {string} into search box")
    public void searchBy(String searchby) throws InterruptedException {
        objCustomers.searchBy(searchby);
    }

    @Then("User should see the following information in the table")
    public void tableResults(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String Id = data.get(0).get("ID");
        String companyName = data.get(0).get("Company Name");
        String contactName = data.get(0).get("Contact Name");
        String contactTitle = data.get(0).get("Contact title");
        String region = data.get(0).get("Region");
        String postalCode = data.get(0).get("Postal Code");
        String country = data.get(0).get("Country");
        String city = data.get(0).get("City");
        String phone = data.get(0).get("Phone");
        String fax = data.get(0).get("Fax");
        String representatives = data.get(0).get("Representatives");
        Assert.assertEquals(Id, objCustomers.readId());
        Assert.assertEquals(companyName, objCustomers.readCompanyName());
        Assert.assertEquals(contactName, objCustomers.readContactName());
        Assert.assertEquals(contactTitle, objCustomers.readContactTitle());
        Assert.assertEquals(region, objCustomers.readRegion());
        Assert.assertEquals(postalCode, objCustomers.readPostalCode());
        Assert.assertEquals(country, objCustomers.readCountry());
        Assert.assertEquals(city, objCustomers.readCity());
        Assert.assertEquals(phone, objCustomers.readPhone());
        Assert.assertEquals(fax, objCustomers.readFax());
        Assert.assertEquals(representatives, objCustomers.readRepresentatives());

    }
}
