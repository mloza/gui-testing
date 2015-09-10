
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
    "creator_id",
    "owner_id",
    "name",
    "value",
    "currency",
    "hot",
    "stage_id",
    "source_id",
    "loss_reason_id",
    "dropbox_email",
    "contact_id",
    "organization_id",
    "estimated_close_date",
    "tags",
    "custom_fields",
    "created_at",
    "updated_at"
})
public class Deal {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("creator_id")
    private Long creatorId;
    @JsonProperty("owner_id")
    private Long ownerId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("value")
    private Long value;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("hot")
    private Boolean hot;
    @JsonProperty("stage_id")
    private Long stageId;
    @JsonProperty("source_id")
    private Long sourceId;
    @JsonProperty("loss_reason_id")
    private Object lossReasonId;
    @JsonProperty("dropbox_email")
    private String dropboxEmail;
    @JsonProperty("contact_id")
    private Long contactId;
    @JsonProperty("organization_id")
    private Long organizationId;
    @JsonProperty("estimated_close_date")
    private Object estimatedCloseDate;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("custom_fields")
    private CustomFields customFields;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    public Deal withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The creatorId
     */
    @JsonProperty("creator_id")
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * 
     * @param creatorId
     *     The creator_id
     */
    @JsonProperty("creator_id")
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Deal withCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 
     * @return
     *     The ownerId
     */
    @JsonProperty("owner_id")
    public Long getOwnerId() {
        return ownerId;
    }

    /**
     * 
     * @param ownerId
     *     The owner_id
     */
    @JsonProperty("owner_id")
    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Deal withOwnerId(Long ownerId) {
        this.ownerId = ownerId;
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

    public Deal withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public Long getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(Long value) {
        this.value = value;
    }

    public Deal withValue(Long value) {
        this.value = value;
        return this;
    }

    /**
     * 
     * @return
     *     The currency
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * 
     * @param currency
     *     The currency
     */
    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Deal withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * 
     * @return
     *     The hot
     */
    @JsonProperty("hot")
    public Boolean getHot() {
        return hot;
    }

    /**
     * 
     * @param hot
     *     The hot
     */
    @JsonProperty("hot")
    public void setHot(Boolean hot) {
        this.hot = hot;
    }

    public Deal withHot(Boolean hot) {
        this.hot = hot;
        return this;
    }

    /**
     * 
     * @return
     *     The stageId
     */
    @JsonProperty("stage_id")
    public Long getStageId() {
        return stageId;
    }

    /**
     * 
     * @param stageId
     *     The stage_id
     */
    @JsonProperty("stage_id")
    public void setStageId(Long stageId) {
        this.stageId = stageId;
    }

    public Deal withStageId(Long stageId) {
        this.stageId = stageId;
        return this;
    }

    /**
     * 
     * @return
     *     The sourceId
     */
    @JsonProperty("source_id")
    public Long getSourceId() {
        return sourceId;
    }

    /**
     * 
     * @param sourceId
     *     The source_id
     */
    @JsonProperty("source_id")
    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public Deal withSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 
     * @return
     *     The lossReasonId
     */
    @JsonProperty("loss_reason_id")
    public Object getLossReasonId() {
        return lossReasonId;
    }

    /**
     * 
     * @param lossReasonId
     *     The loss_reason_id
     */
    @JsonProperty("loss_reason_id")
    public void setLossReasonId(Object lossReasonId) {
        this.lossReasonId = lossReasonId;
    }

    public Deal withLossReasonId(Object lossReasonId) {
        this.lossReasonId = lossReasonId;
        return this;
    }

    /**
     * 
     * @return
     *     The dropboxEmail
     */
    @JsonProperty("dropbox_email")
    public String getDropboxEmail() {
        return dropboxEmail;
    }

    /**
     * 
     * @param dropboxEmail
     *     The dropbox_email
     */
    @JsonProperty("dropbox_email")
    public void setDropboxEmail(String dropboxEmail) {
        this.dropboxEmail = dropboxEmail;
    }

    public Deal withDropboxEmail(String dropboxEmail) {
        this.dropboxEmail = dropboxEmail;
        return this;
    }

    /**
     * 
     * @return
     *     The contactId
     */
    @JsonProperty("contact_id")
    public Long getContactId() {
        return contactId;
    }

    /**
     * 
     * @param contactId
     *     The contact_id
     */
    @JsonProperty("contact_id")
    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public Deal withContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }

    /**
     * 
     * @return
     *     The organizationId
     */
    @JsonProperty("organization_id")
    public Long getOrganizationId() {
        return organizationId;
    }

    /**
     * 
     * @param organizationId
     *     The organization_id
     */
    @JsonProperty("organization_id")
    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public Deal withOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * 
     * @return
     *     The estimatedCloseDate
     */
    @JsonProperty("estimated_close_date")
    public Object getEstimatedCloseDate() {
        return estimatedCloseDate;
    }

    /**
     * 
     * @param estimatedCloseDate
     *     The estimated_close_date
     */
    @JsonProperty("estimated_close_date")
    public void setEstimatedCloseDate(Object estimatedCloseDate) {
        this.estimatedCloseDate = estimatedCloseDate;
    }

    public Deal withEstimatedCloseDate(Object estimatedCloseDate) {
        this.estimatedCloseDate = estimatedCloseDate;
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

    public Deal withTags(List<String> tags) {
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

    public Deal withCustomFields(CustomFields customFields) {
        this.customFields = customFields;
        return this;
    }

    /**
     * 
     * @return
     *     The createdAt
     */
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt
     *     The created_at
     */
    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Deal withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 
     * @return
     *     The updatedAt
     */
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt
     *     The updated_at
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Deal withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
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

    public Deal withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
