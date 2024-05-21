package testcases;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CardIssuePage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.VehicleManualEntryPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class VehicleManualEntryTest extends DriverSetup {
    VehicleManualEntryPage vehicleManualEntry = new VehicleManualEntryPage();

    @Test(dataProvider = "cardNumber1",dataProviderClass = DataSet.class, priority = 1)
    @Description("Validate Entry of Vehicle Manual Entry with Card")
    public void VehicleManualEntry1(String cardNumber) throws InterruptedException {
        getDriver().get(vehicleManualEntry.vehicleManualEntryPageUrl);
        vehicleManualEntry.writeOnElement(vehicleManualEntry.enterVehicleManualEntryCard,cardNumber);
        Thread.sleep(3000);
        vehicleManualEntry.clickOnElement(vehicleManualEntry.clickSubmitVehicleManualEntryCard);
        vehicleManualEntry.addScreenShot("After Successful Vehicle Manual Entry");
        Assert.assertEquals(vehicleManualEntry.getElementText(vehicleManualEntry.vehicleManualEntrySuccessAssertion),"Manual parking entry created successfully.");
    }
    @Test(dataProvider = "cardNumber2",dataProviderClass = DataSet.class, priority = 2)
    @Description("Validate Entry of Vehicle Manual Entry with Card")
    public void VehicleManualEntry2(String cardNumber) throws InterruptedException {
        getDriver().get(vehicleManualEntry.vehicleManualEntryPageUrl);
        vehicleManualEntry.writeOnElement(vehicleManualEntry.enterVehicleManualEntryCard,cardNumber);
        Thread.sleep(3000);
        vehicleManualEntry.clickOnElement(vehicleManualEntry.clickSubmitVehicleManualEntryCard);
        vehicleManualEntry.addScreenShot("After Successful Vehicle Manual Entry");
        Assert.assertEquals(vehicleManualEntry.getElementText(vehicleManualEntry.vehicleManualEntrySuccessAssertion),"Manual parking entry created successfully.");
    }




}
