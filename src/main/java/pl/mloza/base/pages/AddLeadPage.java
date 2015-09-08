package pl.mloza.base.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.mloza.base.framework.AbstractPageObject;

public class AddLeadPage extends AbstractPageObject {
    @Override
    public AddLeadPage open() {
        getSite("leads/new");
        waitForLoad();
        return this;
    }

    @Override
    public AddLeadPage waitForLoad() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("lead-last-name")));
        return this;
    }

    public LeadDetailsPage addLeadWithLastName(String lastName) {
        driver.findElement(By.id("lead-last-name")).sendKeys("testname");
        driver.findElement(By.className("save")).click();
        return getPageObject(LeadDetailsPage.class).waitForLoad();
    }
}
