package pages;

import helper.EnvironmentSetup;
import helper.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ItemPage extends EnvironmentSetup {

    public static WebElement getAddToCartComparisonButton(){
        return driver.findElement(By.id(Locators.addToCartComparisonButtonId));
    }

}
