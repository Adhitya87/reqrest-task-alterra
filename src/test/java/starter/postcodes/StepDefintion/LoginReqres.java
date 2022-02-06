package starter.postcodes.StepDefintion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.Reqres3;

import static org.hamcrest.CoreMatchers.equalTo;

public class LoginReqres {
    @Steps
    Reqres3 reqres3;

    @When("user input with email is {string}")
    public void userInputWithEmailIs(String email) {

    }

    @And("password is {string}")
    public void passwordIs(String password) {
    }

    @Then("user successes to login and user get token {string}")
    public void userSuccessesToLoginAndUserGetToken(String token) {
        SerenityRest.then()
                .statusCode(200)
                .body("token",equalTo(token));
    }

}




