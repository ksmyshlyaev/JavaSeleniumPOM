package helper;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EnvironmentSetup {

    public static ChromeDriver driver;
    public static ChromeOptions options;
    public static Actions action;
    public static WebDriverWait wait;
    public static JavascriptExecutor js;

    @BeforeAll
    public static void setUp(){
        String workingDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", workingDir + "\\src\\main\\resources\\drivers\\chromedriver.exe");
        options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterAll
    public static void close(){
        driver.quit();
    }

}
