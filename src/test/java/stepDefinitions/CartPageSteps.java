package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.*;
import util.DriverFactory;

public class CartPageSteps {
    WebDriver driver = DriverFactory.getDriver();
    CartPage cartPage = new CartPage(driver);
    HomePage homePage = new HomePage(driver);
    ModalsPage modalsPage = new ModalsPage(driver);
    ProductPage productPage = new ProductPage(driver);
    SignUpPage signUpPage = new SignUpPage(driver);
    LoginPage loginPage = new LoginPage(driver);


    @Given("Controlling {string} {string} {string} {string}Cart Page and text {string} and {string}")
    public void controllingCartPageAndTextAnd(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5) {
        loginPage.controllogintext();
        signUpPage.textemail(arg4);
        signUpPage.textpassword(arg5);
        loginPage.clickloginbutton();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        homePage.hovertext(arg0,arg1);
        homePage.checkblousemodalspage();
        modalsPage.clickfilter(arg2);
        modalsPage.clickproduct();
        modalsPage.checkproductpage();
        productPage.clicksize(arg3);
        productPage.clickaddcartbutton();
        productPage.controllingcartsymbol();
    }

    @When("check {string} name")
    public void checkName(String arg4) {
        cartPage.clickbasketicon();
        cartPage.checkname(arg4);

    }

    @When("check one piece")
    public void checkOnePiece() {
        cartPage.checkonepiece();


    }

    @When("check {string} size")
    public void checkSize(String arg6) {
        cartPage.checksize(arg6);

    }

    @When("click Go to Payment Step button")
    public void clickGoToPaymentStepButton() {
        cartPage.clickpaymentbutton();

    }

    @Then("should see Payment Step")
    public void shouldSeePaymentStep() {
        cartPage.paymentwindow();

    }



}
