package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {

    WebDriver sdriver;

    By signupfirstname = By.xpath("//input[@name='UserFirstName']");

    By signupLastname = By.xpath("//input[@name='UserLastName']");

    By signupemail = By.xpath("//input[@name='UserEmail']");

    By signupjobtitle = By.xpath("//select[@name='UserTitle']");

    By signupcompanyname = By.xpath("//input[@name='CompanyName']");

    By signupemployees = By.xpath("//select[@name='CompanyEmployees']");

    By textMessage = By.xpath("//*[@id=\"start-your-free-trial\"]/span");

    By signupphone = By.xpath("//input[@name='UserPhone']");

    public SignUpPage(WebDriver bdriver1) {
        // TODO Auto-generated constructor stub
        sdriver = bdriver1;
    }

    public WebElement entersignupfirstname() {
        return sdriver.findElement(signupfirstname);
    }

    public WebElement entersignupLastname() {
        return sdriver.findElement(signupLastname);
    }

    public WebElement entersignupemail() {
        return sdriver.findElement(signupemail);
    }

    public WebElement clicksignupjobtitle() {
        return sdriver.findElement(signupjobtitle);
    }

    public WebElement entersignupcompanyname() {
        return sdriver.findElement(signupcompanyname);
    }

    public WebElement clicksignupemployees() {
        return sdriver.findElement(signupemployees);
    }

    public WebElement entersignupphone() {
        return sdriver.findElement(signupphone);
    }

    public WebElement textMessage() {
        return sdriver.findElement(textMessage);
    }

}
