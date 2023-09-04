
package org.talend.poc.salesforce.marketing.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Role complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Role"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsPrivate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSystemDefined" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ForceInheritance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PermissionSets" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PermissionSet" type="{http://exacttarget.com/wsdl/partnerAPI}PermissionSet" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Permissions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Permission" type="{http://exacttarget.com/wsdl/partnerAPI}Permission" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "Role", propOrder = {
    "name",
    "description",
    "isPrivate",
    "isSystemDefined",
    "forceInheritance",
    "permissionSets",
    "permissions"
})
public class Role
    extends APIObject
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "IsPrivate")
    protected Boolean isPrivate;
    @XmlElement(name = "IsSystemDefined")
    protected Boolean isSystemDefined;
    @XmlElement(name = "ForceInheritance")
    protected Boolean forceInheritance;
    @XmlElement(name = "PermissionSets")
    protected Role.PermissionSets permissionSets;
    @XmlElement(name = "Permissions")
    protected Role.Permissions permissions;

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
     * Gets the value of the isPrivate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrivate() {
        return isPrivate;
    }

    /**
     * Sets the value of the isPrivate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrivate(Boolean value) {
        this.isPrivate = value;
    }

    /**
     * Gets the value of the isSystemDefined property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSystemDefined() {
        return isSystemDefined;
    }

    /**
     * Sets the value of the isSystemDefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSystemDefined(Boolean value) {
        this.isSystemDefined = value;
    }

    /**
     * Gets the value of the forceInheritance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceInheritance() {
        return forceInheritance;
    }

    /**
     * Sets the value of the forceInheritance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceInheritance(Boolean value) {
        this.forceInheritance = value;
    }

    /**
     * Gets the value of the permissionSets property.
     * 
     * @return
     *     possible object is
     *     {@link Role.PermissionSets }
     *     
     */
    public Role.PermissionSets getPermissionSets() {
        return permissionSets;
    }

    /**
     * Sets the value of the permissionSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Role.PermissionSets }
     *     
     */
    public void setPermissionSets(Role.PermissionSets value) {
        this.permissionSets = value;
    }

    /**
     * Gets the value of the permissions property.
     * 
     * @return
     *     possible object is
     *     {@link Role.Permissions }
     *     
     */
    public Role.Permissions getPermissions() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Role.Permissions }
     *     
     */
    public void setPermissions(Role.Permissions value) {
        this.permissions = value;
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
     *         &lt;element name="Permission" type="{http://exacttarget.com/wsdl/partnerAPI}Permission" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "permission"
    })
    public static class Permissions {

        @XmlElement(name = "Permission")
        protected List<Permission> permission;

        /**
         * Gets the value of the permission property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the permission property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPermission().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Permission }
         * 
         * 
         */
        public List<Permission> getPermission() {
            if (permission == null) {
                permission = new ArrayList<Permission>();
            }
            return this.permission;
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
     *         &lt;element name="PermissionSet" type="{http://exacttarget.com/wsdl/partnerAPI}PermissionSet" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "permissionSet"
    })
    public static class PermissionSets {

        @XmlElement(name = "PermissionSet")
        protected List<PermissionSet> permissionSet;

        /**
         * Gets the value of the permissionSet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the permissionSet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPermissionSet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PermissionSet }
         * 
         * 
         */
        public List<PermissionSet> getPermissionSet() {
            if (permissionSet == null) {
                permissionSet = new ArrayList<PermissionSet>();
            }
            return this.permissionSet;
        }

    }

}
