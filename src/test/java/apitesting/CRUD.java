package apitesting;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import static io.restassured.response.Response.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertTrue;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class CRUD {
	@Test
	public void getResponseBody() {

		baseURI = "https://reqres.in/";

//		ValidatableResponse response = given().when().get("/api/users/2").then().assertThat().statusCode(200)
//				.assertThat().body(containsString("janet.weaver@reqres.in")).body("data.first_name", equalTo("Janet"))
//				.log().all();
		
		
				
		get("/api/users?page=2").then().assertThat().body(matchesJsonSchemaInClasspath("schema.json"));

	}
}
