
package org.talend.poc.salesforce.marketing.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForwardedEmailOptInEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForwardedEmailOptInEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}TrackingEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OptInSubscriberKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForwardedEmailOptInEvent", propOrder = {
    "optInSubscriberKey"
})
public class ForwardedEmailOptInEvent
    extends TrackingEvent
{

    @XmlElement(name = "OptInSubscriberKey")
    protected String optInSubscriberKey;

    /**
     * Gets the value of the optInSubscriberKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptInSubscriberKey() {
        return optInSubscriberKey;
    }

    /**
     * Sets the value of the optInSubscriberKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptInSubscriberKey(String value) {
        this.optInSubscriberKey = value;
    }

}
