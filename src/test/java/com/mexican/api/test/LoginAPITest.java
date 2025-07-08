package com.mexican.api.test;

import org.testng.annotations.Test;

import com.mexican.api.base.AuthService;

import io.restassured.response.Response;

public class LoginAPITest {

    @Test
    public void loginTest(){
        AuthService authService = new AuthService();
        Response response = authService.login("");

        response.then().log().all().assertThat().statusCode(200);
    }
    
}
