package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class ModalsPage {
    By searchcolorinput= By.cssSelector("[placeholder=\"Renk Ara\"]");
    By blackcolor= By.cssSelector("span.color-filter-option__pattern");
    By products= By.cssSelector(".product-card:nth-child(2)");
    By producttext = By.cssSelector("span.review-count");
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper helper;
    Actions action;
    public ModalsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.helper = new ElementHelper(driver);

    }
    public void clickfilter(String filter){

        helper.scrollToElement(driver.findElement(searchcolorinput));
        helper.sendKey(searchcolorinput,filter);
        helper.click(blackcolor);

    }

        public void clickproduct(){
            helper.click(products);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }

    public void checkproductpage(){
        helper.checkElementVisible(producttext);



    }
}
