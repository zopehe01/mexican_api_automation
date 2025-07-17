package com.mexican.api.filters;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class LoggingFilter implements Filter {

    private static final Logger logger = LogManager.getLogger(LoggingFilter.class);

    @Override
    public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
            FilterContext ctx) {
                logRequest(requestSpec);
                Response response =  ctx.next(requestSpec, responseSpec);
                loginResponse(response);
                return response;
       
    }

    private void logRequest(FilterableRequestSpecification requestSpec){
        logger.info("BaseURI: "+ requestSpec.getBaseUri());
        logger.info("BasePath: "+ requestSpec.getBasePath());
        logger.info("Request Headers: "+ requestSpec.getHeaders());
        logger.info("Request Body: "+ requestSpec.getBody());
    }

    private void loginResponse(Response response){
        logger.info("Response Headers: "+ response.getStatusCode());
        logger.info("Response Headers: "+ response.getHeaders());
        logger.info("Response Body: "+ response.getBody().prettyPrint());
    }

}
