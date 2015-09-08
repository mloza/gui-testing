package pl.mloza.base.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import pl.mloza.base.framework.AbstractPageObject;
import pl.mloza.base.framework.PageObject;

public class Dashboard extends AbstractPageObject {

    @Autowired
    WebDriver driver;

    @Override
    public Dashboard open() {
        getSite("");
        waitForLoad();
        return this;
    }

    @Override
    public PageObject waitForLoad() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h1")));
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.tagName("h1")), "Dashboard"));
        return this;
    }

    public LeadsPage goToLeads() {
        return goTo(LeadsPage.class);
    }

    public SettingsPage goToSettings() {
        return goTo(SettingsPage.class);
    }
}
