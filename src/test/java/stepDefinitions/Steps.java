package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Steps {

    @Given("User is in login page")
    public void user_is_in_login_page() {
        System.out.println("Steps.user_is_in_login_page");
    }
    @When("User enter correct username")
    public void user_enter_correct_username() {
        System.out.println("Steps.user_enter_correct_username");
    }
    @When("password")
    public void password() {
        System.out.println("Steps.password");
    }
    @Then("User can login to the system")
    public void user_can_login_to_the_system() {
        Assert.assertEquals(1,1);
    }


}
