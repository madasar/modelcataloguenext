/**
 */
package mcn;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mcn.ValueDomain#getDataelement <em>Dataelement</em>}</li>
 *   <li>{@link mcn.ValueDomain#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see mcn.McnPackage#getValueDomain()
 * @model
 * @generated
 */
public interface ValueDomain extends AdminsteredItem {
	/**
	 * Returns the value of the '<em><b>Dataelement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mcn.DataElement#getValuedomain <em>Valuedomain</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataelement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataelement</em>' reference.
	 * @see #setDataelement(DataElement)
	 * @see mcn.McnPackage#getValueDomain_Dataelement()
	 * @see mcn.DataElement#getValuedomain
	 * @model opposite="valuedomain" required="true"
	 * @generated
	 */
	DataElement getDataelement();

	/**
	 * Sets the value of the '{@link mcn.ValueDomain#getDataelement <em>Dataelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dataelement</em>' reference.
	 * @see #getDataelement()
	 * @generated
	 */
	void setDataelement(DataElement value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DataType)
	 * @see mcn.McnPackage#getValueDomain_Type()
	 * @model required="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link mcn.ValueDomain#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // ValueDomain
