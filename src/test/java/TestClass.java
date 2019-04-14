import org.junit.Test;
import pages.MainPage;
import pages.RegisterPage;

import static org.junit.Assert.*;

public class TestClass extends helper.EnvironmentSetup {

    @Test
    public void RegisterTest(){
        driver.get(MainPage.url);
        MainPage.clickOnRegisterButton();
        RegisterPage.enterEmail("asadaadsasdasd");
        RegisterPage.clickRegisterButton();

        assertTrue("Проверьте правильность ввода.", driver.getPageSource().contains("Проверьте правильность ввода."));
    }

}

