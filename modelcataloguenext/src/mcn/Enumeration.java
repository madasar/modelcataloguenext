/**
 */
package mcn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mcn.Enumeration#getEnums <em>Enums</em>}</li>
 * </ul>
 * </p>
 *
 * @see mcn.McnPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends DataType {
	/**
	 * Returns the value of the '<em><b>Enums</b></em>' reference list.
	 * The list contents are of type {@link mcn.EnumValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enums</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enums</em>' reference list.
	 * @see mcn.McnPackage#getEnumeration_Enums()
	 * @model
	 * @generated
	 */
	EList<EnumValue> getEnums();

} // Enumeration
