package pages;

import helper.Locators;
import org.openqa.selenium.By;

public class ElectronicsPage extends  helper.EnvironmentSetup {

    public static void clickOnCameraAndPhotoLink() {
        driver.findElement(By.linkText(Locators.cameraAndPhotoLinkText)).click();
    }
}
