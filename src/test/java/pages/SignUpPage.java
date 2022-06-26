package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class SignUpPage {

   By signuptext= By.cssSelector("h5.register__title");
   By email= By.name("email");
   By password= By.name("password");
   By phone= By.name("phone");
   By aggrementbox= By.name("memberPrivacyApprove");
   By registerbutton = By.cssSelector(".register__button.register__button--blue");

    WebDriver driver;
    WebDriverWait wait;
    ElementHelper helper;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.helper = new ElementHelper(driver);
    }
    public void signuptext(){
        helper.checkElementVisible(signuptext);

    }
    public void textemail(String mail){

        helper.sendKey(email,mail);
    }
    public void textpassword(String passw){
        helper.sendKey(password,passw);
    }
    public void textphone(String phon){

        helper.sendKey(phone,phon);
    }
    public void clickagreement(){

        helper.click(aggrementbox);
    }
    public void clickregisterbutton(){
        helper.click(registerbutton);
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
