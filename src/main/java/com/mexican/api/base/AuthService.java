package com.mexican.api.base;

import io.restassured.response.Response;

public class AuthService extends BaseService{

    private final static String BASE_PATH="/api/auth/";

    public Response login(String payload){
        return postRequest(payload, BASE_PATH + "login");
    }

    
}
