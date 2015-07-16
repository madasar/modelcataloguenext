/**
 */
package modelcatalogue;

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
 * @see modelcatalogue.McnFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface McnPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "modelcatalogue";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://models.cs.ox.ac.uk/ns/modelcatalogue";

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
	McnPackage eINSTANCE = modelcatalogue.impl.McnPackageImpl.init();

	/**
	 * The meta object id for the '{@link modelcatalogue.impl.CatalogueElementImpl <em>Catalogue Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelcatalogue.impl.CatalogueElementImpl
	 * @see modelcatalogue.impl.McnPackageImpl#getCatalogueElement()
	 * @generated
	 */
	int CATALOGUE_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_ELEMENT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_ELEMENT__GUID = 1;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_ELEMENT__DATE_CREATED = 2;

	/**
	 * The feature id for the '<em><b>Created By User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_ELEMENT__CREATED_BY_USER = 3;

	/**
	 * The feature id for the '<em><b>Contraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_ELEMENT__CONTRAINTS = 4;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_ELEMENT__TAGS = 5;

	/**
	 * The number of structural features of the '<em>Catalogue Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_ELEMENT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Catalogue Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATALOGUE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelcatalogue.impl.DataModelImpl <em>Data Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelcatalogue.impl.DataModelImpl
	 * @see modelcatalogue.impl.McnPackageImpl#getDataModel()
	 * @generated
	 */
	int DATA_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__LABEL = CATALOGUE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__GUID = CATALOGUE_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__DATE_CREATED = CATALOGUE_ELEMENT__DATE_CREATED;

	/**
	 * The feature id for the '<em><b>Created By User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__CREATED_BY_USER = CATALOGUE_ELEMENT__CREATED_BY_USER;

	/**
	 * The feature id for the '<em><b>Contraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__CONTRAINTS = CATALOGUE_ELEMENT__CONTRAINTS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__TAGS = CATALOGUE_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Finalised</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__FINALISED = CATALOGUE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Release Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__RELEASE_LABEL = CATALOGUE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Finalised Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__FINALISED_DATE = CATALOGUE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Declares</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__DECLARES = CATALOGUE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Owns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL__OWNS = CATALOGUE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_FEATURE_COUNT = CATALOGUE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Data Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_MODEL_OPERATION_COUNT = CATALOGUE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelcatalogue.impl.DataClassImpl <em>Data Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelcatalogue.impl.DataClassImpl
	 * @see modelcatalogue.impl.McnPackageImpl#getDataClass()
	 * @generated
	 */
	int DATA_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__LABEL = CATALOGUE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__GUID = CATALOGUE_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__DATE_CREATED = CATALOGUE_ELEMENT__DATE_CREATED;

	/**
	 * The feature id for the '<em><b>Created By User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__CREATED_BY_USER = CATALOGUE_ELEMENT__CREATED_BY_USER;

	/**
	 * The feature id for the '<em><b>Contraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__CONTRAINTS = CATALOGUE_ELEMENT__CONTRAINTS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__TAGS = CATALOGUE_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Xtends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__XTENDS = CATALOGUE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__CONTAINS = CATALOGUE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Defines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS__DEFINES = CATALOGUE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Data Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS_FEATURE_COUNT = CATALOGUE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Data Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CLASS_OPERATION_COUNT = CATALOGUE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelcatalogue.impl.DataItemImpl <em>Data Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelcatalogue.impl.DataItemImpl
	 * @see modelcatalogue.impl.McnPackageImpl#getDataItem()
	 * @generated
	 */
	int DATA_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__LABEL = CATALOGUE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__GUID = CATALOGUE_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__DATE_CREATED = CATALOGUE_ELEMENT__DATE_CREATED;

	/**
	 * The feature id for the '<em><b>Created By User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__CREATED_BY_USER = CATALOGUE_ELEMENT__CREATED_BY_USER;

	/**
	 * The feature id for the '<em><b>Contraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__CONTRAINTS = CATALOGUE_ELEMENT__CONTRAINTS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__TAGS = CATALOGUE_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM__TYPE = CATALOGUE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM_FEATURE_COUNT = CATALOGUE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_ITEM_OPERATION_COUNT = CATALOGUE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelcatalogue.impl.DataConstraintImpl <em>Data Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelcatalogue.impl.DataConstraintImpl
	 * @see modelcatalogue.impl.McnPackageImpl#getDataConstraint()
	 * @generated
	 */
	int DATA_CONSTRAINT = 4;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTRAINT__LANGUAGE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTRAINT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Data Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Data Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelcatalogue.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelcatalogue.impl.DataTypeImpl
	 * @see modelcatalogue.impl.McnPackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__LABEL = CATALOGUE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__GUID = CATALOGUE_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DATE_CREATED = CATALOGUE_ELEMENT__DATE_CREATED;

	/**
	 * The feature id for the '<em><b>Created By User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CREATED_BY_USER = CATALOGUE_ELEMENT__CREATED_BY_USER;

	/**
	 * The feature id for the '<em><b>Contraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__CONTRAINTS = CATALOGUE_ELEMENT__CONTRAINTS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__TAGS = CATALOGUE_ELEMENT__TAGS;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = CATALOGUE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = CATALOGUE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelcatalogue.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelcatalogue.impl.ReferenceTypeImpl
	 * @see modelcatalogue.impl.McnPackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 6;

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
	 * The feature id for the '<em><b>Contraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__CONTRAINTS = DATA_TYPE__CONTRAINTS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__TAGS = DATA_TYPE__TAGS;

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
	 * The meta object id for the '{@link modelcatalogue.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelcatalogue.impl.PrimitiveTypeImpl
	 * @see modelcatalogue.impl.McnPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 7;

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
	 * The feature id for the '<em><b>Contraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__CONTRAINTS = DATA_TYPE__CONTRAINTS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__TAGS = DATA_TYPE__TAGS;

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
	 * The meta object id for the '{@link modelcatalogue.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelcatalogue.impl.RelationshipImpl
	 * @see modelcatalogue.impl.McnPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 8;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelcatalogue.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelcatalogue.impl.TagImpl
	 * @see modelcatalogue.impl.McnPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 9;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link modelcatalogue.impl.EnumValueImpl <em>Enum Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelcatalogue.impl.EnumValueImpl
	 * @see modelcatalogue.impl.McnPackageImpl#getEnumValue()
	 * @generated
	 */
	int ENUM_VALUE = 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__LABEL = CATALOGUE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__GUID = CATALOGUE_ELEMENT__GUID;

	/**
	 * The feature id for the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__DATE_CREATED = CATALOGUE_ELEMENT__DATE_CREATED;

	/**
	 * The feature id for the '<em><b>Created By User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__CREATED_BY_USER = CATALOGUE_ELEMENT__CREATED_BY_USER;

	/**
	 * The feature id for the '<em><b>Contraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__CONTRAINTS = CATALOGUE_ELEMENT__CONTRAINTS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__TAGS = CATALOGUE_ELEMENT__TAGS;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE__TYPE = CATALOGUE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_FEATURE_COUNT = CATALOGUE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enum Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_VALUE_OPERATION_COUNT = CATALOGUE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link modelcatalogue.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see modelcatalogue.impl.EnumerationImpl
	 * @see modelcatalogue.impl.McnPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 11;

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
	 * The feature id for the '<em><b>Contraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__CONTRAINTS = DATA_TYPE__CONTRAINTS;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__TAGS = DATA_TYPE__TAGS;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__VALUES = DATA_TYPE_FEATURE_COUNT + 0;

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
	 * Returns the meta object for class '{@link modelcatalogue.CatalogueElement <em>Catalogue Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Catalogue Element</em>'.
	 * @see modelcatalogue.CatalogueElement
	 * @generated
	 */
	EClass getCatalogueElement();

	/**
	 * Returns the meta object for the attribute '{@link modelcatalogue.CatalogueElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see modelcatalogue.CatalogueElement#getLabel()
	 * @see #getCatalogueElement()
	 * @generated
	 */
	EAttribute getCatalogueElement_Label();

	/**
	 * Returns the meta object for the attribute '{@link modelcatalogue.CatalogueElement#getGUID <em>GUID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>GUID</em>'.
	 * @see modelcatalogue.CatalogueElement#getGUID()
	 * @see #getCatalogueElement()
	 * @generated
	 */
	EAttribute getCatalogueElement_GUID();

	/**
	 * Returns the meta object for the attribute '{@link modelcatalogue.CatalogueElement#getDateCreated <em>Date Created</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Created</em>'.
	 * @see modelcatalogue.CatalogueElement#getDateCreated()
	 * @see #getCatalogueElement()
	 * @generated
	 */
	EAttribute getCatalogueElement_DateCreated();

	/**
	 * Returns the meta object for the attribute '{@link modelcatalogue.CatalogueElement#getCreatedByUser <em>Created By User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By User</em>'.
	 * @see modelcatalogue.CatalogueElement#getCreatedByUser()
	 * @see #getCatalogueElement()
	 * @generated
	 */
	EAttribute getCatalogueElement_CreatedByUser();

	/**
	 * Returns the meta object for the containment reference list '{@link modelcatalogue.CatalogueElement#getContraints <em>Contraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contraints</em>'.
	 * @see modelcatalogue.CatalogueElement#getContraints()
	 * @see #getCatalogueElement()
	 * @generated
	 */
	EReference getCatalogueElement_Contraints();

	/**
	 * Returns the meta object for the containment reference list '{@link modelcatalogue.CatalogueElement#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see modelcatalogue.CatalogueElement#getTags()
	 * @see #getCatalogueElement()
	 * @generated
	 */
	EReference getCatalogueElement_Tags();

	/**
	 * Returns the meta object for class '{@link modelcatalogue.DataModel <em>Data Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Model</em>'.
	 * @see modelcatalogue.DataModel
	 * @generated
	 */
	EClass getDataModel();

	/**
	 * Returns the meta object for the attribute '{@link modelcatalogue.DataModel#isFinalised <em>Finalised</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finalised</em>'.
	 * @see modelcatalogue.DataModel#isFinalised()
	 * @see #getDataModel()
	 * @generated
	 */
	EAttribute getDataModel_Finalised();

	/**
	 * Returns the meta object for the attribute '{@link modelcatalogue.DataModel#getReleaseLabel <em>Release Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Release Label</em>'.
	 * @see modelcatalogue.DataModel#getReleaseLabel()
	 * @see #getDataModel()
	 * @generated
	 */
	EAttribute getDataModel_ReleaseLabel();

	/**
	 * Returns the meta object for the attribute '{@link modelcatalogue.DataModel#getFinalisedDate <em>Finalised Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Finalised Date</em>'.
	 * @see modelcatalogue.DataModel#getFinalisedDate()
	 * @see #getDataModel()
	 * @generated
	 */
	EAttribute getDataModel_FinalisedDate();

	/**
	 * Returns the meta object for the containment reference list '{@link modelcatalogue.DataModel#getDeclares <em>Declares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Declares</em>'.
	 * @see modelcatalogue.DataModel#getDeclares()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Declares();

	/**
	 * Returns the meta object for the containment reference list '{@link modelcatalogue.DataModel#getOwns <em>Owns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns</em>'.
	 * @see modelcatalogue.DataModel#getOwns()
	 * @see #getDataModel()
	 * @generated
	 */
	EReference getDataModel_Owns();

	/**
	 * Returns the meta object for class '{@link modelcatalogue.DataClass <em>Data Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Class</em>'.
	 * @see modelcatalogue.DataClass
	 * @generated
	 */
	EClass getDataClass();

	/**
	 * Returns the meta object for the reference '{@link modelcatalogue.DataClass#getXtends <em>Xtends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Xtends</em>'.
	 * @see modelcatalogue.DataClass#getXtends()
	 * @see #getDataClass()
	 * @generated
	 */
	EReference getDataClass_Xtends();

	/**
	 * Returns the meta object for the reference list '{@link modelcatalogue.DataClass#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contains</em>'.
	 * @see modelcatalogue.DataClass#getContains()
	 * @see #getDataClass()
	 * @generated
	 */
	EReference getDataClass_Contains();

	/**
	 * Returns the meta object for the containment reference list '{@link modelcatalogue.DataClass#getDefines <em>Defines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Defines</em>'.
	 * @see modelcatalogue.DataClass#getDefines()
	 * @see #getDataClass()
	 * @generated
	 */
	EReference getDataClass_Defines();

	/**
	 * Returns the meta object for class '{@link modelcatalogue.DataItem <em>Data Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Item</em>'.
	 * @see modelcatalogue.DataItem
	 * @generated
	 */
	EClass getDataItem();

	/**
	 * Returns the meta object for the reference '{@link modelcatalogue.DataItem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see modelcatalogue.DataItem#getType()
	 * @see #getDataItem()
	 * @generated
	 */
	EReference getDataItem_Type();

	/**
	 * Returns the meta object for class '{@link modelcatalogue.DataConstraint <em>Data Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Constraint</em>'.
	 * @see modelcatalogue.DataConstraint
	 * @generated
	 */
	EClass getDataConstraint();

	/**
	 * Returns the meta object for the attribute '{@link modelcatalogue.DataConstraint#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see modelcatalogue.DataConstraint#getLanguage()
	 * @see #getDataConstraint()
	 * @generated
	 */
	EAttribute getDataConstraint_Language();

	/**
	 * Returns the meta object for the attribute '{@link modelcatalogue.DataConstraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see modelcatalogue.DataConstraint#getValue()
	 * @see #getDataConstraint()
	 * @generated
	 */
	EAttribute getDataConstraint_Value();

	/**
	 * Returns the meta object for class '{@link modelcatalogue.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see modelcatalogue.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link modelcatalogue.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type</em>'.
	 * @see modelcatalogue.ReferenceType
	 * @generated
	 */
	EClass getReferenceType();

	/**
	 * Returns the meta object for the reference '{@link modelcatalogue.ReferenceType#getRelatedTo <em>Related To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Related To</em>'.
	 * @see modelcatalogue.ReferenceType#getRelatedTo()
	 * @see #getReferenceType()
	 * @generated
	 */
	EReference getReferenceType_RelatedTo();

	/**
	 * Returns the meta object for class '{@link modelcatalogue.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see modelcatalogue.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link modelcatalogue.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see modelcatalogue.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link modelcatalogue.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see modelcatalogue.Relationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link modelcatalogue.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see modelcatalogue.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for the attribute '{@link modelcatalogue.Relationship#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see modelcatalogue.Relationship#getType()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Type();

	/**
	 * Returns the meta object for class '{@link modelcatalogue.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see modelcatalogue.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for class '{@link modelcatalogue.EnumValue <em>Enum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Value</em>'.
	 * @see modelcatalogue.EnumValue
	 * @generated
	 */
	EClass getEnumValue();

	/**
	 * Returns the meta object for the reference '{@link modelcatalogue.EnumValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see modelcatalogue.EnumValue#getType()
	 * @see #getEnumValue()
	 * @generated
	 */
	EReference getEnumValue_Type();

	/**
	 * Returns the meta object for class '{@link modelcatalogue.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see modelcatalogue.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link modelcatalogue.Enumeration#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see modelcatalogue.Enumeration#getValues()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Values();

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
		 * The meta object literal for the '{@link modelcatalogue.impl.CatalogueElementImpl <em>Catalogue Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelcatalogue.impl.CatalogueElementImpl
		 * @see modelcatalogue.impl.McnPackageImpl#getCatalogueElement()
		 * @generated
		 */
		EClass CATALOGUE_ELEMENT = eINSTANCE.getCatalogueElement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOGUE_ELEMENT__LABEL = eINSTANCE.getCatalogueElement_Label();

		/**
		 * The meta object literal for the '<em><b>GUID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOGUE_ELEMENT__GUID = eINSTANCE.getCatalogueElement_GUID();

		/**
		 * The meta object literal for the '<em><b>Date Created</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOGUE_ELEMENT__DATE_CREATED = eINSTANCE.getCatalogueElement_DateCreated();

		/**
		 * The meta object literal for the '<em><b>Created By User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATALOGUE_ELEMENT__CREATED_BY_USER = eINSTANCE.getCatalogueElement_CreatedByUser();

		/**
		 * The meta object literal for the '<em><b>Contraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGUE_ELEMENT__CONTRAINTS = eINSTANCE.getCatalogueElement_Contraints();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATALOGUE_ELEMENT__TAGS = eINSTANCE.getCatalogueElement_Tags();

		/**
		 * The meta object literal for the '{@link modelcatalogue.impl.DataModelImpl <em>Data Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelcatalogue.impl.DataModelImpl
		 * @see modelcatalogue.impl.McnPackageImpl#getDataModel()
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
		 * The meta object literal for the '<em><b>Declares</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__DECLARES = eINSTANCE.getDataModel_Declares();

		/**
		 * The meta object literal for the '<em><b>Owns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_MODEL__OWNS = eINSTANCE.getDataModel_Owns();

		/**
		 * The meta object literal for the '{@link modelcatalogue.impl.DataClassImpl <em>Data Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelcatalogue.impl.DataClassImpl
		 * @see modelcatalogue.impl.McnPackageImpl#getDataClass()
		 * @generated
		 */
		EClass DATA_CLASS = eINSTANCE.getDataClass();

		/**
		 * The meta object literal for the '<em><b>Xtends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CLASS__XTENDS = eINSTANCE.getDataClass_Xtends();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CLASS__CONTAINS = eINSTANCE.getDataClass_Contains();

		/**
		 * The meta object literal for the '<em><b>Defines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CLASS__DEFINES = eINSTANCE.getDataClass_Defines();

		/**
		 * The meta object literal for the '{@link modelcatalogue.impl.DataItemImpl <em>Data Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelcatalogue.impl.DataItemImpl
		 * @see modelcatalogue.impl.McnPackageImpl#getDataItem()
		 * @generated
		 */
		EClass DATA_ITEM = eINSTANCE.getDataItem();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_ITEM__TYPE = eINSTANCE.getDataItem_Type();

		/**
		 * The meta object literal for the '{@link modelcatalogue.impl.DataConstraintImpl <em>Data Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelcatalogue.impl.DataConstraintImpl
		 * @see modelcatalogue.impl.McnPackageImpl#getDataConstraint()
		 * @generated
		 */
		EClass DATA_CONSTRAINT = eINSTANCE.getDataConstraint();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CONSTRAINT__LANGUAGE = eINSTANCE.getDataConstraint_Language();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CONSTRAINT__VALUE = eINSTANCE.getDataConstraint_Value();

		/**
		 * The meta object literal for the '{@link modelcatalogue.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelcatalogue.impl.DataTypeImpl
		 * @see modelcatalogue.impl.McnPackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link modelcatalogue.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelcatalogue.impl.ReferenceTypeImpl
		 * @see modelcatalogue.impl.McnPackageImpl#getReferenceType()
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
		 * The meta object literal for the '{@link modelcatalogue.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelcatalogue.impl.PrimitiveTypeImpl
		 * @see modelcatalogue.impl.McnPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link modelcatalogue.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelcatalogue.impl.RelationshipImpl
		 * @see modelcatalogue.impl.McnPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__TYPE = eINSTANCE.getRelationship_Type();

		/**
		 * The meta object literal for the '{@link modelcatalogue.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelcatalogue.impl.TagImpl
		 * @see modelcatalogue.impl.McnPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '{@link modelcatalogue.impl.EnumValueImpl <em>Enum Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelcatalogue.impl.EnumValueImpl
		 * @see modelcatalogue.impl.McnPackageImpl#getEnumValue()
		 * @generated
		 */
		EClass ENUM_VALUE = eINSTANCE.getEnumValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUM_VALUE__TYPE = eINSTANCE.getEnumValue_Type();

		/**
		 * The meta object literal for the '{@link modelcatalogue.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see modelcatalogue.impl.EnumerationImpl
		 * @see modelcatalogue.impl.McnPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__VALUES = eINSTANCE.getEnumeration_Values();

	}

} //McnPackage
