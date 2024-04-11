package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Overview extends BasePage {
    @FindBy (xpath = "Checkout: Overview\n") private WebElement overviewTitle;
    @FindBy (xpath = "//*[@id=\"cancel\"]") private WebElement cancelButton;
    @FindBy (xpath = "//*[@id=\"finish\"]") private WebElement finishButton;

    public Overview (){
        PageFactory.initElements(driver,this);
    }
    public String getOverviewTitle(){
        return overviewTitle.getText();
    }

    public Overview finish (){
        finishButton.click();
        return this;
    }
}
