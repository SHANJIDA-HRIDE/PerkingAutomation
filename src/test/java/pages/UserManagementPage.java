package pages;

import org.openqa.selenium.By;

public class UserManagementPage extends basePage{
    public String userManagementPageUrl = "http://54.89.25.234:8000/register";
    public By enterFirstName = By.id("first_name");
    public By enterLastName = By.id("last_name");
    public By enterUsername = By.id("username");
    public By selectUserType = By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/select[1]");
    public By enterPassword = By.id("password");
    public By enterConfirmPassword = By.id("confirmPassword");
    public By clickSubmitButton = By.xpath("//button[@type='submit' and contains(@class, 'btn') and contains(@class, 'btn-primary') and contains(@class, 'mr-2')]");
    public By userEnterSuccessAssertion = By.xpath("//strong[contains(text(),'Registration Successful.')]");
    public By userEnterDuplicateUsernameAssertion = By.xpath("//strong[contains(text(),'User with this username already exists. Please use')]");

}
