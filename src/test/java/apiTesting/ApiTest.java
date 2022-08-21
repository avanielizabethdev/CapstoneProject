package apiTesting;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiTest {
	
	Response response;
	String AllProd = "http://localhost:8082/medicare/json/data/all/products";
	String AllCat = "http://localhost:8082/medicare/json/data/category/1/products";
	String MostViewed = "http://localhost:8082/medicare/json/data/mv/products";
	String MostPurchased = "http://localhost:8082/medicare/json/data/mp/products";
	
	@Test
	public void apitest() {
		
		response = GetAllProduct();
		Assert.assertEquals(response.getStatusCode(), 200);
		
		response = GetAllCategory();
		Assert.assertEquals(response.getStatusCode(), 200);
		
		response = GetMostViewedProduct();
		Assert.assertEquals(response.getStatusCode(), 200);
		
		response = GetMostPurchasedProduct();
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	
	public Response GetAllProduct() {
		
		RestAssured.baseURI = AllProd;
		RequestSpecification request = RestAssured.given();
		Response response = request.get();
		
		return response;
	}
	
	public Response GetAllCategory() {
		
		RestAssured.baseURI = AllCat;
		RequestSpecification request = RestAssured.given();
		Response response = request.get();
		
		return response;
	}

	public Response GetMostViewedProduct() {
		
		RestAssured.baseURI = MostViewed;
		RequestSpecification request = RestAssured.given();
		Response response = request.get();
		
		return response;
	}
	
public Response GetMostPurchasedProduct() {
		
		RestAssured.baseURI = MostPurchased;
		RequestSpecification request = RestAssured.given();
		Response response = request.get();
		
		return response;
	}

}
