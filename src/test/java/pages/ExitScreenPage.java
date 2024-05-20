package pages;

import org.openqa.selenium.By;

public class ExitScreenPage extends basePage{
    public String exitScreenPageUrl = "http://54.89.25.234:8000/card_exit/";
    public By enterCardNumToExitScreen = By.id("card_no");
    public By clickOnCalculateButton = By.xpath("//button[@class='no-print btn btn-primary' and contains(text(), 'Calculate')]");
    public By clickVehicleMatchedCheckBox = By.id("vehicleMatched");
    public By clickAmountReceivedCheckBox = By.id("amountReceived");
    public By clickOnPrintButton = By.xpath("//button[@class='no-print btn btn-success' and contains(text(), 'Print')]");
}
