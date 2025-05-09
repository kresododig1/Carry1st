package Carry1st.Test.utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Collections;

public class Driver {
    /*
    Creating a private constructor, so we are closing
    access to the object of this class from outside the class
     */
    private Driver() {
    }
    /*
    We make WebDriver instance variable private, because we want to close access from outside the class.
    We make it static because we will use it in a static method.
     */
    //   private static WebDriver driver; // value is null by default, this is POLYMORPHISM!!!

    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    /*
    Create a re-usable utility method which will return same driver instance when we call it
     */
    public static WebDriver getDriver() {

        if (driverPool.get() == null) {
            /*
            We read our browserType from configuration.properties.
            This way, we can control which browser is opened from outside our code, from configuration.properties.
             */
            String browserType = ConfigurationReader.getProperty("browser");
            /*
                Depending on the browserType that will be return from configuration.properties file
                switch statement will determine the case, and open the matching browser
            */
            switch (browserType) {
                case "chrome":

                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--incognito");



                    driverPool.set(new ChromeDriver(options));
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;

                case "firefox":

                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;

            }

        }
        return driverPool.get();
    }


        public static void closeDriver () {

            if (driverPool.get() != null) {
                driverPool.get().quit(); // this line will terminate the existing session. value will not even be null
                driverPool.remove();
            }
        }
    }