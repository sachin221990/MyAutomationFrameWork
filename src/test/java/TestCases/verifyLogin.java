package TestCases;

import common.baseClass;
import common.constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

import java.io.IOException;

public class verifyLogin extends baseClass {

    @Test
    public void login() throws IOException {
        //initialseBrowser();
        //driver.get("https://login.salesforce.com/?locale=in");
        //LaunchApplication();
        //WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
        //WebElement password=driver.findElement(By.xpath("//input[@name='pw']"));
        //username.sendKeys("Test");
        //password.sendKeys("Test1");
        //driver.findElement(By.xpath("//input[@id='Login']")).click();

        LoginPage loginpage = new LoginPage(driver);
        loginpage.enterUserName().sendKeys(constants.Username);
        loginpage.enterPassword().sendKeys(constants.Password);
        loginpage.clickOnLoginButton().click();
        System.out.println("Login successfull...");
    }
}
