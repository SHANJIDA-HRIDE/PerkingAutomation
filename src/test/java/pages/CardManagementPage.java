package pages;

import org.openqa.selenium.By;

public class CardManagementPage extends basePage{
    public String cardPageUrl = "http://54.89.25.234:8000/card";

    public By cardNumber = By.id("card_number");
    public By submitCardButton = By.xpath("//button[@type='submit']");

    public By successAlert = By.xpath("//div[@class='alert alert-success alert-dismissible fade show']");
    public By duplicateAlert = By.xpath("//div[contains(@class, 'alert-danger')]");



}
