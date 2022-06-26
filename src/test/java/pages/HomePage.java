package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class HomePage {

    By logo = By.cssSelector("a.main-header-logo");
    By categories = By.cssSelector("a.menu-header-item__title");
    By undercategories = By.cssSelector(".mega-menu.mega-menu--hovered .zone-item__anchor");
    //By coupon = By.cssSelector("span.editable.ins-element-editable.editable-text");
    By understandbutton= By.cssSelector(".cookieseal-banner-body button");
    By blousemodalstext = By.cssSelector(".col-xs-12 h1");
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper helper;
    Actions action;
    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.helper = new ElementHelper(driver);
        Actions builder = new Actions(driver);
    }

    public void checklogo(){

        helper.checkElementVisible(logo);
    }

    public void hovertext(String name, String name2){
        helper.clickElementWithText(understandbutton,"ANLADIM");
        //helper.click(coupon);
        helper.hoverElement(categories,name);

        helper.clickElementWithText(undercategories,name2);

    }

    public void checkblousemodalspage(){

        helper.checkElementWithText(blousemodalstext,"Bluz Modelleri");

    }

}
