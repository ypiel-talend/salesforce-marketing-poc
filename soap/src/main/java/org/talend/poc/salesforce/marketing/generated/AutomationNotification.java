
package org.talend.poc.salesforce.marketing.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutomationNotification complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutomationNotification"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Body" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChannelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="NotificationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AutomationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutomationNotification", propOrder = {
    "address",
    "body",
    "channelType",
    "notificationType",
    "automationID"
})
public class AutomationNotification
    extends APIObject
{

    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "Body")
    protected String body;
    @XmlElement(name = "ChannelType")
    protected String channelType;
    @XmlElement(name = "NotificationType")
    protected String notificationType;
    @XmlElement(name = "AutomationID")
    protected String automationID;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBody(String value) {
        this.body = value;
    }

    /**
     * Gets the value of the channelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * Sets the value of the channelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelType(String value) {
        this.channelType = value;
    }

    /**
     * Gets the value of the notificationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationType() {
        return notificationType;
    }

    /**
     * Sets the value of the notificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationType(String value) {
        this.notificationType = value;
    }

    /**
     * Gets the value of the automationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomationID() {
        return automationID;
    }

    /**
     * Sets the value of the automationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomationID(String value) {
        this.automationID = value;
    }

}
