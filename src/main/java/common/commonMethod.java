package common;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class commonMethod {

    public static void handleDropdown(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public static void handleAssertions(String Actual,String Expected){
        SoftAssert assertion = new SoftAssert();
        assertion.assertEquals(Actual,Expected);
        assertion.assertAll();
    }
}
