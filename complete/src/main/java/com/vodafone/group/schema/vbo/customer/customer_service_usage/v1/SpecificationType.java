
package com.vodafone.group.schema.vbo.customer.customer_service_usage.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.vodafone.group.schema.common.v1.BaseComponentType;


/**
 * <p>Java class for SpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://group.vodafone.com/schema/common/v1}BaseComponentType">
 *       &lt;sequence>
 *         &lt;element name="Characteristics" type="{http://group.vodafone.com/schema/vbo/customer/customer-service-usage/v1}CharacteristicsListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificationType", propOrder = {
    "characteristics"
})
@XmlSeeAlso({
    UsageSpecificationType.class
})
public class SpecificationType
    extends BaseComponentType
{

    @XmlElement(name = "Characteristics")
    protected CharacteristicsListType characteristics;

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

}
