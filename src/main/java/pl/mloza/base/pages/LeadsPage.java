package pl.mloza.base.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.mloza.base.framework.AbstractPageObject;

public class LeadsPage extends AbstractPageObject {
    @Override
    public LeadsPage open() {
        driver.findElement(By.id("nav-leads")).click();
        waitForLoad();
        return this;
    }

    @Override
    public LeadsPage waitForLoad() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("leads-new")));
        return this;
    }

    public AddLeadPage goToAddLead() {
        driver.findElement(By.id("leads-new")).click();
        return getPageObject(AddLeadPage.class);
    }

    public LeadDetailsPage openLeadWithLastName(String lastName) {
        driver.findElement(By.xpath("//a[@class='lead-name'][contains(text(), 'testname')]")).click();
        return getPageObject(LeadDetailsPage.class).waitForLoad();
    }
}
