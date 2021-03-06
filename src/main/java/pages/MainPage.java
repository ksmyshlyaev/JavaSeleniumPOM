package pages;

import helper.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.fail;

public class MainPage extends  helper.EnvironmentSetup {
    public static String url = "https://www.amazon.com/";

    public static void clickOnSignInButton() {
        if (driver.findElement(By.id(Locators.signInButtonId)).isDisplayed()) {
            driver.findElement(By.id(Locators.signInButtonId)).click();
        }
    }

    public static void clickOnElectronicsElement() {
        action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(Locators.departmentsLinkXpath))).perform();
        driver.findElement(By.linkText(Locators.electronicsLinkText)).click();
    }
}

