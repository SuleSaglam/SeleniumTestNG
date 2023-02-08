package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.Driver;
import utilities.ReusableMethods;

public class AutomationExercisePage {

    public AutomationExercisePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Category']")
    public WebElement textHomeAutomationExercise;

    @FindBy(xpath = "//*[text()='Subscription']")
    public WebElement textSubscription;

    @FindBy(id = "scrollUp")
    public WebElement scrollUp;

    @FindBy(xpath = "(//*[text()='Full-Fledged practice website for Automation Engineers'])[3]")
    public WebElement textfullFledged;

    public void verificationHomePage() {
        Assert.assertTrue(textHomeAutomationExercise.isDisplayed());
        ReusableMethods.bekle(2);
        Assert.assertTrue(textSubscription.isDisplayed());
        ReusableMethods.bekle(2);
    }

    public void verificationSubscription(){
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(2);
    }

    public void verificationFullFledged() {
        scrollUp.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(textfullFledged.isDisplayed());
    }

}
