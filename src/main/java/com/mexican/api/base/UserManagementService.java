package com.mexican.api.base;

import io.restassured.response.Response;

public class UserManagementService extends BaseService{

    private static final String BASE_PATH = "api/users";


    public Response profile(String token){
                setToken(token);
                return getRequest(BASE_PATH +"/profile");
            }
        
        
            



}
