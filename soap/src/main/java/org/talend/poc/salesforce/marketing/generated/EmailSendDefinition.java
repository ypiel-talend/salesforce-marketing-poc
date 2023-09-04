
package org.talend.poc.salesforce.marketing.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EmailSendDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmailSendDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}SendDefinition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SendDefinitionList" type="{http://exacttarget.com/wsdl/partnerAPI}SendDefinitionList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://exacttarget.com/wsdl/partnerAPI}Email" minOccurs="0"/&gt;
 *         &lt;element name="BccEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AutoBccEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestEmailAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EmailSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DynamicEmailSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsMultipart" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsWrapped" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SendLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SendWindowOpen" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="SendWindowClose" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="SendWindowDelete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DeduplicateByEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExclusionFilter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TrackingUsers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TrackingUser" type="{http://exacttarget.com/wsdl/partnerAPI}TrackingUser" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Additional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CCEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DeliveryScheduledTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/&gt;
 *         &lt;element name="MessageDeliveryType" type="{http://exacttarget.com/wsdl/partnerAPI}MessageDeliveryTypeEnum" minOccurs="0"/&gt;
 *         &lt;element name="IsSeedListSend" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="TimeZone" type="{http://exacttarget.com/wsdl/partnerAPI}TimeZone" minOccurs="0"/&gt;
 *         &lt;element name="SeedListOccurance" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PreHeader" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReplyToAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReplyToDisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailSendDefinition", propOrder = {
    "sendDefinitionList",
    "email",
    "bccEmail",
    "autoBccEmail",
    "testEmailAddr",
    "emailSubject",
    "dynamicEmailSubject",
    "isMultipart",
    "isWrapped",
    "sendLimit",
    "sendWindowOpen",
    "sendWindowClose",
    "sendWindowDelete",
    "deduplicateByEmail",
    "exclusionFilter",
    "trackingUsers",
    "additional",
    "ccEmail",
    "deliveryScheduledTime",
    "messageDeliveryType",
    "isSeedListSend",
    "timeZone",
    "seedListOccurance",
    "preHeader",
    "replyToAddress",
    "replyToDisplayName"
})
@XmlSeeAlso({
    DeprecatedEmailSendDefinition.class
})
public class EmailSendDefinition
    extends SendDefinition
{

    @XmlElement(name = "SendDefinitionList")
    protected List<SendDefinitionList> sendDefinitionList;
    @XmlElement(name = "Email")
    protected Email email;
    @XmlElement(name = "BccEmail")
    protected String bccEmail;
    @XmlElement(name = "AutoBccEmail")
    protected String autoBccEmail;
    @XmlElement(name = "TestEmailAddr")
    protected String testEmailAddr;
    @XmlElement(name = "EmailSubject")
    protected String emailSubject;
    @XmlElement(name = "DynamicEmailSubject")
    protected String dynamicEmailSubject;
    @XmlElement(name = "IsMultipart")
    protected Boolean isMultipart;
    @XmlElement(name = "IsWrapped")
    protected Boolean isWrapped;
    @XmlElement(name = "SendLimit")
    protected Integer sendLimit;
    @XmlElement(name = "SendWindowOpen")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar sendWindowOpen;
    @XmlElement(name = "SendWindowClose")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar sendWindowClose;
    @XmlElement(name = "SendWindowDelete")
    protected Boolean sendWindowDelete;
    @XmlElement(name = "DeduplicateByEmail")
    protected Boolean deduplicateByEmail;
    @XmlElement(name = "ExclusionFilter")
    protected String exclusionFilter;
    @XmlElement(name = "TrackingUsers")
    protected EmailSendDefinition.TrackingUsers trackingUsers;
    @XmlElement(name = "Additional")
    protected String additional;
    @XmlElement(name = "CCEmail")
    protected String ccEmail;
    @XmlElement(name = "DeliveryScheduledTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar deliveryScheduledTime;
    @XmlElement(name = "MessageDeliveryType")
    @XmlSchemaType(name = "string")
    protected MessageDeliveryTypeEnum messageDeliveryType;
    @XmlElement(name = "IsSeedListSend")
    protected Boolean isSeedListSend;
    @XmlElement(name = "TimeZone")
    protected TimeZone timeZone;
    @XmlElement(name = "SeedListOccurance")
    protected Integer seedListOccurance;
    @XmlElement(name = "PreHeader")
    protected String preHeader;
    @XmlElement(name = "ReplyToAddress")
    protected String replyToAddress;
    @XmlElement(name = "ReplyToDisplayName")
    protected String replyToDisplayName;

    /**
     * Gets the value of the sendDefinitionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sendDefinitionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSendDefinitionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SendDefinitionList }
     * 
     * 
     */
    public List<SendDefinitionList> getSendDefinitionList() {
        if (sendDefinitionList == null) {
            sendDefinitionList = new ArrayList<SendDefinitionList>();
        }
        return this.sendDefinitionList;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link Email }
     *     
     */
    public Email getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link Email }
     *     
     */
    public void setEmail(Email value) {
        this.email = value;
    }

    /**
     * Gets the value of the bccEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBccEmail() {
        return bccEmail;
    }

    /**
     * Sets the value of the bccEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBccEmail(String value) {
        this.bccEmail = value;
    }

    /**
     * Gets the value of the autoBccEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoBccEmail() {
        return autoBccEmail;
    }

    /**
     * Sets the value of the autoBccEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoBccEmail(String value) {
        this.autoBccEmail = value;
    }

    /**
     * Gets the value of the testEmailAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestEmailAddr() {
        return testEmailAddr;
    }

    /**
     * Sets the value of the testEmailAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestEmailAddr(String value) {
        this.testEmailAddr = value;
    }

    /**
     * Gets the value of the emailSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSubject() {
        return emailSubject;
    }

    /**
     * Sets the value of the emailSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSubject(String value) {
        this.emailSubject = value;
    }

    /**
     * Gets the value of the dynamicEmailSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicEmailSubject() {
        return dynamicEmailSubject;
    }

    /**
     * Sets the value of the dynamicEmailSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicEmailSubject(String value) {
        this.dynamicEmailSubject = value;
    }

    /**
     * Gets the value of the isMultipart property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMultipart() {
        return isMultipart;
    }

    /**
     * Sets the value of the isMultipart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultipart(Boolean value) {
        this.isMultipart = value;
    }

    /**
     * Gets the value of the isWrapped property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWrapped() {
        return isWrapped;
    }

    /**
     * Sets the value of the isWrapped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWrapped(Boolean value) {
        this.isWrapped = value;
    }

    /**
     * Gets the value of the sendLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSendLimit() {
        return sendLimit;
    }

    /**
     * Sets the value of the sendLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSendLimit(Integer value) {
        this.sendLimit = value;
    }

    /**
     * Gets the value of the sendWindowOpen property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendWindowOpen() {
        return sendWindowOpen;
    }

    /**
     * Sets the value of the sendWindowOpen property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendWindowOpen(XMLGregorianCalendar value) {
        this.sendWindowOpen = value;
    }

    /**
     * Gets the value of the sendWindowClose property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendWindowClose() {
        return sendWindowClose;
    }

    /**
     * Sets the value of the sendWindowClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendWindowClose(XMLGregorianCalendar value) {
        this.sendWindowClose = value;
    }

    /**
     * Gets the value of the sendWindowDelete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendWindowDelete() {
        return sendWindowDelete;
    }

    /**
     * Sets the value of the sendWindowDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendWindowDelete(Boolean value) {
        this.sendWindowDelete = value;
    }

    /**
     * Gets the value of the deduplicateByEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeduplicateByEmail() {
        return deduplicateByEmail;
    }

    /**
     * Sets the value of the deduplicateByEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeduplicateByEmail(Boolean value) {
        this.deduplicateByEmail = value;
    }

    /**
     * Gets the value of the exclusionFilter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExclusionFilter() {
        return exclusionFilter;
    }

    /**
     * Sets the value of the exclusionFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExclusionFilter(String value) {
        this.exclusionFilter = value;
    }

    /**
     * Gets the value of the trackingUsers property.
     * 
     * @return
     *     possible object is
     *     {@link EmailSendDefinition.TrackingUsers }
     *     
     */
    public EmailSendDefinition.TrackingUsers getTrackingUsers() {
        return trackingUsers;
    }

    /**
     * Sets the value of the trackingUsers property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailSendDefinition.TrackingUsers }
     *     
     */
    public void setTrackingUsers(EmailSendDefinition.TrackingUsers value) {
        this.trackingUsers = value;
    }

    /**
     * Gets the value of the additional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditional() {
        return additional;
    }

    /**
     * Sets the value of the additional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditional(String value) {
        this.additional = value;
    }

    /**
     * Gets the value of the ccEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCEmail() {
        return ccEmail;
    }

    /**
     * Sets the value of the ccEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCEmail(String value) {
        this.ccEmail = value;
    }

    /**
     * Gets the value of the deliveryScheduledTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryScheduledTime() {
        return deliveryScheduledTime;
    }

    /**
     * Sets the value of the deliveryScheduledTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryScheduledTime(XMLGregorianCalendar value) {
        this.deliveryScheduledTime = value;
    }

    /**
     * Gets the value of the messageDeliveryType property.
     * 
     * @return
     *     possible object is
     *     {@link MessageDeliveryTypeEnum }
     *     
     */
    public MessageDeliveryTypeEnum getMessageDeliveryType() {
        return messageDeliveryType;
    }

    /**
     * Sets the value of the messageDeliveryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageDeliveryTypeEnum }
     *     
     */
    public void setMessageDeliveryType(MessageDeliveryTypeEnum value) {
        this.messageDeliveryType = value;
    }

    /**
     * Gets the value of the isSeedListSend property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSeedListSend() {
        return isSeedListSend;
    }

    /**
     * Sets the value of the isSeedListSend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSeedListSend(Boolean value) {
        this.isSeedListSend = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZone }
     *     
     */
    public TimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZone }
     *     
     */
    public void setTimeZone(TimeZone value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the seedListOccurance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeedListOccurance() {
        return seedListOccurance;
    }

    /**
     * Sets the value of the seedListOccurance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeedListOccurance(Integer value) {
        this.seedListOccurance = value;
    }

    /**
     * Gets the value of the preHeader property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreHeader() {
        return preHeader;
    }

    /**
     * Sets the value of the preHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreHeader(String value) {
        this.preHeader = value;
    }

    /**
     * Gets the value of the replyToAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyToAddress() {
        return replyToAddress;
    }

    /**
     * Sets the value of the replyToAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyToAddress(String value) {
        this.replyToAddress = value;
    }

    /**
     * Gets the value of the replyToDisplayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReplyToDisplayName() {
        return replyToDisplayName;
    }

    /**
     * Sets the value of the replyToDisplayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReplyToDisplayName(String value) {
        this.replyToDisplayName = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TrackingUser" type="{http://exacttarget.com/wsdl/partnerAPI}TrackingUser" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "trackingUser"
    })
    public static class TrackingUsers {

        @XmlElement(name = "TrackingUser")
        protected List<TrackingUser> trackingUser;

        /**
         * Gets the value of the trackingUser property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trackingUser property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrackingUser().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TrackingUser }
         * 
         * 
         */
        public List<TrackingUser> getTrackingUser() {
            if (trackingUser == null) {
                trackingUser = new ArrayList<TrackingUser>();
            }
            return this.trackingUser;
        }

    }

}
