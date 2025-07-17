package com.mexican.api.base;

import java.util.HashMap;
import java.util.Map;

import com.mexican.api.models.request.ForgotPasswordRequest;
import com.mexican.api.models.request.LoginRequest;
import com.mexican.api.models.request.SingUpRequest;

import io.restassured.response.Response;

public class AuthService extends BaseService{

    private final static String BASE_PATH="/api/auth/";

    public Response login(LoginRequest payload){
        return postRequest(payload, BASE_PATH + "login");
    }

    public Response signUp(SingUpRequest payload){
        return postRequest(payload, BASE_PATH +"signup");

    }

    public Response forgotPassword(ForgotPasswordRequest payload){
        return postRequest(payload, BASE_PATH +"forgot-password");

    }
    
    public Response forgotPassword(String emailId){
        Map<String, String> payload = new HashMap<>();
        payload.put(emailId, emailId);
        return postRequest(payload, BASE_PATH +"forgot-password-email");

    }

    
}
