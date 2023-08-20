package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class baseClass {

     public WebDriver driver;
     public void initialseBrowser() throws IOException {

          //To access the file
          //C:\Users\sachin\IdeaProjects\AutomationFramework
          FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\data.properties");

          //To read the file
          Properties prop=new Properties();
          prop.load(fis);
          String broswerName=prop.getProperty("browser");

          if(broswerName.equalsIgnoreCase("chrome")){
                driver = new ChromeDriver();
          }
          else if(broswerName.equalsIgnoreCase("firefox")){
                driver = new FirefoxDriver();
          }
          else if(broswerName.equalsIgnoreCase("edge")){
                driver = new EdgeDriver();
          }
          else {
               System.out.println("Please select the correct browser...");
          }
     }

     @BeforeMethod
     public void LaunchApplication() throws IOException {
          initialseBrowser();
          driver.get("https://login.salesforce.com/?locale=in");
     }
}
