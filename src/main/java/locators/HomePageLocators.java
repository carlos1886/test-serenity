package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {
    @FindBy(xpath = "//section[@class='content-header']")
    public WebElement homePageUserName;

    @FindBy(xpath = "//div[@class='col-lg-3 col-sm-6']//div[@class='card-body']")
    public WebElement summaryBoxes;

    @FindBy(xpath = "//div[@class='tab-content no-padding']")
    public WebElement ordersGraph;

    @FindBy(xpath = "//div[@class='card s-dashboard-card s-chat']")
    public WebElement chat;

    @FindBy(xpath = "//div[@class='card s-dashboard-card s-dashboard-worldmap bg-world-map']")
    public WebElement worldGraph;
}
