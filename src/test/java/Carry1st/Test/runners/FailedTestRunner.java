package Carry1st.Test.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "Carry1st/Test/step_definition",
        features = "@target/rerun.txt"

)



public class FailedTestRunner {
}
