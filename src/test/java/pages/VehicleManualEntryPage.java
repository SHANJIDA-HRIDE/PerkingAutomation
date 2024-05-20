package pages;

import org.openqa.selenium.By;

public class VehicleManualEntryPage extends basePage{
   public String vehicleManualEntryPageUrl = "http://54.89.25.234:8000/manual_entry/";

    public By clickSubmitVehicleManualEntryCard = By.xpath("//button[@class='btn btn-primary mr-2']");
    public By enterVehicleManualEntryCard = By.id("card_number");
    public By vehicleManualEntrySuccessAssertion = By.xpath("//div[@class='alert alert-success alert-dismissible fade show' and @role='alert']//b\n");

}
