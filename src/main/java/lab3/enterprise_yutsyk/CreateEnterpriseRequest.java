//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.23 at 12:31:28 AM EEST 
//


package lab3.enterprise_yutsyk;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="enterpise" type="{http://enterprise-yutsyk.lab3}enterprise"/>
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
    "enterpise"
})
@XmlRootElement(name = "createEnterpriseRequest")
public class CreateEnterpriseRequest {

    @XmlElement(required = true)
    protected Enterprise enterpise;

    /**
     * Gets the value of the enterpise property.
     * 
     * @return
     *     possible object is
     *     {@link Enterprise }
     *     
     */
    public Enterprise getEnterpise() {
        return enterpise;
    }

    /**
     * Sets the value of the enterpise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Enterprise }
     *     
     */
    public void setEnterpise(Enterprise value) {
        this.enterpise = value;
    }

}
