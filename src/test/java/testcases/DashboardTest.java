package testcases;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CardManagementPage;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.DriverSetup;

public class DashboardTest extends DriverSetup {

    LoginPage loginPage = new LoginPage();
    CardManagementPage cardManagementPage = new CardManagementPage();
    DashboardPage dashboardPage = new DashboardPage();

}
