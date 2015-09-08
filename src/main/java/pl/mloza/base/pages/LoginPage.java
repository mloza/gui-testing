package pl.mloza.base.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import pl.mloza.base.framework.AbstractPageObject;
import pl.mloza.base.framework.PageObject;

public class LoginPage extends AbstractPageObject {

    @Autowired
    Dashboard dashboard;

    @Override
    public LoginPage open() {
        getSite("");
        waitForLoad();
        return this;
    }

    @Override
    public LoginPage waitForLoad() {
        waitForElement(By.id("user_email"));
        return this;
    }

    public Dashboard login() {
        driver.findElement(By.id("user_email")).sendKeys("michal@mloza.pl");
        driver.findElement(By.id("user_password")).sendKeys("Vulture9");
        driver.findElement(By.tagName("button")).click();

        dashboard.waitForLoad();
        return dashboard;
    }
}
