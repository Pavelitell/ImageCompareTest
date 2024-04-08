package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Overview extends BasePage {
    @FindBy (xpath = "Checkout: Overview\n") private WebElement overviewTitle;
    @FindBy (xpath = "//*[@id=\"cancel\"]") private WebElement cancelButton;
    @FindBy (xpath = "//*[@id=\"finish\"]") private WebElement finishButton;
    public String getOverviewTitle(){
        return overviewTitle.getText();
    }
}
