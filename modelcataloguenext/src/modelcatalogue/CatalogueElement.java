/**
 */
package modelcatalogue;

import java.math.BigInteger;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catalogue Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link modelcatalogue.CatalogueElement#getLabel <em>Label</em>}</li>
 *   <li>{@link modelcatalogue.CatalogueElement#getGUID <em>GUID</em>}</li>
 *   <li>{@link modelcatalogue.CatalogueElement#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link modelcatalogue.CatalogueElement#getCreatedByUser <em>Created By User</em>}</li>
 *   <li>{@link modelcatalogue.CatalogueElement#getContraints <em>Contraints</em>}</li>
 *   <li>{@link modelcatalogue.CatalogueElement#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @see modelcatalogue.McnPackage#getCatalogueElement()
 * @model abstract="true"
 * @generated
 */
public interface CatalogueElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see modelcatalogue.McnPackage#getCatalogueElement_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link modelcatalogue.CatalogueElement#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>GUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>GUID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GUID</em>' attribute.
	 * @see #setGUID(String)
	 * @see modelcatalogue.McnPackage#getCatalogueElement_GUID()
	 * @model
	 * @generated
	 */
	String getGUID();

	/**
	 * Sets the value of the '{@link modelcatalogue.CatalogueElement#getGUID <em>GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GUID</em>' attribute.
	 * @see #getGUID()
	 * @generated
	 */
	void setGUID(String value);

	/**
	 * Returns the value of the '<em><b>Date Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Created</em>' attribute.
	 * @see #setDateCreated(Date)
	 * @see modelcatalogue.McnPackage#getCatalogueElement_DateCreated()
	 * @model required="true"
	 * @generated
	 */
	Date getDateCreated();

	/**
	 * Sets the value of the '{@link modelcatalogue.CatalogueElement#getDateCreated <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Created</em>' attribute.
	 * @see #getDateCreated()
	 * @generated
	 */
	void setDateCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Created By User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By User</em>' attribute.
	 * @see #setCreatedByUser(BigInteger)
	 * @see modelcatalogue.McnPackage#getCatalogueElement_CreatedByUser()
	 * @model required="true"
	 * @generated
	 */
	BigInteger getCreatedByUser();

	/**
	 * Sets the value of the '{@link modelcatalogue.CatalogueElement#getCreatedByUser <em>Created By User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User</em>' attribute.
	 * @see #getCreatedByUser()
	 * @generated
	 */
	void setCreatedByUser(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Contraints</b></em>' containment reference list.
	 * The list contents are of type {@link modelcatalogue.DataConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contraints</em>' containment reference list.
	 * @see modelcatalogue.McnPackage#getCatalogueElement_Contraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataConstraint> getContraints();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link modelcatalogue.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see modelcatalogue.McnPackage#getCatalogueElement_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

} // CatalogueElement
