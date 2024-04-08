package tests;

import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import pages.LoginPage;

import static readProperty.ConfigProvider.USER_2_NAME;
import static readProperty.ConfigProvider.USER_2_PASS;

public class ProductsPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    @BeforeEach
    protected void logIn(){
        loginPage.signIn(USER_2_NAME,USER_2_PASS);
    }

}
