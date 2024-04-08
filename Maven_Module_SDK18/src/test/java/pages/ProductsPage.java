package pages;

import core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage {

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
    @FindBy(id = "add-to-cart") private WebElement AddToCartButton;






}
