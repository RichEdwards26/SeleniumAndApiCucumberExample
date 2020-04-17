package Drivers;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.Test;

public class CucumberHooks {
    private TestContext test;
    public CucumberHooks(TestContext test){
        this.test = test;
    }

    @Before("@gui")
    public void Before()
    {
        test.CreateWebDriver();
    }

    @After("@gui")
    public void After()
    {
        test.CloseAndQuitWebDriver();
    }
}
