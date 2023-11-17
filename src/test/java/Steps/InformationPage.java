package Steps;

import io.cucumber.java.en.Then;
import org.example.LocatorRead;
import org.testng.Assert;

import java.io.IOException;

public class InformationPage extends LocatorRead {
    @Then("user should be able to an error if don't provide any firstname under delivery information page")
    public void userShouldBeAbleToAnErrorIfDonProvideAnyFirstnameUnderDeliveryInformationPage() throws IOException {
        Hooks.page.click(read("ADDTOCart"));
        Hooks.page.click(read("cartContainer"));
        Hooks.page.click(read("checkOut"));
        Hooks.page.fill(read("lastName"), "def");
        Hooks.page.fill(read("zipCode"), "110022");
        Hooks.page.click(read("continueBTN"));

        if (Hooks.page.locator(read("firstNameError")).textContent().contains("First Name is required")){
            Assert.assertTrue(true);
        }
        else {
            Assert.assertTrue(false);
        }
    }

    @Then("user should be able to an error if don't provide any lastname under delivery information page")
    public void userShouldBeAbleToAnErrorIfDonTProvideAnyLastnameUnderDeliveryInformationPage() throws IOException {
        Hooks.page.click(read("ADDTOCart"));
        Hooks.page.click(read("cartContainer"));
        Hooks.page.click(read("checkOut"));
        Hooks.page.fill(read("firstName"), "abc");
        Hooks.page.fill(read("zipCode"), "110022");
        Hooks.page.click(read("continueBTN"));

        if (Hooks.page.locator(read("firstNameError")).textContent().contains("Last Name is required")){
            Assert.assertTrue(true);
        }
        else {
            Assert.assertTrue(false);
        }
    }

    @Then("user should be able to an error if don't provide any ZipCode under delivery information page")
    public void userShouldBeAbleToAnErrorIfDonTProvideAnyZipCodeUnderDeliveryInformationPage() throws IOException {
        Hooks.page.click(read("ADDTOCart"));
        Hooks.page.click(read("cartContainer"));
        Hooks.page.click(read("checkOut"));
        Hooks.page.fill(read("firstName"), "abc");
        Hooks.page.fill(read("lastName"), "def");
        Hooks.page.click(read("continueBTN"));

        if (Hooks.page.locator(read("firstNameError")).textContent().contains("Postal Code is required")){
            Assert.assertTrue(true);
        }
        else {
            Assert.assertTrue(false);
        }
    }
}
