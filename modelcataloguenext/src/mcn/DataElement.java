/**
 */
package mcn;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mcn.DataElement#getValueDomain <em>Value Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see mcn.McnPackage#getDataElement()
 * @model
 * @generated
 */
public interface DataElement extends AdminsteredItem {

	/**
	 * Returns the value of the '<em><b>Value Domain</b></em>' reference list.
	 * The list contents are of type {@link mcn.ValueDomain}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Domain</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Domain</em>' reference list.
	 * @see mcn.McnPackage#getDataElement_ValueDomain()
	 * @model
	 * @generated
	 */
	EList<ValueDomain> getValueDomain();
} // DataElement
