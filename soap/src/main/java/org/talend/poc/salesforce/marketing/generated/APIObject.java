
package org.talend.poc.salesforce.marketing.generated;

import java.util.ArrayList;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for APIObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="APIObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Client" type="{http://exacttarget.com/wsdl/partnerAPI}ClientID" minOccurs="0"/&gt;
 *         &lt;element name="PartnerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartnerProperties" type="{http://exacttarget.com/wsdl/partnerAPI}APIProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ObjectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Owner" type="{http://exacttarget.com/wsdl/partnerAPI}Owner" minOccurs="0"/&gt;
 *         &lt;element name="CorrelationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ObjectState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsPlatformObject" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "APIObject", propOrder = {
    "client",
    "partnerKey",
    "partnerProperties",
    "createdDate",
    "modifiedDate",
    "id",
    "objectID",
    "customerKey",
    "owner",
    "correlationID",
    "objectState",
    "isPlatformObject"
})
@XmlSeeAlso({
    ContentValidation.class,
    ScheduleDefinition.class,
    Subscriber.class,
    SubscriberList.class,
    org.talend.poc.salesforce.marketing.generated.List.class,
    Group.class,
    ListAttribute.class,
    ListAttributeRestrictedValue.class,
    Send.class,
    TriggeredSend.class,
    SenderProfile.class,
    DeliveryProfile.class,
    PrivateDomain.class,
    PrivateDomainSet.class,
    PrivateIP.class,
    AudienceItem.class,
    DataFolder.class,
    ResultMessage.class,
    ResultItem.class,
    ExtractTemplate.class,
    Locale.class,
    TimeZone.class,
    Account.class,
    LandingPage.class,
    AccountPrivateLabel.class,
    BusinessRule.class,
    AccountUser.class,
    SsoIdentity.class,
    UserAccess.class,
    Brand.class,
    BrandTag.class,
    Role.class,
    PermissionSet.class,
    Permission.class,
    Email.class,
    ContentArea.class,
    Message.class,
    TrackingEvent.class,
    ListSubscriber.class,
    GlobalUnsubscribeCategory.class,
    Link.class,
    SendSummary.class,
    SubscriberSendResult.class,
    TriggeredSendSummary.class,
    AsyncRequestResult.class,
    VoiceTriggeredSend.class,
    SMSTriggeredSend.class,
    SendClassification.class,
    TrackingUser.class,
    MessagingVendorKind.class,
    SMSMTEvent.class,
    SMSMOEvent.class,
    BaseMOKeyword.class,
    SMSSharedKeyword.class,
    FileTransferLocation.class,
    DataExtension.class,
    PropertyDefinition.class,
    DataExtensionTemplate.class,
    ImportDefinitionFieldMap.class,
    ImportResultsSummary.class,
    FilterDefinition.class,
    ListSend.class,
    LinkSend.class,
    ObjectExtension.class,
    PublicKeyManagement.class,
    SecurityObject.class,
    Authentication.class,
    ResourceSpecification.class,
    Portfolio.class,
    Template.class,
    Layout.class,
    IntegrationProfile.class,
    IntegrationProfileDefinition.class,
    ReplyMailManagementConfiguration.class,
    FileTrigger.class,
    FileTriggerTypeLastPull.class,
    ProgramManifestTemplate.class,
    Publication.class,
    PublicationSubscriber.class,
    AutomationInstances.class,
    AutomationNotification.class,
    AutomationTask.class,
    AutomationActivity.class,
    InteractionBaseObject.class,
    PlatformApplication.class,
    PlatformApplicationPackage.class,
    SuppressionListDefinition.class,
    SuppressionListContext.class,
    SuppressionListData.class,
    SendAdditionalAttribute.class,
    Asset.class,
    Category.class,
    ImportFileDestination.class,
    ContactEvent.class,
    AttributeSet.class,
    ScheduledRequest.class,
    ScheduledConversation.class
})
public class APIObject {

    @XmlElement(name = "Client")
    protected ClientID client;
    @XmlElementRef(name = "PartnerKey", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partnerKey;
    @XmlElement(name = "PartnerProperties")
    protected java.util.List<APIProperty> partnerProperties;
    @XmlElement(name = "CreatedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlElementRef(name = "ModifiedDate", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> modifiedDate;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElementRef(name = "ObjectID", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<String> objectID;
    @XmlElement(name = "CustomerKey")
    protected String customerKey;
    @XmlElement(name = "Owner")
    protected Owner owner;
    @XmlElement(name = "CorrelationID")
    protected String correlationID;
    @XmlElement(name = "ObjectState")
    protected String objectState;
    @XmlElement(name = "IsPlatformObject")
    protected Boolean isPlatformObject;

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link ClientID }
     *     
     */
    public ClientID getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientID }
     *     
     */
    public void setClient(ClientID value) {
        this.client = value;
    }

    /**
     * Gets the value of the partnerKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartnerKey() {
        return partnerKey;
    }

    /**
     * Sets the value of the partnerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartnerKey(JAXBElement<String> value) {
        this.partnerKey = value;
    }

    /**
     * Gets the value of the partnerProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APIProperty }
     * 
     * 
     */
    public java.util.List<APIProperty> getPartnerProperties() {
        if (partnerProperties == null) {
            partnerProperties = new ArrayList<APIProperty>();
        }
        return this.partnerProperties;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setModifiedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the objectID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObjectID() {
        return objectID;
    }

    /**
     * Sets the value of the objectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObjectID(JAXBElement<String> value) {
        this.objectID = value;
    }

    /**
     * Gets the value of the customerKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerKey() {
        return customerKey;
    }

    /**
     * Sets the value of the customerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerKey(String value) {
        this.customerKey = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link Owner }
     *     
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Owner }
     *     
     */
    public void setOwner(Owner value) {
        this.owner = value;
    }

    /**
     * Gets the value of the correlationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrelationID() {
        return correlationID;
    }

    /**
     * Sets the value of the correlationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrelationID(String value) {
        this.correlationID = value;
    }

    /**
     * Gets the value of the objectState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectState() {
        return objectState;
    }

    /**
     * Sets the value of the objectState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectState(String value) {
        this.objectState = value;
    }

    /**
     * Gets the value of the isPlatformObject property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPlatformObject() {
        return isPlatformObject;
    }

    /**
     * Sets the value of the isPlatformObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPlatformObject(Boolean value) {
        this.isPlatformObject = value;
    }

}
