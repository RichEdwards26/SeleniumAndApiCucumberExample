package Drivers;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        //plugin = {"pretty", "html:target/cucumber-html-report"},
        //plugin = {"pretty", "html:target/cucumber"},
        glue = {"Drivers", "Steps"}
        )
public class RunCucumberTest {
}