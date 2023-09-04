
package org.talend.poc.salesforce.marketing.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaveOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaveOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SaveAction" type="{http://exacttarget.com/wsdl/partnerAPI}SaveAction"/&gt;
 *         &lt;element name="TrackChanges" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaveOption", propOrder = {
    "propertyName",
    "saveAction",
    "trackChanges"
})
public class SaveOption {

    @XmlElement(name = "PropertyName", required = true)
    protected String propertyName;
    @XmlElement(name = "SaveAction", required = true)
    @XmlSchemaType(name = "string")
    protected SaveAction saveAction;
    @XmlElement(name = "TrackChanges")
    protected Boolean trackChanges;

    /**
     * Gets the value of the propertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the value of the propertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyName(String value) {
        this.propertyName = value;
    }

    /**
     * Gets the value of the saveAction property.
     * 
     * @return
     *     possible object is
     *     {@link SaveAction }
     *     
     */
    public SaveAction getSaveAction() {
        return saveAction;
    }

    /**
     * Sets the value of the saveAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaveAction }
     *     
     */
    public void setSaveAction(SaveAction value) {
        this.saveAction = value;
    }

    /**
     * Gets the value of the trackChanges property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTrackChanges() {
        return trackChanges;
    }

    /**
     * Sets the value of the trackChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTrackChanges(Boolean value) {
        this.trackChanges = value;
    }

}
