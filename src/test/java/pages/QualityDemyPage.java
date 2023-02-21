package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class QualityDemyPage {

    public QualityDemyPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[text()='Log in']")
    public WebElement linkLogIn;

    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement cookieKabul;

    @FindBy(xpath = "//*[text()='Forgot password?']")
    public WebElement linkForgotPassword;

    @FindBy(xpath = "//*[text()='Forgot password']")
    public WebElement textForgotPassword;

    @FindBy(id = "forgot-password-email")
    public WebElement boxForgotPasswordEmail;

    @FindBy(xpath = "//*[text()='Send request']")
    public WebElement linkSendRequest;

    public void forgotPasswordPage() {
        Driver.getDriver().get(ConfigReader.getProperty("qualityDemyUrl"));
        linkLogIn.click();
        if (cookieKabul.isDisplayed()) {
            cookieKabul.click();
        }
        linkForgotPassword.click();
    }

    public void verificationForgotPassword() {
        Assert.assertTrue(textForgotPassword.isDisplayed());
    }

    @FindBy(xpath = "//*[text()='Check your inbox for the request']")
    public WebElement textCheckYour;

    public void validEmail() {
        boxForgotPasswordEmail.click();
        boxForgotPasswordEmail.sendKeys(ConfigReader.getProperty("qualityDemyValidEmail"));
        linkSendRequest.click();
        Assert.assertTrue(textCheckYour.isDisplayed());
    }

    @FindBy(xpath = "//*[text()='User not found']")
    public WebElement textUserNotFound;

    public void invalidEmail() {
        boxForgotPasswordEmail.click();
        boxForgotPasswordEmail.sendKeys(ConfigReader.getProperty("qualityDemyInvalidEmail"));
        linkSendRequest.click();
        Assert.assertTrue(textUserNotFound.isDisplayed());
    }
}
