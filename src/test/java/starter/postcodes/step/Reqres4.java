package starter.postcodes.step;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class Reqres4 {
    public String URLCreate="https://reqres.in/api/users/2";
    @Step
    public void updateuser(String name, String job){


        JSONObject data = new JSONObject();
        data.put("name",name);
        data.put("job", job);

        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(data.toString())
                .log().all()
                .when()
                .put(URLCreate);
    }
}
