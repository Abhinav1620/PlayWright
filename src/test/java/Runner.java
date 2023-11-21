import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = {"src/test/java/Feature"}, glue = {"Steps"}, monochrome = true, plugin = {"pretty","html:target/Report.html"})
public class Runner extends AbstractTestNGCucumberTests {
}
