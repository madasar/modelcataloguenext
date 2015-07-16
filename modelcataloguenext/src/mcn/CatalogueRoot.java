/**
 */
package mcn;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalogue Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mcn.CatalogueRoot#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see mcn.McnPackage#getCatalogueRoot()
 * @model
 * @generated
 */
public interface CatalogueRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' reference list.
	 * The list contents are of type {@link mcn.AdminsteredItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' reference list.
	 * @see mcn.McnPackage#getCatalogueRoot_Elements()
	 * @model
	 * @generated
	 */
	EList<AdminsteredItem> getElements();

} // CatalogueRoot
