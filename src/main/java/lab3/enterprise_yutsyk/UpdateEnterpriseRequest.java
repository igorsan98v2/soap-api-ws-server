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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="name">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ceo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="founder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="founded" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="type_of_activity" type="{http://enterprise-yutsyk.lab3}activity"/>
 *         &lt;element name="staff" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "name",
    "ceo",
    "founder",
    "founded",
    "typeOfActivity",
    "staff"
})
@XmlRootElement(name = "updateEnterpriseRequest")
public class UpdateEnterpriseRequest {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String ceo;
    @XmlElement(required = true)
    protected String founder;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar founded;
    @XmlElement(name = "type_of_activity", required = true)
    protected Activity typeOfActivity;
    protected int staff;

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
     * Gets the value of the ceo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCeo() {
        return ceo;
    }

    /**
     * Sets the value of the ceo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCeo(String value) {
        this.ceo = value;
    }

    /**
     * Gets the value of the founder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFounder() {
        return founder;
    }

    /**
     * Sets the value of the founder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFounder(String value) {
        this.founder = value;
    }

    /**
     * Gets the value of the founded property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFounded() {
        return founded;
    }

    /**
     * Sets the value of the founded property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFounded(XMLGregorianCalendar value) {
        this.founded = value;
    }

    /**
     * Gets the value of the typeOfActivity property.
     * 
     * @return
     *     possible object is
     *     {@link Activity }
     *     
     */
    public Activity getTypeOfActivity() {
        return typeOfActivity;
    }

    /**
     * Sets the value of the typeOfActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Activity }
     *     
     */
    public void setTypeOfActivity(Activity value) {
        this.typeOfActivity = value;
    }

    /**
     * Gets the value of the staff property.
     * 
     */
    public int getStaff() {
        return staff;
    }

    /**
     * Sets the value of the staff property.
     * 
     */
    public void setStaff(int value) {
        this.staff = value;
    }

}