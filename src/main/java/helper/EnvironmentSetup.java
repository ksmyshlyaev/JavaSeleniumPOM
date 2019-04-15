package helper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class EnvironmentSetup {

    public static ChromeDriver driver;
    public static Actions action;

    @BeforeClass
    public static void setUp(){
        String workingDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", workingDir + "\\src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void close(){
        driver.quit();
    }

}
