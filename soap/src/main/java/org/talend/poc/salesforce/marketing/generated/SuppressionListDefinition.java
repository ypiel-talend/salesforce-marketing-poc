
package org.talend.poc.salesforce.marketing.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SuppressionListDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuppressionListDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contexts" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Context" type="{http://exacttarget.com/wsdl/partnerAPI}SuppressionListContext" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Fields" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Field" type="{http://exacttarget.com/wsdl/partnerAPI}DataExtensionField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SubscriberCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="NotifyEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuppressionListDefinition", propOrder = {
    "name",
    "category",
    "description",
    "contexts",
    "fields",
    "subscriberCount",
    "notifyEmail"
})
public class SuppressionListDefinition
    extends APIObject
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Category")
    protected Long category;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Contexts")
    protected SuppressionListDefinition.Contexts contexts;
    @XmlElement(name = "Fields")
    protected SuppressionListDefinition.Fields fields;
    @XmlElement(name = "SubscriberCount")
    protected Long subscriberCount;
    @XmlElement(name = "NotifyEmail")
    protected String notifyEmail;

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
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCategory(Long value) {
        this.category = value;
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
     * Gets the value of the contexts property.
     * 
     * @return
     *     possible object is
     *     {@link SuppressionListDefinition.Contexts }
     *     
     */
    public SuppressionListDefinition.Contexts getContexts() {
        return contexts;
    }

    /**
     * Sets the value of the contexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuppressionListDefinition.Contexts }
     *     
     */
    public void setContexts(SuppressionListDefinition.Contexts value) {
        this.contexts = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link SuppressionListDefinition.Fields }
     *     
     */
    public SuppressionListDefinition.Fields getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link SuppressionListDefinition.Fields }
     *     
     */
    public void setFields(SuppressionListDefinition.Fields value) {
        this.fields = value;
    }

    /**
     * Gets the value of the subscriberCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubscriberCount() {
        return subscriberCount;
    }

    /**
     * Sets the value of the subscriberCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubscriberCount(Long value) {
        this.subscriberCount = value;
    }

    /**
     * Gets the value of the notifyEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotifyEmail() {
        return notifyEmail;
    }

    /**
     * Sets the value of the notifyEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotifyEmail(String value) {
        this.notifyEmail = value;
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
     *         &lt;element name="Context" type="{http://exacttarget.com/wsdl/partnerAPI}SuppressionListContext" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "context"
    })
    public static class Contexts {

        @XmlElement(name = "Context")
        protected List<SuppressionListContext> context;

        /**
         * Gets the value of the context property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the context property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContext().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SuppressionListContext }
         * 
         * 
         */
        public List<SuppressionListContext> getContext() {
            if (context == null) {
                context = new ArrayList<SuppressionListContext>();
            }
            return this.context;
        }

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
     *         &lt;element name="Field" type="{http://exacttarget.com/wsdl/partnerAPI}DataExtensionField" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "field"
    })
    public static class Fields {

        @XmlElement(name = "Field")
        protected List<DataExtensionField> field;

        /**
         * Gets the value of the field property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the field property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getField().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DataExtensionField }
         * 
         * 
         */
        public List<DataExtensionField> getField() {
            if (field == null) {
                field = new ArrayList<DataExtensionField>();
            }
            return this.field;
        }

    }

}
