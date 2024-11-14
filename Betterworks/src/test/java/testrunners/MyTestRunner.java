package testrunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:/Users/Admin/Downloads/Cucumber-BDD-Projects-main/Cucumber-BDD-Projects-main/Betterworks/src/test/resources/parallel/Search.feature"},
        glue = {"Parallel"},
        plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/"}
          )
public class   MyTestRunner {

}
