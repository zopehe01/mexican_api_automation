package com.mexican.api.test;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.mexican.api.base.AuthService;
import com.mexican.api.models.request.LoginRequest;
import com.mexican.api.models.response.LoginResponse;

import io.restassured.response.Response;

@Listeners(com.mexican.api.listeners.TestListener.class)
public class LoginAPITest {

    @Test
    public void loginTest(){
        LoginRequest loginRequest = new LoginRequest.Builder()
            .setUsername("")
            .setPassword("")
            .build();
        AuthService authService = new AuthService();
        Response response = authService.login(loginRequest);
        LoginResponse loginResponse = response.as(LoginResponse.class);
        Assert.assertNotNull(loginResponse.getToken());
        Assert.assertEquals(loginResponse.getType(), "Bearer");
        Assert.assertEquals(loginResponse.getId(), 3);
        Assert.assertEquals(loginResponse.getUsername(), "hemant");
        Assert.assertEquals(loginResponse.getEmail(), "test@gmail.com");
        List<String> roles = new ArrayList<>();
        roles.add("admin");
        roles.add("contributor");
        Assert.assertEquals(loginResponse.getRoles(), roles);
    }
    
}
