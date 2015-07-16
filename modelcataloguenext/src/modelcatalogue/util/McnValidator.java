/**
 */
package modelcatalogue.util;

import java.util.Map;

import modelcatalogue.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see modelcatalogue.McnPackage
 * @generated
 */
public class McnValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final McnValidator INSTANCE = new McnValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "modelcatalogue";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public McnValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return McnPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case McnPackage.CATALOGUE_ELEMENT:
				return validateCatalogueElement((CatalogueElement)value, diagnostics, context);
			case McnPackage.DATA_MODEL:
				return validateDataModel((DataModel)value, diagnostics, context);
			case McnPackage.DATA_CLASS:
				return validateDataClass((DataClass)value, diagnostics, context);
			case McnPackage.DATA_ITEM:
				return validateDataItem((DataItem)value, diagnostics, context);
			case McnPackage.DATA_CONSTRAINT:
				return validateDataConstraint((DataConstraint)value, diagnostics, context);
			case McnPackage.DATA_TYPE:
				return validateDataType((DataType)value, diagnostics, context);
			case McnPackage.REFERENCE_TYPE:
				return validateReferenceType((ReferenceType)value, diagnostics, context);
			case McnPackage.PRIMITIVE_TYPE:
				return validatePrimitiveType((PrimitiveType)value, diagnostics, context);
			case McnPackage.RELATIONSHIP:
				return validateRelationship((Relationship)value, diagnostics, context);
			case McnPackage.TAG:
				return validateTag((Tag)value, diagnostics, context);
			case McnPackage.ENUM_VALUE:
				return validateEnumValue((EnumValue)value, diagnostics, context);
			case McnPackage.ENUMERATION:
				return validateEnumeration((Enumeration)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatalogueElement(CatalogueElement catalogueElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(catalogueElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataModel(DataModel dataModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataClass(DataClass dataClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataClass_NonSelf_contains(dataClass, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataClass_NonSelf_extends(dataClass, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NonSelf_contains constraint of '<em>Data Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_CLASS__NON_SELF_CONTAINS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The \\'DataClass\\' \"' + self.toString() + '\" cannot contain itself',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tnot self.contains -> closure(contains) -> includes(self) \n" +
		"}.status";

	/**
	 * Validates the NonSelf_contains constraint of '<em>Data Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataClass_NonSelf_contains(DataClass dataClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(McnPackage.Literals.DATA_CLASS,
				 dataClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NonSelf_contains",
				 DATA_CLASS__NON_SELF_CONTAINS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the NonSelf_extends constraint of '<em>Data Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DATA_CLASS__NON_SELF_EXTENDS__EEXPRESSION = "Tuple {\n" +
		"\tmessage : String = 'The \\'DataClass\\' \"' + self.toString() + '\" cannot extend itself',\n" +
		"\tstatus : Boolean = \n" +
		"\t\t\tnot self.contains -> closure(xtends) -> includes(self) \n" +
		"}.status";

	/**
	 * Validates the NonSelf_extends constraint of '<em>Data Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataClass_NonSelf_extends(DataClass dataClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(McnPackage.Literals.DATA_CLASS,
				 dataClass,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NonSelf_extends",
				 DATA_CLASS__NON_SELF_EXTENDS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataItem(DataItem dataItem, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataItem, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataConstraint(DataConstraint dataConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataConstraint, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataType(DataType dataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceType(ReferenceType referenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitiveType(PrimitiveType primitiveType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primitiveType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(relationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTag(Tag tag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tag, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumValue(EnumValue enumValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumeration, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //McnValidator
