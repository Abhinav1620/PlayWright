package Steps;

import com.microsoft.playwright.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.LocatorRead;
import org.testng.Assert;

import java.io.IOException;

public class MyStepdefs extends LocatorRead {
    @When("^User navigated to website$")
    public void userNavigatedToWebsite() {
        Hooks.page.navigate("https://www.saucedemo.com/v1/");
    }

    @And("Fill his correct {string} and correct {string}")
    public void fillHisCorrectAndCorrect(String arg0, String arg1) throws IOException {
//        Hooks.page.type("", arg0, new Page.TypeOptions().setDelay(200));
//        Hooks.page.type("", arg1, new Page.TypeOptions().setDelay(200));
        Hooks.page.fill(read("username"), arg0);
        Hooks.page.fill(read("password"), arg1);
        Hooks.page.click(read("loginBTN"));
    }

    @Then("User should be able to see Homepage of the application.")
    public void userShouldBeAbleToSeeHomepageOfTheApplication() {
        String page = Hooks.page.locator(".product_label").textContent();
        Assert.assertEquals(page, "Products");
    }
}
