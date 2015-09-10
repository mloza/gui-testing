package com.mloza.base.gui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.mloza.base.pages.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.openqa.selenium.lift.Matchers.text;

@ContextConfiguration(locations = {"classpath:spring-config-gui.xml"})
public class AddNewLead_CheckStatus_ChangeStatusName_ValidateIfLeadStatusIsUpdated extends AbstractTestNGSpringContextTests {

    private final String LEAD_LAST_NAME = "testingName";
    private final String NEW_STATUS = "Different status";
    private final String OLD_STATUS = "New";

    @Autowired
    LoginPage loginPage;

    @Autowired
    Dashboard dashboard;

    @BeforeClass
    public void setUp() {
        loginPage.open();
        Dashboard dashboard = loginPage.login();

        SettingsLeadsStatusesTab settingsLeadsStatusesTab = dashboard
                .goTo(SettingsPage.class)
                .goToSettingsLeadsPage()
                .openLeadStatusesTab();

        if(settingsLeadsStatusesTab.statusDoesNotExists(OLD_STATUS)) {
            throw new SkipException("Status New does not exists. It needs to be corrected before test.");
        }
    }

    @Test
    public void testStatusChange() throws Exception {
        LeadDetailsPage leadDetailsPage = dashboard
                .open()
                .goToLeads()
                .goToAddLead()
                .addLeadWithLastName(LEAD_LAST_NAME);

        assertThat("New lead has different status than New",
                leadDetailsPage.getLeadStatusElement(),
                text(equalTo(OLD_STATUS)));

        SettingsLeadsStatusesTab settingsLeadsStatusesTab = dashboard
                .goToSettings()
                .goToSettingsLeadsPage()
                .openLeadStatusesTab();

        settingsLeadsStatusesTab.changeStatusName(OLD_STATUS, NEW_STATUS);

        leadDetailsPage = dashboard
                .goToLeads()
                .openLeadWithLastName(LEAD_LAST_NAME);

        assertThat("Status name didn't change",
                leadDetailsPage.getLeadStatusElement(),
                text(equalTo(NEW_STATUS)));
    }

    @AfterClass
    public void tearDown() {
        dashboard
                .goToSettings()
                .goToSettingsLeadsPage()
                .openLeadStatusesTab()
                .changeStatusName(NEW_STATUS, OLD_STATUS);

        dashboard
                .goToLeads()
                .openLeadWithLastName(LEAD_LAST_NAME)
                .delete();
    }
}
