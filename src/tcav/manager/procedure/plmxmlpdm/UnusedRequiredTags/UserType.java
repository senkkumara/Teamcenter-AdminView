//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b24-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.22 at 11:41:15 AM EST 
//


package tcav.manager.procedure.plmxmlpdm.UnusedRequiredTags;

import tcav.manager.procedure.plmxmlpdm.base.OwnerBase;
import org.w3c.dom.Node;
/*
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
*/

/**
 * 
 *       A User, i.e. a user account on a computer system.
 * 
 *       Attributes:
 * 
 *       userId:        User Id.
 *       personRef:     optional reference to a Person element.
 *       
 * 
 * <p>Java class for UserType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.plmxml.org/Schemas/PLMXMLSchema}OwnerBase">
 *       &lt;attribute name="personRef" type="{http://www.plmxml.org/Schemas/PLMXMLSchema}anyURIType" />
 *       &lt;attribute name="userId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "UserType")
public class UserType extends OwnerBase {

    //@XmlAttribute
    protected String personRef;
    //@XmlAttribute(required = true)
    protected String userId;
    
    public UserType(Node node) {
        super(node);
    }

    /**
     * Gets the value of the personRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRef() {
        return personRef;
    }

    /**
     * Sets the value of the personRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRef(String value) {
        this.personRef = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

}
