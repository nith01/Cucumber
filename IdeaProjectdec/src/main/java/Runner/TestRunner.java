package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\main\\java\\org\\freecrmBDDframework\\Features",
        glue = {"stepDefinitions"})//,format={"pretty","html:test-outout"})  //your cucumber options goes here

public class TestRunner {
    //This class will be empty
}
