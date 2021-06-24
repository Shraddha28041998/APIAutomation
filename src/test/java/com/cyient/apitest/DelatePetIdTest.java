package com.cyient.apitest;

import io.restassured.RestAssured;

public class DelatePetIdTest {

public static String baseUrl="https://petstore.swagger.io/v2/";
	
	public static void main(String[] args) {
		int id=84;
		String resource="pet/"+id;
		System.out.println(baseUrl+resource);
		
		RestAssured
		.given()
         .when().delete(baseUrl+resource)
         .then().log().all().statusCode(200);
	}

	}


