package pages;

import helper.EnvironmentSetup;
import helper.Locators;
import org.openqa.selenium.By;

public class CartPage extends EnvironmentSetup {


    public static void clickDeleteButton(){
        driver.findElement(By.xpath(Locators.deleteButtonXpath)).click();
    }

    public static String getItemsBoxGroupFullText(){
        return driver.findElement(By.cssSelector(Locators.itemsBoxGroupCssSelector)).getText();
    }

    public static String getShoppingCartPlaceholderFullText(){
        return driver.findElement(By.cssSelector(Locators.shoppingCartPlaceholderCssSelector)).getText();
    }

    public static String getSubtotalFullText(){
        return driver.findElement(By.id(Locators.subtotalLabelId)).getText();
    }

}
