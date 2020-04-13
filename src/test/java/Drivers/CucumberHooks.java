package Drivers;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.Test;

public class CucumberHooks {
    private TestContext test;
    public CucumberHooks(TestContext test){
        this.test = test;
    }

    @Before
    public void Before()
    {
        String x = "a";
        test.CreateWebDriver();
    }

    @After
    public void After()
    {
        test.CloseAndQuitWebDriver();
    }
}
