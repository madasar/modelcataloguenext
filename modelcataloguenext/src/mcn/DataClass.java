/**
 */
package mcn;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mcn.DataClass#getExtends <em>Extends</em>}</li>
 *   <li>{@link mcn.DataClass#getContains <em>Contains</em>}</li>
 *   <li>{@link mcn.DataClass#getDatamodel <em>Datamodel</em>}</li>
 *   <li>{@link mcn.DataClass#getDataelements <em>Dataelements</em>}</li>
 * </ul>
 * </p>
 *
 * @see mcn.McnPackage#getDataClass()
 * @model
 * @generated
 */
public interface DataClass extends AdminsteredItem {
	/**
	 * Returns the value of the '<em><b>Extends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extends</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extends</em>' reference.
	 * @see #setExtends(DataClass)
	 * @see mcn.McnPackage#getDataClass_Extends()
	 * @model
	 * @generated
	 */
	DataClass getExtends();

	/**
	 * Sets the value of the '{@link mcn.DataClass#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(DataClass value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link mcn.DataClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see mcn.McnPackage#getDataClass_Contains()
	 * @model
	 * @generated
	 */
	EList<DataClass> getContains();

	/**
	 * Returns the value of the '<em><b>Datamodel</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mcn.DataModel#getDataclasses <em>Dataclasses</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datamodel</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datamodel</em>' reference.
	 * @see #setDatamodel(DataModel)
	 * @see mcn.McnPackage#getDataClass_Datamodel()
	 * @see mcn.DataModel#getDataclasses
	 * @model opposite="dataclasses" required="true"
	 * @generated
	 */
	DataModel getDatamodel();

	/**
	 * Sets the value of the '{@link mcn.DataClass#getDatamodel <em>Datamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datamodel</em>' reference.
	 * @see #getDatamodel()
	 * @generated
	 */
	void setDatamodel(DataModel value);

	/**
	 * Returns the value of the '<em><b>Dataelements</b></em>' reference list.
	 * The list contents are of type {@link mcn.DataElement}.
	 * It is bidirectional and its opposite is '{@link mcn.DataElement#getDataclass <em>Dataclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dataelements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dataelements</em>' reference list.
	 * @see mcn.McnPackage#getDataClass_Dataelements()
	 * @see mcn.DataElement#getDataclass
	 * @model opposite="dataclass"
	 * @generated
	 */
	EList<DataElement> getDataelements();

} // DataClass
