package steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ResponseOptions;




import java.util.HashMap;
import java.util.Map;


public class Post {

    public static ResponseOptions<Response> response;   

    @Given("^I Perform POST operation for \"([^\"]*)\" with body$")
    public void iPerformPOSTOperationForWithBody(String url) throws Throwable {

        HashMap<String, String> body = new HashMap<>();
        body.put("name", data.get(1).get(0));

        
        HashMap<String, String> pathParams = new HashMap<>();
        pathParams.put("salary", data.get(1).get(1));

 HashMap<String, String> pathParams = new HashMap<>();
        pathParams.put("age", data.get(1).get(2));
		
        
        response = RestAssuredExtension.PostOpsWithBodyAndPathParams(url, pathParams, body);
    }

    @Then("^I should see the body has name as \"([^\"]*)\"$")
    public void iShouldSeeTheBodyHasNameAs(String name) throws Throwable {
        assertThat(response.getBody().jsonPath().get("name"), equalTo(name));
    }

 }

}
