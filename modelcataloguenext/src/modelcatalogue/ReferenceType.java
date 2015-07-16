/**
 */
package modelcatalogue;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelcatalogue.ReferenceType#getRelatedTo <em>Related To</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelcatalogue.McnPackage#getReferenceType()
 * @model
 * @generated
 */
public interface ReferenceType extends DataType {
	/**
	 * Returns the value of the '<em><b>Related To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related To</em>' reference.
	 * @see #setRelatedTo(DataClass)
	 * @see modelcatalogue.McnPackage#getReferenceType_RelatedTo()
	 * @model required="true"
	 * @generated
	 */
	DataClass getRelatedTo();

	/**
	 * Sets the value of the '{@link modelcatalogue.ReferenceType#getRelatedTo <em>Related To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Related To</em>' reference.
	 * @see #getRelatedTo()
	 * @generated
	 */
	void setRelatedTo(DataClass value);

} // ReferenceType
