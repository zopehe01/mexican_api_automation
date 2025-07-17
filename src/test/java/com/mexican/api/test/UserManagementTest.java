package com.mexican.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mexican.api.base.AuthService;
import com.mexican.api.base.UserManagementService;
import com.mexican.api.models.request.LoginRequest;
import com.mexican.api.models.response.LoginResponse;
import com.mexican.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class UserManagementTest {

    @Test
    public void validateGetProfile(){

        AuthService authService = new AuthService();
        LoginRequest loginRequest = new LoginRequest.Builder()
            .setUsername("")
            .setPassword("")
            .build();
        Response response = authService.login(loginRequest);
        LoginResponse loginResponse = response.as(LoginResponse.class);
        UserManagementService userManagementService = new UserManagementService();
        Response upResponse = userManagementService.profile(loginResponse.getToken());
        UserProfileResponse UserProfileResponse = upResponse.as(UserProfileResponse.class);
        Assert.assertEquals(UserProfileResponse.getId(), 3);
        Assert.assertEquals(UserProfileResponse.getFirstName(),"Hemant");


    }

}
