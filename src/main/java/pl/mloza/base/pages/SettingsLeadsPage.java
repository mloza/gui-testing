package pl.mloza.base.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.mloza.base.framework.AbstractPageObject;

public class SettingsLeadsPage extends AbstractPageObject {
    @Override
    public SettingsLeadsPage open() {
        getSite("/settings/leads");
        waitForLoad();
        return this;
    }

    @Override
    public SettingsLeadsPage waitForLoad() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h2")));
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.tagName("h2")), "Leads"));
        return this;
    }

    public SettingsLeadsStatusesTab openLeadStatusesTab() {
        driver.findElement(By.cssSelector("#main-container a[href='#lead-status']")).click();
        return getPageObject(SettingsLeadsStatusesTab.class).waitForLoad();
    }
}
