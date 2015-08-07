/**
 */
package modelcatalogue.impl;

import java.util.Collection;
import java.util.Date;
import modelcatalogue.CatalogueElement;
import modelcatalogue.DataConstraint;
import modelcatalogue.McnPackage;
import modelcatalogue.Tag;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Catalogue Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link modelcatalogue.impl.CatalogueElementImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link modelcatalogue.impl.CatalogueElementImpl#getGUID <em>GUID</em>}</li>
 *   <li>{@link modelcatalogue.impl.CatalogueElementImpl#getDateCreated <em>Date Created</em>}</li>
 *   <li>{@link modelcatalogue.impl.CatalogueElementImpl#getCreatedByUser <em>Created By User</em>}</li>
 *   <li>{@link modelcatalogue.impl.CatalogueElementImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link modelcatalogue.impl.CatalogueElementImpl#getTags <em>Tags</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CatalogueElementImpl extends MinimalEObjectImpl.Container implements CatalogueElement {
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
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<DataConstraint> constraints;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogueElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McnPackage.Literals.CATALOGUE_ELEMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, McnPackage.CATALOGUE_ELEMENT__LABEL, oldLabel, label));
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
			eNotify(new ENotificationImpl(this, Notification.SET, McnPackage.CATALOGUE_ELEMENT__GUID, oldGUID, guid));
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
			eNotify(new ENotificationImpl(this, Notification.SET, McnPackage.CATALOGUE_ELEMENT__DATE_CREATED, oldDateCreated, dateCreated));
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
			eNotify(new ENotificationImpl(this, Notification.SET, McnPackage.CATALOGUE_ELEMENT__CREATED_BY_USER, oldCreatedByUser, createdByUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<DataConstraint>(DataConstraint.class, this, McnPackage.CATALOGUE_ELEMENT__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, McnPackage.CATALOGUE_ELEMENT__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McnPackage.CATALOGUE_ELEMENT__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
			case McnPackage.CATALOGUE_ELEMENT__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
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
			case McnPackage.CATALOGUE_ELEMENT__LABEL:
				return getLabel();
			case McnPackage.CATALOGUE_ELEMENT__GUID:
				return getGUID();
			case McnPackage.CATALOGUE_ELEMENT__DATE_CREATED:
				return getDateCreated();
			case McnPackage.CATALOGUE_ELEMENT__CREATED_BY_USER:
				return getCreatedByUser();
			case McnPackage.CATALOGUE_ELEMENT__CONSTRAINTS:
				return getConstraints();
			case McnPackage.CATALOGUE_ELEMENT__TAGS:
				return getTags();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case McnPackage.CATALOGUE_ELEMENT__LABEL:
				setLabel((String)newValue);
				return;
			case McnPackage.CATALOGUE_ELEMENT__GUID:
				setGUID((String)newValue);
				return;
			case McnPackage.CATALOGUE_ELEMENT__DATE_CREATED:
				setDateCreated((Date)newValue);
				return;
			case McnPackage.CATALOGUE_ELEMENT__CREATED_BY_USER:
				setCreatedByUser((Integer)newValue);
				return;
			case McnPackage.CATALOGUE_ELEMENT__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends DataConstraint>)newValue);
				return;
			case McnPackage.CATALOGUE_ELEMENT__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
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
			case McnPackage.CATALOGUE_ELEMENT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case McnPackage.CATALOGUE_ELEMENT__GUID:
				setGUID(GUID_EDEFAULT);
				return;
			case McnPackage.CATALOGUE_ELEMENT__DATE_CREATED:
				setDateCreated(DATE_CREATED_EDEFAULT);
				return;
			case McnPackage.CATALOGUE_ELEMENT__CREATED_BY_USER:
				setCreatedByUser(CREATED_BY_USER_EDEFAULT);
				return;
			case McnPackage.CATALOGUE_ELEMENT__CONSTRAINTS:
				getConstraints().clear();
				return;
			case McnPackage.CATALOGUE_ELEMENT__TAGS:
				getTags().clear();
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
			case McnPackage.CATALOGUE_ELEMENT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case McnPackage.CATALOGUE_ELEMENT__GUID:
				return GUID_EDEFAULT == null ? guid != null : !GUID_EDEFAULT.equals(guid);
			case McnPackage.CATALOGUE_ELEMENT__DATE_CREATED:
				return DATE_CREATED_EDEFAULT == null ? dateCreated != null : !DATE_CREATED_EDEFAULT.equals(dateCreated);
			case McnPackage.CATALOGUE_ELEMENT__CREATED_BY_USER:
				return createdByUser != CREATED_BY_USER_EDEFAULT;
			case McnPackage.CATALOGUE_ELEMENT__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case McnPackage.CATALOGUE_ELEMENT__TAGS:
				return tags != null && !tags.isEmpty();
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

} //CatalogueElementImpl
