package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class A01 {

    AutomationExercisePage automationExercisePage = new AutomationExercisePage();

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));

        automationExercisePage.verificationHomePage();
        automationExercisePage.verificationSubscription();
        automationExercisePage.verificationFullFledged();

        Driver.quitDriver();
    }
}
