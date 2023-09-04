
package org.talend.poc.salesforce.marketing.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnsubEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnsubEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}TrackingEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="List" type="{http://exacttarget.com/wsdl/partnerAPI}List" minOccurs="0"/&gt;
 *         &lt;element name="IsMasterUnsubscribed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsubEvent", propOrder = {
    "list",
    "isMasterUnsubscribed"
})
public class UnsubEvent
    extends TrackingEvent
{

    @XmlElement(name = "List")
    protected List list;
    @XmlElement(name = "IsMasterUnsubscribed")
    protected Boolean isMasterUnsubscribed;

    /**
     * Gets the value of the list property.
     * 
     * @return
     *     possible object is
     *     {@link List }
     *     
     */
    public List getList() {
        return list;
    }

    /**
     * Sets the value of the list property.
     * 
     * @param value
     *     allowed object is
     *     {@link List }
     *     
     */
    public void setList(List value) {
        this.list = value;
    }

    /**
     * Gets the value of the isMasterUnsubscribed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMasterUnsubscribed() {
        return isMasterUnsubscribed;
    }

    /**
     * Sets the value of the isMasterUnsubscribed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMasterUnsubscribed(Boolean value) {
        this.isMasterUnsubscribed = value;
    }

}
