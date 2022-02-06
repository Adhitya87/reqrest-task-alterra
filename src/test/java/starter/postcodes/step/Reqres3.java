package starter.postcodes.step;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

public class Reqres3 {
    public static String URLCreate="https://reqres.in/api/login";
    @Step
    public static void Login(String password)
    {
        JSONObject data = new JSONObject();

        data.put("password", password);

        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(data.toString())
                .log().all()
                .when()
                .post(URLCreate);
    }


}
