package testcases;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.CardIssuePage;
import pages.LoginPage;
import utilities.DriverSetup;

public class CardIssueTest extends DriverSetup {

    DashboardPage dashboardPage = new DashboardPage();
    CardIssuePage cardIssuePage = new CardIssuePage();
    LoginPage loginPage = new LoginPage();
    @Test(priority = 1)
    @Description("Validate Entry of Card Issue with Mode Post-Paid Hourly")
    public void cardIssueWithModePostPaidHourly() throws InterruptedException {
        getDriver().get(cardIssuePage.cardIssuePageUrl);
        cardIssuePage.addScreenShot("After click to the Card Issue page");
        Assert.assertEquals(cardIssuePage.getElementText(cardIssuePage.cardIssuePageAssertion),"Card Issue at Entry Booth");
        cardIssuePage.selectWithVisibleText(cardIssuePage.selectCardMode,"Post-Paid");
        Thread.sleep(3000);
        cardIssuePage.selectWithVisibleText(cardIssuePage.selectCardTariffType,"Hourly");
        cardIssuePage.selectWithVisibleText(cardIssuePage.selectCardVehicleType,"Motorcycle");
        Thread.sleep(3000);
        cardIssuePage.selectWithVisibleText(cardIssuePage.selectCard,"Hride21");
        Thread.sleep(3000);
        cardIssuePage.writeOnElement(cardIssuePage.enterDriverName,"Hafiz");
        cardIssuePage.writeOnElement(cardIssuePage.enterVehicleRegistrationNumber,"Qa-41-1000");
        cardIssuePage.writeOnElement(cardIssuePage.enterDriverContact,"0048151");
        cardIssuePage.clickOnElement(cardIssuePage.clickCardSubmitButton);
        cardIssuePage.addScreenShot("After Successful Card Issue");
        Assert.assertEquals(cardIssuePage.getElementText(cardIssuePage.cardEnterSuccessAssertion),"The card issued successfully.");
    }

    @Test(priority = 2)
    @Description("Validate Entry of Card Issue with Mode Post-Paid Daily")
    public void cardIssueWithModePostPaidDaily() throws InterruptedException {
        cardIssuePage.selectWithVisibleText(cardIssuePage.selectCardMode,"Post-Paid");
        Thread.sleep(3000);
        cardIssuePage.selectWithVisibleText(cardIssuePage.selectCardTariffType,"Daily");
        cardIssuePage.selectWithVisibleText(cardIssuePage.selectCardVehicleType,"Motorcycle");
        Thread.sleep(3000);
        cardIssuePage.selectWithVisibleText(cardIssuePage.selectCard,"Hride22");
        Thread.sleep(3000);
        cardIssuePage.writeOnElement(cardIssuePage.enterDriverName,"Hafiz");
        cardIssuePage.writeOnElement(cardIssuePage.enterVehicleRegistrationNumber,"Fa-85-1010");
        cardIssuePage.writeOnElement(cardIssuePage.enterDriverContact,"017770");
        cardIssuePage.clickOnElement(cardIssuePage.clickCardSubmitButton);
        cardIssuePage.addScreenShot("After Successful Card Issue");
        Assert.assertEquals(cardIssuePage.getElementText(cardIssuePage.cardEnterSuccessAssertion),"The card issued successfully.");
    }


}
