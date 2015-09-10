package com.mloza.base.rest.api;

import com.getbase.Client;
import com.getbase.models.Contact;
import com.getbase.models.Deal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

@ContextConfiguration(locations = {"classpath:spring-config-rest.xml"})
public class CreateContact_CreateDeal_ChekIfProspectStatusIsUpdated extends AbstractTestNGSpringContextTests {

    @Autowired
    Client client;

    Contact contact;
    Deal deal;

    @BeforeClass
    public void setUp() throws Exception {
        contact = createContact();
        deal = createDeal();

        TimeUnit.SECONDS.sleep(3); //Give time for data to propagate
    }

    @Test
    public void testProspectStatusChanged() throws Exception {
        assertThat("Prospect status didn't change",
                getContact(contact.getId()).getProspectStatus(),
                not(equalTo(contact.getProspectStatus())));
    }

    @AfterClass
    public void tearDown() {
        client.deals().delete(deal.getId());
        client.contacts().delete(contact.getId());
    }

    private Deal createDeal() {
        Deal deal = new Deal();
        deal.setContactId(contact.getId());
        deal.setName("Much money");
        return client.deals().create(deal);
    }

    private Contact createContact() {
        Contact contact = new Contact();
        contact.setLastName("personax");
        return client.contacts().create(contact);
    }

    private Contact getContact(long contactId) {
        return client.contacts().get(contactId);
    }
}
