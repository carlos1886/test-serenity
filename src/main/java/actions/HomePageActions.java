package actions;

import locators.HomePageLocators;
import org.openqa.selenium.support.PageFactory;
import utils.HelperClass;

public class HomePageActions {
    HomePageLocators homePageLocators = null;

    public HomePageActions() {

        this.homePageLocators = new HomePageLocators();

        PageFactory.initElements(HelperClass.getDriver(), homePageLocators);
    }


    // Get the User name from Home Page
    public String getHomePageText() {
        return homePageLocators.homePageUserName.getText();
    }

    public String getSummaryData(){
        return homePageLocators.summaryBoxes.getText();
    }
    public boolean getOrdersGraph(){
        return homePageLocators.ordersGraph.isDisplayed();
    }
    public boolean getChat(){
        return homePageLocators.chat.isDisplayed();
    }
    public boolean getworldGraph(){
        return homePageLocators.worldGraph.isDisplayed();
    }
}
