package pages;

import helper.Locators;
import org.openqa.selenium.By;

public class MainPage extends  helper.EnvironmentSetup {
    public static String url = "https://www.booking.com/";

    public static void clickOnRegisterButton() {
    driver.findElement(By.partialLinkText(Locators.registerButtonText)).click();
    }

}
