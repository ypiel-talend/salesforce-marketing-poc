
package org.talend.poc.salesforce.marketing.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetrieveRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrieveRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ClientIDs" type="{http://exacttarget.com/wsdl/partnerAPI}ClientID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Properties" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Filter" type="{http://exacttarget.com/wsdl/partnerAPI}FilterPart" minOccurs="0"/&gt;
 *         &lt;element name="RespondTo" type="{http://exacttarget.com/wsdl/partnerAPI}AsyncResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PartnerProperties" type="{http://exacttarget.com/wsdl/partnerAPI}APIProperty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ContinueRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QueryAllAccounts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RetrieveAllSinceLastBatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RepeatLastResult" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Retrieves" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Request" type="{http://exacttarget.com/wsdl/partnerAPI}Request" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Options" type="{http://exacttarget.com/wsdl/partnerAPI}RetrieveOptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrieveRequest", propOrder = {
    "clientIDs",
    "objectType",
    "properties",
    "filter",
    "respondTo",
    "partnerProperties",
    "continueRequest",
    "queryAllAccounts",
    "retrieveAllSinceLastBatch",
    "repeatLastResult",
    "retrieves",
    "options"
})
public class RetrieveRequest {

    @XmlElement(name = "ClientIDs")
    protected List<ClientID> clientIDs;
    @XmlElement(name = "ObjectType", required = true)
    protected String objectType;
    @XmlElement(name = "Properties")
    protected List<String> properties;
    @XmlElement(name = "Filter")
    protected FilterPart filter;
    @XmlElement(name = "RespondTo")
    protected List<AsyncResponse> respondTo;
    @XmlElement(name = "PartnerProperties")
    protected List<APIProperty> partnerProperties;
    @XmlElement(name = "ContinueRequest")
    protected String continueRequest;
    @XmlElement(name = "QueryAllAccounts")
    protected Boolean queryAllAccounts;
    @XmlElement(name = "RetrieveAllSinceLastBatch")
    protected Boolean retrieveAllSinceLastBatch;
    @XmlElement(name = "RepeatLastResult")
    protected Boolean repeatLastResult;
    @XmlElement(name = "Retrieves")
    protected RetrieveRequest.Retrieves retrieves;
    @XmlElement(name = "Options")
    protected RetrieveOptions options;

    /**
     * Gets the value of the clientIDs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientIDs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientIDs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientID }
     * 
     * 
     */
    public List<ClientID> getClientIDs() {
        if (clientIDs == null) {
            clientIDs = new ArrayList<ClientID>();
        }
        return this.clientIDs;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the properties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProperties() {
        if (properties == null) {
            properties = new ArrayList<String>();
        }
        return this.properties;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link FilterPart }
     *     
     */
    public FilterPart getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterPart }
     *     
     */
    public void setFilter(FilterPart value) {
        this.filter = value;
    }

    /**
     * Gets the value of the respondTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the respondTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespondTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AsyncResponse }
     * 
     * 
     */
    public List<AsyncResponse> getRespondTo() {
        if (respondTo == null) {
            respondTo = new ArrayList<AsyncResponse>();
        }
        return this.respondTo;
    }

    /**
     * Gets the value of the partnerProperties property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerProperties property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerProperties().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APIProperty }
     * 
     * 
     */
    public List<APIProperty> getPartnerProperties() {
        if (partnerProperties == null) {
            partnerProperties = new ArrayList<APIProperty>();
        }
        return this.partnerProperties;
    }

    /**
     * Gets the value of the continueRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContinueRequest() {
        return continueRequest;
    }

    /**
     * Sets the value of the continueRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContinueRequest(String value) {
        this.continueRequest = value;
    }

    /**
     * Gets the value of the queryAllAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isQueryAllAccounts() {
        return queryAllAccounts;
    }

    /**
     * Sets the value of the queryAllAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setQueryAllAccounts(Boolean value) {
        this.queryAllAccounts = value;
    }

    /**
     * Gets the value of the retrieveAllSinceLastBatch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetrieveAllSinceLastBatch() {
        return retrieveAllSinceLastBatch;
    }

    /**
     * Sets the value of the retrieveAllSinceLastBatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetrieveAllSinceLastBatch(Boolean value) {
        this.retrieveAllSinceLastBatch = value;
    }

    /**
     * Gets the value of the repeatLastResult property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRepeatLastResult() {
        return repeatLastResult;
    }

    /**
     * Sets the value of the repeatLastResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepeatLastResult(Boolean value) {
        this.repeatLastResult = value;
    }

    /**
     * Gets the value of the retrieves property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveRequest.Retrieves }
     *     
     */
    public RetrieveRequest.Retrieves getRetrieves() {
        return retrieves;
    }

    /**
     * Sets the value of the retrieves property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveRequest.Retrieves }
     *     
     */
    public void setRetrieves(RetrieveRequest.Retrieves value) {
        this.retrieves = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link RetrieveOptions }
     *     
     */
    public RetrieveOptions getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetrieveOptions }
     *     
     */
    public void setOptions(RetrieveOptions value) {
        this.options = value;
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
     *         &lt;element name="Request" type="{http://exacttarget.com/wsdl/partnerAPI}Request" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "request"
    })
    public static class Retrieves {

        @XmlElement(name = "Request")
        protected List<Request> request;

        /**
         * Gets the value of the request property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the request property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRequest().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Request }
         * 
         * 
         */
        public List<Request> getRequest() {
            if (request == null) {
                request = new ArrayList<Request>();
            }
            return this.request;
        }

    }

}
