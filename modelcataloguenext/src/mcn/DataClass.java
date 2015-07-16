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
 *   <li>{@link mcn.DataClass#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see mcn.McnPackage#getDataClass()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NonSelf_clones'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NonSelf_clones='Tuple {\n\tmessage : String = \'The \\\'DataClass\\\' \"\' + self.toString() + \'\" cannot clone itself\',\n\tstatus : Boolean = \n\t\t\tself.contains <> self\n}.status'"
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
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link mcn.DataElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see mcn.McnPackage#getDataClass_Elements()
	 * @model
	 * @generated
	 */
	EList<DataElement> getElements();

} // DataClass
