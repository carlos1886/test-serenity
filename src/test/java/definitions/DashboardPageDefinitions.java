package definitions;

import actions.HomePageActions;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class DashboardPageDefinitions {

    HomePageActions objHomePage = new HomePageActions();

    @Then("User should see in orders box {string} {string}")
    public void summaryOrders(String count, String description) {

        Assert.assertTrue(objHomePage.getSummaryData().contains(count + '\n' + description));

    }

    @Then("User should see orders graph")
    public void ordersGraph() {

        Assert.assertTrue(objHomePage.getOrdersGraph());

    }

    @Then("User should see chat")
    public void chat() {
        Assert.assertTrue(objHomePage.getChat());
    }

    @Then("User should world graph")
    public void worldGraph() {
        Assert.assertTrue(objHomePage.getworldGraph());
    }

}

