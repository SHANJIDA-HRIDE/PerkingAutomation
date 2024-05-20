package testcases;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CardManagementPage;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class LoginPageTest extends DriverSetup {

    LoginPage loginPage = new LoginPage();

   @Test(dataProvider = "invalidCredentials",dataProviderClass = DataSet.class, priority = 1)
    @Description("Testing login functionality with invalid credentials")
    public void testLoginWithoutInvalidCredentials(String username, String password, String warning){
        getDriver().get(loginPage.loginPageUrl);
        loginPage.writeOnElement(loginPage.Username,username);
        loginPage.writeOnElement(loginPage.Password,password);
        loginPage.clickOnElement(loginPage.loginButton);
        loginPage.addScreenShot("After trying to logging in with wrong credentials");
        Assert.assertEquals(loginPage.getElementText(loginPage.warningMessage), warning);
    }

   @Test(priority = 2)
    @Description("Verify login with a valid username and valid password.")
    public void loginWithValidCredential() throws InterruptedException {
        loginPage.writeOnElement(loginPage.Username,"tausif");
        loginPage.writeOnElement(loginPage.Password,"1234");
        loginPage.clickOnElement(loginPage.loginButton);
        Thread.sleep(2000);
        loginPage.addScreenShot("After logging in with correct credentials");
        Assert.assertEquals(loginPage.getElementText(loginPage.confirmationMessageElement),"Dashboard");
        loginPage.clickOnElement(loginPage.logOutButton);
    }
}
