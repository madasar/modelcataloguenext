/**
 */
package mcn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semantic Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mcn.SemanticLink#getSource <em>Source</em>}</li>
 *   <li>{@link mcn.SemanticLink#getTarget <em>Target</em>}</li>
 *   <li>{@link mcn.SemanticLink#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mcn.McnPackage#getSemanticLink()
 * @model
 * @generated
 */
public interface SemanticLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(AdminsteredItem)
	 * @see mcn.McnPackage#getSemanticLink_Source()
	 * @model required="true"
	 * @generated
	 */
	AdminsteredItem getSource();

	/**
	 * Sets the value of the '{@link mcn.SemanticLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(AdminsteredItem value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AdminsteredItem)
	 * @see mcn.McnPackage#getSemanticLink_Target()
	 * @model required="true"
	 * @generated
	 */
	AdminsteredItem getTarget();

	/**
	 * Sets the value of the '{@link mcn.SemanticLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AdminsteredItem value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(int)
	 * @see mcn.McnPackage#getSemanticLink_Type()
	 * @model default="0"
	 * @generated
	 */
	int getType();

	/**
	 * Sets the value of the '{@link mcn.SemanticLink#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(int value);

} // SemanticLink
