package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.*;
import util.DriverFactory;

public class ProductPageSteps {
    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);
    ModalsPage modalsPage = new ModalsPage(driver);
    ProductPage productPage = new ProductPage(driver);
    SignUpPage signUpPage = new SignUpPage(driver);
    LoginPage loginPage = new LoginPage(driver);

    @Given("Controlling {string} {string} {string} Product Page and text {string} and {string}")
    public void controllingProductPageAndTextAnd(String arg0, String arg1, String arg2, String arg3, String arg4) {
        loginPage.controllogintext();
        signUpPage.textemail(arg3);
        signUpPage.textpassword(arg4);
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
    }

    @When("click {string} size")
    public void clickSize(String arg4) {
        productPage.clicksize(arg4);


    }

    @When("click add cart button")
    public void clickAddCartButton() {
        productPage.clickaddcartbutton();

    }

    @Then("should see Cart page")
    public void shouldSeeCartPage() {
        productPage.controllingcartsymbol();

    }



}
