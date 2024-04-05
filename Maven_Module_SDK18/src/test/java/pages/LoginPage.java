package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static readProperty.ConfigProvider.*;

public class LoginPage extends BasePage {
    @FindBy(id = "user-name") private WebElement emailTextBox;
    @FindBy(id = "password") private WebElement passTextBox;
    @FindBy(xpath = "//*[@id='login-button']") private WebElement loginButton;

    public LoginPage(){
        driver.get(URL);
        PageFactory.initElements(driver,this);
    }

    public LoginPage signIn(String email,String password){
        emailTextBox.sendKeys(email);
        passTextBox.sendKeys(password);
        loginButton.click();
        return this;
    }

}
