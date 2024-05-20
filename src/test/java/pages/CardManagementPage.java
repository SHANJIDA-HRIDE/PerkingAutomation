package pages;

import org.openqa.selenium.By;

public class CardManagementPage extends basePage{
    public String cardPageUrl = "http://54.89.25.234:8000/card";

    public By cardNumber = By.id("card_number");
    public By submitCardButton = By.xpath("//button[@type='submit']");
    public By successAlert = By.xpath("//div[@class='alert alert-success alert-dismissible fade show']");
    public By duplicateAlert = By.xpath("//div[contains(@class, 'alert-danger')]");
    public By cardSearch = By.xpath("//div[@id='order-listing_filter']//input[@type='search' and @class='form-control']");
    public By cardFoundAssertion = By.xpath("//td[text()='CardTest5007']");
    public By clickEditCardButton = By.id("openEditCardModal");
    public By cardEditPageAssertion = By.id("editCardModalLabel");
    public By cardEditToInactive = By.id("edit_usable_status_inactive");
    public By cardEditSaveChanges = By.id("save_change");


}
