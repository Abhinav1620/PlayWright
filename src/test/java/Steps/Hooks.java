package Steps;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.nio.file.Paths;

public class Hooks {
    public static Playwright playwright;
    public static BrowserType.LaunchOptions options;
    public static Browser browser;
    public static BrowserContext context;
    public static Page page;
    @Before
    public void intiall(){
        playwright = Playwright.create();
        options = new BrowserType.LaunchOptions();
        options.setHeadless(false);
        options.setChannel("chrome");
        browser = playwright.chromium().launch(options);
        context = browser.newContext(new Browser.NewContextOptions().setRecordVideoDir(Paths.get("Videos/")));
        page = context.newPage();


    }


    @After
    public void tear(){
        page.close();
        context.close();
        browser.close();
        playwright.close();
    }
}
