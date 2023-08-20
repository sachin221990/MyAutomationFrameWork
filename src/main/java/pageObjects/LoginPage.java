package pageObjects;

import common.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage  {
    public WebDriver driver;

    By username= By.xpath("//input[@id='username']");
    By password= By.xpath("//input[@name='pw']");
    By loginBtn= By.xpath("//input[@id='Login']");

    By tryforfree= By.xpath("//a[@id='signup_link']");

    public LoginPage(WebDriver driver) {
        this.driver=driver;
    }

    public WebElement enterUserName(){
        return driver.findElement(username);
    }

    public WebElement enterPassword(){
        return driver.findElement(password);
    }

    public WebElement clickOnLoginButton(){
        return driver.findElement(loginBtn);
    }

    public WebElement clicktryforfree() {
        return driver.findElement(tryforfree);
    }
}
