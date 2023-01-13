package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomersPageLocators {

    @FindBy(xpath = "//input[@title='introduzca el texto a buscar ...']")
    public WebElement searchby;

    @FindBy(xpath = "//div[@class='slick-cell l0 r0']")
    public WebElement table;

    @FindBy(xpath = "//div[@class='slick-cell l1 r1']")
    public WebElement companyName;

    @FindBy(xpath = "//div[@class='slick-cell l2 r2']")
    public WebElement contactName;
    @FindBy(xpath = "//div[@class='slick-cell l3 r3']")
    public WebElement contactTitle;
    @FindBy(xpath = "//div[@class='slick-cell l4 r4']")
    public WebElement contactRegion;
    @FindBy(xpath = "//div[@class='slick-cell l5 r5']")
    public WebElement postalCode;
    @FindBy(xpath = "//div[@class='slick-cell l6 r6']")
    public WebElement country;
    @FindBy(xpath = "//div[@class='slick-cell l7 r7']")
    public WebElement city;
    @FindBy(xpath = "//div[@class='slick-cell l8 r8']")
    public WebElement phone;
    @FindBy(xpath = "//div[@class='slick-cell l9 r9']")
    public WebElement fax;
    @FindBy(xpath = "//div[@class='slick-cell l10 r10']")
    public WebElement representatives;
}
