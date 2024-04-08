package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompletePage extends BasePage {
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span") private WebElement finishTitle;
    @FindBy(xpath = "//*[@id=\"back-to-products\"]") private WebElement backHomeTitle;
    public String getFinishTitle(){
        return finishTitle.getText();
    }
}
