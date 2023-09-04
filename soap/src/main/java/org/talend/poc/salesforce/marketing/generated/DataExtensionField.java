
package org.talend.poc.salesforce.marketing.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataExtensionField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataExtensionField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}PropertyDefinition"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ordinal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsPrimaryKey" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="FieldType" type="{http://exacttarget.com/wsdl/partnerAPI}DataExtensionFieldType" minOccurs="0"/&gt;
 *         &lt;element name="DataExtension" type="{http://exacttarget.com/wsdl/partnerAPI}DataExtension" minOccurs="0"/&gt;
 *         &lt;element name="StorageType" type="{http://exacttarget.com/wsdl/partnerAPI}DataExtensionFieldStorageType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataExtensionField", propOrder = {
    "ordinal",
    "isPrimaryKey",
    "fieldType",
    "dataExtension",
    "storageType"
})
public class DataExtensionField
    extends PropertyDefinition
{

    @XmlElement(name = "Ordinal")
    protected Integer ordinal;
    @XmlElement(name = "IsPrimaryKey")
    protected Boolean isPrimaryKey;
    @XmlElement(name = "FieldType")
    @XmlSchemaType(name = "string")
    protected DataExtensionFieldType fieldType;
    @XmlElement(name = "DataExtension")
    protected DataExtension dataExtension;
    @XmlElement(name = "StorageType")
    @XmlSchemaType(name = "string")
    protected DataExtensionFieldStorageType storageType;

    /**
     * Gets the value of the ordinal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrdinal() {
        return ordinal;
    }

    /**
     * Sets the value of the ordinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrdinal(Integer value) {
        this.ordinal = value;
    }

    /**
     * Gets the value of the isPrimaryKey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrimaryKey() {
        return isPrimaryKey;
    }

    /**
     * Sets the value of the isPrimaryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimaryKey(Boolean value) {
        this.isPrimaryKey = value;
    }

    /**
     * Gets the value of the fieldType property.
     * 
     * @return
     *     possible object is
     *     {@link DataExtensionFieldType }
     *     
     */
    public DataExtensionFieldType getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataExtensionFieldType }
     *     
     */
    public void setFieldType(DataExtensionFieldType value) {
        this.fieldType = value;
    }

    /**
     * Gets the value of the dataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link DataExtension }
     *     
     */
    public DataExtension getDataExtension() {
        return dataExtension;
    }

    /**
     * Sets the value of the dataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataExtension }
     *     
     */
    public void setDataExtension(DataExtension value) {
        this.dataExtension = value;
    }

    /**
     * Gets the value of the storageType property.
     * 
     * @return
     *     possible object is
     *     {@link DataExtensionFieldStorageType }
     *     
     */
    public DataExtensionFieldStorageType getStorageType() {
        return storageType;
    }

    /**
     * Sets the value of the storageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataExtensionFieldStorageType }
     *     
     */
    public void setStorageType(DataExtensionFieldStorageType value) {
        this.storageType = value;
    }

}
