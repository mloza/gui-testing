
package pl.mloza.base.rest.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "referral_website"
})
public class CustomFields {

    @JsonProperty("referral_website")
    private String referralWebsite;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The referralWebsite
     */
    @JsonProperty("referral_website")
    public String getReferralWebsite() {
        return referralWebsite;
    }

    /**
     * 
     * @param referralWebsite
     *     The referral_website
     */
    @JsonProperty("referral_website")
    public void setReferralWebsite(String referralWebsite) {
        this.referralWebsite = referralWebsite;
    }

    public CustomFields withReferralWebsite(String referralWebsite) {
        this.referralWebsite = referralWebsite;
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

    public CustomFields withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
