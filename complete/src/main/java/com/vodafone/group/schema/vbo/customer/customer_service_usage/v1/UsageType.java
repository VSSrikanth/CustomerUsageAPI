
package com.vodafone.group.schema.vbo.customer.customer_service_usage.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.vodafone.group.schema.common.v1.TimePeriodType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.AmountType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.CodeType;
import un.unece.uncefact.documentation.standard.corecomponenttype._2.QuantityType;


/**
 * <p>Java class for UsageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" minOccurs="0"/>
 *         &lt;element name="Categories" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Category" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Amount" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}AmountType" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}QuantityType" minOccurs="0"/>
 *         &lt;element name="TimePeriod" type="{http://group.vodafone.com/schema/common/v1}TimePeriodType" minOccurs="0"/>
 *         &lt;element name="Characteristics" type="{http://group.vodafone.com/schema/vbo/customer/customer-service-usage/v1}CharacteristicsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageType", propOrder = {
    "type",
    "categories",
    "amount",
    "quantity",
    "timePeriod",
    "characteristics"
})
public class UsageType {

    @XmlElement(name = "Type")
    protected CodeType type;
    @XmlElement(name = "Categories")
    protected UsageType.Categories categories;
    @XmlElement(name = "Amount")
    protected AmountType amount;
    @XmlElement(name = "Quantity")
    protected QuantityType quantity;
    @XmlElement(name = "TimePeriod")
    protected TimePeriodType timePeriod;
    @XmlElement(name = "Characteristics")
    protected CharacteristicsListType characteristics;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setType(CodeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the categories property.
     * 
     * @return
     *     possible object is
     *     {@link UsageType.Categories }
     *     
     */
    public UsageType.Categories getCategories() {
        return categories;
    }

    /**
     * Sets the value of the categories property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageType.Categories }
     *     
     */
    public void setCategories(UsageType.Categories value) {
        this.categories = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setQuantity(QuantityType value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the timePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TimePeriodType }
     *     
     */
    public TimePeriodType getTimePeriod() {
        return timePeriod;
    }

    /**
     * Sets the value of the timePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimePeriodType }
     *     
     */
    public void setTimePeriod(TimePeriodType value) {
        this.timePeriod = value;
    }

    /**
     * Gets the value of the characteristics property.
     * 
     * @return
     *     possible object is
     *     {@link CharacteristicsListType }
     *     
     */
    public CharacteristicsListType getCharacteristics() {
        return characteristics;
    }

    /**
     * Sets the value of the characteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacteristicsListType }
     *     
     */
    public void setCharacteristics(CharacteristicsListType value) {
        this.characteristics = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Category" type="{urn:un:unece:uncefact:documentation:standard:CoreComponentType:2}CodeType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "category"
    })
    public static class Categories {

        @XmlElement(name = "Category", required = true)
        protected List<CodeType> category;

        /**
         * Gets the value of the category property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the category property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CodeType }
         * 
         * 
         */
        public List<CodeType> getCategory() {
            if (category == null) {
                category = new ArrayList<CodeType>();
            }
            return this.category;
        }

    }

}
