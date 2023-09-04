
package org.talend.poc.salesforce.marketing.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Options" type="{http://exacttarget.com/wsdl/partnerAPI}UpdateOptions"/&gt;
 *         &lt;element name="Objects" type="{http://exacttarget.com/wsdl/partnerAPI}APIObject" maxOccurs="unbounded"/&gt;
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
    "options",
    "objects"
})
@XmlRootElement(name = "UpdateRequest")
public class UpdateRequest {

    @XmlElement(name = "Options", required = true)
    protected UpdateOptions options;
    @XmlElement(name = "Objects", required = true)
    protected List<APIObject> objects;

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOptions }
     *     
     */
    public UpdateOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOptions }
     *     
     */
    public void setOptions(UpdateOptions value) {
        this.options = value;
    }

    /**
     * Gets the value of the objects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APIObject }
     * 
     * 
     */
    public List<APIObject> getObjects() {
        if (objects == null) {
            objects = new ArrayList<APIObject>();
        }
        return this.objects;
    }

}
