package testcases;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ExitScreenExemptionPage;
import pages.LoginPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class ExitScreenExemptionTest extends DriverSetup {
    ExitScreenExemptionPage exitScreenExemption = new ExitScreenExemptionPage();

    @Test(dataProvider = "exitScreenExemption",dataProviderClass = DataSet.class, priority = 1)
    @Description("Validate Daily Bill Calculation in Exit Payment Page")
    public void exitScreenExemption(String cardNumber,String actualPayment,String actualPaymentReason) throws InterruptedException {
        getDriver().get(exitScreenExemption.exitScreenExemptionPageUrl);
        //exitScreenExemption.addScreenShot("After click to the Exit Exemption Screen page");
        Thread.sleep(2000);
        exitScreenExemption.writeOnElement(exitScreenExemption.enterCardNumToExitScreen,cardNumber);
        exitScreenExemption.clickOnElement(exitScreenExemption.clickOnCalculateButton);
        Thread.sleep(6000);
        exitScreenExemption.writeOnElement(exitScreenExemption.enterCardActualPayment,actualPayment);
        Thread.sleep(2000);
        exitScreenExemption.writeOnElement(exitScreenExemption.enterCardActualPaymentReason,actualPaymentReason);
        Thread.sleep(2000);
        exitScreenExemption.clickOnCheckBox(exitScreenExemption.clickVehicleMatchedCheckBox);
        exitScreenExemption.clickOnCheckBox(exitScreenExemption.clickAmountReceivedCheckBox);
        Thread.sleep(3000);
        exitScreenExemption.clickOnElement(exitScreenExemption.clickOnSaveButton);
    }

}
