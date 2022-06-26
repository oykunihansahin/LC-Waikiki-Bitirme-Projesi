package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class ProductPage {

    By size= By.cssSelector("a[size=\"M\"]");
    By addcartbutton=By.id("pd_add_to_cart");
    By basketsymbol = By.cssSelector("span.badge-circle");
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper helper;
    Actions action;
    public ProductPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.helper = new ElementHelper(driver);

    }
    public void clicksize(String arg4){
    helper.click(size);


    }
    public void clickaddcartbutton(){
        helper.click(addcartbutton);


    }
    public void controllingcartsymbol(){
       helper.checkElementWithText(basketsymbol,"1");


    }


}
