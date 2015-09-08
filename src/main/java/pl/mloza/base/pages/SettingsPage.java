package pl.mloza.base.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pl.mloza.base.framework.AbstractPageObject;

public class SettingsPage extends AbstractPageObject {

    @Override
    public SettingsPage open() {
        driver.findElement(By.cssSelector("#user-dd>a")).click();
        driver.findElement(By.cssSelector(".settings>a")).click();
        return this;
    }

    @Override
    public SettingsPage waitForLoad() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h1")));
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.tagName("h1")), "Settings"));
        return this;
    }
}
