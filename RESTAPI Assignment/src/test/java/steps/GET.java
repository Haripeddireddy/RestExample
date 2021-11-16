package steps;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import model.Address;
import model.Location;
import model.LoginBody;
import model.Posts;
import utilities.APIConstant;
import utilities.EARestAssuredV2;
import utilities.RestAssuredExtension;


public class GET {


    public static ResponseOptions<Response> response;
    public static String token;

    @Given("^I perform GET operation for \"([^\"]*)\"$")
    public void iPerformGETOperationFor(String url) throws Throwable {
        response = RestAssuredExtension.Get(url);
    }

   
    @Then("^I should see the employee name as \"([^\"]*)\"$")
    public void iShouldSeeTheEmployeeNameAs(String authorName) throws Throwable {

      

        assertThat(post.name(), equalTo("test"));

        
    }

   
}