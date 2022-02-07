package starter.postcodes.StepDefintion;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.postcodes.step.Reqres4;

import static org.hamcrest.CoreMatchers.equalTo;

public class UpdateReqres {
    @Steps
    Reqres4 reqres4;

    @When("user input name is {string} and job is {string}")
    public void userupdate(String name, String job){
        reqres4.updateuser(name, job);
    }; {
    }


    @Then("user successes to update")
    public void userSuccessesToUpdate() {
        SerenityRest.then()
                .statusCode(200);
    }

    @And("response name is {string} and job is {string} and dateupdate {string}")
    public void responseNameIsAndJobIsAndDateupdate(String name, String job, String dateupdate) {
        SerenityRest.then()
                .body("name",equalTo(name))
                .body("job",equalTo(job));

    }
}

