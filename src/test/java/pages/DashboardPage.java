package pages;

import org.openqa.selenium.By;

public class DashboardPage extends basePage{
    //public String dashboardPageUrl = "http://54.89.25.234:8000/dashboard/";

    public By settingsLink = By.xpath("//a[@class='nav-link' and @data-toggle='collapse' and @href='#auth']//span[@class='menu-title']");
    public By operationsLink = By.xpath("//a[@class='nav-link' and @href='#operations']");
    public By reportsLink = By.xpath("//a[@class='nav-link' and @href='#reports']");
    public By cardManagementLink = By.xpath("//li[@class='nav-item']//a[@class='nav-link' and @href='/card']");
    public By cardIssueLink = By.xpath("//li[@class='nav-item']//a[@class='nav-link active' and contains(@href, '/card_issue/')]");
}
