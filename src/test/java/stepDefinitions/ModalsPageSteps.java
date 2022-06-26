package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import pages.HomePage;
import pages.LoginPage;
import pages.ModalsPage;
import pages.SignUpPage;
import util.DriverFactory;

public class ModalsPageSteps {


    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);
    ModalsPage modalsPage = new ModalsPage(driver);
    SignUpPage signUpPage = new SignUpPage(driver);
    LoginPage loginPage = new LoginPage(driver);


    @Given("Controlling {string} {string} Modals Page and text {string} and {string}")
    public void controllingModalsPageAndTextAnd(String arg0, String arg1, String arg2, String arg3) {
        loginPage.controllogintext();
        signUpPage.textemail(arg2);
        signUpPage.textpassword(arg3);
        loginPage.clickloginbutton();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        homePage.hovertext(arg0,arg1);
        homePage.checkblousemodalspage();
    }

    @When("click {string} filter")
    public void clickFilter(String arg4) {

        modalsPage.clickfilter(arg4);
    }

    @When("click first product")
    public void clickFirstProduct() {
        modalsPage.clickproduct();
    }

    @Then("should see Product Page")
    public void shouldSeeProductPage() {
        modalsPage.checkproductpage();
    }



}
