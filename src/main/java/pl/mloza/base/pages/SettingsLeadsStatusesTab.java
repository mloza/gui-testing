package pl.mloza.base.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.mloza.base.framework.AbstractPageObject;

public class SettingsLeadsStatusesTab extends AbstractPageObject {
    @Override
    public SettingsLeadsStatusesTab open() {
        throw new RuntimeException("No direct access, use settings page to open this tab");
    }

    @Override
    public SettingsLeadsStatusesTab waitForLoad() {
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='lead-status']//div[contains(@class, 'item')][//h4]//button")));
        return this;
    }

    public boolean statusExists(String status) {
        try {
            driver.findElement(By.xpath("//div[@id='lead-status']//div[contains(@class, 'item')][//h4[contains(text(), '"+status+"')]]"));
            return true;
        } catch(NoSuchElementException e) {
            return false;
        }
    }

    public boolean statusDoesNotExists(String status) {
        return !statusExists(status);
    }

    public SettingsLeadsStatusesTab changeStatusName(String from, String to) {
        WebElement status = driver.findElement(By.xpath("//div[@id='lead-status']/div/*[div/div[contains(@class, 'item')]//h4[contains(text(), '"+from+"')]]"));
        status.findElement(By.tagName("button")).click();

        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.visibilityOf(status.findElement(By.tagName("input"))));
        WebElement field = status.findElement(By.tagName("input"));
        field.clear();
        field.sendKeys(to);

        status.findElement(By.tagName("button")).click();
        return this;
    }
}
