package com.mexican.api.test;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.mexican.api.base.AuthService;
import com.mexican.api.models.request.ForgotPasswordRequest;
import com.mexican.api.models.response.ForgotPasswordResponse;

import io.restassured.response.Response;

public class ForgotPasswordTest {

    @Test (description = "Verify forgot password flow with email and mobile number")
    public void validateForgotPassword(){
        AuthService authService = new AuthService();
        ForgotPasswordRequest forgotPasswordRequest = new ForgotPasswordRequest.Builder()
        .emailId("test@gmail.com")
        .mobileNo("123456789")
        .username("").oldPassword("").newPassword("").build();
        Response response = authService.forgotPassword(forgotPasswordRequest);
        ForgotPasswordResponse actualResponse = response.as(ForgotPasswordResponse.class);
        ForgotPasswordResponse expectedResponse = new ForgotPasswordResponse.Builder()
            .msg("New password sent on registered mobile email address.")
            .status("success").timestamp(null).build();
        Assert.assertEquals(actualResponse.getStatus(), expectedResponse.getStatus());
        Assert.assertEquals(actualResponse.getMsg(), expectedResponse.getMsg());
    }

    @Test (description = "Verify forgot password flow with email")
    public void validateForgotPasswordWithEmail(){
        AuthService authService = new AuthService();
        Response response = authService.forgotPassword("test@gmail.com");
        ForgotPasswordResponse actualResponse = response.as(ForgotPasswordResponse.class);
        ForgotPasswordResponse expectedResponse = new ForgotPasswordResponse.Builder()
            .msg("Password reset link sent on your registered email address.").status("success").build();
        Assert.assertEquals(actualResponse.getStatus(), expectedResponse.getStatus());
        Assert.assertEquals(actualResponse.getMsg(), expectedResponse.getMsg());
    }

}
