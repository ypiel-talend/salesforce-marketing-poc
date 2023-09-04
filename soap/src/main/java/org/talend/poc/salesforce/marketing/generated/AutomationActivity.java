
package org.talend.poc.salesforce.marketing.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutomationActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutomationActivity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Definition" type="{http://exacttarget.com/wsdl/partnerAPI}APIObject" minOccurs="0"/&gt;
 *         &lt;element name="Automation" type="{http://exacttarget.com/wsdl/partnerAPI}Automation" minOccurs="0"/&gt;
 *         &lt;element name="AutomationTask" type="{http://exacttarget.com/wsdl/partnerAPI}AutomationTask" minOccurs="0"/&gt;
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ActivityObject" type="{http://exacttarget.com/wsdl/partnerAPI}APIObject" minOccurs="0"/&gt;
 *         &lt;element name="SerializedObject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutomationActivity", propOrder = {
    "name",
    "description",
    "isActive",
    "definition",
    "automation",
    "automationTask",
    "sequence",
    "activityObject",
    "serializedObject"
})
@XmlSeeAlso({
    AutomationActivityInstance.class
})
public class AutomationActivity
    extends APIObject
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElement(name = "Definition")
    protected APIObject definition;
    @XmlElement(name = "Automation")
    protected Automation automation;
    @XmlElement(name = "AutomationTask")
    protected AutomationTask automationTask;
    @XmlElement(name = "Sequence")
    protected Integer sequence;
    @XmlElement(name = "ActivityObject")
    protected APIObject activityObject;
    @XmlElement(name = "SerializedObject")
    protected String serializedObject;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

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
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link APIObject }
     *     
     */
    public APIObject getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIObject }
     *     
     */
    public void setDefinition(APIObject value) {
        this.definition = value;
    }

    /**
     * Gets the value of the automation property.
     * 
     * @return
     *     possible object is
     *     {@link Automation }
     *     
     */
    public Automation getAutomation() {
        return automation;
    }

    /**
     * Sets the value of the automation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Automation }
     *     
     */
    public void setAutomation(Automation value) {
        this.automation = value;
    }

    /**
     * Gets the value of the automationTask property.
     * 
     * @return
     *     possible object is
     *     {@link AutomationTask }
     *     
     */
    public AutomationTask getAutomationTask() {
        return automationTask;
    }

    /**
     * Sets the value of the automationTask property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomationTask }
     *     
     */
    public void setAutomationTask(AutomationTask value) {
        this.automationTask = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequence(Integer value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the activityObject property.
     * 
     * @return
     *     possible object is
     *     {@link APIObject }
     *     
     */
    public APIObject getActivityObject() {
        return activityObject;
    }

    /**
     * Sets the value of the activityObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link APIObject }
     *     
     */
    public void setActivityObject(APIObject value) {
        this.activityObject = value;
    }

    /**
     * Gets the value of the serializedObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerializedObject() {
        return serializedObject;
    }

    /**
     * Sets the value of the serializedObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerializedObject(String value) {
        this.serializedObject = value;
    }

}
