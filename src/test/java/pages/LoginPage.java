package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class LoginPage {

    By logintext= By.cssSelector(".login-form__title");
    By loginbutton= By.cssSelector(".login-form__button.login-form__button--bg-blue");
    By logo = By.cssSelector("a.main-header-logo");
    WebDriver driver;
    WebDriverWait wait;
    ElementHelper helper;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.helper = new ElementHelper(driver);
    }
    public void controllogintext(){
        helper.checkElementVisible(logintext);

    }
    public void clickloginbutton(){
        helper.click(loginbutton);

    }
    public void checklogo(){

        helper.checkElementVisible(logo);
    }

}
