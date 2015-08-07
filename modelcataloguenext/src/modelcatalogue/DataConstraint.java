/**
 */
package modelcatalogue;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelcatalogue.DataConstraint#getLanguage <em>Language</em>}</li>
 *   <li>{@link modelcatalogue.DataConstraint#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelcatalogue.McnPackage#getDataConstraint()
 * @model
 * @generated
 */
public interface DataConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see modelcatalogue.McnPackage#getDataConstraint_Language()
	 * @model required="true"
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link modelcatalogue.DataConstraint#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see modelcatalogue.McnPackage#getDataConstraint_Content()
	 * @model required="true"
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link modelcatalogue.DataConstraint#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // DataConstraint
