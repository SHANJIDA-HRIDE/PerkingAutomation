package pages;

import org.openqa.selenium.By;

public class ExitScreenExemptionPage extends basePage{
    public String exitScreenExemptionPageUrl = "http://54.89.25.234:8000/receive_card_from_driver_exit_exempt/";
    public By enterCardNumToExitScreen = By.id("card_no");
    public By clickOnCalculateButton = By.xpath("//button[contains(text(),'Calculate')]");
    public By enterCardActualPayment = By.id("actual_payment");
    public By enterCardActualPaymentReason = By.id("reason");
    public By clickVehicleMatchedCheckBox = By.id("vehicleMatched");
    public By clickAmountReceivedCheckBox = By.id("amountReceived");
    public By clickOnSaveButton = By.xpath("//button[contains(text(),'Save')]");

}
