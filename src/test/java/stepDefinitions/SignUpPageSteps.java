package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SignUpPage;
import util.DriverFactory;

public class SignUpPageSteps {

    WebDriver driver = DriverFactory.getDriver();
    SignUpPage signUpPage = new SignUpPage(driver);



    @Given("Controlling on the Sign Up Page")
    public void controllingOnTheSignUpPage() {
        signUpPage.signuptext();
    }

    @When("type Email {string}")
    public void typeEmail(String arg0) {
        signUpPage.textemail(arg0);

    }

    @When("type Password {string}")
    public void typePassword(String arg1) {
        signUpPage.textpassword(arg1);

    }

    @When("type phone number {string}")
    public void typePhoneNumber(String arg2) {
        signUpPage.textphone(arg2);

    }

    @When("click agreement checkbox")
    public void clickAgreementCheckbox() {
        signUpPage.clickagreement();


    }

    @When("click Sign Up button")
    public void clickSignUpButton() {
        signUpPage.clickregisterbutton();


    }


}
