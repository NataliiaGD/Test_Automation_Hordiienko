package restAssured;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class TestMethods {
    @Test
    public void getSingleUser(){
        RestAssured.given()
                .baseUri("https://reqres.in/")
                .basePath("/api/users/2")
                .when()
                .get()
                .then()
                .statusCode(200)
                .log()
                .all();
    }
    @Test
    public void getSingleUserNotFound(){
        RestAssured.given()
                .baseUri("https://reqres.in/")
                .basePath("/api/users/23")
                .when()
                .get()
                .then()
                .statusCode(404)
                .log()
                .all();
    }
    @Test
    public void getListResource(){
        RestAssured.given()
                .baseUri("https://reqres.in/")
                .basePath("/api/unknown")
                .when()
                .get()
                .then()
                .statusCode(200)
                .log()
                .all();
    }
}
