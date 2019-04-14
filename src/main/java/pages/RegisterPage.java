package pages;

import helper.Locators;
import org.openqa.selenium.By;

public class RegisterPage extends helper.EnvironmentSetup {
    public static String errorText;

    public static void enterEmail(String email) {
        driver.findElement(By.id(Locators.registrationEmailId)).sendKeys(email);
    }

    public static void clickRegisterButton() {
        driver.findElement(By.className(Locators.registrationProceedButtonClass)).click();
    }

    public void getErrorText(){
        errorText = driver.findElement(By.id(Locators.registrationErrorId)).getAttribute("value");
        System.out.println(errorText);
    }
}