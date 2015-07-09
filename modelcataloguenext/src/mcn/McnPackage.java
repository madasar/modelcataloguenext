/**
 */
package mcn;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mcn.McnFactory
 * @model kind="package"
 * @generated
 */
public interface McnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mcn";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://models.cs.ox.ac.uk/ns/mcn";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mcn";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	McnPackage eINSTANCE = mcn.impl.McnPackageImpl.init();

	/**
	 * The meta object id for the '{@link mcn.impl.AdminsteredItemImpl <em>Adminstered Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcn.impl.AdminsteredItemImpl
	 * @see mcn.impl.McnPackageImpl#getAdminsteredItem()
	 * @generated
	 */
	int ADMINSTERED_ITEM = 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINSTERED_ITEM__ANNOTATION = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINSTERED_ITEM__LABEL = 1;

	/**
	 * The feature id for the '<em><b>GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINSTERED_ITEM__GUID = 2;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINSTERED_ITEM__DATE_CREATED = 3;

	/**
	 * The feature id for the '<em><b>Created By User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINSTERED_ITEM__CREATED_BY_USER = 4;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINSTERED_ITEM__LINKED_TO = 5;

	/**
	 * The number of structural features of the '<em>Adminstered Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINSTERED_ITEM_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Adminstered Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINSTERED_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mcn.impl.DataClassImpl <em>Data Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcn.impl.DataClassImpl
	 * @see mcn.impl.McnPackageImpl#getDataClass()
	 * @generated
	 */
	int DATA_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__ANNOTATION = ADMINSTERED_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__LABEL = ADMINSTERED_ITEM__LABEL;

	/**
	 * The feature id for the '<em><b>GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__GUID = ADMINSTERED_ITEM__GUID;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__DATE_CREATED = ADMINSTERED_ITEM__DATE_CREATED;

	/**
	 * The feature id for the '<em><b>Created By User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__CREATED_BY_USER = ADMINSTERED_ITEM__CREATED_BY_USER;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__LINKED_TO = ADMINSTERED_ITEM__LINKED_TO;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__EXTENDS = ADMINSTERED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__CONTAINS = ADMINSTERED_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datamodel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__DATAMODEL = ADMINSTERED_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dataelements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__DATAELEMENTS = ADMINSTERED_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS_FEATURE_COUNT = ADMINSTERED_ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS_OPERATION_COUNT = ADMINSTERED_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mcn.impl.DataModelImpl <em>Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcn.impl.DataModelImpl
	 * @see mcn.impl.McnPackageImpl#getDataModel()
	 * @generated
	 */
	int DATA_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__ANNOTATION = ADMINSTERED_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__LABEL = ADMINSTERED_ITEM__LABEL;

	/**
	 * The feature id for the '<em><b>GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__GUID = ADMINSTERED_ITEM__GUID;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__DATE_CREATED = ADMINSTERED_ITEM__DATE_CREATED;

	/**
	 * The feature id for the '<em><b>Created By User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__CREATED_BY_USER = ADMINSTERED_ITEM__CREATED_BY_USER;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__LINKED_TO = ADMINSTERED_ITEM__LINKED_TO;

	/**
	 * The feature id for the '<em><b>Finalised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__FINALISED = ADMINSTERED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Dataclasses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__DATACLASSES = ADMINSTERED_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Release Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__RELEASE_LABEL = ADMINSTERED_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Finalised Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__FINALISED_DATE = ADMINSTERED_ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_FEATURE_COUNT = ADMINSTERED_ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_OPERATION_COUNT = ADMINSTERED_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mcn.impl.DataElementImpl <em>Data Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcn.impl.DataElementImpl
	 * @see mcn.impl.McnPackageImpl#getDataElement()
	 * @generated
	 */
	int DATA_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__ANNOTATION = ADMINSTERED_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__LABEL = ADMINSTERED_ITEM__LABEL;

	/**
	 * The feature id for the '<em><b>GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__GUID = ADMINSTERED_ITEM__GUID;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__DATE_CREATED = ADMINSTERED_ITEM__DATE_CREATED;

	/**
	 * The feature id for the '<em><b>Created By User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__CREATED_BY_USER = ADMINSTERED_ITEM__CREATED_BY_USER;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__LINKED_TO = ADMINSTERED_ITEM__LINKED_TO;

	/**
	 * The feature id for the '<em><b>Dataclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__DATACLASS = ADMINSTERED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Valuedomain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT__VALUEDOMAIN = ADMINSTERED_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_FEATURE_COUNT = ADMINSTERED_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ELEMENT_OPERATION_COUNT = ADMINSTERED_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mcn.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcn.impl.AnnotationImpl
	 * @see mcn.impl.McnPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 4;

	/**
	 * The feature id for the '<em><b>Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__ITEM = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__KEY = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mcn.impl.ValueDomainImpl <em>Value Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcn.impl.ValueDomainImpl
	 * @see mcn.impl.McnPackageImpl#getValueDomain()
	 * @generated
	 */
	int VALUE_DOMAIN = 5;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOMAIN__ANNOTATION = ADMINSTERED_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOMAIN__LABEL = ADMINSTERED_ITEM__LABEL;

	/**
	 * The feature id for the '<em><b>GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOMAIN__GUID = ADMINSTERED_ITEM__GUID;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOMAIN__DATE_CREATED = ADMINSTERED_ITEM__DATE_CREATED;

	/**
	 * The feature id for the '<em><b>Created By User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOMAIN__CREATED_BY_USER = ADMINSTERED_ITEM__CREATED_BY_USER;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOMAIN__LINKED_TO = ADMINSTERED_ITEM__LINKED_TO;

	/**
	 * The feature id for the '<em><b>Dataelement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOMAIN__DATAELEMENT = ADMINSTERED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOMAIN__TYPE = ADMINSTERED_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOMAIN_FEATURE_COUNT = ADMINSTERED_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Value Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_DOMAIN_OPERATION_COUNT = ADMINSTERED_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mcn.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcn.impl.DataTypeImpl
	 * @see mcn.impl.McnPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ANNOTATION = ADMINSTERED_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__LABEL = ADMINSTERED_ITEM__LABEL;

	/**
	 * The feature id for the '<em><b>GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__GUID = ADMINSTERED_ITEM__GUID;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DATE_CREATED = ADMINSTERED_ITEM__DATE_CREATED;

	/**
	 * The feature id for the '<em><b>Created By User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CREATED_BY_USER = ADMINSTERED_ITEM__CREATED_BY_USER;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__LINKED_TO = ADMINSTERED_ITEM__LINKED_TO;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = ADMINSTERED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = ADMINSTERED_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mcn.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcn.impl.ReferenceTypeImpl
	 * @see mcn.impl.McnPackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__ANNOTATION = DATA_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__LABEL = DATA_TYPE__LABEL;

	/**
	 * The feature id for the '<em><b>GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__GUID = DATA_TYPE__GUID;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__DATE_CREATED = DATA_TYPE__DATE_CREATED;

	/**
	 * The feature id for the '<em><b>Created By User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__CREATED_BY_USER = DATA_TYPE__CREATED_BY_USER;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__LINKED_TO = DATA_TYPE__LINKED_TO;

	/**
	 * The feature id for the '<em><b>Related To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__RELATED_TO = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mcn.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcn.impl.PrimitiveTypeImpl
	 * @see mcn.impl.McnPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__ANNOTATION = DATA_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__LABEL = DATA_TYPE__LABEL;

	/**
	 * The feature id for the '<em><b>GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__GUID = DATA_TYPE__GUID;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__DATE_CREATED = DATA_TYPE__DATE_CREATED;

	/**
	 * The feature id for the '<em><b>Created By User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__CREATED_BY_USER = DATA_TYPE__CREATED_BY_USER;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__LINKED_TO = DATA_TYPE__LINKED_TO;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mcn.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcn.impl.EnumerationImpl
	 * @see mcn.impl.McnPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 9;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ANNOTATION = DATA_TYPE__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LABEL = DATA_TYPE__LABEL;

	/**
	 * The feature id for the '<em><b>GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__GUID = DATA_TYPE__GUID;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__DATE_CREATED = DATA_TYPE__DATE_CREATED;

	/**
	 * The feature id for the '<em><b>Created By User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__CREATED_BY_USER = DATA_TYPE__CREATED_BY_USER;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LINKED_TO = DATA_TYPE__LINKED_TO;

	/**
	 * The feature id for the '<em><b>Enums</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__ENUMS = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link mcn.impl.SemanticLinkImpl <em>Semantic Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcn.impl.SemanticLinkImpl
	 * @see mcn.impl.McnPackageImpl#getSemanticLink()
	 * @generated
	 */
	int SEMANTIC_LINK = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_LINK__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_LINK__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_LINK__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Semantic Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_LINK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Semantic Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMANTIC_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mcn.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcn.impl.TermImpl
	 * @see mcn.impl.McnPackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 11;

	/**
	 * The feature id for the '<em><b>Taken From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM__TAKEN_FROM = 0;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mcn.impl.TerminologyImpl <em>Terminology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcn.impl.TerminologyImpl
	 * @see mcn.impl.McnPackageImpl#getTerminology()
	 * @generated
	 */
	int TERMINOLOGY = 12;

	/**
	 * The number of structural features of the '<em>Terminology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Terminology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mcn.impl.EnumValueImpl <em>Enum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mcn.impl.EnumValueImpl
	 * @see mcn.impl.McnPackageImpl#getEnumValue()
	 * @generated
	 */
	int ENUM_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__ANNOTATION = ADMINSTERED_ITEM__ANNOTATION;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__LABEL = ADMINSTERED_ITEM__LABEL;

	/**
	 * The feature id for the '<em><b>GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__GUID = ADMINSTERED_ITEM__GUID;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__DATE_CREATED = ADMINSTERED_ITEM__DATE_CREATED;

	/**
	 * The feature id for the '<em><b>Created By User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__CREATED_BY_USER = ADMINSTERED_ITEM__CREATED_BY_USER;

	/**
	 * The feature id for the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__LINKED_TO = ADMINSTERED_ITEM__LINKED_TO;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__KEY = ADMINSTERED_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__VALUE = ADMINSTERED_ITEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_FEATURE_COUNT = ADMINSTERED_ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_OPERATION_COUNT = ADMINSTERED_ITEM_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link mcn.AdminsteredItem <em>Adminstered Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adminstered Item</em>'.
	 * @see mcn.AdminsteredItem
	 * @generated
	 */
	EClass getAdminsteredItem();

	/**
	 * Returns the meta object for the reference '{@link mcn.AdminsteredItem#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotation</em>'.
	 * @see mcn.AdminsteredItem#getAnnotation()
	 * @see #getAdminsteredItem()
	 * @generated
	 */
	EReference getAdminsteredItem_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link mcn.AdminsteredItem#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see mcn.AdminsteredItem#getLabel()
	 * @see #getAdminsteredItem()
	 * @generated
	 */
	EAttribute getAdminsteredItem_Label();

	/**
	 * Returns the meta object for the attribute '{@link mcn.AdminsteredItem#getGUID <em>GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GUID</em>'.
	 * @see mcn.AdminsteredItem#getGUID()
	 * @see #getAdminsteredItem()
	 * @generated
	 */
	EAttribute getAdminsteredItem_GUID();

	/**
	 * Returns the meta object for the attribute '{@link mcn.AdminsteredItem#getDateCreated <em>Date Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Created</em>'.
	 * @see mcn.AdminsteredItem#getDateCreated()
	 * @see #getAdminsteredItem()
	 * @generated
	 */
	EAttribute getAdminsteredItem_DateCreated();

	/**
	 * Returns the meta object for the attribute '{@link mcn.AdminsteredItem#getCreatedByUser <em>Created By User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By User</em>'.
	 * @see mcn.AdminsteredItem#getCreatedByUser()
	 * @see #getAdminsteredItem()
	 * @generated
	 */
	EAttribute getAdminsteredItem_CreatedByUser();

	/**
	 * Returns the meta object for the reference '{@link mcn.AdminsteredItem#getLinkedTo <em>Linked To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Linked To</em>'.
	 * @see mcn.AdminsteredItem#getLinkedTo()
	 * @see #getAdminsteredItem()
	 * @generated
	 */
	EReference getAdminsteredItem_LinkedTo();

	/**
	 * Returns the meta object for class '{@link mcn.DataClass <em>Data Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Class</em>'.
	 * @see mcn.DataClass
	 * @generated
	 */
	EClass getDataClass();

	/**
	 * Returns the meta object for the reference '{@link mcn.DataClass#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extends</em>'.
	 * @see mcn.DataClass#getExtends()
	 * @see #getDataClass()
	 * @generated
	 */
	EReference getDataClass_Extends();

	/**
	 * Returns the meta object for the reference list '{@link mcn.DataClass#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see mcn.DataClass#getContains()
	 * @see #getDataClass()
	 * @generated
	 */
	EReference getDataClass_Contains();

	/**
	 * Returns the meta object for the reference '{@link mcn.DataClass#getDatamodel <em>Datamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Datamodel</em>'.
	 * @see mcn.DataClass#getDatamodel()
	 * @see #getDataClass()
	 * @generated
	 */
	EReference getDataClass_Datamodel();

	/**
	 * Returns the meta object for the reference list '{@link mcn.DataClass#getDataelements <em>Dataelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dataelements</em>'.
	 * @see mcn.DataClass#getDataelements()
	 * @see #getDataClass()
	 * @generated
	 */
	EReference getDataClass_Dataelements();

	/**
	 * Returns the meta object for class '{@link mcn.DataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Model</em>'.
	 * @see mcn.DataModel
	 * @generated
	 */
	EClass getDataModel();

	/**
	 * Returns the meta object for the attribute '{@link mcn.DataModel#isFinalised <em>Finalised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finalised</em>'.
	 * @see mcn.DataModel#isFinalised()
	 * @see #getDataModel()
	 * @generated
	 */
	EAttribute getDataModel_Finalised();

	/**
	 * Returns the meta object for the reference list '{@link mcn.DataModel#getDataclasses <em>Dataclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dataclasses</em>'.
	 * @see mcn.DataModel#getDataclasses()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Dataclasses();

	/**
	 * Returns the meta object for the attribute '{@link mcn.DataModel#getReleaseLabel <em>Release Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Label</em>'.
	 * @see mcn.DataModel#getReleaseLabel()
	 * @see #getDataModel()
	 * @generated
	 */
	EAttribute getDataModel_ReleaseLabel();

	/**
	 * Returns the meta object for the attribute '{@link mcn.DataModel#getFinalisedDate <em>Finalised Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finalised Date</em>'.
	 * @see mcn.DataModel#getFinalisedDate()
	 * @see #getDataModel()
	 * @generated
	 */
	EAttribute getDataModel_FinalisedDate();

	/**
	 * Returns the meta object for class '{@link mcn.DataElement <em>Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Element</em>'.
	 * @see mcn.DataElement
	 * @generated
	 */
	EClass getDataElement();

	/**
	 * Returns the meta object for the reference '{@link mcn.DataElement#getDataclass <em>Dataclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dataclass</em>'.
	 * @see mcn.DataElement#getDataclass()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_Dataclass();

	/**
	 * Returns the meta object for the reference list '{@link mcn.DataElement#getValuedomain <em>Valuedomain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Valuedomain</em>'.
	 * @see mcn.DataElement#getValuedomain()
	 * @see #getDataElement()
	 * @generated
	 */
	EReference getDataElement_Valuedomain();

	/**
	 * Returns the meta object for class '{@link mcn.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see mcn.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the reference '{@link mcn.Annotation#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Item</em>'.
	 * @see mcn.Annotation#getItem()
	 * @see #getAnnotation()
	 * @generated
	 */
	EReference getAnnotation_Item();

	/**
	 * Returns the meta object for the attribute '{@link mcn.Annotation#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see mcn.Annotation#getKey()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Key();

	/**
	 * Returns the meta object for the attribute '{@link mcn.Annotation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mcn.Annotation#getValue()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Value();

	/**
	 * Returns the meta object for class '{@link mcn.ValueDomain <em>Value Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Domain</em>'.
	 * @see mcn.ValueDomain
	 * @generated
	 */
	EClass getValueDomain();

	/**
	 * Returns the meta object for the reference '{@link mcn.ValueDomain#getDataelement <em>Dataelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dataelement</em>'.
	 * @see mcn.ValueDomain#getDataelement()
	 * @see #getValueDomain()
	 * @generated
	 */
	EReference getValueDomain_Dataelement();

	/**
	 * Returns the meta object for the reference '{@link mcn.ValueDomain#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see mcn.ValueDomain#getType()
	 * @see #getValueDomain()
	 * @generated
	 */
	EReference getValueDomain_Type();

	/**
	 * Returns the meta object for class '{@link mcn.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see mcn.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link mcn.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type</em>'.
	 * @see mcn.ReferenceType
	 * @generated
	 */
	EClass getReferenceType();

	/**
	 * Returns the meta object for the reference '{@link mcn.ReferenceType#getRelatedTo <em>Related To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related To</em>'.
	 * @see mcn.ReferenceType#getRelatedTo()
	 * @see #getReferenceType()
	 * @generated
	 */
	EReference getReferenceType_RelatedTo();

	/**
	 * Returns the meta object for class '{@link mcn.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see mcn.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link mcn.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see mcn.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the reference list '{@link mcn.Enumeration#getEnums <em>Enums</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Enums</em>'.
	 * @see mcn.Enumeration#getEnums()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Enums();

	/**
	 * Returns the meta object for class '{@link mcn.SemanticLink <em>Semantic Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semantic Link</em>'.
	 * @see mcn.SemanticLink
	 * @generated
	 */
	EClass getSemanticLink();

	/**
	 * Returns the meta object for the reference '{@link mcn.SemanticLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see mcn.SemanticLink#getSource()
	 * @see #getSemanticLink()
	 * @generated
	 */
	EReference getSemanticLink_Source();

	/**
	 * Returns the meta object for the reference '{@link mcn.SemanticLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see mcn.SemanticLink#getTarget()
	 * @see #getSemanticLink()
	 * @generated
	 */
	EReference getSemanticLink_Target();

	/**
	 * Returns the meta object for the attribute '{@link mcn.SemanticLink#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mcn.SemanticLink#getType()
	 * @see #getSemanticLink()
	 * @generated
	 */
	EAttribute getSemanticLink_Type();

	/**
	 * Returns the meta object for class '{@link mcn.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see mcn.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for the reference '{@link mcn.Term#getTakenFrom <em>Taken From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Taken From</em>'.
	 * @see mcn.Term#getTakenFrom()
	 * @see #getTerm()
	 * @generated
	 */
	EReference getTerm_TakenFrom();

	/**
	 * Returns the meta object for class '{@link mcn.Terminology <em>Terminology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology</em>'.
	 * @see mcn.Terminology
	 * @generated
	 */
	EClass getTerminology();

	/**
	 * Returns the meta object for class '{@link mcn.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Value</em>'.
	 * @see mcn.EnumValue
	 * @generated
	 */
	EClass getEnumValue();

	/**
	 * Returns the meta object for the attribute '{@link mcn.EnumValue#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see mcn.EnumValue#getKey()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_Key();

	/**
	 * Returns the meta object for the attribute '{@link mcn.EnumValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mcn.EnumValue#getValue()
	 * @see #getEnumValue()
	 * @generated
	 */
	EAttribute getEnumValue_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	McnFactory getMcnFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mcn.impl.AdminsteredItemImpl <em>Adminstered Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcn.impl.AdminsteredItemImpl
		 * @see mcn.impl.McnPackageImpl#getAdminsteredItem()
		 * @generated
		 */
		EClass ADMINSTERED_ITEM = eINSTANCE.getAdminsteredItem();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMINSTERED_ITEM__ANNOTATION = eINSTANCE.getAdminsteredItem_Annotation();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINSTERED_ITEM__LABEL = eINSTANCE.getAdminsteredItem_Label();

		/**
		 * The meta object literal for the '<em><b>GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINSTERED_ITEM__GUID = eINSTANCE.getAdminsteredItem_GUID();

		/**
		 * The meta object literal for the '<em><b>Date Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINSTERED_ITEM__DATE_CREATED = eINSTANCE.getAdminsteredItem_DateCreated();

		/**
		 * The meta object literal for the '<em><b>Created By User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMINSTERED_ITEM__CREATED_BY_USER = eINSTANCE.getAdminsteredItem_CreatedByUser();

		/**
		 * The meta object literal for the '<em><b>Linked To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMINSTERED_ITEM__LINKED_TO = eINSTANCE.getAdminsteredItem_LinkedTo();

		/**
		 * The meta object literal for the '{@link mcn.impl.DataClassImpl <em>Data Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcn.impl.DataClassImpl
		 * @see mcn.impl.McnPackageImpl#getDataClass()
		 * @generated
		 */
		EClass DATA_CLASS = eINSTANCE.getDataClass();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CLASS__EXTENDS = eINSTANCE.getDataClass_Extends();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CLASS__CONTAINS = eINSTANCE.getDataClass_Contains();

		/**
		 * The meta object literal for the '<em><b>Datamodel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CLASS__DATAMODEL = eINSTANCE.getDataClass_Datamodel();

		/**
		 * The meta object literal for the '<em><b>Dataelements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CLASS__DATAELEMENTS = eINSTANCE.getDataClass_Dataelements();

		/**
		 * The meta object literal for the '{@link mcn.impl.DataModelImpl <em>Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcn.impl.DataModelImpl
		 * @see mcn.impl.McnPackageImpl#getDataModel()
		 * @generated
		 */
		EClass DATA_MODEL = eINSTANCE.getDataModel();

		/**
		 * The meta object literal for the '<em><b>Finalised</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MODEL__FINALISED = eINSTANCE.getDataModel_Finalised();

		/**
		 * The meta object literal for the '<em><b>Dataclasses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__DATACLASSES = eINSTANCE.getDataModel_Dataclasses();

		/**
		 * The meta object literal for the '<em><b>Release Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MODEL__RELEASE_LABEL = eINSTANCE.getDataModel_ReleaseLabel();

		/**
		 * The meta object literal for the '<em><b>Finalised Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_MODEL__FINALISED_DATE = eINSTANCE.getDataModel_FinalisedDate();

		/**
		 * The meta object literal for the '{@link mcn.impl.DataElementImpl <em>Data Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcn.impl.DataElementImpl
		 * @see mcn.impl.McnPackageImpl#getDataElement()
		 * @generated
		 */
		EClass DATA_ELEMENT = eINSTANCE.getDataElement();

		/**
		 * The meta object literal for the '<em><b>Dataclass</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__DATACLASS = eINSTANCE.getDataElement_Dataclass();

		/**
		 * The meta object literal for the '<em><b>Valuedomain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ELEMENT__VALUEDOMAIN = eINSTANCE.getDataElement_Valuedomain();

		/**
		 * The meta object literal for the '{@link mcn.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcn.impl.AnnotationImpl
		 * @see mcn.impl.McnPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANNOTATION__ITEM = eINSTANCE.getAnnotation_Item();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__KEY = eINSTANCE.getAnnotation_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__VALUE = eINSTANCE.getAnnotation_Value();

		/**
		 * The meta object literal for the '{@link mcn.impl.ValueDomainImpl <em>Value Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcn.impl.ValueDomainImpl
		 * @see mcn.impl.McnPackageImpl#getValueDomain()
		 * @generated
		 */
		EClass VALUE_DOMAIN = eINSTANCE.getValueDomain();

		/**
		 * The meta object literal for the '<em><b>Dataelement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_DOMAIN__DATAELEMENT = eINSTANCE.getValueDomain_Dataelement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_DOMAIN__TYPE = eINSTANCE.getValueDomain_Type();

		/**
		 * The meta object literal for the '{@link mcn.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcn.impl.DataTypeImpl
		 * @see mcn.impl.McnPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link mcn.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcn.impl.ReferenceTypeImpl
		 * @see mcn.impl.McnPackageImpl#getReferenceType()
		 * @generated
		 */
		EClass REFERENCE_TYPE = eINSTANCE.getReferenceType();

		/**
		 * The meta object literal for the '<em><b>Related To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TYPE__RELATED_TO = eINSTANCE.getReferenceType_RelatedTo();

		/**
		 * The meta object literal for the '{@link mcn.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcn.impl.PrimitiveTypeImpl
		 * @see mcn.impl.McnPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link mcn.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcn.impl.EnumerationImpl
		 * @see mcn.impl.McnPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Enums</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__ENUMS = eINSTANCE.getEnumeration_Enums();

		/**
		 * The meta object literal for the '{@link mcn.impl.SemanticLinkImpl <em>Semantic Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcn.impl.SemanticLinkImpl
		 * @see mcn.impl.McnPackageImpl#getSemanticLink()
		 * @generated
		 */
		EClass SEMANTIC_LINK = eINSTANCE.getSemanticLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_LINK__SOURCE = eINSTANCE.getSemanticLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEMANTIC_LINK__TARGET = eINSTANCE.getSemanticLink_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMANTIC_LINK__TYPE = eINSTANCE.getSemanticLink_Type();

		/**
		 * The meta object literal for the '{@link mcn.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcn.impl.TermImpl
		 * @see mcn.impl.McnPackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '<em><b>Taken From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM__TAKEN_FROM = eINSTANCE.getTerm_TakenFrom();

		/**
		 * The meta object literal for the '{@link mcn.impl.TerminologyImpl <em>Terminology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcn.impl.TerminologyImpl
		 * @see mcn.impl.McnPackageImpl#getTerminology()
		 * @generated
		 */
		EClass TERMINOLOGY = eINSTANCE.getTerminology();

		/**
		 * The meta object literal for the '{@link mcn.impl.EnumValueImpl <em>Enum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mcn.impl.EnumValueImpl
		 * @see mcn.impl.McnPackageImpl#getEnumValue()
		 * @generated
		 */
		EClass ENUM_VALUE = eINSTANCE.getEnumValue();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__KEY = eINSTANCE.getEnumValue_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM_VALUE__VALUE = eINSTANCE.getEnumValue_Value();

	}

} //McnPackage
