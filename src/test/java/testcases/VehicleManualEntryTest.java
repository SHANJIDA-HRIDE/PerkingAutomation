package testcases;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CardIssuePage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.VehicleManualEntryPage;
import utilities.DriverSetup;

public class VehicleManualEntryTest extends DriverSetup {

    DashboardPage dashboardPage = new DashboardPage();
    CardIssuePage cardIssuePage = new CardIssuePage();
    LoginPage loginPage = new LoginPage();
    VehicleManualEntryPage vehicleManualEntry = new VehicleManualEntryPage();

    @Test(priority = 1)
    @Description("Validate Entry of Vehicle Manual Entry with Card")
    public void VehicleManualEntry() throws InterruptedException {
        getDriver().get(loginPage.loginPageUrl);
        loginPage.writeOnElement(loginPage.Username,"tausif");
        loginPage.writeOnElement(loginPage.Password,"1234");
        loginPage.clickOnElement(loginPage.loginButton);
        Thread.sleep(2000);
        getDriver().get(vehicleManualEntry.vehicleManualEntryPageUrl);
        vehicleManualEntry.writeOnElement(vehicleManualEntry.enterVehicleManualEntryCard,"Hride4");
        Thread.sleep(3000);
        vehicleManualEntry.clickOnElement(vehicleManualEntry.clickSubmitVehicleManualEntryCard);
        vehicleManualEntry.addScreenShot("After Successful Vehicle Manual Entry");
        Assert.assertEquals(vehicleManualEntry.getElementText(vehicleManualEntry.vehicleManualEntrySuccessAssertion),"Manual parking entry created successfully.");
    }



}
