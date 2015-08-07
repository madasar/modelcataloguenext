/**
 */
package modelcatalogue;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelcatalogue.DataClass#getExtends <em>Extends</em>}</li>
 *   <li>{@link modelcatalogue.DataClass#getContains <em>Contains</em>}</li>
 *   <li>{@link modelcatalogue.DataClass#getDefines <em>Defines</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelcatalogue.McnPackage#getDataClass()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NonSelf_contains NonSelf_extends'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NonSelf_contains='Tuple {\n\tmessage : String = \'The \\\'DataClass\\\' \"\' + self.toString() + \'\" cannot contain itself\',\n\tstatus : Boolean = \n\t\t\tnot self.contains -> closure(contains) -> includes(self) \n}.status' NonSelf_extends='Tuple {\n\tmessage : String = \'The \\\'DataClass\\\' \"\' + self.toString() + \'\" cannot extend itself\',\n\tstatus : Boolean = \n\t\t\tnot self.extends -> closure(extends) -> includes(self) \n}.status'"
 * @generated
 */
public interface DataClass extends CatalogueElement {
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
	 * @see modelcatalogue.McnPackage#getDataClass_Extends()
	 * @model
	 * @generated
	 */
	DataClass getExtends();

	/**
	 * Sets the value of the '{@link modelcatalogue.DataClass#getExtends <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extends</em>' reference.
	 * @see #getExtends()
	 * @generated
	 */
	void setExtends(DataClass value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' reference list.
	 * The list contents are of type {@link modelcatalogue.DataClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' reference list.
	 * @see modelcatalogue.McnPackage#getDataClass_Contains()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DataClass> getContains();

	/**
	 * Returns the value of the '<em><b>Defines</b></em>' containment reference list.
	 * The list contents are of type {@link modelcatalogue.DataItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Defines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defines</em>' containment reference list.
	 * @see modelcatalogue.McnPackage#getDataClass_Defines()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DataItem> getDefines();

} // DataClass
