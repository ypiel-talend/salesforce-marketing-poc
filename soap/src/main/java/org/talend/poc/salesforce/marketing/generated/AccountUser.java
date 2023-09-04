
package org.talend.poc.salesforce.marketing.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AccountUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://exacttarget.com/wsdl/partnerAPI}APIObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountUserID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="UserID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MustChangePassword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ActiveFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ChallengePhrase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChallengeAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UserPermissions" type="{http://exacttarget.com/wsdl/partnerAPI}UserAccess" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Delete" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="LastSuccessfulLogin" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IsAPIUser" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="NotificationEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsLocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Unlock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="BusinessUnit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DefaultBusinessUnit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="DefaultApplication" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Locale" type="{http://exacttarget.com/wsdl/partnerAPI}Locale" minOccurs="0"/&gt;
 *         &lt;element name="TimeZone" type="{http://exacttarget.com/wsdl/partnerAPI}TimeZone" minOccurs="0"/&gt;
 *         &lt;element name="DefaultBusinessUnitObject" type="{http://exacttarget.com/wsdl/partnerAPI}BusinessUnit" minOccurs="0"/&gt;
 *         &lt;element name="AssociatedBusinessUnits" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BusinessUnit" type="{http://exacttarget.com/wsdl/partnerAPI}BusinessUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Roles" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Role" type="{http://exacttarget.com/wsdl/partnerAPI}Role" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LanguageLocale" type="{http://exacttarget.com/wsdl/partnerAPI}Locale" minOccurs="0"/&gt;
 *         &lt;element name="SsoIdentities" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SsoIdentity" type="{http://exacttarget.com/wsdl/partnerAPI}SsoIdentity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IsSendable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountUser", propOrder = {
    "accountUserID",
    "userID",
    "password",
    "name",
    "email",
    "mustChangePassword",
    "activeFlag",
    "challengePhrase",
    "challengeAnswer",
    "userPermissions",
    "delete",
    "lastSuccessfulLogin",
    "isAPIUser",
    "notificationEmailAddress",
    "isLocked",
    "unlock",
    "businessUnit",
    "defaultBusinessUnit",
    "defaultApplication",
    "locale",
    "timeZone",
    "defaultBusinessUnitObject",
    "associatedBusinessUnits",
    "roles",
    "languageLocale",
    "ssoIdentities",
    "isSendable"
})
public class AccountUser
    extends APIObject
{

    @XmlElementRef(name = "AccountUserID", namespace = "http://exacttarget.com/wsdl/partnerAPI", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> accountUserID;
    @XmlElement(name = "UserID", required = true)
    protected String userID;
    @XmlElement(name = "Password")
    protected String password;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Email", required = true)
    protected String email;
    @XmlElement(name = "MustChangePassword")
    protected Boolean mustChangePassword;
    @XmlElement(name = "ActiveFlag")
    protected Boolean activeFlag;
    @XmlElement(name = "ChallengePhrase")
    protected String challengePhrase;
    @XmlElement(name = "ChallengeAnswer")
    protected String challengeAnswer;
    @XmlElement(name = "UserPermissions", nillable = true)
    protected List<UserAccess> userPermissions;
    @XmlElement(name = "Delete", defaultValue = "0")
    protected int delete;
    @XmlElement(name = "LastSuccessfulLogin")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastSuccessfulLogin;
    @XmlElement(name = "IsAPIUser")
    protected Boolean isAPIUser;
    @XmlElement(name = "NotificationEmailAddress")
    protected String notificationEmailAddress;
    @XmlElement(name = "IsLocked")
    protected Boolean isLocked;
    @XmlElement(name = "Unlock")
    protected Boolean unlock;
    @XmlElement(name = "BusinessUnit")
    protected Integer businessUnit;
    @XmlElement(name = "DefaultBusinessUnit")
    protected Integer defaultBusinessUnit;
    @XmlElement(name = "DefaultApplication")
    protected String defaultApplication;
    @XmlElement(name = "Locale")
    protected Locale locale;
    @XmlElement(name = "TimeZone")
    protected TimeZone timeZone;
    @XmlElement(name = "DefaultBusinessUnitObject")
    protected BusinessUnit defaultBusinessUnitObject;
    @XmlElement(name = "AssociatedBusinessUnits")
    protected AccountUser.AssociatedBusinessUnits associatedBusinessUnits;
    @XmlElement(name = "Roles")
    protected AccountUser.Roles roles;
    @XmlElement(name = "LanguageLocale")
    protected Locale languageLocale;
    @XmlElement(name = "SsoIdentities")
    protected AccountUser.SsoIdentities ssoIdentities;
    @XmlElement(name = "IsSendable")
    protected Boolean isSendable;

    /**
     * Gets the value of the accountUserID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getAccountUserID() {
        return accountUserID;
    }

    /**
     * Sets the value of the accountUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setAccountUserID(JAXBElement<Integer> value) {
        this.accountUserID = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserID() {
        return userID;
    }

    /**
     * Sets the value of the userID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserID(String value) {
        this.userID = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the mustChangePassword property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMustChangePassword() {
        return mustChangePassword;
    }

    /**
     * Sets the value of the mustChangePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMustChangePassword(Boolean value) {
        this.mustChangePassword = value;
    }

    /**
     * Gets the value of the activeFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveFlag() {
        return activeFlag;
    }

    /**
     * Sets the value of the activeFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveFlag(Boolean value) {
        this.activeFlag = value;
    }

    /**
     * Gets the value of the challengePhrase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengePhrase() {
        return challengePhrase;
    }

    /**
     * Sets the value of the challengePhrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengePhrase(String value) {
        this.challengePhrase = value;
    }

    /**
     * Gets the value of the challengeAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengeAnswer() {
        return challengeAnswer;
    }

    /**
     * Sets the value of the challengeAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengeAnswer(String value) {
        this.challengeAnswer = value;
    }

    /**
     * Gets the value of the userPermissions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userPermissions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserPermissions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserAccess }
     * 
     * 
     */
    public List<UserAccess> getUserPermissions() {
        if (userPermissions == null) {
            userPermissions = new ArrayList<UserAccess>();
        }
        return this.userPermissions;
    }

    /**
     * Gets the value of the delete property.
     * 
     */
    public int getDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     */
    public void setDelete(int value) {
        this.delete = value;
    }

    /**
     * Gets the value of the lastSuccessfulLogin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastSuccessfulLogin() {
        return lastSuccessfulLogin;
    }

    /**
     * Sets the value of the lastSuccessfulLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastSuccessfulLogin(XMLGregorianCalendar value) {
        this.lastSuccessfulLogin = value;
    }

    /**
     * Gets the value of the isAPIUser property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAPIUser() {
        return isAPIUser;
    }

    /**
     * Sets the value of the isAPIUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAPIUser(Boolean value) {
        this.isAPIUser = value;
    }

    /**
     * Gets the value of the notificationEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationEmailAddress() {
        return notificationEmailAddress;
    }

    /**
     * Sets the value of the notificationEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationEmailAddress(String value) {
        this.notificationEmailAddress = value;
    }

    /**
     * Gets the value of the isLocked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLocked() {
        return isLocked;
    }

    /**
     * Sets the value of the isLocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLocked(Boolean value) {
        this.isLocked = value;
    }

    /**
     * Gets the value of the unlock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnlock() {
        return unlock;
    }

    /**
     * Sets the value of the unlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnlock(Boolean value) {
        this.unlock = value;
    }

    /**
     * Gets the value of the businessUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBusinessUnit() {
        return businessUnit;
    }

    /**
     * Sets the value of the businessUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBusinessUnit(Integer value) {
        this.businessUnit = value;
    }

    /**
     * Gets the value of the defaultBusinessUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDefaultBusinessUnit() {
        return defaultBusinessUnit;
    }

    /**
     * Sets the value of the defaultBusinessUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefaultBusinessUnit(Integer value) {
        this.defaultBusinessUnit = value;
    }

    /**
     * Gets the value of the defaultApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultApplication() {
        return defaultApplication;
    }

    /**
     * Sets the value of the defaultApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultApplication(String value) {
        this.defaultApplication = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link Locale }
     *     
     */
    public Locale getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Locale }
     *     
     */
    public void setLocale(Locale value) {
        this.locale = value;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link TimeZone }
     *     
     */
    public TimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeZone }
     *     
     */
    public void setTimeZone(TimeZone value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the defaultBusinessUnitObject property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessUnit }
     *     
     */
    public BusinessUnit getDefaultBusinessUnitObject() {
        return defaultBusinessUnitObject;
    }

    /**
     * Sets the value of the defaultBusinessUnitObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessUnit }
     *     
     */
    public void setDefaultBusinessUnitObject(BusinessUnit value) {
        this.defaultBusinessUnitObject = value;
    }

    /**
     * Gets the value of the associatedBusinessUnits property.
     * 
     * @return
     *     possible object is
     *     {@link AccountUser.AssociatedBusinessUnits }
     *     
     */
    public AccountUser.AssociatedBusinessUnits getAssociatedBusinessUnits() {
        return associatedBusinessUnits;
    }

    /**
     * Sets the value of the associatedBusinessUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountUser.AssociatedBusinessUnits }
     *     
     */
    public void setAssociatedBusinessUnits(AccountUser.AssociatedBusinessUnits value) {
        this.associatedBusinessUnits = value;
    }

    /**
     * Gets the value of the roles property.
     * 
     * @return
     *     possible object is
     *     {@link AccountUser.Roles }
     *     
     */
    public AccountUser.Roles getRoles() {
        return roles;
    }

    /**
     * Sets the value of the roles property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountUser.Roles }
     *     
     */
    public void setRoles(AccountUser.Roles value) {
        this.roles = value;
    }

    /**
     * Gets the value of the languageLocale property.
     * 
     * @return
     *     possible object is
     *     {@link Locale }
     *     
     */
    public Locale getLanguageLocale() {
        return languageLocale;
    }

    /**
     * Sets the value of the languageLocale property.
     * 
     * @param value
     *     allowed object is
     *     {@link Locale }
     *     
     */
    public void setLanguageLocale(Locale value) {
        this.languageLocale = value;
    }

    /**
     * Gets the value of the ssoIdentities property.
     * 
     * @return
     *     possible object is
     *     {@link AccountUser.SsoIdentities }
     *     
     */
    public AccountUser.SsoIdentities getSsoIdentities() {
        return ssoIdentities;
    }

    /**
     * Sets the value of the ssoIdentities property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountUser.SsoIdentities }
     *     
     */
    public void setSsoIdentities(AccountUser.SsoIdentities value) {
        this.ssoIdentities = value;
    }

    /**
     * Gets the value of the isSendable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSendable() {
        return isSendable;
    }

    /**
     * Sets the value of the isSendable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSendable(Boolean value) {
        this.isSendable = value;
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
     *         &lt;element name="BusinessUnit" type="{http://exacttarget.com/wsdl/partnerAPI}BusinessUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "businessUnit"
    })
    public static class AssociatedBusinessUnits {

        @XmlElement(name = "BusinessUnit")
        protected List<BusinessUnit> businessUnit;

        /**
         * Gets the value of the businessUnit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the businessUnit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBusinessUnit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BusinessUnit }
         * 
         * 
         */
        public List<BusinessUnit> getBusinessUnit() {
            if (businessUnit == null) {
                businessUnit = new ArrayList<BusinessUnit>();
            }
            return this.businessUnit;
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
     *         &lt;element name="Role" type="{http://exacttarget.com/wsdl/partnerAPI}Role" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "role"
    })
    public static class Roles {

        @XmlElement(name = "Role")
        protected List<Role> role;

        /**
         * Gets the value of the role property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the role property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRole().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Role }
         * 
         * 
         */
        public List<Role> getRole() {
            if (role == null) {
                role = new ArrayList<Role>();
            }
            return this.role;
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
     *         &lt;element name="SsoIdentity" type="{http://exacttarget.com/wsdl/partnerAPI}SsoIdentity" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "ssoIdentity"
    })
    public static class SsoIdentities {

        @XmlElement(name = "SsoIdentity")
        protected List<SsoIdentity> ssoIdentity;

        /**
         * Gets the value of the ssoIdentity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ssoIdentity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSsoIdentity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SsoIdentity }
         * 
         * 
         */
        public List<SsoIdentity> getSsoIdentity() {
            if (ssoIdentity == null) {
                ssoIdentity = new ArrayList<SsoIdentity>();
            }
            return this.ssoIdentity;
        }

    }

}
