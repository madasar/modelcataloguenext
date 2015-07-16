/**
 */
package modelcatalogue;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelcatalogue.DataModel#isFinalised <em>Finalised</em>}</li>
 *   <li>{@link modelcatalogue.DataModel#getReleaseLabel <em>Release Label</em>}</li>
 *   <li>{@link modelcatalogue.DataModel#getFinalisedDate <em>Finalised Date</em>}</li>
 *   <li>{@link modelcatalogue.DataModel#getDeclares <em>Declares</em>}</li>
 *   <li>{@link modelcatalogue.DataModel#getOwns <em>Owns</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelcatalogue.McnPackage#getDataModel()
 * @model
 * @generated
 */
public interface DataModel extends CatalogueElement {
	/**
	 * Returns the value of the '<em><b>Finalised</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finalised</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalised</em>' attribute.
	 * @see #setFinalised(boolean)
	 * @see modelcatalogue.McnPackage#getDataModel_Finalised()
	 * @model default="false"
	 * @generated
	 */
	boolean isFinalised();

	/**
	 * Sets the value of the '{@link modelcatalogue.DataModel#isFinalised <em>Finalised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalised</em>' attribute.
	 * @see #isFinalised()
	 * @generated
	 */
	void setFinalised(boolean value);

	/**
	 * Returns the value of the '<em><b>Release Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Label</em>' attribute.
	 * @see #setReleaseLabel(String)
	 * @see modelcatalogue.McnPackage#getDataModel_ReleaseLabel()
	 * @model
	 * @generated
	 */
	String getReleaseLabel();

	/**
	 * Sets the value of the '{@link modelcatalogue.DataModel#getReleaseLabel <em>Release Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Label</em>' attribute.
	 * @see #getReleaseLabel()
	 * @generated
	 */
	void setReleaseLabel(String value);

	/**
	 * Returns the value of the '<em><b>Finalised Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Finalised Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finalised Date</em>' attribute.
	 * @see #setFinalisedDate(Date)
	 * @see modelcatalogue.McnPackage#getDataModel_FinalisedDate()
	 * @model required="true"
	 * @generated
	 */
	Date getFinalisedDate();

	/**
	 * Sets the value of the '{@link modelcatalogue.DataModel#getFinalisedDate <em>Finalised Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalised Date</em>' attribute.
	 * @see #getFinalisedDate()
	 * @generated
	 */
	void setFinalisedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Declares</b></em>' containment reference list.
	 * The list contents are of type {@link modelcatalogue.DataClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declares</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declares</em>' containment reference list.
	 * @see modelcatalogue.McnPackage#getDataModel_Declares()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DataClass> getDeclares();

	/**
	 * Returns the value of the '<em><b>Owns</b></em>' containment reference list.
	 * The list contents are of type {@link modelcatalogue.DataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' containment reference list.
	 * @see modelcatalogue.McnPackage#getDataModel_Owns()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DataType> getOwns();

} // DataModel
