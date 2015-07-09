/**
 */
package mcn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mcn.Term#getTakenFrom <em>Taken From</em>}</li>
 * </ul>
 * </p>
 *
 * @see mcn.McnPackage#getTerm()
 * @model
 * @generated
 */
public interface Term extends EObject {
	/**
	 * Returns the value of the '<em><b>Taken From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Taken From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Taken From</em>' reference.
	 * @see #setTakenFrom(Terminology)
	 * @see mcn.McnPackage#getTerm_TakenFrom()
	 * @model
	 * @generated
	 */
	Terminology getTakenFrom();

	/**
	 * Sets the value of the '{@link mcn.Term#getTakenFrom <em>Taken From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taken From</em>' reference.
	 * @see #getTakenFrom()
	 * @generated
	 */
	void setTakenFrom(Terminology value);

} // Term
