
package com.vodafone.group.schema.extension.vbo.customer.customer_service_usage.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtendedLatestTransactions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedLatestTransactions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionTypeUid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StartOfCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndOfCall" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberDialled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreditBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Roaming" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Volume" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SponsorMsisdn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackageId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorisationReqRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BpartyNetwork" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TxTypeGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CellIdentity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TariffDiscountPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CounterDelta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CounterBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CounterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargeDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UomBalanceDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UomDeltaDisplay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricePlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RechargeDefinition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TxCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CounterGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChargingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CounterTypeUid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CalcBalance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CalcDifference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedLatestTransactions", propOrder = {
    "subscriberId",
    "transactionTypeUid",
    "displayName",
    "startOfCall",
    "endOfCall",
    "numberDialled",
    "callDuration",
    "value",
    "creditBalance",
    "roaming",
    "volume",
    "sponsorMsisdn",
    "serviceType",
    "packageId",
    "authorisationReqRef",
    "bpartyNetwork",
    "txTypeGroup",
    "locationAreaCode",
    "cellIdentity",
    "tariffDiscountPercentage",
    "counterDelta",
    "counterBalance",
    "counterType",
    "chargeDuration",
    "uomBalanceDisplay",
    "uomDeltaDisplay",
    "type",
    "pricePlan",
    "clazz",
    "rechargeDefinition",
    "txCategory",
    "contentDescription",
    "counterGroup",
    "parent",
    "chargingId",
    "counterTypeUid",
    "calcBalance",
    "calcDifference"
})
public class ExtendedLatestTransactions {

    @XmlElement(name = "SubscriberId")
    protected String subscriberId;
    @XmlElement(name = "TransactionTypeUid")
    protected String transactionTypeUid;
    @XmlElement(name = "DisplayName")
    protected String displayName;
    @XmlElement(name = "StartOfCall")
    protected String startOfCall;
    @XmlElement(name = "EndOfCall")
    protected String endOfCall;
    @XmlElement(name = "NumberDialled")
    protected String numberDialled;
    @XmlElement(name = "CallDuration")
    protected String callDuration;
    @XmlElement(name = "Value")
    protected String value;
    @XmlElement(name = "CreditBalance")
    protected String creditBalance;
    @XmlElement(name = "Roaming")
    protected String roaming;
    @XmlElement(name = "Volume")
    protected String volume;
    @XmlElement(name = "SponsorMsisdn")
    protected String sponsorMsisdn;
    @XmlElement(name = "ServiceType")
    protected String serviceType;
    @XmlElement(name = "PackageId")
    protected String packageId;
    @XmlElement(name = "AuthorisationReqRef")
    protected String authorisationReqRef;
    @XmlElement(name = "BpartyNetwork")
    protected String bpartyNetwork;
    @XmlElement(name = "TxTypeGroup")
    protected String txTypeGroup;
    @XmlElement(name = "LocationAreaCode")
    protected String locationAreaCode;
    @XmlElement(name = "CellIdentity")
    protected String cellIdentity;
    @XmlElement(name = "TariffDiscountPercentage")
    protected String tariffDiscountPercentage;
    @XmlElement(name = "CounterDelta")
    protected String counterDelta;
    @XmlElement(name = "CounterBalance")
    protected String counterBalance;
    @XmlElement(name = "CounterType")
    protected String counterType;
    @XmlElement(name = "ChargeDuration")
    protected String chargeDuration;
    @XmlElement(name = "UomBalanceDisplay")
    protected String uomBalanceDisplay;
    @XmlElement(name = "UomDeltaDisplay")
    protected String uomDeltaDisplay;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "PricePlan")
    protected String pricePlan;
    @XmlElement(name = "Class")
    protected String clazz;
    @XmlElement(name = "RechargeDefinition")
    protected String rechargeDefinition;
    @XmlElement(name = "TxCategory")
    protected String txCategory;
    @XmlElement(name = "ContentDescription")
    protected String contentDescription;
    @XmlElement(name = "CounterGroup")
    protected String counterGroup;
    @XmlElement(name = "Parent")
    protected String parent;
    @XmlElement(name = "ChargingId")
    protected String chargingId;
    @XmlElement(name = "CounterTypeUid")
    protected String counterTypeUid;
    @XmlElement(name = "CalcBalance")
    protected String calcBalance;
    @XmlElement(name = "CalcDifference")
    protected String calcDifference;

    /**
     * Gets the value of the subscriberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriberId() {
        return subscriberId;
    }

    /**
     * Sets the value of the subscriberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriberId(String value) {
        this.subscriberId = value;
    }

    /**
     * Gets the value of the transactionTypeUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionTypeUid() {
        return transactionTypeUid;
    }

    /**
     * Sets the value of the transactionTypeUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionTypeUid(String value) {
        this.transactionTypeUid = value;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the value of the displayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Gets the value of the startOfCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartOfCall() {
        return startOfCall;
    }

    /**
     * Sets the value of the startOfCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartOfCall(String value) {
        this.startOfCall = value;
    }

    /**
     * Gets the value of the endOfCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndOfCall() {
        return endOfCall;
    }

    /**
     * Sets the value of the endOfCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndOfCall(String value) {
        this.endOfCall = value;
    }

    /**
     * Gets the value of the numberDialled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberDialled() {
        return numberDialled;
    }

    /**
     * Sets the value of the numberDialled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberDialled(String value) {
        this.numberDialled = value;
    }

    /**
     * Gets the value of the callDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallDuration() {
        return callDuration;
    }

    /**
     * Sets the value of the callDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallDuration(String value) {
        this.callDuration = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the creditBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditBalance() {
        return creditBalance;
    }

    /**
     * Sets the value of the creditBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditBalance(String value) {
        this.creditBalance = value;
    }

    /**
     * Gets the value of the roaming property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoaming() {
        return roaming;
    }

    /**
     * Sets the value of the roaming property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoaming(String value) {
        this.roaming = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolume(String value) {
        this.volume = value;
    }

    /**
     * Gets the value of the sponsorMsisdn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorMsisdn() {
        return sponsorMsisdn;
    }

    /**
     * Sets the value of the sponsorMsisdn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorMsisdn(String value) {
        this.sponsorMsisdn = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the packageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageId() {
        return packageId;
    }

    /**
     * Sets the value of the packageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageId(String value) {
        this.packageId = value;
    }

    /**
     * Gets the value of the authorisationReqRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorisationReqRef() {
        return authorisationReqRef;
    }

    /**
     * Sets the value of the authorisationReqRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorisationReqRef(String value) {
        this.authorisationReqRef = value;
    }

    /**
     * Gets the value of the bpartyNetwork property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpartyNetwork() {
        return bpartyNetwork;
    }

    /**
     * Sets the value of the bpartyNetwork property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpartyNetwork(String value) {
        this.bpartyNetwork = value;
    }

    /**
     * Gets the value of the txTypeGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxTypeGroup() {
        return txTypeGroup;
    }

    /**
     * Sets the value of the txTypeGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxTypeGroup(String value) {
        this.txTypeGroup = value;
    }

    /**
     * Gets the value of the locationAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationAreaCode() {
        return locationAreaCode;
    }

    /**
     * Sets the value of the locationAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationAreaCode(String value) {
        this.locationAreaCode = value;
    }

    /**
     * Gets the value of the cellIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellIdentity() {
        return cellIdentity;
    }

    /**
     * Sets the value of the cellIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellIdentity(String value) {
        this.cellIdentity = value;
    }

    /**
     * Gets the value of the tariffDiscountPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffDiscountPercentage() {
        return tariffDiscountPercentage;
    }

    /**
     * Sets the value of the tariffDiscountPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffDiscountPercentage(String value) {
        this.tariffDiscountPercentage = value;
    }

    /**
     * Gets the value of the counterDelta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterDelta() {
        return counterDelta;
    }

    /**
     * Sets the value of the counterDelta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterDelta(String value) {
        this.counterDelta = value;
    }

    /**
     * Gets the value of the counterBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterBalance() {
        return counterBalance;
    }

    /**
     * Sets the value of the counterBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterBalance(String value) {
        this.counterBalance = value;
    }

    /**
     * Gets the value of the counterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterType() {
        return counterType;
    }

    /**
     * Sets the value of the counterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterType(String value) {
        this.counterType = value;
    }

    /**
     * Gets the value of the chargeDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeDuration() {
        return chargeDuration;
    }

    /**
     * Sets the value of the chargeDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeDuration(String value) {
        this.chargeDuration = value;
    }

    /**
     * Gets the value of the uomBalanceDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUomBalanceDisplay() {
        return uomBalanceDisplay;
    }

    /**
     * Sets the value of the uomBalanceDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUomBalanceDisplay(String value) {
        this.uomBalanceDisplay = value;
    }

    /**
     * Gets the value of the uomDeltaDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUomDeltaDisplay() {
        return uomDeltaDisplay;
    }

    /**
     * Sets the value of the uomDeltaDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUomDeltaDisplay(String value) {
        this.uomDeltaDisplay = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the pricePlan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricePlan() {
        return pricePlan;
    }

    /**
     * Sets the value of the pricePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricePlan(String value) {
        this.pricePlan = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the rechargeDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRechargeDefinition() {
        return rechargeDefinition;
    }

    /**
     * Sets the value of the rechargeDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRechargeDefinition(String value) {
        this.rechargeDefinition = value;
    }

    /**
     * Gets the value of the txCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxCategory() {
        return txCategory;
    }

    /**
     * Sets the value of the txCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxCategory(String value) {
        this.txCategory = value;
    }

    /**
     * Gets the value of the contentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentDescription() {
        return contentDescription;
    }

    /**
     * Sets the value of the contentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentDescription(String value) {
        this.contentDescription = value;
    }

    /**
     * Gets the value of the counterGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterGroup() {
        return counterGroup;
    }

    /**
     * Sets the value of the counterGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterGroup(String value) {
        this.counterGroup = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParent(String value) {
        this.parent = value;
    }

    /**
     * Gets the value of the chargingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargingId() {
        return chargingId;
    }

    /**
     * Sets the value of the chargingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargingId(String value) {
        this.chargingId = value;
    }

    /**
     * Gets the value of the counterTypeUid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounterTypeUid() {
        return counterTypeUid;
    }

    /**
     * Sets the value of the counterTypeUid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounterTypeUid(String value) {
        this.counterTypeUid = value;
    }

    /**
     * Gets the value of the calcBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalcBalance() {
        return calcBalance;
    }

    /**
     * Sets the value of the calcBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalcBalance(String value) {
        this.calcBalance = value;
    }

    /**
     * Gets the value of the calcDifference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalcDifference() {
        return calcDifference;
    }

    /**
     * Sets the value of the calcDifference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalcDifference(String value) {
        this.calcDifference = value;
    }

}
