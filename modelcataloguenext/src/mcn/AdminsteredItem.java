/**
 */
package mcn;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adminstered Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link mcn.AdminsteredItem#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link mcn.AdminsteredItem#getLabel <em>Label</em>}</li>
 *   <li>{@link mcn.AdminsteredItem#getGUID <em>GUID</em>}</li>
 *   <li>{@link mcn.AdminsteredItem#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link mcn.AdminsteredItem#getCreatedByUser <em>Created By User</em>}</li>
 *   <li>{@link mcn.AdminsteredItem#getLinkedTo <em>Linked To</em>}</li>
 * </ul>
 * </p>
 *
 * @see mcn.McnPackage#getAdminsteredItem()
 * @model abstract="true"
 * @generated
 */
public interface AdminsteredItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link mcn.Annotation#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' reference.
	 * @see #setAnnotation(Annotation)
	 * @see mcn.McnPackage#getAdminsteredItem_Annotation()
	 * @see mcn.Annotation#getItem
	 * @model opposite="item"
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link mcn.AdminsteredItem#getAnnotation <em>Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

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
	 * @see mcn.McnPackage#getAdminsteredItem_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link mcn.AdminsteredItem#getLabel <em>Label</em>}' attribute.
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
	 * @see mcn.McnPackage#getAdminsteredItem_GUID()
	 * @model
	 * @generated
	 */
	String getGUID();

	/**
	 * Sets the value of the '{@link mcn.AdminsteredItem#getGUID <em>GUID</em>}' attribute.
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
	 * @see mcn.McnPackage#getAdminsteredItem_DateCreated()
	 * @model
	 * @generated
	 */
	Date getDateCreated();

	/**
	 * Sets the value of the '{@link mcn.AdminsteredItem#getDateCreated <em>Date Created</em>}' attribute.
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
	 * @see #setCreatedByUser(int)
	 * @see mcn.McnPackage#getAdminsteredItem_CreatedByUser()
	 * @model
	 * @generated
	 */
	int getCreatedByUser();

	/**
	 * Sets the value of the '{@link mcn.AdminsteredItem#getCreatedByUser <em>Created By User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By User</em>' attribute.
	 * @see #getCreatedByUser()
	 * @generated
	 */
	void setCreatedByUser(int value);

	/**
	 * Returns the value of the '<em><b>Linked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked To</em>' reference.
	 * @see #setLinkedTo(Term)
	 * @see mcn.McnPackage#getAdminsteredItem_LinkedTo()
	 * @model
	 * @generated
	 */
	Term getLinkedTo();

	/**
	 * Sets the value of the '{@link mcn.AdminsteredItem#getLinkedTo <em>Linked To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linked To</em>' reference.
	 * @see #getLinkedTo()
	 * @generated
	 */
	void setLinkedTo(Term value);

} // AdminsteredItem
