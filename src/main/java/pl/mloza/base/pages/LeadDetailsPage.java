package pl.mloza.base.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.mloza.base.framework.AbstractPageObject;

public class LeadDetailsPage extends AbstractPageObject {
    @Override
    public LeadDetailsPage open() {
        throw new RuntimeException("No direct access");
    }

    @Override
    public LeadDetailsPage waitForLoad() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("lead-status")));
        return this;
    }

    public WebElement getLeadStatusElement() {
        return driver.findElement(By.className("lead-status"));
    }

    public LeadsPage delete() {
        driver.findElement(By.className("delete")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.className("confirm")));
        driver.findElement(By.className("confirm")).click();
        return getPageObject(LeadsPage.class).waitForLoad();
    }
}
