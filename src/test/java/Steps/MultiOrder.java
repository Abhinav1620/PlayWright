package Steps;

import io.cucumber.java.en.And;
import org.example.LocatorRead;

import java.io.IOException;

public class MultiOrder extends LocatorRead {
    @And("selects his products which he want to order")
    public void selectsHisProductsWhichHeWantTooOrder() throws IOException {
        Hooks.page.click(read("tShirt"));
        Hooks.page.goBack();
        Hooks.page.click(read("SauceLabsBackpack"));
    }
}
