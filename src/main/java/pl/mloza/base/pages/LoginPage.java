package pl.mloza.base.pages;

import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import pl.mloza.base.framework.AbstractPageObject;

public class LoginPage extends AbstractPageObject {

    @Autowired
    Dashboard dashboard;

    @Value("${base.username}")
    String username;

    @Value("${base.password}")
    String password;

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
        driver.findElement(By.id("user_email")).sendKeys(username);
        driver.findElement(By.id("user_password")).sendKeys(password);
        driver.findElement(By.tagName("button")).click();

        dashboard.waitForLoad();
        return dashboard;
    }
}
