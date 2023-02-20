package tests;

import org.testng.annotations.Test;
import pages.QualityDemyPage;
import utilities.Driver;

public class A03 {

    QualityDemyPage qualityDemyPage = new QualityDemyPage();

    @Test
    public void test01() {
        qualityDemyPage.forgotPasswordPage();
        qualityDemyPage.verificationForgotPassword();
        qualityDemyPage.validEmail();
        Driver.quitDriver();
    }

    @Test
    public void test02() {
        qualityDemyPage.forgotPasswordPage();
        qualityDemyPage.invalidEmail();
        Driver.quitDriver();
    }
}
