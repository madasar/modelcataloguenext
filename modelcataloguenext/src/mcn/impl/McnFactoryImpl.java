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
public class McnFactoryImpl extends EFactoryImpl implements McnFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static McnFactory init() {
		try {
			McnFactory theMcnFactory = (McnFactory)EPackage.Registry.INSTANCE.getEFactory(McnPackage.eNS_URI);
			if (theMcnFactory != null) {
				return theMcnFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new McnFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public McnFactoryImpl() {
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
			case McnPackage.DATA_CLASS: return createDataClass();
			case McnPackage.DATA_MODEL: return createDataModel();
			case McnPackage.DATA_ELEMENT: return createDataElement();
			case McnPackage.ANNOTATION: return createAnnotation();
			case McnPackage.VALUE_DOMAIN: return createValueDomain();
			case McnPackage.REFERENCE_TYPE: return createReferenceType();
			case McnPackage.PRIMITIVE_TYPE: return createPrimitiveType();
			case McnPackage.ENUMERATION: return createEnumeration();
			case McnPackage.SEMANTIC_LINK: return createSemanticLink();
			case McnPackage.TERM: return createTerm();
			case McnPackage.ENUM_VALUE: return createEnumValue();
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
	public McnPackage getMcnPackage() {
		return (McnPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static McnPackage getPackage() {
		return McnPackage.eINSTANCE;
	}

} //McnFactoryImpl
