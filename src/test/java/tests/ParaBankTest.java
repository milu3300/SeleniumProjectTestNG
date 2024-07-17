package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ParaBankTest {
    /*
    1. Go to the "https://parabank.parasoft.com/parabank"
2. Click on register
3. Fill out the fields to register(don't give your real info)
4. After registering, log out from your account
5. Log back in using the username and password
6. After logging in, check the balance if you have more than 0
7. Open new savings account by clicking Open New Account
8. And then transfer half of your checking account balance to your newly created savings account.
9. Lastly go back to your home page, and verify if that fund is in your savings account
     */
   WebDriver driver;



   public ParaBankTest(){
       this.driver = Driver.getDriver();
       PageFactory.initElements(driver,this);
   }

   @FindBy(xpath = "//a[text() = 'Register']")
    public WebElement registerBtn;

   @FindBy(xpath = "//input[@id=\"customer.firstName\"]")
    public WebElement firstName;

   @FindBy(xpath = "//input[@id=\"customer.lastName\"]")
    public WebElement lastName;

   @FindBy(xpath = "//input[@id=\"customer.address.street\"]")
    public WebElement address;

   @FindBy(xpath = "//input[@id=\"customer.address.city\"]")
    public WebElement city;

   @FindBy(xpath = "//input[@id=\"customer.address.state\"]")
    public WebElement state;

   @FindBy(xpath = "//input[@id=\"customer.address.zipCode\"]")
    public WebElement zipCode;

   @FindBy(xpath = "//input[@id=\"customer.phoneNumber\"]")
    public WebElement phoneNumber;

   @FindBy(xpath = "//input[@id=\"customer.ssn\"]")
    public WebElement ssnNumber;

   @FindBy(xpath = "//input[@id=\"customer.username\"]")
    public WebElement userName;

   @FindBy(xpath = "//input[@name=\"customer.password\"]")
    public WebElement password;

   @FindBy(xpath = "//input[@id=\"repeatedPassword\"]")
    public WebElement repeatedPassword;

   @FindBy(xpath = "//input[@name=\"username\"]")
   public WebElement name;

   @FindBy(xpath = "//input[@name=\"password\"]")
   public WebElement pass;

   @FindBy(xpath = "//input[@value=\"Log In\"]")
   public WebElement logInBtn;

   @FindBy(xpath = "//input[@value=\"Register\"]" )
   public WebElement registerButton;


   public void infoForRegister(){
       Faker faker = new Faker();
       ParaBankTest paraBankTest = new ParaBankTest();
       driver.get("https://parabank.parasoft.com/parabank");
       paraBankTest.registerBtn.click();
       paraBankTest.firstName.sendKeys(faker.name().firstName());
       paraBankTest.lastName.sendKeys(faker.name().lastName());
       paraBankTest.address.sendKeys(faker.address().fullAddress());
       paraBankTest.city.sendKeys(faker.address().city());
       paraBankTest.state.sendKeys(faker.address().state());
       paraBankTest.zipCode.sendKeys(faker.address().zipCode());
       paraBankTest.phoneNumber.sendKeys(faker.phoneNumber().phoneNumber());
       paraBankTest.ssnNumber.sendKeys("123456789");
       paraBankTest.userName.sendKeys("anna123");
       paraBankTest.password.click();
       paraBankTest.password.sendKeys("admin123");
       paraBankTest.repeatedPassword.sendKeys("admin123");
       paraBankTest.registerButton.click();
   }

   public void logIn(){
       ParaBankTest paraBankTest = new ParaBankTest();
       paraBankTest.name.click();
     //git a  paraBankTest.name.sendKeys("anna123");
       paraBankTest.pass.click();
       paraBankTest.pass.sendKeys("admin123");
       paraBankTest.logInBtn.click();
   }














}
