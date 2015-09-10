
package pl.mloza.base.rest.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "name",
    "first_name",
    "last_name",
    "title",
    "description",
    "industry",
    "website",
    "prospect_status",
    "email",
    "phone",
    "mobile",
    "fax",
    "twitter",
    "facebook",
    "linkedin",
    "skype",
    "address",
    "tags",
    "custom_fields"
})
public class Contact {

    @JsonProperty("id")
    private Long contactId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("industry")
    private String industry;
    @JsonProperty("website")
    private String website;
    @JsonProperty("email")
    private String email;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("fax")
    private String fax;
    @JsonProperty("twitter")
    private String twitter;
    @JsonProperty("facebook")
    private String facebook;
    @JsonProperty("linkedin")
    private String linkedin;
    @JsonProperty("skype")
    private String skype;
    @JsonProperty("prospect_status")
    private String prospectStatus;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("custom_fields")
    private CustomFields customFields;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The contactId
     */
    @JsonProperty("id")
    public Long getContactId() {
        return contactId;
    }

    /**
     *
     * @param contactId
     *     The contact_id
     */
    @JsonProperty("id")
    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public Contact withContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }

    /**
     *
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Contact withName(String name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @return
     *     The firstName
     */
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    /**
     *
     * @param firstName
     *     The first_name
     */
    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Contact withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     *
     * @return
     *     The lastName
     */
    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    /**
     *
     * @param lastName
     *     The last_name
     */
    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Contact withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     *
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Contact withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     *
     * @return
     *     The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     *     The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Contact withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     *
     * @return
     *     The industry
     */
    @JsonProperty("industry")
    public String getIndustry() {
        return industry;
    }

    /**
     *
     * @param industry
     *     The industry
     */
    @JsonProperty("industry")
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public Contact withIndustry(String industry) {
        this.industry = industry;
        return this;
    }

    /**
     *
     * @return
     *     The website
     */
    @JsonProperty("website")
    public String getWebsite() {
        return website;
    }

    /**
     *
     * @param website
     *     The website
     */
    @JsonProperty("website")
    public void setWebsite(String website) {
        this.website = website;
    }

    public Contact withWebsite(String website) {
        this.website = website;
        return this;
    }

    /**
     *
     * @return
     *     The prospect_status
     */
    @JsonProperty("prospect_status")
    public String getProspectStatus() {
        return prospectStatus;
    }

    /**
     *
     * @param prospect_status
     *     The prospect_status
     */
    @JsonProperty("prospect_status")
    public void setProspectStatus(String prospectStatus) {
        this.prospectStatus = prospectStatus;
    }

    public Contact withProspectStatus(String prospectStatus) {
        this.prospectStatus = prospectStatus;
        return this;
    }

    /**
     * 
     * @return
     *     The email
     */
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    /**
     * 
     * @param email
     *     The email
     */
    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public Contact withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 
     * @return
     *     The phone
     */
    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    /**
     * 
     * @param phone
     *     The phone
     */
    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Contact withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 
     * @return
     *     The mobile
     */
    @JsonProperty("mobile")
    public String getMobile() {
        return mobile;
    }

    /**
     * 
     * @param mobile
     *     The mobile
     */
    @JsonProperty("mobile")
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Contact withMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    /**
     * 
     * @return
     *     The fax
     */
    @JsonProperty("fax")
    public String getFax() {
        return fax;
    }

    /**
     * 
     * @param fax
     *     The fax
     */
    @JsonProperty("fax")
    public void setFax(String fax) {
        this.fax = fax;
    }

    public Contact withFax(String fax) {
        this.fax = fax;
        return this;
    }

    /**
     * 
     * @return
     *     The twitter
     */
    @JsonProperty("twitter")
    public String getTwitter() {
        return twitter;
    }

    /**
     * 
     * @param twitter
     *     The twitter
     */
    @JsonProperty("twitter")
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public Contact withTwitter(String twitter) {
        this.twitter = twitter;
        return this;
    }

    /**
     * 
     * @return
     *     The facebook
     */
    @JsonProperty("facebook")
    public String getFacebook() {
        return facebook;
    }

    /**
     * 
     * @param facebook
     *     The facebook
     */
    @JsonProperty("facebook")
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public Contact withFacebook(String facebook) {
        this.facebook = facebook;
        return this;
    }

    /**
     * 
     * @return
     *     The linkedin
     */
    @JsonProperty("linkedin")
    public String getLinkedin() {
        return linkedin;
    }

    /**
     * 
     * @param linkedin
     *     The linkedin
     */
    @JsonProperty("linkedin")
    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public Contact withLinkedin(String linkedin) {
        this.linkedin = linkedin;
        return this;
    }

    /**
     * 
     * @return
     *     The skype
     */
    @JsonProperty("skype")
    public String getSkype() {
        return skype;
    }

    /**
     * 
     * @param skype
     *     The skype
     */
    @JsonProperty("skype")
    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Contact withSkype(String skype) {
        this.skype = skype;
        return this;
    }

    /**
     * 
     * @return
     *     The address
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    public Contact withAddress(Address address) {
        this.address = address;
        return this;
    }

    /**
     * 
     * @return
     *     The tags
     */
    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Contact withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * 
     * @return
     *     The customFields
     */
    @JsonProperty("custom_fields")
    public CustomFields getCustomFields() {
        return customFields;
    }

    /**
     * 
     * @param customFields
     *     The custom_fields
     */
    @JsonProperty("custom_fields")
    public void setCustomFields(CustomFields customFields) {
        this.customFields = customFields;
    }

    public Contact withCustomFields(CustomFields customFields) {
        this.customFields = customFields;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Contact withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
