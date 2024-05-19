package pages;

import org.openqa.selenium.By;

public class LoginPage extends basePage{
    public String loginPageUrl = "http://54.89.25.234:8000/";

    public By Username = By.id("username");
    public By Password = By.id("password");
    public By loginButton = By.xpath("//div[@class='mt-3']//button[@type='submit' and contains(@class, 'auth-form-btn')]");
    public By confirmationMessageElement = By.xpath("//h3[@class='page-title']");
    public By logOutButton = By.linkText("Logout");
    public By warningMessage = By.xpath("//div[contains(@class, 'alert') and contains(@class, 'alert-danger') and contains(@class, 'alert-dismissible') and contains(@class, 'fade') and contains(@class, 'show')]");

}
