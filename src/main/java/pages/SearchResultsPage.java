package pages;

import helper.EnvironmentSetup;
import org.openqa.selenium.By;

public class SearchResultsPage extends EnvironmentSetup {

    public static void clickOnResultByItemName(String itemName) {
        driver.findElement(By.partialLinkText(itemName)).click();
    }
}
