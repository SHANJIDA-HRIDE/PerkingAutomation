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
    CardManagementPage cardManagementPage = new CardManagementPage();
    DashboardPage dashboardPage = new DashboardPage();

    @BeforeMethod
    public void getToTheUrl(){
        getDriver().get(loginPage.loginPageUrl);
    }


   /* @Test(dataProvider = "invalidCredentials",dataProviderClass = DataSet.class, priority = 1)
    @Description("Testing login functionality with invalid credentials")
    public void testLoginWithoutInvalidCredentials(String username, String password, String warning){
        loginPage.writeOnElement(loginPage.Username,username);
        loginPage.writeOnElement(loginPage.Password,password);
        loginPage.clickOnElement(loginPage.loginButton);
        loginPage.addScreenShot("After trying to logging in with wrong credentials");
        Assert.assertEquals(loginPage.getElementText(loginPage.warningMessage), warning);
    }*/

    @Test(priority = 1)
    @Description("Verify login with a valid username and valid password.")
    public void loginWithValidCredential() throws InterruptedException {
        loginPage.writeOnElement(loginPage.Username,"tausif");
        loginPage.writeOnElement(loginPage.Password,"1234");
        loginPage.clickOnElement(loginPage.loginButton);
        Thread.sleep(2000);
        //loginPage.addScreenShot("After logging in with correct credentials");
        //Assert.assertEquals(loginPage.getElementText(loginPage.confirmationMessageElement),"Dashboard");
        //loginPage.clickOnElement(loginPage.logOutButton);
    }

    @Test(priority = 2)
    @Description("Verify that users can successfully enter details for a card into the system.")
    public void newCardEntry(){
        //dashboardPage.clickOnElement(dashboardPage.settingsLink);
        //dashboardPage.clickOnElement(dashboardPage.cardManagementLink);

        getDriver().get(cardManagementPage.cardPageUrl);

        cardManagementPage.writeOnElement(cardManagementPage.cardNumber,"CardTest5001");
        cardManagementPage.clickOnElement(cardManagementPage.submitCardButton);
        cardManagementPage.addScreenShot("After enter new card");
        Assert.assertEquals(cardManagementPage.getElementText(cardManagementPage.successAlert),"Card created successfully.");
    }












   /* @Test(priority = 2)
    @Description("Verify login with valid username and invalid password")
    public void loginWithInValidCredential(){
        loginPage.writeOnElement(loginPage.Username,"tausif");
        loginPage.writeOnElement(loginPage.Password,"12345");
        loginPage.clickOnElement(loginPage.loginButton);
        loginPage.addScreenShot("After logging in with correct credentials");
        Assert.assertEquals(loginPage.getElementText(loginPage.confirmationMessageElement),"Dashboard");
        loginPage.clickOnElement(loginPage.logOutButton);
    }
    @Test(priority = 3)
    @Description("verify login with an invalid username and valid password")
    public void loginWithInValidCredential2(){
        loginPage.writeOnElement(loginPage.Username,"jojo");
        loginPage.writeOnElement(loginPage.Password,"1234");
        loginPage.clickOnElement(loginPage.loginButton);
        loginPage.addScreenShot("After logging in with correct credentials");
        Assert.assertEquals(loginPage.getElementText(loginPage.confirmationMessageElement),"Dashboard");
        loginPage.clickOnElement(loginPage.logOutButton);
    }

    @Test(priority = 4)
    @Description("verify login with an invalid username and invalid password")
    public void loginWithInValidCredential3(){
        loginPage.writeOnElement(loginPage.Username,"jojo");
        loginPage.writeOnElement(loginPage.Password,"12345");
        loginPage.clickOnElement(loginPage.loginButton);
        loginPage.addScreenShot("After logging in with correct credentials");
        Assert.assertEquals(loginPage.getElementText(loginPage.confirmationMessageElement),"Dashboard");
        loginPage.clickOnElement(loginPage.logOutButton);
    }
    @Test(priority = 5)
    @Description("Validate logging into the Application without providing any credentials")
    public void loginWithNoCredentials(){
        loginPage.writeOnElement(loginPage.Username,"");
        loginPage.writeOnElement(loginPage.Password,"");
        loginPage.clickOnElement(loginPage.loginButton);
        loginPage.addScreenShot("After logging in with correct credentials");
        Assert.assertEquals(loginPage.getElementText(loginPage.confirmationMessageElement),"Dashboard");
        loginPage.clickOnElement(loginPage.logOutButton);
    }
    @Test(priority = 6)
    @Description("Validate logging into the Application using inactive credentials")
    public void loginWithInactiveCredentials(){
        loginPage.writeOnElement(loginPage.Username,"Operator1");
        loginPage.writeOnElement(loginPage.Password,"1234");
        loginPage.clickOnElement(loginPage.loginButton);
        loginPage.addScreenShot("After logging in with correct credentials");
        Assert.assertEquals(loginPage.getElementText(loginPage.confirmationMessageElement),"Dashboard");
        loginPage.clickOnElement(loginPage.logOutButton);
    }*/


}
