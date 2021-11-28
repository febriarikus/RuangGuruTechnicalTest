package Utils;

import net.serenitybdd.rest.SerenityRest;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Request {
    public static void Get (String endpoint,  int statusCode){
        SerenityRest
                .given()
                .contentType("application/json")
                .when()
                .get(endpoint)
                .then()
                .log()
                .ifValidationFails()
                .statusCode(statusCode);
    }
}