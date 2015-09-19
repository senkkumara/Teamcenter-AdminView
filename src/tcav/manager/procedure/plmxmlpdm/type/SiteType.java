//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b24-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.22 at 11:41:15 AM EST 
//


package tcav.manager.procedure.plmxmlpdm.type;

import tcav.xml.TagTools;
import tcav.manager.procedure.plmxmlpdm.base.OwnerBase;
import org.w3c.dom.Node;
import org.w3c.dom.NamedNodeMap;
/*
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
*/

/**
 * 
 *       A Site in the sense of a particular software installation, database,
 *       or location.
 *       
 *       Attributes:
 *       
 *       (name:          Name of the Site, inherited from DescriptionBase)
 *       siteId:         Identifying Id of the Site
 *       addressRef:     Reference to Address element.
 *       ownerRef:       Reference to owning Organisation.
 *       
 * 
 * <p>Java class for SiteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.plmxml.org/Schemas/PLMXMLSchema}OwnerBase">
 *       &lt;attribute name="addressRef" type="{http://www.plmxml.org/Schemas/PLMXMLSchema}anyURIType" />
 *       &lt;attribute name="ownerRef" type="{http://www.plmxml.org/Schemas/PLMXMLSchema}anyURIType" />
 *       &lt;attribute name="siteId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "SiteType")
public final class SiteType extends OwnerBase
{

    //@XmlAttribute
    protected final String addressRefAttribute = "addressRef";
    protected String addressRef;
    
    //@XmlAttribute
    protected final String ownerRefAttribute = "ownerRef";
    protected String ownerRef;
    
    //@XmlAttribute
    protected final String siteIdAttribute = "siteId";
    protected String siteId;
    
    public SiteType(Node node) {
        super(node);
        
        if(node == null)
            return;
        
        Node currentNode = node;
        NamedNodeMap attrib = currentNode.getAttributes();
        
        setAddressRef(TagTools.getStringValue(attrib, addressRefAttribute));
        setOwnerRef(TagTools.getStringValue(attrib, ownerRefAttribute));
        setSiteId(TagTools.getStringValue(attrib, siteIdAttribute));
    }

    public String getAddressRef() {
        return addressRef;
    }

    public void setAddressRef(String value) {
        this.addressRef = value;
    }

    public String getOwnerRef() {
        return ownerRef;
    }

    public void setOwnerRef(String value) {
        this.ownerRef = value;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String value) {
        this.siteId = value;
    }

    /***************
     * Customisation
     ***************/
}
