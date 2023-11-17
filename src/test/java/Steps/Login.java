package Steps;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import org.example.LocatorRead;
import org.testng.Assert;

import java.io.IOException;

public class Login extends LocatorRead {

    @Then("an error should appear in front of user")
    public void anErrorShouldAppearInFrontOfUser() throws IOException {
       if (read("errorLog").equalsIgnoreCase("Epic sadface: ")){
           Assert.assertTrue(true);
       }
       else {
           Assert.fail();
       }
    }
}
