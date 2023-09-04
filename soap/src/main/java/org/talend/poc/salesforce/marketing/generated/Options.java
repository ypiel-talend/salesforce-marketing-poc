
package org.talend.poc.salesforce.marketing.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Options complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Options"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Client" type="{http://exacttarget.com/wsdl/partnerAPI}ClientID" minOccurs="0"/&gt;
 *         &lt;element name="SendResponseTo" type="{http://exacttarget.com/wsdl/partnerAPI}AsyncResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SaveOptions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SaveOption" type="{http://exacttarget.com/wsdl/partnerAPI}SaveOption" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Priority" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/&gt;
 *         &lt;element name="ConversationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SequenceCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="CallsInConversation" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RequestType" type="{http://exacttarget.com/wsdl/partnerAPI}RequestType" minOccurs="0"/&gt;
 *         &lt;element name="QueuePriority" type="{http://exacttarget.com/wsdl/partnerAPI}Priority" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Options", propOrder = {
    "client",
    "sendResponseTo",
    "saveOptions",
    "priority",
    "conversationID",
    "sequenceCode",
    "callsInConversation",
    "scheduledTime",
    "requestType",
    "queuePriority"
})
@XmlSeeAlso({
    CreateOptions.class,
    UpdateOptions.class,
    DeleteOptions.class,
    ConfigureOptions.class,
    ScheduleOptions.class,
    SystemStatusOptions.class,
    RetrieveSingleOptions.class,
    RetrieveOptions.class,
    PerformOptions.class,
    ExtractOptions.class
})
public abstract class Options {

    @XmlElement(name = "Client")
    protected ClientID client;
    @XmlElement(name = "SendResponseTo")
    protected List<AsyncResponse> sendResponseTo;
    @XmlElement(name = "SaveOptions")
    protected Options.SaveOptions saveOptions;
    @XmlElement(name = "Priority")
    protected Byte priority;
    @XmlElement(name = "ConversationID")
    protected String conversationID;
    @XmlElement(name = "SequenceCode")
    protected Integer sequenceCode;
    @XmlElement(name = "CallsInConversation")
    protected Integer callsInConversation;
    @XmlElement(name = "ScheduledTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar scheduledTime;
    @XmlElement(name = "RequestType")
    @XmlSchemaType(name = "string")
    protected RequestType requestType;
    @XmlElement(name = "QueuePriority")
    @XmlSchemaType(name = "string")
    protected Priority queuePriority;

    /**
     * Gets the value of the client property.
     * 
     * @return
     *     possible object is
     *     {@link ClientID }
     *     
     */
    public ClientID getClient() {
        return client;
    }

    /**
     * Sets the value of the client property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientID }
     *     
     */
    public void setClient(ClientID value) {
        this.client = value;
    }

    /**
     * Gets the value of the sendResponseTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sendResponseTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSendResponseTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AsyncResponse }
     * 
     * 
     */
    public List<AsyncResponse> getSendResponseTo() {
        if (sendResponseTo == null) {
            sendResponseTo = new ArrayList<AsyncResponse>();
        }
        return this.sendResponseTo;
    }

    /**
     * Gets the value of the saveOptions property.
     * 
     * @return
     *     possible object is
     *     {@link Options.SaveOptions }
     *     
     */
    public Options.SaveOptions getSaveOptions() {
        return saveOptions;
    }

    /**
     * Sets the value of the saveOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Options.SaveOptions }
     *     
     */
    public void setSaveOptions(Options.SaveOptions value) {
        this.saveOptions = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setPriority(Byte value) {
        this.priority = value;
    }

    /**
     * Gets the value of the conversationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversationID() {
        return conversationID;
    }

    /**
     * Sets the value of the conversationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversationID(String value) {
        this.conversationID = value;
    }

    /**
     * Gets the value of the sequenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceCode() {
        return sequenceCode;
    }

    /**
     * Sets the value of the sequenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceCode(Integer value) {
        this.sequenceCode = value;
    }

    /**
     * Gets the value of the callsInConversation property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCallsInConversation() {
        return callsInConversation;
    }

    /**
     * Sets the value of the callsInConversation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCallsInConversation(Integer value) {
        this.callsInConversation = value;
    }

    /**
     * Gets the value of the scheduledTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledTime() {
        return scheduledTime;
    }

    /**
     * Sets the value of the scheduledTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledTime(XMLGregorianCalendar value) {
        this.scheduledTime = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequestType(RequestType value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the queuePriority property.
     * 
     * @return
     *     possible object is
     *     {@link Priority }
     *     
     */
    public Priority getQueuePriority() {
        return queuePriority;
    }

    /**
     * Sets the value of the queuePriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority }
     *     
     */
    public void setQueuePriority(Priority value) {
        this.queuePriority = value;
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
     *         &lt;element name="SaveOption" type="{http://exacttarget.com/wsdl/partnerAPI}SaveOption" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "saveOption"
    })
    public static class SaveOptions {

        @XmlElement(name = "SaveOption")
        protected List<SaveOption> saveOption;

        /**
         * Gets the value of the saveOption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the saveOption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSaveOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SaveOption }
         * 
         * 
         */
        public List<SaveOption> getSaveOption() {
            if (saveOption == null) {
                saveOption = new ArrayList<SaveOption>();
            }
            return this.saveOption;
        }

    }

}
