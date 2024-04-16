package Carry1st.Test.step_definition;


/*
In the class we will be able to pass pre- & post- conditions to each scenario and each step
*/


import Carry1st.Test.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {



    @After
    public void tearDownScenario(Scenario scenario){

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/jpg", scenario.getName());

        }

        Driver.closeDriver();

    }

}
