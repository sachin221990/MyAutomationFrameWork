package TestCases;

import common.baseClass;
import common.commonMethod;
import common.constants;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.SignUpPage;

import java.io.IOException;

public class signUp extends baseClass {

    @Test
    public void signUp() throws IOException, InterruptedException {
        //initialseBrowser();
        //driver.get("https://login.salesforce.com/?locale=in");
        //LaunchApplication();

        LoginPage loginpage = new LoginPage(driver);
        loginpage.clicktryforfree().click();

        Thread.sleep(3000);
        SignUpPage SignUpPage = new SignUpPage(driver);
        SignUpPage.entersignupfirstname().sendKeys(constants.FirstName);
        SignUpPage.entersignupLastname().sendKeys(constants.LastName);
        SignUpPage.entersignupemail().sendKeys("xyz@gmail.com");
        commonMethod.handleDropdown(SignUpPage.clicksignupjobtitle(),1);
        commonMethod.handleDropdown(SignUpPage.clicksignupemployees(),2);
        SignUpPage.entersignupcompanyname().sendKeys("ABC");
        SignUpPage.entersignupphone().sendKeys("1234567891");
        String ActualTitle=SignUpPage.textMessage().getText();
        String ExpectedTitle ="Start your free trial.";
        //Assert.assertEquals(ActualTitle,ExpectedTitle);
        commonMethod.handleAssertions(ActualTitle,ExpectedTitle);
        System.out.println("SignUp successfull...");
    }

}
