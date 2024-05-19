package testcases;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.CardManagementPage;
import pages.DashboardPage;
import utilities.DriverSetup;

public class CardManagementTest extends DriverSetup {

    LoginPage loginPage = new LoginPage();
    CardManagementPage cardManagementPage = new CardManagementPage();
    DashboardPage dashboardPage = new DashboardPage();


    @BeforeMethod
    public void getToTheUrl(){
        getDriver().get(loginPage.loginPageUrl);
    }

    @Test(priority = 1)
    @Description("Verify that users can successfully enter details for a card into the system.")
    public void newCardEntry(){
        dashboardPage.clickOnElement(dashboardPage.settingsLink);
        dashboardPage.clickOnElement(dashboardPage.cardManagementLink);
        cardManagementPage.writeOnElement(cardManagementPage.cardNumber,"CardTest5001");
        cardManagementPage.clickOnElement(cardManagementPage.submitCardButton);
        cardManagementPage.addScreenShot("After enter new card");
        Assert.assertEquals(cardManagementPage.getElementText(cardManagementPage.successAlert),"Card created successfully.");
    }

    @Test(priority = 2)
    @Description("Prevent Duplicate Card Number Entry")
    public void duplicateCardEntry(){
        cardManagementPage.writeOnElement(cardManagementPage.cardNumber,"CardTest5001");
        cardManagementPage.clickOnElement(cardManagementPage.submitCardButton);
        cardManagementPage.addScreenShot("After enter Duplicate card");
        Assert.assertEquals(cardManagementPage.getElementText(cardManagementPage.duplicateAlert),"Card with this number already exists. Please use a different number");
    }

}
