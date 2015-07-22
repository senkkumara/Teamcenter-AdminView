//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.3-b24-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.07.22 at 11:41:15 AM EST 
//
package tceav.manager.procedure.plmxmlpdm.type;

import java.util.ArrayList;
import java.util.List;
import java.awt.Point;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.NamedNodeMap;
import tceav.manager.procedure.plmxmlpdm.TagTools;
import tceav.manager.procedure.plmxmlpdm.TagTypeEnum;
import tceav.manager.procedure.plmxmlpdm.base.AttribOwnerBase;
import tceav.manager.procedure.plmxmlpdm.classtype.WorkflowTemplateClassificationEnum;
import tceav.manager.procedure.plmxmlpdm.classtype.WorkflowTemplateStageEnum;

/**
 * 
 *       The WorkflowTemplateType represents the type for the workflow templates.  
 *       Typically workflow template is used to initialize workflow processes. A workflow 
 *       template have actions associated with it to represent a list of workflow actions that
 *       will be triggered during a workflow process. The actions objects are WorkflowAction 
 *       objects. A workflow template also might have a parent task template, one or more 
 *       dependency task templates, and one or more child task templates associated with it. 
 *       These are also WorkflowTemplate objects.
 *       
 * 
 * <p>Java class for WorkflowTemplateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkflowTemplateType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.plmxml.org/Schemas/PLMXMLSchema}AttribOwnerBase">
 *       &lt;sequence>
 *         &lt;element name="TaskDescription" type="{http://www.plmxml.org/Schemas/PLMXMLSchema}UserListDataType"/>
 *         &lt;element name="DependencyTaskActions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DependencyTaskTemplates" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="actions" type="{http://www.plmxml.org/Schemas/PLMXMLSchema}uriReferenceListType" />
 *       &lt;attribute name="dependencyTaskTemplateRefs" type="{http://www.plmxml.org/Schemas/PLMXMLSchema}uriReferenceListType" />
 *       &lt;attribute name="iconKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="location" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="objectType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="parentTaskTemplateRef" type="{http://www.plmxml.org/Schemas/PLMXMLSchema}anyURIType" />
 *       &lt;attribute name="showInProcessStage" use="required" type="{http://www.w3.org/2001/XMLSchema}Boolean" />
 *       &lt;attribute name="signoffQuorum" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="stage" type="{http://www.plmxml.org/Schemas/PLMXMLSchema}WorkflowTemplateStageEnum" default="available" />
 *       &lt;attribute name="subTemplateRefs" type="{http://www.plmxml.org/Schemas/PLMXMLSchema}uriReferenceListType" />
 *       &lt;attribute name="templateClassification" type="{http://www.plmxml.org/Schemas/PLMXMLSchema}WorkflowTemplateClassificationEnum" default="task" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
//@XmlAccessorType(XmlAccessType.FIELD)
/*
@XmlType(name = "WorkflowTemplateType", propOrder = {
"taskDescription",
"dependencyTaskActions",
"dependencyTaskTemplates"
})
 */
public class WorkflowTemplateType extends AttribOwnerBase {

    //@XmlElement(name = "TaskDescription", required = true)
    protected UserListDataType taskDescription;
    //@XmlElement(name = "DependencyTaskActions", required = true)
    protected String dependencyTaskActions;
    //@XmlElement(name = "DependencyTaskTemplates", required = true)
    protected String dependencyTaskTemplates;
    //@XmlAttribute
    /**************
     *Customisation
     *
     * actionsAttribute renamed to actionRefsAttribute
     * actions renamed to actionRefs
     **************/
    protected final String actionRefsAttribute = "actions";
    protected List<String> actionRefs;
    //@XmlAttribute
    protected final String dependencyTaskTemplateRefsAttribute = "dependencyTaskTemplateRefs";
    protected List<String> dependencyTaskTemplateRefs;
    //@XmlAttribute
    protected final String iconKeyAttribute = "iconKey";
    protected String iconKey;
    //@XmlAttribute(required = true)
    protected final String locationAttribute = "location";
    protected String location;
    //@XmlAttribute(required = true)
    protected final String objectTypeAttribute = "objectType";
    protected String objectType;
    //@XmlAttribute
    protected final String parentTaskTemplateRefAttribute = "parentTaskTemplateRef";
    protected String parentTaskTemplateRef;
    //@XmlAttribute(required = true)
    protected final String showInProcessStageAttribute = "showInProcessStage";
    protected Boolean showInProcessStage;
    //@XmlAttribute
    protected final String signoffQuorumAttribute = "signoffQuorum";
    protected Integer signoffQuorum;
    //@XmlAttribute
    protected final String stageAttribute = "stage";
    protected WorkflowTemplateStageEnum stage;
    //@XmlAttribute
    protected final String subTemplateRefsAttribute = "subTemplateRefs";
    protected List<String> subTemplateRefs;
    //@XmlAttribute
    protected final String templateClassificationAttribute = "templateClassification";
    protected WorkflowTemplateClassificationEnum templateClassification;

    public WorkflowTemplateType(Node node) {
        super(node);
        Node currentNode = node;
        NamedNodeMap attrib = currentNode.getAttributes();
        NodeList nodeList = currentNode.getChildNodes();


        setIconKey(TagTools.getStringValue(attrib, iconKeyAttribute));
        setLocation(TagTools.getStringValue(attrib, locationAttribute));
        setObjectType(TagTools.getStringValue(attrib, objectTypeAttribute));
        setParentTaskTemplateRef(TagTools.getStringValue(attrib, parentTaskTemplateRefAttribute));
        setShowInProcessStage(TagTools.getBooleanValue(attrib, showInProcessStageAttribute));
        setSignoffQuorum(TagTools.getIntegerValue(attrib, signoffQuorumAttribute));

        String s;

        s = TagTools.getStringValue(attrib, stageAttribute);
        if (s != null) {
            setStage(WorkflowTemplateStageEnum.fromValue(s));
        }
        s = TagTools.getStringValue(attrib, templateClassificationAttribute);
        if (s != null) {
            setTemplateClassification(WorkflowTemplateClassificationEnum.fromValue(s));
        }
        TagTools.addToList(attrib, subTemplateRefsAttribute, getSubTemplateRefs());
        TagTools.addToList(attrib, dependencyTaskTemplateRefsAttribute, getDependencyTaskTemplateRefs());
        TagTools.addToList(attrib, actionRefsAttribute, getActionRefs());

        TagTypeEnum tagType;
        for (int i = 0; i < nodeList.getLength(); i++) {
            currentNode = nodeList.item(i);
            tagType = TagTypeEnum.fromValue(currentNode.getNodeName());

            switch (tagType) {
                case DependencyTaskActions:
                    setDependencyTaskActions(currentNode.getNodeValue());
                    break;

                case DependencyTaskTemplates:
                    setDependencyTaskTemplates(currentNode.getNodeValue());
                    break;

                case TaskDescription:
                    setTaskDescription(new UserListDataType(currentNode));
                    break;

                default:
                    break;
            }
        }

    }

    public UserListDataType getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(UserListDataType value) {
        this.taskDescription = value;
    }

    public String getDependencyTaskActions() {
        return dependencyTaskActions;
    }

    public void setDependencyTaskActions(String value) {
        this.dependencyTaskActions = value;
    }

    public String getDependencyTaskTemplates() {
        return dependencyTaskTemplates;
    }

    public void setDependencyTaskTemplates(String value) {
        this.dependencyTaskTemplates = value;
    }

    public List<String> getDependencyTaskTemplateRefs() {
        if (dependencyTaskTemplateRefs == null) {
            dependencyTaskTemplateRefs = new ArrayList<String>();
        }
        return this.dependencyTaskTemplateRefs;
    }

    public String getIconKey() {
        return iconKey;
    }

    public void setIconKey(String value) {
        this.iconKey = value;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String value) {
        this.location = value;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String value) {
        this.objectType = value;
    }

    public String getParentTaskTemplateRef() {
        return parentTaskTemplateRef;
    }

    public void setParentTaskTemplateRef(String value) {
        this.parentTaskTemplateRef = value;
    }

    public Boolean isShowInProcessStage() {
        return showInProcessStage;
    }

    public void setShowInProcessStage(Boolean value) {
        this.showInProcessStage = value;
    }

    public Integer getSignoffQuorum() {
        return signoffQuorum;
    }

    public void setSignoffQuorum(Integer value) {
        this.signoffQuorum = value;
    }

    public WorkflowTemplateStageEnum getStage() {
        if (stage == null) {
            return WorkflowTemplateStageEnum.AVAILABLE;
        } else {
            return stage;
        }
    }

    public void setStage(WorkflowTemplateStageEnum value) {
        this.stage = value;
    }

    public List<String> getSubTemplateRefs() {
        if (subTemplateRefs == null) {
            subTemplateRefs = new ArrayList<String>();
        }
        return this.subTemplateRefs;
    }

    public WorkflowTemplateClassificationEnum getTemplateClassification() {
        if (templateClassification == null) {
            return WorkflowTemplateClassificationEnum.TASK;
        } else {
            return templateClassification;
        }
    }

    public void setTemplateClassification(WorkflowTemplateClassificationEnum value) {
        this.templateClassification = value;
    }

    /***************
     * Customisation
     *
     * getActions() changed to getActionRefs()
     ***************/
    public List<String> getActionRefs() {
        if (actionRefs == null) {
            actionRefs = new ArrayList<String>();
        }
        return this.actionRefs;
    }
    
    /***************
     * Customisation
     ***************/
    private WorkflowTemplateType[] subTemplates;
    //private WorkflowTemplateType[] dependantTasks;
    private WorkflowActionType[] actions;
    private WorkflowTemplateType parentTaskTemplate;

    public WorkflowTemplateType getParentTaskTemplate() {
        return parentTaskTemplate;
    }

    public WorkflowTemplateType getRootTaskTemplate() {
        WorkflowTemplateType root = this;

        while (root.getParentTaskTemplate() != null) {
            root = root.getParentTaskTemplate();
        }
        return root;
    }

    public boolean isRootTaskTemplate() {
        return (getParentTaskTemplate() == null);
    }

    public void setParentTaskTemplate(WorkflowTemplateType parentTaskTemplate) {
        this.parentTaskTemplate = parentTaskTemplate;
    }

    /*
    public WorkflowTemplateType[] getDependencyTaskTemplate() {
        if (dependantTasks == null) {
            dependantTasks = new WorkflowTemplateType[getDependencyTaskTemplateRefs().size()];
        }
        return dependantTasks;
    }
    */

    public WorkflowTemplateType[] getSubTemplates() {
        if (subTemplates == null) {
            subTemplates = new WorkflowTemplateType[getSubTemplateRefs().size()];
        }
        return subTemplates;
    }

    public WorkflowActionType[] getActions() {
        if (actions == null) {
            actions = new WorkflowActionType[getActionRefs().size()];
        }
        return actions;
    }
    
    
    private Point locTask;
    private Point locStart;
    private Point locEnd;
    private final static int xLocTask = 0;
    private final static int yLocTask = 1;
    private final static int xLocStart = 2;
    private final static int yLocStart = 3;
    private final static int xLocEnd = 4;
    private final static int yLocEnd = 5;
    
    private void initialiseLocations() {
        String[] sLoc = getLocation().split(",");
        int iLoc[] = new int[sLoc.length];
        
        for(int i=0; i<sLoc.length; i++)
            iLoc[i] = Integer.parseInt(sLoc[i], 16);
        
        locTask = new Point(iLoc[xLocTask], iLoc[yLocTask]);
        locStart = new Point(iLoc[xLocStart], iLoc[yLocStart]);
        locEnd = new Point(iLoc[xLocEnd], iLoc[yLocEnd]);
    }

    public Point getTaskLocation() {
        if (locTask == null) {
            initialiseLocations();
        }
        return locTask;
    }

    public Point getStartLocation() {
        if (locTask == null) {
            initialiseLocations();
        }
        return locStart;
    }

    public Point getEndLocation() {
        if (locTask == null) {
            initialiseLocations();
        }
        return locEnd;
    }
}
