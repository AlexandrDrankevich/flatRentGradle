package test;

import driver.DriverSingleton;
import org.testng.annotations.AfterMethod;

public class AbstractTest {

    @AfterMethod
    public void tearDown() {
        DriverSingleton.closeDriver();
    }
}
