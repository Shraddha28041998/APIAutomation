package com.cyient.apitest;

import io.restassured.RestAssured;

public class PlaceAnOrderForAPetTest {
	public static String baseUrl="https://petstore.swagger.io/v2/";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String resource="store/order";
		
		
		RestAssured
		.given().headers("Content-Type","application/json")
		.body("{\r\n"
				+ "    \"id\": 40,\r\n"
				+ "    \"petId\": 42,\r\n"
				+ "    \"quantity\": 0,\r\n"
				+ "    \"shipDate\": \"2021-06-18T04:40:41.525+0000\",\r\n"
				+ "    \"status\": \"placed\",\r\n"
				+ "    \"complete\": true\r\n"
				+ "}")
         .when().post(baseUrl+resource)
         .then().log().all().statusCode(200);

	}

}


