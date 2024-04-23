package core;

import helpers.Custom;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;




public class BaseTest {
public static EventFiringWebDriver driver;
//public static RemoteWebDriver driver;
public static ChromeOptions chromeOptions;
public static FirefoxOptions foxOptions;
public static Actions actions;
public static String Browser = System.getProperty("browser");


@BeforeAll
public static void setUp() {

    Browser = "Chrome";

    if (Browser.contains("Chrome")) {
        WebDriverManager.chromedriver().setup();
        chromeOptions = new ChromeOptions();
        driver = new EventFiringWebDriver(new ChromeDriver(chromeOptions));
    }
    if (Browser.contains("FireFox")) {
        WebDriverManager.firefoxdriver().setup();
        foxOptions = new FirefoxOptions();
        driver = new EventFiringWebDriver(new FirefoxDriver(foxOptions));
    }
    driver.manage().window().maximize();
    driver.register(new Custom());
    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    actions = new Actions(driver);
    BasePage.setDriver(driver);

}

@AfterAll
public static void tearDown() {
    driver.quit();

}

}