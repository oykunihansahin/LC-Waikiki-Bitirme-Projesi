package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.SignUpPage;
import util.DriverFactory;

public class LoginPageSteps {
    WebDriver driver = DriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    SignUpPage signUpPage = new SignUpPage(driver);



    @Given("Controlling on the Login Page and text {string} and {string}")
    public void controllingOnTheLoginPageAndTextAnd(String arg0, String arg1) {
        loginPage.controllogintext();
        signUpPage.textemail(arg0);
        signUpPage.textpassword(arg1);
    }


    @When("click login button")
    public void clickLoginButton() {
        loginPage.clickloginbutton();

    }

    @Then("should see HomePage")
    public void shouldSeeHomePage() {
        loginPage.checklogo();
    }


}
