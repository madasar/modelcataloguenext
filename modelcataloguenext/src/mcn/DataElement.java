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
 *   <li>{@link mcn.DataElement#getDataclass <em>Dataclass</em>}</li>
 *   <li>{@link mcn.DataElement#getValuedomain <em>Valuedomain</em>}</li>
 * </ul>
 * </p>
 *
 * @see mcn.McnPackage#getDataElement()
 * @model
 * @generated
 */
public interface DataElement extends AdminsteredItem {
	/**
	 * Returns the value of the '<em><b>Dataclass</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mcn.DataClass#getDataelements <em>Dataelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataclass</em>' reference.
	 * @see #setDataclass(DataClass)
	 * @see mcn.McnPackage#getDataElement_Dataclass()
	 * @see mcn.DataClass#getDataelements
	 * @model opposite="dataelements" required="true"
	 * @generated
	 */
	DataClass getDataclass();

	/**
	 * Sets the value of the '{@link mcn.DataElement#getDataclass <em>Dataclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataclass</em>' reference.
	 * @see #getDataclass()
	 * @generated
	 */
	void setDataclass(DataClass value);

	/**
	 * Returns the value of the '<em><b>Valuedomain</b></em>' reference list.
	 * The list contents are of type {@link mcn.ValueDomain}.
	 * It is bidirectional and its opposite is '{@link mcn.ValueDomain#getDataelement <em>Dataelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valuedomain</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valuedomain</em>' reference list.
	 * @see mcn.McnPackage#getDataElement_Valuedomain()
	 * @see mcn.ValueDomain#getDataelement
	 * @model opposite="dataelement"
	 * @generated
	 */
	EList<ValueDomain> getValuedomain();

} // DataElement
