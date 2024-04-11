package tests;

import core.BaseTest;
import org.junit.jupiter.api.Test;
import pages.LoginPage;

import static readProperty.ConfigProvider.*;

public class LoginPageTest extends BaseTest {


    LoginPage loginPage = new LoginPage();
    @Test
    protected void logIn(){
        loginPage.signIn(USER_2_NAME,USER_2_PASS);
    }
}
