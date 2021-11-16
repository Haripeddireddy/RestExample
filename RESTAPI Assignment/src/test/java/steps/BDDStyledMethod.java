package steps;

import io.restassured.http.ContentType;
import org.hamcrest.core.Is;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class BDDStyledMethod {


    public static void SimpleGET(String name){
        given().contentType(ContentType.JSON).
                when().get(String.format("http://dummy.restapiexample.com/api/v1/employee/1", name)).
                then().body("name", is("name"));
    }

   

    
    public static void PerformPOSTWithBodyParameter() {
        HashMap<String,String> postContent = new HashMap<>();
        postContent.put("name", "test");
        postContent.put("salary", "123");
        postContent.put("age", "23");

        given()
                .contentType(ContentType.JSON).
        with()
                .body(postContent).
        when()
                .post("http://dummy.restapiexample.com/api/v1/create").
        then()
                .body("name", Is.is("ExecuteAutomation"));
    }





}
