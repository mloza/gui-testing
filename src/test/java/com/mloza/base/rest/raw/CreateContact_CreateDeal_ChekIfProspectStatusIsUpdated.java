package com.mloza.base.rest.raw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pl.mloza.base.rest.model.Contact;
import pl.mloza.base.rest.model.Deal;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static pl.mloza.base.rest.Envelope.createEnvelope;

@ContextConfiguration(locations = {"classpath:spring-config-rest.xml"})
public class CreateContact_CreateDeal_ChekIfProspectStatusIsUpdated extends AbstractTestNGSpringContextTests {

    @Autowired
    RestTemplate restTemplate;

    @Value("${base.api.url}")
    String apiUrl;

    Contact contact;
    Deal deal;

    @BeforeClass
    public void setUp() throws Exception {
        contact = createContact();
        deal = createDeal(contact.getContactId());

        TimeUnit.SECONDS.sleep(3);
    }

    @Test
    public void testProspectStatusChanged() throws Exception {
        assertThat("Prospect status didn't change",
                getContact(contact.getContactId()).getProspectStatus(),
                not(equalTo(contact.getProspectStatus())));
    }

    @AfterClass
    public void tearDown() {
        deleteDeal(deal.getId());
        deleteContact(deal.getContactId());
    }

    private Deal createDeal(Long id) {
        Deal deal = new Deal();
        deal.setName("NewDeal");
        deal.setContactId(id);
        return restTemplate.postForObject(apiUrl+"deals", createEnvelope(deal), Deal.class);
    }

    private Contact createContact() {
        Contact contact = new Contact();
        contact.setLastName("RawName");
        return restTemplate.postForObject(apiUrl+"contacts", createEnvelope(contact), Contact.class);
    }

    private Contact getContact(Long id) {
        return restTemplate.getForObject(apiUrl + "contacts/{id}", Contact.class, id);
    }

    private void deleteDeal(Long dealId) {
        restTemplate.delete(apiUrl + "deals/{id}", dealId);
    }

    private void deleteContact(Long id) {
        restTemplate.delete(apiUrl + "contacts/{id}", id);
    }

}
