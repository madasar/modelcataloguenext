/**
 */
package modelcatalogue;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelcatalogue.DataItem#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelcatalogue.McnPackage#getDataItem()
 * @model
 * @generated
 */
public interface DataItem extends CatalogueElement {
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
	 * @see modelcatalogue.McnPackage#getDataItem_Type()
	 * @model
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link modelcatalogue.DataItem#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // DataItem
