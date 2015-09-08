package pl.mloza.base.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;

public abstract class AbstractPageObject implements PageObject {

    @Autowired
    protected WebDriver driver;

    @Value("${base.url}")
    String url;

    @Autowired
    ApplicationContext context;

    public WebDriver getDriver() {
        return driver;
    }

    protected void getSiteAndWaitForElement(String URI, By element) {
        getSite(URI);
        waitForElement(element);
    }

    protected void waitForElement(By element) {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(element));
    }

    protected void getSite(String URI) {
        driver.get(url + URI);
    }

    @Override
    public <T extends PageObject> T goTo(Class<T> destination) {
        return (T) context.getBean(destination).open();
    }

    protected <T extends PageObject> T getPageObject(Class<T> destination) {
        return context.getBean(destination);
    }
}
