/**
 */
package mcn.impl;

import java.util.Date;
import mcn.AdminsteredItem;
import mcn.Annotation;
import mcn.McnPackage;
import mcn.Term;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adminstered Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mcn.impl.AdminsteredItemImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link mcn.impl.AdminsteredItemImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link mcn.impl.AdminsteredItemImpl#getGUID <em>GUID</em>}</li>
 *   <li>{@link mcn.impl.AdminsteredItemImpl#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link mcn.impl.AdminsteredItemImpl#getCreatedByUser <em>Created By User</em>}</li>
 *   <li>{@link mcn.impl.AdminsteredItemImpl#getLinkedTo <em>Linked To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AdminsteredItemImpl extends MinimalEObjectImpl.Container implements AdminsteredItem {
	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation annotation;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getGUID() <em>GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGUID()
	 * @generated
	 * @ordered
	 */
	protected static final String GUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGUID() <em>GUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGUID()
	 * @generated
	 * @ordered
	 */
	protected String guid = GUID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateCreated() <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCreated()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_CREATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateCreated() <em>Date Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCreated()
	 * @generated
	 * @ordered
	 */
	protected Date dateCreated = DATE_CREATED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedByUser() <em>Created By User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUser()
	 * @generated
	 * @ordered
	 */
	protected static final int CREATED_BY_USER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCreatedByUser() <em>Created By User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedByUser()
	 * @generated
	 * @ordered
	 */
	protected int createdByUser = CREATED_BY_USER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLinkedTo() <em>Linked To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkedTo()
	 * @generated
	 * @ordered
	 */
	protected Term linkedTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdminsteredItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McnPackage.Literals.ADMINSTERED_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getAnnotation() {
		if (annotation != null && annotation.eIsProxy()) {
			InternalEObject oldAnnotation = (InternalEObject)annotation;
			annotation = (Annotation)eResolveProxy(oldAnnotation);
			if (annotation != oldAnnotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McnPackage.ADMINSTERED_ITEM__ANNOTATION, oldAnnotation, annotation));
			}
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation basicGetAnnotation() {
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotation(Annotation newAnnotation, NotificationChain msgs) {
		Annotation oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McnPackage.ADMINSTERED_ITEM__ANNOTATION, oldAnnotation, newAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotation(Annotation newAnnotation) {
		if (newAnnotation != annotation) {
			NotificationChain msgs = null;
			if (annotation != null)
				msgs = ((InternalEObject)annotation).eInverseRemove(this, McnPackage.ANNOTATION__ITEM, Annotation.class, msgs);
			if (newAnnotation != null)
				msgs = ((InternalEObject)newAnnotation).eInverseAdd(this, McnPackage.ANNOTATION__ITEM, Annotation.class, msgs);
			msgs = basicSetAnnotation(newAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McnPackage.ADMINSTERED_ITEM__ANNOTATION, newAnnotation, newAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McnPackage.ADMINSTERED_ITEM__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGUID() {
		return guid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGUID(String newGUID) {
		String oldGUID = guid;
		guid = newGUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McnPackage.ADMINSTERED_ITEM__GUID, oldGUID, guid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateCreated(Date newDateCreated) {
		Date oldDateCreated = dateCreated;
		dateCreated = newDateCreated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McnPackage.ADMINSTERED_ITEM__DATE_CREATED, oldDateCreated, dateCreated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCreatedByUser() {
		return createdByUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedByUser(int newCreatedByUser) {
		int oldCreatedByUser = createdByUser;
		createdByUser = newCreatedByUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McnPackage.ADMINSTERED_ITEM__CREATED_BY_USER, oldCreatedByUser, createdByUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term getLinkedTo() {
		if (linkedTo != null && linkedTo.eIsProxy()) {
			InternalEObject oldLinkedTo = (InternalEObject)linkedTo;
			linkedTo = (Term)eResolveProxy(oldLinkedTo);
			if (linkedTo != oldLinkedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McnPackage.ADMINSTERED_ITEM__LINKED_TO, oldLinkedTo, linkedTo));
			}
		}
		return linkedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Term basicGetLinkedTo() {
		return linkedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkedTo(Term newLinkedTo) {
		Term oldLinkedTo = linkedTo;
		linkedTo = newLinkedTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McnPackage.ADMINSTERED_ITEM__LINKED_TO, oldLinkedTo, linkedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McnPackage.ADMINSTERED_ITEM__ANNOTATION:
				if (annotation != null)
					msgs = ((InternalEObject)annotation).eInverseRemove(this, McnPackage.ANNOTATION__ITEM, Annotation.class, msgs);
				return basicSetAnnotation((Annotation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McnPackage.ADMINSTERED_ITEM__ANNOTATION:
				return basicSetAnnotation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case McnPackage.ADMINSTERED_ITEM__ANNOTATION:
				if (resolve) return getAnnotation();
				return basicGetAnnotation();
			case McnPackage.ADMINSTERED_ITEM__LABEL:
				return getLabel();
			case McnPackage.ADMINSTERED_ITEM__GUID:
				return getGUID();
			case McnPackage.ADMINSTERED_ITEM__DATE_CREATED:
				return getDateCreated();
			case McnPackage.ADMINSTERED_ITEM__CREATED_BY_USER:
				return getCreatedByUser();
			case McnPackage.ADMINSTERED_ITEM__LINKED_TO:
				if (resolve) return getLinkedTo();
				return basicGetLinkedTo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case McnPackage.ADMINSTERED_ITEM__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case McnPackage.ADMINSTERED_ITEM__LABEL:
				setLabel((String)newValue);
				return;
			case McnPackage.ADMINSTERED_ITEM__GUID:
				setGUID((String)newValue);
				return;
			case McnPackage.ADMINSTERED_ITEM__DATE_CREATED:
				setDateCreated((Date)newValue);
				return;
			case McnPackage.ADMINSTERED_ITEM__CREATED_BY_USER:
				setCreatedByUser((Integer)newValue);
				return;
			case McnPackage.ADMINSTERED_ITEM__LINKED_TO:
				setLinkedTo((Term)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case McnPackage.ADMINSTERED_ITEM__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case McnPackage.ADMINSTERED_ITEM__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case McnPackage.ADMINSTERED_ITEM__GUID:
				setGUID(GUID_EDEFAULT);
				return;
			case McnPackage.ADMINSTERED_ITEM__DATE_CREATED:
				setDateCreated(DATE_CREATED_EDEFAULT);
				return;
			case McnPackage.ADMINSTERED_ITEM__CREATED_BY_USER:
				setCreatedByUser(CREATED_BY_USER_EDEFAULT);
				return;
			case McnPackage.ADMINSTERED_ITEM__LINKED_TO:
				setLinkedTo((Term)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case McnPackage.ADMINSTERED_ITEM__ANNOTATION:
				return annotation != null;
			case McnPackage.ADMINSTERED_ITEM__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case McnPackage.ADMINSTERED_ITEM__GUID:
				return GUID_EDEFAULT == null ? guid != null : !GUID_EDEFAULT.equals(guid);
			case McnPackage.ADMINSTERED_ITEM__DATE_CREATED:
				return DATE_CREATED_EDEFAULT == null ? dateCreated != null : !DATE_CREATED_EDEFAULT.equals(dateCreated);
			case McnPackage.ADMINSTERED_ITEM__CREATED_BY_USER:
				return createdByUser != CREATED_BY_USER_EDEFAULT;
			case McnPackage.ADMINSTERED_ITEM__LINKED_TO:
				return linkedTo != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (label: ");
		result.append(label);
		result.append(", GUID: ");
		result.append(guid);
		result.append(", dateCreated: ");
		result.append(dateCreated);
		result.append(", createdByUser: ");
		result.append(createdByUser);
		result.append(')');
		return result.toString();
	}

} //AdminsteredItemImpl
