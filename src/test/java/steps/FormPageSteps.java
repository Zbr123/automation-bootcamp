//package steps;
//
//import core.WebDriverHook;
//import locators.FormLocators;
//
//import io.cucumber.java.en.When;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.And;
//
//public class FormPageSteps {
//
//    private FormLocators formLocators;
//
//
//    @When("user is on practice form page")
//    public void goToWebApp(){
//        WebDriverHook webDriverHook = new WebDriverHook();
//        webDriverHook.initializeDriver();
//        formLocators = new FormLocators(webDriverHook.getDriver());
//    }
//
//    @When("user clicks on the practice form link")
//    public void clickOnPracticeForm(){
//        formLocators.getPracticeForm().click();
//    }
//
//    @And("user enters the first name {string}")
//    public void enterFirstName(String firstName) {
//        formLocators.getFirstName().sendKeys(firstName);
//    }
//
//    @And("user enters the last name {string}")
//    public void enterLastName(String lastName) {
//        formLocators.getLastName().sendKeys(lastName);
//    }
//
//    @And("user enters the email address {string}")
//    public void enterEmail(String email) {
//        formLocators.getUserEmail().sendKeys(email);
//    }
//
//    @And("user enters the phone number {string}")
//    public void enterPhoneNumber(String phoneNumber) {
//        formLocators.getPhoneNumber().sendKeys(phoneNumber);
//    }
//
//
//
//    @Then("ABC")
//    public void abc() {
//        //whatever
//    }
//
//    @Then("ABCD")
//    public void abcd() {
//        //do the different
//    }
//
//}

package steps;

import core.CucumberHooks;
import core.WebDriverHook;
import locators.FormLocators;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

public class FormPageSteps {

    private FormLocators formLocators;
    private WebDriverHook webDriverHook;

    // Constructor to initialize WebDriverHook and FormLocators
    public FormPageSteps() {
        webDriverHook = WebDriverHook.getInstance();
        formLocators = new FormLocators(webDriverHook.getDriver());
    }


    @When("user is on practice form page")
    public void goToWebApp(){
        formLocators = new FormLocators(webDriverHook.getDriver());
    }

    @When("user clicks on the practice form link")
    public void clickOnPracticeForm(){
        formLocators.getPracticeForm().click();
    }

    @And("user enters the first name {string}")
    public void enterFirstName(String firstName) {
        formLocators.getFirstName().sendKeys(firstName);
    }

    @And("user enters the last name {string}")
    public void enterLastName(String lastName) {
        formLocators.getLastName().sendKeys(lastName);
    }

    @And("user enters the email address {string}")
    public void enterEmail(String email) {
        formLocators.getUserEmail().sendKeys(email);
    }

    @And("user enters the phone number {string}")
    public void enterPhoneNumber(String phoneNumber) {
        formLocators.getPhoneNumber().sendKeys(phoneNumber);
    }


}
