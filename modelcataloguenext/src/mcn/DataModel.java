/**
 */
package mcn;

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
 *   <li>{@link mcn.DataModel#isFinalised <em>Finalised</em>}</li>
 *   <li>{@link mcn.DataModel#getReleaseLabel <em>Release Label</em>}</li>
 *   <li>{@link mcn.DataModel#getFinalisedDate <em>Finalised Date</em>}</li>
 *   <li>{@link mcn.DataModel#getDataclasses <em>Dataclasses</em>}</li>
 * </ul>
 * </p>
 *
 * @see mcn.McnPackage#getDataModel()
 * @model
 * @generated
 */
public interface DataModel extends AdminsteredItem {
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
	 * @see mcn.McnPackage#getDataModel_Finalised()
	 * @model default="false"
	 * @generated
	 */
	boolean isFinalised();

	/**
	 * Sets the value of the '{@link mcn.DataModel#isFinalised <em>Finalised</em>}' attribute.
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
	 * @see mcn.McnPackage#getDataModel_ReleaseLabel()
	 * @model
	 * @generated
	 */
	String getReleaseLabel();

	/**
	 * Sets the value of the '{@link mcn.DataModel#getReleaseLabel <em>Release Label</em>}' attribute.
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
	 * @see mcn.McnPackage#getDataModel_FinalisedDate()
	 * @model
	 * @generated
	 */
	Date getFinalisedDate();

	/**
	 * Sets the value of the '{@link mcn.DataModel#getFinalisedDate <em>Finalised Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finalised Date</em>' attribute.
	 * @see #getFinalisedDate()
	 * @generated
	 */
	void setFinalisedDate(Date value);

	/**
	 * Returns the value of the '<em><b>Dataclasses</b></em>' reference list.
	 * The list contents are of type {@link mcn.DataClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataclasses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataclasses</em>' reference list.
	 * @see mcn.McnPackage#getDataModel_Dataclasses()
	 * @model
	 * @generated
	 */
	EList<DataClass> getDataclasses();

} // DataModel
