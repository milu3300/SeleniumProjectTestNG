package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    WebDriver driver;

    public HomePage() {
        this.driver = Driver.getDriver();
        PageFactory.initElements(driver, this);


    }

    @FindBy(xpath = "//button[text()=\"Sign in\"]")
    public WebElement signInButton;

    @FindBy(id = "email_input_text")
    public WebElement usernameInput;

    @FindBy(id = "password_input_text")
    public WebElement passwordInput;

    @FindBy(xpath = "//form//button[text()='Sign in']")
    public WebElement signInButtonInForm;

    public void login(String username, String password) {
        signInButton.click();
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signInButtonInForm.click();
    }


@FindBy (linkText = "Vegetarian")
    public WebElement vegetarian;

    @FindBy(xpath = "//input[@id=\"cal_input\"]")
    public WebElement caloriesInput;



    @FindBy(xpath = "//select[@id=\"num_meals_selector\"]")
    public WebElement mealsnumB8t;

    @FindBy(xpath = "//option[contains(text(), '4 meals')]")
    public WebElement fourMealsB8t;

    @FindBy(xpath = "//button[contains(text(), 'Generate')]")
    public WebElement generateB8t;

    @FindBy(xpath = "//div[@class=\"plan_calories text-medium\"]")
    public WebElement caloriesNum;


    @FindBy(xpath = "//div[@class=\"day_refresh_button svg-button inline-block\"]")
    public WebElement refresh;


    @FindBy(xpath = "//div[contains(text(), 'Breakfast')]")
    public WebElement breakfast;
    @FindBy(xpath = "//div[contains(text(), 'Lunch')]")
    public WebElement lunch;
    @FindBy(xpath = "//div[contains(text(), 'Dinner')]")
    public WebElement dinner;
    @FindBy(xpath = "//div[contains(text(), 'Snack')]")
    public WebElement snack;















}
