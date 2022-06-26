package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;



public class CartPage {

    By basketicon= By.cssSelector("span.badge-circle");
    By productname= By.cssSelector(".rd-cart-item-title");
    By sizename = By.cssSelector(".rd-cart-item-size");
    By gotopaymentstepbutton = By.cssSelector("div.col-md-12.pl-20.pr-20");
    By addnewaddress = By.cssSelector(".titleTextSmallFont");
    By numberofproduct= By.cssSelector("[value=\"1\"]");
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper helper;
    Actions action;
    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.helper = new ElementHelper(driver);

    }
    public void clickbasketicon(){

        helper.click(basketicon);
    }
    public void checkname(String name){

        helper.checkElementWithText(productname,name);
    }
    public void checksize(String size){

        helper.checkElementWithText(sizename,size);
    }
    public void clickpaymentbutton(){

        helper.click(gotopaymentstepbutton);
    }
    public void paymentwindow(){

        helper.checkElementVisible(addnewaddress);
    }
    public void checkonepiece(){

        helper.checkElementVisible(numberofproduct);
    }





}
