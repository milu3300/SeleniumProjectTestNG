package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CommonPage {

    WebDriver driver;

    public CommonPage(){
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "linkText = \"Infographics")
    public WebElement infographics;

    @FindBy(xpath = "//li[text()='Sales']")
    public WebElement sales;

    @FindBy(xpath = "//li[text()='Expenses']")
    public WebElement expenses;

    @FindBy(xpath = "//li[text()='Reports']")
    public WebElement reports;










}
