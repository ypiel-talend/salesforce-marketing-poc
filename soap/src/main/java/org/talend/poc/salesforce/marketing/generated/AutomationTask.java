
package org.talend.poc.salesforce.marketing.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AutomationTask complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutomationTask"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutomationTaskType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Automation" type="{http://exacttarget.com/wsdl/partnerAPI}Automation" minOccurs="0"/&gt;
 *         &lt;element name="Sequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Activities" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Activity" type="{http://exacttarget.com/wsdl/partnerAPI}AutomationActivity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AutomationTask", propOrder = {
    "automationTaskType",
    "name",
    "description",
    "automation",
    "sequence",
    "activities"
})
@XmlSeeAlso({
    AutomationTaskInstance.class
})
public class AutomationTask
    extends APIObject
{

    @XmlElement(name = "AutomationTaskType")
    protected String automationTaskType;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Automation")
    protected Automation automation;
    @XmlElement(name = "Sequence")
    protected Integer sequence;
    @XmlElement(name = "Activities")
    protected AutomationTask.Activities activities;

    /**
     * Gets the value of the automationTaskType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomationTaskType() {
        return automationTaskType;
    }

    /**
     * Sets the value of the automationTaskType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomationTaskType(String value) {
        this.automationTaskType = value;
    }

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
     * Gets the value of the activities property.
     * 
     * @return
     *     possible object is
     *     {@link AutomationTask.Activities }
     *     
     */
    public AutomationTask.Activities getActivities() {
        return activities;
    }

    /**
     * Sets the value of the activities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutomationTask.Activities }
     *     
     */
    public void setActivities(AutomationTask.Activities value) {
        this.activities = value;
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
     *         &lt;element name="Activity" type="{http://exacttarget.com/wsdl/partnerAPI}AutomationActivity" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "activity"
    })
    public static class Activities {

        @XmlElement(name = "Activity")
        protected List<AutomationActivity> activity;

        /**
         * Gets the value of the activity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the activity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActivity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AutomationActivity }
         * 
         * 
         */
        public List<AutomationActivity> getActivity() {
            if (activity == null) {
                activity = new ArrayList<AutomationActivity>();
            }
            return this.activity;
        }

    }

}
