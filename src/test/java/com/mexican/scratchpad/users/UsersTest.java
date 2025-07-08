package com.mexican.scratchpad.users;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class UsersTest {

    private Map<String,String> headers = new HashMap<>();

    @BeforeClass
    private void setup(){
        baseURI="https://reqres.in";
        headers.put("x-api-key", "reqres-free-v1");

    }

    @Test (description = "Verify '/api/users' endpoint returns list of users")
    public void verifyGetListUser(){
        
        given()
            .log().ifValidationFails()
            .headers(headers)
        .when()
            .basePath("/api/users")
            .param("page", "2")
            .get()
        .then()
            .log().ifValidationFails()
            .assertThat()
            .statusCode(200);
    }

    @Test(description = "Verify '/api/users/{id}' endpoint returns single requested user using id")
    public void verifyGetSingleUser(){
        
        given()
            .log().ifValidationFails()
            .headers(headers)
        .when()
            .get("/api/users/2")
        .then()
            .log().ifValidationFails()
            .assertThat()
            .statusCode(200);
    }

    @Test(description = "Verify '/api/users/{id}' endpoint with invalid id returns 404 Not Found")
    public void verifyGetSingleUserNegativeScenario(){
        
        given()
            .log().ifValidationFails()
            .headers(headers)
        .when()
            .get("/api/users/23")
        .then()
            .log().ifValidationFails()
            .assertThat()
            .statusCode(404);
    }


    @Test(description = "Verify create user endpoint")
    public void verifyCreateUser(){
        
        given()
            .log().ifValidationFails()
            .headers(headers)
            .body("{\r\n" + //
                                "    \"name\": \"John\",\r\n" + //
                                "    \"job\": \"Team Lead\"\r\n" + //
                                "}")
        .when()
            .post("/api/users")
        .then()
            .log().ifValidationFails()
            .assertThat()
            .statusCode(201);
    }

    @Test(description = "Verify Update user endpoint using put method")
    public void verifyUpdateUser(){
        
        given()
            .log().ifValidationFails()
            .headers(headers)
            .body("{\r\n" + //
                                "    \"name\": \"John\",\r\n" + //
                                "    \"job\": \"Manager\"\r\n" + //
                                "}")
        .when()
            .put("/api/users/2")
        .then()
            .log().ifValidationFails()
            .assertThat()
            .statusCode(200);
    }

    @Test(description = "Verify Update user endpoint using Patch method")
    public void verifyUpdateUserUsingPatch(){
        
        given()
            .log().ifValidationFails()
            .headers(headers)
            .body("{\r\n" + //
                                "    \"name\": \"John\",\r\n" + //
                                "    \"job\": \"Manager\"\r\n" + //
                                "}")
        .when()
            .patch("/api/users/2")
        .then()
            .log().ifValidationFails()
            .assertThat()
            .statusCode(200);
    }


    @AfterClass
    private void tearDown(){

    }
    
}
