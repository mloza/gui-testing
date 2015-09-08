package com.mloza.gui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.mloza.base.pages.Dashboard;
import pl.mloza.base.pages.LoginPage;
import pl.mloza.base.pages.SettingsPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.openqa.selenium.lift.Matchers.text;

@ContextConfiguration(locations = { "classpath:spring-config.xml" })
public class FirstScratch extends AbstractTestNGSpringContextTests {

    @Autowired
    LoginPage loginPage;

    @BeforeClass
    public void before() {
        loginPage.open();
        Dashboard dashboard = loginPage.login();

        dashboard.goTo(SettingsPage.class);
    }

    @Test
    public void testWebDriverWork() throws Exception {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://app.futuresimple.com");

        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.id("user_email")));

        WebElement element = driver.findElement(By.id("user_email"));
        element.sendKeys("michal@mloza.pl");

        WebElement element2 = driver.findElement(By.id("user_password"));
        element2.sendKeys("Vulture9");

        WebElement element3 = driver.findElement(By.tagName("button"));
        element3.click();

        webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h1")));
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.tagName("h1")), "Dashboard"));

        driver.findElement(By.id("nav-leads")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("leads-new")));
        driver.findElement(By.id("leads-new")).click();

        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.id("lead-last-name")));
        driver.findElement(By.id("lead-last-name")).sendKeys("testname");
        driver.findElement(By.className("save")).click();

        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("lead-status")));
        assertThat("New lead has status New", driver.findElement(By.className("lead-status")), text(equalTo("New")));

        driver.findElement(By.cssSelector("#user-dd>a")).click();
        driver.findElement(By.cssSelector(".settings>a")).click();

        webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h1")));
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.tagName("h1")), "Settings"));
        driver.findElement(By.cssSelector(".settings-menu .leads>a")).click();

        webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h2")));
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.tagName("h2")), "Leads"));
        driver.findElement(By.cssSelector("#main-container a[href='#lead-status']")).click();

        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='lead-status']//div[contains(@class, 'item')][//h4[contains(text(), 'New')]]//button")));
        WebElement status = driver.findElement(By.xpath("//div[@id='lead-status']/div/*[div/div[contains(@class, 'item')]//h4[contains(text(), 'New')]]"));
        status.findElement(By.tagName("button")).click();
        webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.visibilityOf(status.findElement(By.tagName("input"))));
        WebElement field = status.findElement(By.tagName("input"));
        field.clear();
        field.sendKeys("different name");

        status.findElement(By.tagName("button")).click();

        driver.findElement(By.id("nav-leads")).click();
        webDriverWait = new WebDriverWait(driver, 10);
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h1")));
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='lead-name'][contains(text(), 'testname')]")));

        driver.findElement(By.xpath("//a[@class='lead-name'][contains(text(), 'testname')]")).click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.className("lead-status")));
        assertThat("New lead has changed status", driver.findElement(By.className("lead-status")), text(equalTo("different name")));

        System.out.println("I'm dam'n good");

    }
}
