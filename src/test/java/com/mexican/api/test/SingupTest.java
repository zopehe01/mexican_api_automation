package com.mexican.api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mexican.api.base.AuthService;
import com.mexican.api.models.request.SingUpRequest;
import com.mexican.api.models.response.SingUpResponse;

import io.restassured.response.Response;

public class SingupTest {

    @Test
    public void validateSingupFlow(){
        SingUpRequest singUpRequest = new SingUpRequest.Builder()
            .setFirstName("Hemant")
            .setLastName("Zope")
            .setEmailId("test@gmail.com")
            .setMobileNo("123456789")
            .setUsername("")
            .setPassword("")
            .build();
        AuthService authService = new AuthService();
        Response response = authService.signUp(singUpRequest);
        SingUpResponse singUpResponse = response.as(SingUpResponse.class);
        Assert.assertEquals(singUpResponse.getUsername(), singUpRequest.getUsername());
        Assert.assertEquals(singUpResponse.getMsg(), "registration successful");
        Assert.assertNotNull(singUpResponse.getTimestamp());

    }

}
