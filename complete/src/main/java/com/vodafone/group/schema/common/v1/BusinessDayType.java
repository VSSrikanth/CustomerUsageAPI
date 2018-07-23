
package com.vodafone.group.schema.common.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.IndicatorType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.TextType;


/**
 * <p>Java class for BusinessDayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessDayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Day" type="{http://group.vodafone.com/schema/common/v1}DayType"/>
 *         &lt;element name="Indicator" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}IndicatorType" minOccurs="0"/>
 *         &lt;element name="BusinessHours" type="{http://group.vodafone.com/schema/common/v1}TimePeriodType"/>
 *         &lt;element name="Description" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="actionCode" type="{http://group.vodafone.com/schema/common/v1}ActionCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDayType", propOrder = {
    "day",
    "indicator",
    "businessHours",
    "description"
})
public class BusinessDayType {

    @XmlElement(name = "Day", required = true)
    protected DayType day;
    @XmlElement(name = "Indicator")
    protected IndicatorType indicator;
    @XmlElement(name = "BusinessHours", required = true)
    protected TimePeriodType businessHours;
    @XmlElement(name = "Description")
    protected TextType description;
    @XmlAttribute(name = "actionCode")
    protected ActionCodeType actionCode;

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link DayType }
     *     
     */
    public DayType getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayType }
     *     
     */
    public void setDay(DayType value) {
        this.day = value;
    }

    /**
     * Gets the value of the indicator property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorType }
     *     
     */
    public IndicatorType getIndicator() {
        return indicator;
    }

    /**
     * Sets the value of the indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorType }
     *     
     */
    public void setIndicator(IndicatorType value) {
        this.indicator = value;
    }

    /**
     * Gets the value of the businessHours property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getBusinessHours() {
        return businessHours;
    }

    /**
     * Sets the value of the businessHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setBusinessHours(TimePeriodType value) {
        this.businessHours = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setDescription(TextType value) {
        this.description = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCodeType }
     *     
     */
    public ActionCodeType getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCodeType }
     *     
     */
    public void setActionCode(ActionCodeType value) {
        this.actionCode = value;
    }

}
