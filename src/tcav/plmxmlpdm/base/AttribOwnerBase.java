//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b24-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2007.07.22 at 11:41:15 AM EST
//


package tcav.plmxmlpdm.base;

import java.util.*;

import tcav.plmxmlpdm.TagTools;
import tcav.plmxmlpdm.TagTypeEnum;
import tcav.plmxmlpdm.type.UserDataType;
import tcav.plmxmlpdm.type.AssociatedDataSetType;
import tcav.plmxmlpdm.type.AssociatedFormType;
import tcav.plmxmlpdm.type.AssociatedFolderType;
import tcav.plmxmlpdm.type.ValidationResultsType;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.NamedNodeMap;

/*
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
 */

/**
 *
 *       Base class for elements which have PLMXML Attributes, i.e. elements
 *       derived from plm:AttributeBase.
 *
 *       Attributes:
 *
 *       attributeRefs: reference to Attributes
 *
 *       Elements:
 *
 *       Attribute:     any element derived from AttributeBase.
 *
 *
 * <p>Java class for AttribOwnerBase complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AttribOwnerBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.plmxml.org/Schemas/PLMXMLSchema}DescriptionBase">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.plmxml.org/Schemas/PLMXMLSchema}Attribute" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="attributeRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
//@XmlAccessorType(XmlAccessType.FIELD)
/*
  @XmlType(name = "AttribOwnerBase", propOrder = {
    "attribute"
})
 */
public abstract class AttribOwnerBase extends DescriptionBase {
    
    //@XmlElementRef(name = "Attribute", namespace = "http://www.plmxml.org/Schemas/PLMXMLSchema", type = JAXBElement.class)
    protected List<AttributeBase> attribute;
    
    //@XmlAttribute
    //@XmlIDREF
    /***************
     * Customisation
     * List<String> attributeRefs, use to be List<Object> attributeRefs
     ***************/
    protected List<String> attributeRefs;
    
    public AttribOwnerBase(Node node) {
        super(node);
        Node currentNode = node;
        NamedNodeMap attrib = currentNode.getAttributes();
        NodeList nodeList = currentNode.getChildNodes();
        
        TagTypeEnum tagType;
        for (int i=0; i<nodeList.getLength(); i++) {
            currentNode = nodeList.item(i);
            tagType = TagTypeEnum.fromValue(currentNode.getNodeName());
            
            switch(tagType) {
                case Arguments:
                    UserDataType arg = new UserDataType(currentNode);
                    arg.setTagType(TagTypeEnum.Arguments);
                    getAttribute().add(arg);
                    getAttributeRefs().add(arg.getId());
                    break;

                case UserData:          
                    UserDataType ud = new UserDataType(currentNode);
                    getAttribute().add(ud);
                    getAttributeRefs().add(ud.getId());
                    break;
                    
                case AssociatedDataSet:
                    AssociatedDataSetType ad = new AssociatedDataSetType(currentNode);
                    getAttribute().add(ad);
                    getAttributeRefs().add(ad.getId());
                    break;
                    
                case AssociatedFolder:
                    AssociatedFolderType afd = new AssociatedFolderType(currentNode);
                    getAttribute().add(afd);
                    getAttributeRefs().add(afd.getId());
                    break;
                    
                case AssociatedForm:
                    AssociatedFormType afm = new AssociatedFormType(currentNode);
                    getAttribute().add(afm);
                    getAttributeRefs().add(afm.getId());
                    break;
                    
                case ValidationResults:
                    ValidationResultsType vr = new ValidationResultsType(currentNode);
                    getAttribute().add(vr);
                    getAttributeRefs().add(vr.getId());
                    break;
                    
                default:
                    //System.out.println("AttribOwnerBase: "+currentNode.getNodeName());
                    break;
            }
        }
    }
    
    /**
     * Gets the value of the attribute property.
     *
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link AssociatedFormType }{@code >}
     * {@link JAXBElement }{@code <}{@link UserListDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link MarkupType }{@code >}
     * {@link JAXBElement }{@code <}{@link AttributeBase }{@code >}
     * {@link JAXBElement }{@code <}{@link UserDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link AssociatedDataSetType }{@code >}
     * {@link JAXBElement }{@code <}{@link MassPropertiesType }{@code >}
     * {@link JAXBElement }{@code <}{@link EntityUserDataType }{@code >}
     * {@link JAXBElement }{@code <}{@link AssociatedFolderType }{@code >}
     * {@link JAXBElement }{@code <}{@link ValidationResultsType }{@code >}
     *
     *
     */
    public List<AttributeBase> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<AttributeBase>();
        }
        return this.attribute;
    }
    
    public List<String> getAttributeRefs() {
        if (attributeRefs == null) {
            attributeRefs = new ArrayList<String>();
        }
        return this.attributeRefs;
    }
    
}
