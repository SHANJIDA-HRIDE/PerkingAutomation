package testcases;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CardIssuePage;
import pages.DashboardPage;
import pages.ExitScreenPage;
import pages.LoginPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class ExitScreenTest extends DriverSetup {
    ExitScreenPage exitScreenPage = new ExitScreenPage();
    @Test(dataProvider = "cardNumber1",dataProviderClass = DataSet.class, priority = 1)
    @Description("Validate Hourly Bill Calculation in Exit Payment Page")
    public void cardExitWithCard(String cardNumber) throws InterruptedException {
        getDriver().get(exitScreenPage.exitScreenPageUrl);
        exitScreenPage.addScreenShot("After click to the Exit Screen page");
        Thread.sleep(2000);
        exitScreenPage.writeOnElement(exitScreenPage.enterCardNumToExitScreen,cardNumber);
        exitScreenPage.clickOnElement(exitScreenPage.clickOnCalculateButton);
        exitScreenPage.clickOnCheckBox(exitScreenPage.clickVehicleMatchedCheckBox);
        exitScreenPage.clickOnCheckBox(exitScreenPage.clickAmountReceivedCheckBox);
        Thread.sleep(3000);
        exitScreenPage.clickOnElement(exitScreenPage.clickOnPrintButton);
        Thread.sleep(3000);
    }


}
