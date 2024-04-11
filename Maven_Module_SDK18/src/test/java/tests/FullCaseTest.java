package tests;

import core.BaseTest;
import helpers.ImageManager;
import helpers.Custom;
import helpers.TestListener;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import pages.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static readProperty.ConfigProvider.*;

@ExtendWith(TestListener.class)
public class FullCaseTest extends BaseTest {

    Custom custom = new Custom();
    Complete complete = new Complete();
    LoginPage loginPage = new LoginPage();
    Overview overview = new Overview();
    Products products = new Products();
    YourCart yourCart = new YourCart();
    YourInfo yourInfo = new YourInfo();
    ImageManager imageManager = new ImageManager();




    @Test
    public void e2ePositive(){
        loginPage.signIn(USER_2_NAME,USER_2_PASS);
        products.clickProduct();
        yourCart.checkOut();
        yourInfo.addTicket(FIRSTNAME,LASTNAME,ZIP);
        overview.finish();
        Assertions.assertTrue(complete.getFinishTitle().contains("Complete"));

    }
    @Test

    public void negativeLogin(){
        loginPage.signIn(USER_1_NAME,USER_1_PASS);
        Assertions.assertTrue(loginPage.getErroreMessege().contains("Epic sadface"));
    }

    @Test
    public void ScreenAndCompare() throws InterruptedException {
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
