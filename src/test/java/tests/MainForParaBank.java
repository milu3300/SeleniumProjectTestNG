package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import utilities.Driver;

public class MainForParaBank extends ParaBankTest{
    WebDriver driver = Driver.getDriver();
    ParaBankTest paraBankTest = new ParaBankTest();
    @AfterClass
    public static void closeBrowser(){
        Driver.getDriver().close();
    }

    @Test

    public void firstMethodRegister(){
        paraBankTest.infoForRegister();
    }

    @Test
    public void login(){
        paraBankTest.logIn();
    }


}
