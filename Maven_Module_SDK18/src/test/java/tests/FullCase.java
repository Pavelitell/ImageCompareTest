package tests;

import com.github.romankh3.image.comparison.ImageComparison;
import com.github.romankh3.image.comparison.ImageComparisonUtil;
import com.github.romankh3.image.comparison.model.ImageComparisonResult;
import com.github.romankh3.image.comparison.model.ImageComparisonState;
import core.BaseTest;
import helpers.ImageManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.*;

import java.awt.image.BufferedImage;
import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static readProperty.ConfigProvider.*;


public class FullCase extends BaseTest {
    Complete complete = new Complete();
    LoginPage loginPage = new LoginPage();
    Overview overview = new Overview();
    Products products = new Products();
    YourCart yourCart = new YourCart();
    YourInfo yourInfo = new YourInfo();
    ImageManager imageManager = new ImageManager();

    @Test
    protected void e2ePositive(){
        loginPage.signIn(USER_2_NAME,USER_2_PASS);
        products.clickProduct();
        yourCart.checkOut();
        yourInfo.addTicket(FIRSTNAME,LASTNAME,ZIP);
        overview.finish();
        Assertions.assertTrue(complete.getFinishTitle().contains("Complete"));
    }
    @Test
    protected void negativeLogin(){
        loginPage.signIn(USER_1_NAME,USER_1_PASS);
        Assertions.assertTrue(loginPage.getErroreMessege().contains("Epic sadface"));
    }

    @Test
    protected void ScreenAndCompare() throws InterruptedException {
        int actual = imageManager.actual;
        int expected = imageManager.expected;

        loginPage.signIn(USER_2_NAME,USER_2_PASS);
        ImageManager.screenShoting(actual);
        products.logOut();
        loginPage.signIn(USER_3_NAME,USER_3_PASS);
        ImageManager.screenShoting(expected);
        ImageManager.compareImage(actual,expected,"Screenshots","screenshot");
    }
}
