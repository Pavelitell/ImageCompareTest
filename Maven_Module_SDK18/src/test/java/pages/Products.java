package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products extends BasePage {

    //Вещи
    @FindBy(xpath = "//*[@id=\"item_2_title_link\"]/div") private WebElement lowPriseStaff ;
    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div") private WebElement backPackStaff ;
    @FindBy(xpath = "//*[@id=\"item_0_title_link\"]/div") private WebElement bikeStaff ;
    @FindBy(xpath = "//*[@id=\"item_1_title_link\"]/div") private WebElement tShirtStaff ;
    @FindBy(xpath = "//*[@id=\"item_5_title_link\"]/div") private WebElement fleeceJacketStaff ;
    @FindBy(xpath = "//*[@id=\"item_3_title_link\"]/div") private WebElement redFleece  ;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div/span/select") private WebElement productSortContainer ;
    @FindBy(id = "shopping_cart_container") public  WebElement shoppingContanier ;
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span") public  WebElement titleProducts ;
    @FindBy(id = "add-to-cart") private WebElement addToCartButton;
    @FindBy( css="#item_0_img_link > img") public WebElement bikeImage;
    @FindBy(xpath = "//*[@id=\"react-burger-menu-btn\"]")public WebElement openMenu;
    @FindBy(id = "logout_sidebar_link") public WebElement logoutButton;


    public Products(){
        PageFactory.initElements(driver,this);
    }
    public String getTitleProducts(){
        return titleProducts.getText();
    }

    public Products clickProduct(){
        backPackStaff.click();
        addToCartButton.click();
        shoppingContanier.click();
        return this;
    }


public Products logOut(){
        openMenu.click();
        logoutButton.click();
        return this;
}





}
