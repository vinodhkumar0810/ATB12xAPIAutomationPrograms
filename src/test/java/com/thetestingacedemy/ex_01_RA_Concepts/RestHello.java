package com.thetestingacedemy.ex_01_RA_Concepts;

import io.restassured.RestAssured;

public class RestHello {
    public static void main(String[] args) {

        RestAssured.given()
                .baseUri("https://api.postalpincode.in/pincode/560036")
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
