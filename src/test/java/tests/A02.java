package tests;

import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class A02 {

    AutomationExercisePage automationExercisePage = new AutomationExercisePage();

    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("automationUrl"));

        automationExercisePage.verificationRemommendedItems();
        automationExercisePage.verificationCartPage();

        Driver.quitDriver();
    }
}
