
package org.talend.poc.salesforce.marketing.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessUnit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessUnit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}Account"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DefaultSendClassification" type="{http://exacttarget.com/wsdl/partnerAPI}SendClassification" minOccurs="0"/&gt;
 *         &lt;element name="DefaultHomePage" type="{http://exacttarget.com/wsdl/partnerAPI}LandingPage" minOccurs="0"/&gt;
 *         &lt;element name="SubscriberFilter" type="{http://exacttarget.com/wsdl/partnerAPI}FilterPart" minOccurs="0"/&gt;
 *         &lt;element name="MasterUnsubscribeBehavior" type="{http://exacttarget.com/wsdl/partnerAPI}UnsubscribeBehaviorEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessUnit", propOrder = {
    "description",
    "defaultSendClassification",
    "defaultHomePage",
    "subscriberFilter",
    "masterUnsubscribeBehavior"
})
public class BusinessUnit
    extends Account
{

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "DefaultSendClassification")
    protected SendClassification defaultSendClassification;
    @XmlElement(name = "DefaultHomePage")
    protected LandingPage defaultHomePage;
    @XmlElement(name = "SubscriberFilter")
    protected FilterPart subscriberFilter;
    @XmlElement(name = "MasterUnsubscribeBehavior")
    @XmlSchemaType(name = "string")
    protected UnsubscribeBehaviorEnum masterUnsubscribeBehavior;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the defaultSendClassification property.
     * 
     * @return
     *     possible object is
     *     {@link SendClassification }
     *     
     */
    public SendClassification getDefaultSendClassification() {
        return defaultSendClassification;
    }

    /**
     * Sets the value of the defaultSendClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendClassification }
     *     
     */
    public void setDefaultSendClassification(SendClassification value) {
        this.defaultSendClassification = value;
    }

    /**
     * Gets the value of the defaultHomePage property.
     * 
     * @return
     *     possible object is
     *     {@link LandingPage }
     *     
     */
    public LandingPage getDefaultHomePage() {
        return defaultHomePage;
    }

    /**
     * Sets the value of the defaultHomePage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandingPage }
     *     
     */
    public void setDefaultHomePage(LandingPage value) {
        this.defaultHomePage = value;
    }

    /**
     * Gets the value of the subscriberFilter property.
     * 
     * @return
     *     possible object is
     *     {@link FilterPart }
     *     
     */
    public FilterPart getSubscriberFilter() {
        return subscriberFilter;
    }

    /**
     * Sets the value of the subscriberFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterPart }
     *     
     */
    public void setSubscriberFilter(FilterPart value) {
        this.subscriberFilter = value;
    }

    /**
     * Gets the value of the masterUnsubscribeBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link UnsubscribeBehaviorEnum }
     *     
     */
    public UnsubscribeBehaviorEnum getMasterUnsubscribeBehavior() {
        return masterUnsubscribeBehavior;
    }

    /**
     * Sets the value of the masterUnsubscribeBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnsubscribeBehaviorEnum }
     *     
     */
    public void setMasterUnsubscribeBehavior(UnsubscribeBehaviorEnum value) {
        this.masterUnsubscribeBehavior = value;
    }

}
