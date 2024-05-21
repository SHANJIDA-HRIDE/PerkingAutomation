package testcases;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.CardIssuePage;
import pages.LoginPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class CardIssueTest extends DriverSetup {

    CardIssuePage cardIssuePage = new CardIssuePage();
    @Test(dataProvider = "cardIssueWithModePostPaidHourly_Daily",dataProviderClass = DataSet.class, priority = 1)
    @Description("Validate Entry of Card Issue with Mode Post-Paid Hourly")
    public void cardIssueWithModePostPaidHourly_Daily(String CardMode, String tariffType,String vehicleType, String cardNumber,String driverName, String vehicleRegistrationNumber,String driverContact) throws InterruptedException {
        getDriver().get(cardIssuePage.cardIssuePageUrl);
        cardIssuePage.addScreenShot("After click to the Card Issue page");
        Assert.assertEquals(cardIssuePage.getElementText(cardIssuePage.cardIssuePageAssertion),"Card Issue at Entry Booth");
        cardIssuePage.selectWithVisibleText(cardIssuePage.selectCardMode,CardMode);
        Thread.sleep(3000);
        cardIssuePage.selectWithVisibleText(cardIssuePage.selectCardTariffType,tariffType);
        cardIssuePage.selectWithVisibleText(cardIssuePage.selectCardVehicleType,vehicleType);
        cardIssuePage.selectWithVisibleText(cardIssuePage.selectCard,cardNumber);
        Thread.sleep(3000);
        cardIssuePage.writeOnElement(cardIssuePage.enterDriverName,driverName);
        cardIssuePage.writeOnElement(cardIssuePage.enterVehicleRegistrationNumber,vehicleRegistrationNumber);
        cardIssuePage.writeOnElement(cardIssuePage.enterDriverContact,driverContact);
        cardIssuePage.clickOnElement(cardIssuePage.clickCardSubmitButton);
        cardIssuePage.addScreenShot("After Successful Card Issue");
        Assert.assertEquals(cardIssuePage.getElementText(cardIssuePage.cardEnterSuccessAssertion),"The card issued successfully.");
    }


}
