package apitesting;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class CRUD {
	@Test
	public void getResponseBody() { 
		   
		given()
		  .when()
		  .get("http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1")
		  .then()
		  .assertThat().statusCode(200)
		  .log()
		  .all();
	    	
	}
}
