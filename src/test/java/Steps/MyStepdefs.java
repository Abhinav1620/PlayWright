package Steps;

import com.microsoft.playwright.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyStepdefs {
    @When("^User navigated to website$")
    public void userNavigatedToWebsite() {
        Hooks.page.navigate("https://www.saucedemo.com/v1/");
    }

    @And("Fill his correct {string} and correct {string}")
    public void fillHisCorrectAndCorrect(String arg0, String arg1) {
        Hooks.page.type("#user-name", arg0, new Page.TypeOptions().setDelay(200));
        Hooks.page.type("#password", arg1, new Page.TypeOptions().setDelay(200));
    }

    @Then("User should be able to see Homepage of the application.")
    public void userShouldBeAbleToSeeHomepageOfTheApplication() {
        Hooks.page.click("#login-button");
        String page = Hooks.page.locator(".product_label").textContent();
        Assert.assertEquals(page, "Products");
    }
}
