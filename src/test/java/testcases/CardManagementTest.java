package testcases;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.CardManagementPage;
import pages.DashboardPage;
import utilities.DriverSetup;

public class CardManagementTest extends DriverSetup {
    CardManagementPage cardManagementPage = new CardManagementPage();
    DashboardPage dashboardPage = new DashboardPage();



    @Test(priority = 1)
    @Description("Verify that users can successfully enter details for a card into the system.")
    public void newCardEntry(){
        dashboardPage.clickOnElement(dashboardPage.settingsLink);
        dashboardPage.clickOnElement(dashboardPage.cardManagementLink);
        cardManagementPage.writeOnElement(cardManagementPage.cardNumber,"Hride25");
        cardManagementPage.clickOnElement(cardManagementPage.submitCardButton);
        cardManagementPage.addScreenShot("After enter new card");
        Assert.assertEquals(cardManagementPage.getElementText(cardManagementPage.successAlert),"Card created successfully.");
    }

    @Test(priority = 2)
    @Description("Prevent Duplicate Card Number Entry")
    public void duplicateCardEntry(){
        cardManagementPage.writeOnElement(cardManagementPage.cardNumber,"Hride21");
        cardManagementPage.clickOnElement(cardManagementPage.submitCardButton);
        cardManagementPage.addScreenShot("After enter Duplicate card");
        Assert.assertEquals(cardManagementPage.getElementText(cardManagementPage.duplicateAlert),"Card with this number already exists. Please use a different number");
    }

    /*@Test(priority = 3)
    @Description("Validate card search")
    public void cardSearch(){
        cardManagementPage.writeOnElement(cardManagementPage.cardSearch,"CardTest5007");
        cardManagementPage.addScreenShot("After search card");
        Assert.assertTrue(cardManagementPage.isElementVisible(cardManagementPage.cardFoundAssertion));
    }
    @Test(priority = 3)
    @Description("Test whether users can update the details of an existing card in the system ")
    public void editCard() throws InterruptedException {
        cardManagementPage.clickOnElement(cardManagementPage.clickEditCardButton);
        Thread.sleep(2000);
        cardManagementPage.clickOnRadioButton(cardManagementPage.cardEditToInactive);
        cardManagementPage.clickOnElement(cardManagementPage.cardEditSaveChanges);

    }*/

}
