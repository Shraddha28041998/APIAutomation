package com.cyient.apitest;

import io.restassured.RestAssured;

public class PostAddPetToStoreTest {
	public static String baseUrl="https://petstore.swagger.io/v2/";
	public static void main(String[] args) {
		
		
		String resource="pet";
		
		
		RestAssured
		.given().headers("Content-Type","application/json")
		.body("{\r\n"
				+ "  \"id\": 84,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"string\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"doggie\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"available\"\r\n"
				+ "}")
         .when().post(baseUrl+resource)
         .then().log().all().statusCode(200);

	}

}
