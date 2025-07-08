package com.mexican.api.base;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseService {

    private static final String BASE_URL="https://dcd3d9d6-e5d0-41dc-a8d7-df18d7434e00.mock.pstmn.io";
    private RequestSpecification requestSpecification;

    public BaseService(){
        requestSpecification = given().baseUri(BASE_URL);
    }

    protected Response postRequest(String payload, String endpoint){
        return requestSpecification
            .contentType(ContentType.JSON)
                .header("x-api-key","")
                    .body(payload)
                        .post(endpoint);
    }

    
}
