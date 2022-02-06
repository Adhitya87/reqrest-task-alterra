package starter.postcodes.StepDefintion;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.Reqres2;


import static net.thucydides.core.reports.html.MarkdownRendering.RenderedElements.step;
import static org.hamcrest.CoreMatchers.equalTo;


public class RegisterReqres {
    @Steps
    Reqres2 reqres2;

    @When("user input with email is {string} and password is {string}")
    public void user_register(String email, String password) {
        Reqres2.RegisNew(email, password);
    }

    @Then("user successes register")
    public void user_successes_register() {
        SerenityRest.then()
                .statusCode(200);
    }
    @And("user id is {int} and token {string}")
    public void user_id_is_and_token(Integer id, String token) {
        SerenityRest.then()
                .body("id",equalTo(id))
                .body("token",equalTo(token));

    }



}
