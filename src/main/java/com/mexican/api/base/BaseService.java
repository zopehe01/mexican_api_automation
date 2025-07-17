package com.mexican.api.base;

import static io.restassured.RestAssured.*;

import com.mexican.api.filters.LoggingFilter;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {

    private static final String BASE_URL="https://ab494d46-0627-480d-a172-2e5d88f8328c.mock.pstmn.io";
    private RequestSpecification requestSpecification;

    static {
        RestAssured.filters(new LoggingFilter());
    }

    public BaseService(){
        requestSpecification = given().baseUri(BASE_URL);
    }

    protected Response getRequest(String endpoint){
        return requestSpecification
                        .get(endpoint);
    }
    
    protected void setToken(String token) {
         requestSpecification.header("Authorization", "Bearer "+token);
    }
    
    protected Response postRequest(Object payload, String endpoint){
        return requestSpecification
            .contentType(ContentType.JSON)
                    .body(payload)
                        .post(endpoint);
    }

    protected Response postRequest(String baseURL, Object payload, String endpoint){
        return requestSpecification.baseUri(baseURL)
            .contentType(ContentType.JSON)
                    .body(payload)
                        .post(endpoint);
    }

    
}
