package pages;

import helper.EnvironmentSetup;
import helper.Locators;
import org.openqa.selenium.By;

public class PreShoppingCartPage extends EnvironmentSetup {

    public static String getAddedToCartText(){
        return driver.findElement(By.id(Locators.addedToCartTextId)).getText();
    }

    public static void clickCartButton(){
        driver.findElement(By.id(Locators.cartButtonId)).click();
    }
}
