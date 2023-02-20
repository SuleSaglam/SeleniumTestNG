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
    Actions actions = new Actions(Driver.getDriver());

    @FindBy(xpath = "//*[text()='Category']")
    public WebElement textHomeAutomationExercise;

    @FindBy(xpath = "//*[text()='Subscription']")
    public WebElement textSubscription;

    @FindBy(id = "scrollUp")
    public WebElement scrollUp;

    @FindBy(xpath = "(//*[text()='Full-Fledged practice website for Automation Engineers'])[3]")
    public WebElement textfullFledged;

    @FindBy(xpath = "//*[text()='recommended items']")
    public WebElement textRecommendedItems;

    @FindBy(xpath = "(//*[text()='Add to cart'])[74]")
    public WebElement linkRecommendedItemsAddToCart;

    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement linkViewCart;

    @FindBy(xpath = "//*[text()='Proceed To Checkout']")
    public WebElement linkProceedToCheckout;

    public void verificationCartPage() {
        linkRecommendedItemsAddToCart.click();
        ReusableMethods.bekle(2);
        linkViewCart.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(linkProceedToCheckout.isDisplayed());
    }

    public void verificationRemommendedItems() {
        actions.scrollToElement(linkRecommendedItemsAddToCart).perform();
        ReusableMethods.bekle(2);
        Assert.assertTrue(textRecommendedItems.isDisplayed());
        ReusableMethods.bekle(2);
    }

    public void verificationHomePage() {
        Assert.assertTrue(textHomeAutomationExercise.isDisplayed());
        ReusableMethods.bekle(2);
        Assert.assertTrue(textSubscription.isDisplayed());
        ReusableMethods.bekle(2);
    }

    public void verificationSubscription(){
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(2);
    }

    public void verificationFullFledged() {
        scrollUp.click();
        ReusableMethods.bekle(2);
        Assert.assertTrue(textfullFledged.isDisplayed());
    }

}
