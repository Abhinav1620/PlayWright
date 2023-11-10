package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.LocatorRead;

import java.io.IOException;

public class Order extends LocatorRead {
    @And("^selects his product which he want to order$")
    public void selectsHisProductWhichHeWantToOrder() throws IOException {
        Hooks.page.click(read("tShirt"));
    }

    @Then("^user will be able to order his product after filling his delivery information$")
    public void userWillBeAbleToOrderHisProductAfterFillingHisDeliveryInformation() throws IOException {
        Hooks.page.click(read("ADDTOCart"));
        Hooks.page.click(read("cartContainer"));
        Hooks.page.click(read("checkOut"));
        Hooks.page.fill(read("firstName"), "abc");
        Hooks.page.fill(read("lastName"), "def");
        Hooks.page.fill(read("zipCode"), "110022");
        Hooks.page.click(read("continueBTN"));
        Hooks.page.click(read("finishBTN"));
        Hooks.page.click(read("openMenu"));
        Hooks.page.click(read("logout"));
    }
}
