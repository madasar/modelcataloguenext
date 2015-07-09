/**
 */
package mcn.impl;

import mcn.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelcataloguenextFactoryImpl extends EFactoryImpl implements ModelcataloguenextFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelcataloguenextFactory init() {
		try {
			ModelcataloguenextFactory theModelcataloguenextFactory = (ModelcataloguenextFactory)EPackage.Registry.INSTANCE.getEFactory(ModelcataloguenextPackage.eNS_URI);
			if (theModelcataloguenextFactory != null) {
				return theModelcataloguenextFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelcataloguenextFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelcataloguenextFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelcataloguenextPackage.DATA_CLASS: return createDataClass();
			case ModelcataloguenextPackage.DATA_MODEL: return createDataModel();
			case ModelcataloguenextPackage.DATA_ELEMENT: return createDataElement();
			case ModelcataloguenextPackage.ANNOTATION: return createAnnotation();
			case ModelcataloguenextPackage.VALUE_DOMAIN: return createValueDomain();
			case ModelcataloguenextPackage.REFERENCE_TYPE: return createReferenceType();
			case ModelcataloguenextPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case ModelcataloguenextPackage.ENUMERATION: return createEnumeration();
			case ModelcataloguenextPackage.SEMANTIC_LINK: return createSemanticLink();
			case ModelcataloguenextPackage.TERM: return createTerm();
			case ModelcataloguenextPackage.ENUM_VALUE: return createEnumValue();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataClass createDataClass() {
		DataClassImpl dataClass = new DataClassImpl();
		return dataClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel createDataModel() {
		DataModelImpl dataModel = new DataModelImpl();
		return dataModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElement createDataElement() {
		DataElementImpl dataElement = new DataElementImpl();
		return dataElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueDomain createValueDomain() {
		ValueDomainImpl valueDomain = new ValueDomainImpl();
		return valueDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType createReferenceType() {
		ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType createPrimitiveType() {
		PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
		return primitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration createEnumeration() {
		EnumerationImpl enumeration = new EnumerationImpl();
		return enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticLink createSemanticLink() {
		SemanticLinkImpl semanticLink = new SemanticLinkImpl();
		return semanticLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term createTerm() {
		TermImpl term = new TermImpl();
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumValue createEnumValue() {
		EnumValueImpl enumValue = new EnumValueImpl();
		return enumValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelcataloguenextPackage getModelcataloguenextPackage() {
		return (ModelcataloguenextPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelcataloguenextPackage getPackage() {
		return ModelcataloguenextPackage.eINSTANCE;
	}

} //ModelcataloguenextFactoryImpl
