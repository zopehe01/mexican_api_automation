package com.mexican.scratchpad;

import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.Header;


public class StoreAPI {

    private final static  String BASE_URI = "https://petstore.swagger.io";
    public static void main(String[] args) {
        Map<String,String> headers = new HashMap<>();
        headers.put("accept", "application/json");
        headers.put("Content-Type", "application/json");
        RestAssured.baseURI=BASE_URI;
        
        
        
        getInventory(200);
        System.out.println("==================================");
        String payload = "{\r\n" + //
                        "  \"id\": 1,\r\n" + //
                        "  \"petId\": 0,\r\n" + //
                        "  \"quantity\": 0,\r\n" + //
                        "  \"shipDate\": \"2025-07-07T09:03:19.463Z\",\r\n" + //
                        "  \"status\": \"placed\",\r\n" + //
                        "  \"complete\": true\r\n" + //
                        "}";
        placeOrder(200, payload);
        System.out.println("==================================");
        getOrderById(headers,1,200);
        System.out.println("==================================");
        deleteOrder(headers, 1, 200);
        System.out.println("==================================");
        deleteOrder(headers, 1, 404);


        
        
    }

    private static void deleteOrder(Map<String, String> headers, int orderId, int expectedStatusCode) {
        given()
            .log().all()
            .headers(headers)
        .when()
            .delete("/v2/store/order/"+orderId)
        .then()
            .log().all()
            .assertThat()
            .statusCode(expectedStatusCode);
    }

    private static void getOrderById(Map<String, String> headers, int orderId, int expectedStatusCode) {
        given()
            .log().all()
            .headers(headers)
        .when()
            .get("/v2/store/order/"+orderId)
        .then()
            .log().all()
            .assertThat()
            .statusCode(expectedStatusCode);
    }

    private static void placeOrder(int statusCode, String payload) {
        given()
            .log().all()
            .header("accept","application/json")
            .header("Content-Type", "application/json")
            .body(payload)
        .when()
            .post("/v2/store/order")
        .then()
            .log().all()
            .assertThat()
            .statusCode(statusCode);
    }
    
    private static void getInventory(int statusCode) {
        Header header = new Header("accept", "application/json");
        
        
        given()
            .log().all()
            .header(header)
        .when()
            .get("/v2/store/inventory")
        .then()
            .log().all()
            .assertThat()
                .statusCode(statusCode);
    }
}
