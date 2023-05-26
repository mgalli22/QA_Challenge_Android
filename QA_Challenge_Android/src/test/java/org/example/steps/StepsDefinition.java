package org.example.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageObject.HomePage;
import org.example.pageObject.LoginPage;

public class StepsDefinition {

    LoginPage login=new LoginPage();
    @Given("the user is at the login screen")
    public void theUserIsAtTheLoginScreen() throws Exception {
        login.setUp();
    }

    @Then("the user should see the home screen")
    public void theUserShouldSeeTheHomeScreen() {
        HomePage.verifyHomePageTitle();
        LoginPage.tearDown();
        
    }


    @When("the user enters their {string} and {string} and press login button")
    public void theUserEntersTheirAnd(String Email, String Password) {
        login.login(Email,Password);
    }
}
