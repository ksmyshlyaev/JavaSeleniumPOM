package pages;

import helper.Locators;
import org.openqa.selenium.By;

public class RegisterPage extends helper.EnvironmentSetup {
    public static String errorText;

    public static void enterEmail(String email) {
        driver.findElement(By.id(Locators.registrationEmailId)).sendKeys(email);
    }

    public static void enterPassword(String password){
        driver.findElement(By.id(Locators.registrationPasswordId)).sendKeys(password);
    }

    public static void ClickSignInButton() {
        driver.findElement(By.id(Locators.registrationSignInSubmitButtonId)).click();
    }

    public static String getErrorText(){
        errorText = driver.findElement(By.className(Locators.registrationErrorClassName)).getText();
        return errorText;
    }
}