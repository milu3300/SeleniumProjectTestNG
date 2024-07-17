package tests;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ClientsPage;
import pages.CommonPage;
import pages.HomePage;
import utilities.Driver;

public class ClientsTests {
    WebDriver driver= Driver.getDriver();
    HomePage homePage = new HomePage();
    ClientsPage clientsPage = new ClientsPage();
    CommonPage commonPage = new CommonPage();

    @Test
    public void verifyEmptyResult(){
        driver.get("https://cashwise.us/main");
        homePage.login("azizusmanuulu@gmail.com", "Kaspersky00");
        commonPage.sales.click();
        clientsPage.search("apple");
        Assert.assertTrue(clientsPage.listIsEmptyText.isDisplayed());
        



    }


}
