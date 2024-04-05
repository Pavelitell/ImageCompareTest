package tests;

import core.BaseTest;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static readProperty.ConfigProvider.*;

public class LoginPageTest extends BaseTest {


    LoginPage loginPage = new LoginPage();
    @Test
    public void logIn(){
        loginPage.signIn(USER_1_NAME,USER_1_PASS);
    }
}
