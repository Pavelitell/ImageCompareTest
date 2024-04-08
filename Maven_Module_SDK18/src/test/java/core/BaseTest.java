package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WebDriver driver;
    @BeforeAll
     public static void setUp(){
         driver = new ChromeDriver();
         WebDriverManager.chromedriver().setup();
         driver.manage().window().maximize();
         driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
         driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
         BasePage.setDriver(driver);
     }
     @AfterAll
    public static void tearDown(){
//        driver.close();
//        driver.quit();
     }
}

