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
    @Test
    public void createUser(){
        String requestBody = "{\"name\": \"morpheus\", \"job\": \"leader\"}";
        RestAssured.given()
                .baseUri("https://reqres.in")
                .basePath("/api/users")
                .body(requestBody)
                .when()
                .post()
                .then()
                .statusCode(201)
                .log()
                .all();
    }
    @Test
    public void updateUser(){
        String requestBody = "{\"name\": \"morpheus\", \"job\": \"zion resident\"}";
        RestAssured.given()
                .baseUri("https://reqres.in")
                .basePath("/api/users/2")
                .body(requestBody)
                .when()
                .put()
                .then()
                .statusCode(200)
                .log()
                .all();
    }
    @Test
    public void reUpdateUser(){
        String requestBody = "{\"name\": \"morpheus\", \"job\": \"tester\"}";
        RestAssured.given()
                .baseUri("https://reqres.in")
                .basePath("/api/users/2")
                .body(requestBody)
                .when()
                .patch()
                .then()
                .statusCode(200)
                .log()
                .all();
    }
    @Test
    public void deleteUser(){
        RestAssured.given()
                .baseUri("https://reqres.in")
                .basePath("/api/users/2")
                .when()
                .delete()
                .then()
                .statusCode(204)
                .log()
                .all();
    }
    @Test
    public void successfulRegisterUser(){
        String requestBody = "{\"email\": \"eve.holt@reqres.in\", \"password\": \"pistol\"}";
        RestAssured.given()
                .baseUri("https://reqres.in")
                .basePath("/api/register")
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post()
                .then()
                .statusCode(200)
                .log()
                .all();
    }
    @Test
    public void unSuccessfulRegisterUser(){
        String requestBody = "{\"email\": \"sydney@fife\"}";
        RestAssured.given()
                .baseUri("https://reqres.in")
                .basePath("/api/register")
                .body(requestBody)
                .when()
                .post()
                .then()
                .statusCode(400)
                .log()
                .all();
    }
    @Test
    public void successfulLogin(){
        String requestBody = "{\"email\": \"eve.holt@reqres.in\", \"password\": \"cityslicka\"}";
        RestAssured.given()
                .baseUri("https://reqres.in")
                .basePath("/api/login")
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post()
                .then()
                .statusCode(200)
                .log()
                .all();
    }
    @Test
    public void unSuccessfulLogin(){
        String requestBody = "{\"email\": \"peter@klaven\"}";
        RestAssured.given()
                .baseUri("https://reqres.in")
                .basePath("/api/login")
                .body(requestBody)
                .when()
                .post()
                .then()
                .statusCode(400)
                .log()
                .all();
    }
    @Test
    public void delayedResponse(){
        RestAssured.given()
                .baseUri("https://reqres.in")
                .basePath("/api/users?delay=3")
                .when()
                .get()
                .then()
                .statusCode(200)
                .log()
                .all();
    }
}
