package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static readProperty.ConfigProvider.URL;

public class YourCart extends BasePage {
    @FindBy(id = "remove-sauce-labs-bike-light") private WebElement removeButton;
  @FindBy (id = " continue-shopping") private WebElement continueShoppingButton;
   @FindBy (id ="checkout") private WebElement checkoutButton;

   public YourCart(){
       PageFactory.initElements(driver,this);
   }

   public YourCart checkOut(){
       checkoutButton.click();
       return this;
   }


}
