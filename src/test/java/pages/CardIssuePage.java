package pages;

import org.openqa.selenium.By;

public class CardIssuePage extends basePage{
   public String cardIssuePageUrl = "http://54.89.25.234:8000/card_issue/";


    public By cardIssuePageAssertion = By.xpath("//div[@class='page-header']/h3[@class='page-title']");
    public By selectCardMode = By.id("mode");
    public By selectCardTariffType = By.id("tariff_type");
    public By selectCardVehicleType = By.id("vehicle_type");
    public By selectCard = By.id("card_no_select");
    public By enterVehicleRegistrationNumber = By.id("vehicle_reg_number");
    public By enterDriverName = By.id("driver_name");
    public By enterDriverContact = By.id("driver_contact");
    public By clickCardSubmitButton = By.xpath("//button[contains(@class, 'btn-primary')]");
    public By cardEnterSuccessAssertion = By.xpath("//div[@class='alert alert-success alert-dismissible fade show']");

}
