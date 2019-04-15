import org.junit.Test;
import pages.ElectronicsPage;
import pages.MainPage;
import pages.RegisterPage;
import pages.SearchResultsPage;

import static org.junit.Assert.*;

public class TestClass extends helper.EnvironmentSetup {

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
    public void AddItemToCart(){
        driver.get(MainPage.url);
        MainPage.clickOnElectronicsElement();
        ElectronicsPage.clickOnCameraAndPhotoLink();
        SearchResultsPage.clickOnResultByItemName("Samsung 128GB 100MB/s");
    }

}

