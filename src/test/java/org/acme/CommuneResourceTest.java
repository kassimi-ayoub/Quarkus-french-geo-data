package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.*;

@QuarkusTest
public class CommuneResourceTest {

    @Test
    public void testgetCommunesContent(){
        given()
                .when().get("/frenchGeo")
                .then()
                .statusCode(200)
                .body(containsString("Lafitte"));
    }
    @Test
    public void testgetCommuneDataType(){
        given()
                .when().get("/frenchGeo")
                .then()
                .statusCode(200)
                .contentType("application/json")
                .body(containsString("Lafitte"));
    }
}
