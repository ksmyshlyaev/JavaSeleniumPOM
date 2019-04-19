import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;
import helper.Locators;

import static org.junit.jupiter.api.Assertions.*;

public class TestClass extends helper.EnvironmentSetup {

    JavascriptExecutor js = (JavascriptExecutor) driver;

    @Test
    public void RegisterTest(){
        driver.get(MainPage.url);
        MainPage.clickOnSignInButton();
        RegisterPage.enterEmail("daxdccascscsdcxc@gmail.com");
        RegisterPage.enterPassword("asdadxccsecscz");
        RegisterPage.ClickSignInButton();
        assertEquals("We cannot find an account with that email address", RegisterPage.getErrorText());
    }

    @Test
    public void AddAndRemoveItemFromCartTest() {
        driver.get(MainPage.url);
        MainPage.clickOnElectronicsElement();
        ElectronicsPage.clickOnCameraAndPhotoLink();
        SearchResultsPage.clickOnResultByItemName("Samsung 128GB 100MB/s");
        ItemPage.getAddToCartComparisonButton();
        js.executeScript("arguments[0].scrollIntoView();", ItemPage.getAddToCartComparisonButton());
        ItemPage.getAddToCartComparisonButton().click();
        assertEquals("Added to Cart", PreShoppingCartPage.getAddedToCartText());
        PreShoppingCartPage.clickCartButton();
        assertTrue(CartPage.getItemsBoxGroupFullText().contains("Subtotal (1 item): $19.99"));
        CartPage.clickDeleteButton();
        try{
            wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.textToBe(By.id(Locators.subtotalLabelId), "Subtotal (0 items): USD 0.00"));

        } catch(TimeoutException e){
            fail(e.toString());
        }
        assertEquals("Subtotal (0 items): USD 0.00", CartPage.getSubtotalFullText());
        assertEquals("Your Shopping Cart is empty.", CartPage.getShoppingCartPlaceholderFullText());

    }

}

