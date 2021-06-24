package com.cyient.apitest;

import io.restassured.RestAssured;

public class GetFindPetByTest {

	public static String baseUrl="https://petstore.swagger.io/v2/";
	
	public static void main(String[] args) {
		int id=77;
		String resource="pet/"+id;
		System.out.println(baseUrl+resource);
		
		RestAssured
		.given().log().all()
         .when().get(baseUrl+resource)
         .then().log().all().statusCode(200);
	}

}
