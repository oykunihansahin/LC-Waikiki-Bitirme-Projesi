package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;
import util.DriverFactory;

public class HomePageSteps {

    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);
    LoginPage loginPage = new LoginPage(driver);
    SignUpPage signUpPage = new SignUpPage(driver);




    @Given("Controlling on the Home Page and text {string} and {string}")
    public void controllingOnTheHomePageAndTextAnd(String arg0, String arg1) {
        loginPage.controllogintext();
        signUpPage.textemail(arg0);
        signUpPage.textpassword(arg1);
        loginPage.clickloginbutton();
        homePage.checklogo();

    }


    @When("hover {string} text and click {string} text")
    public void hoverTextAndClickText(String arg2, String arg3) {

        homePage.hovertext(arg2,arg3);
    }




    @Then("should see Blouse Modals Page")
    public void shouldSeeBlouseModalsPage() {
        homePage.checkblousemodalspage();

    }



}
