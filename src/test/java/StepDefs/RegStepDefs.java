package StepDefs;

import Core.WebHelper;
import POM.RegisterElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegStepDefs {
    static WebDriver driver;
    RegisterElements webElement;
    @Given("goto the Registration page")
    public void gotoTheRegistrationPage() {
        WebHelper helper=new WebHelper();
        driver= helper.chromeLaunch();
    }

    @When("User input {string} and {string} and {string}")
    public void userInputFirstNameAndLastNameAndEMail(String First, String Last, String Email) throws InterruptedException {
        webElement= new RegisterElements(driver);
        webElement.UserInput1(First, Last, Email);
    }

    @And("User input {string} and {string}")
    public void userInputPhoneAndMessage(String Phone, String Text) throws InterruptedException {
        webElement.UserInput2(Phone, Text);
    }

    @And("User select the Privacy Policy check box")
    public void userSelectThePrivacyPolicyCheckBox() throws InterruptedException {
    webElement.CheckBox1();
    }

    @And("User check Captcha")
    public void userCheckCaptcha() throws InterruptedException {
        webElement.Captcha();

    }

    @And("User click Submit button")
    public void userClickSubmitButton() throws InterruptedException {
        webElement.Submit();
    }

    @Then("exit")
    public void exit() {
        webElement.Close();
    }
}
