package testcases;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import pages.UserManagementPage;
import utilities.DataSet;
import utilities.DriverSetup;

public class UserManagementTest extends DriverSetup {

    UserManagementPage userManagement = new UserManagementPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Test(dataProvider = "newUserEntry",dataProviderClass = DataSet.class, priority = 1)
    @Description("Validate User Creation with Mandatory Fields")
    public void newUserEntry(String firstName, String lastName,String Username, String userType,String Password, String confirmPassword) throws InterruptedException {
        dashboardPage.clickOnElement(dashboardPage.settingsLink);
        getDriver().get(userManagement.userManagementPageUrl);
        userManagement.addScreenShot("After click to the User Management page");
        userManagement.writeOnElement(userManagement.enterFirstName,firstName);
        userManagement.writeOnElement(userManagement.enterLastName,lastName);
        userManagement.writeOnElement(userManagement.enterUsername,Username);
        userManagement.selectWithVisibleText(userManagement.selectUserType,userType);
        userManagement.writeOnElement(userManagement.enterPassword,Password);

        userManagement.writeOnElement(userManagement.enterConfirmPassword,confirmPassword);
        userManagement.clickOnElement(userManagement.clickSubmitButton);
        userManagement.addScreenShot("After Successful User Entry");
        Assert.assertEquals(userManagement.getElementText(userManagement.userEnterSuccessAssertion),"Registration Successful.");
    }

    @Test(dataProvider = "newUserEntry",dataProviderClass = DataSet.class, priority = 2)
    @Description("Validate User Creation with Existing Username")
    public void newUserEntryExistingUsername(String firstName, String lastName,String Username, String userType,String Password, String confirmPassword) throws InterruptedException {
        dashboardPage.clickOnElement(dashboardPage.settingsLink);
        getDriver().get(userManagement.userManagementPageUrl);
        userManagement.addScreenShot("After click to the User Management page");
        userManagement.writeOnElement(userManagement.enterFirstName,firstName);
        userManagement.writeOnElement(userManagement.enterLastName,lastName);
        userManagement.writeOnElement(userManagement.enterUsername,Username);
        userManagement.selectWithVisibleText(userManagement.selectUserType,userType);
        userManagement.writeOnElement(userManagement.enterPassword,Password);

        userManagement.writeOnElement(userManagement.enterConfirmPassword,confirmPassword);
        userManagement.clickOnElement(userManagement.clickSubmitButton);
        userManagement.addScreenShot("Unsuccessful User Entry");
        Assert.assertEquals(userManagement.getElementText(userManagement.userEnterDuplicateUsernameAssertion),"User with this username already exists. Please use a different username");
    }

    }