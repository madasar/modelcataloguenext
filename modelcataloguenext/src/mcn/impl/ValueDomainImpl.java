/**
 */
package mcn.impl;

import mcn.DataElement;
import mcn.DataType;
import mcn.McnPackage;
import mcn.ValueDomain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mcn.impl.ValueDomainImpl#getDataelement <em>Dataelement</em>}</li>
 *   <li>{@link mcn.impl.ValueDomainImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValueDomainImpl extends AdminsteredItemImpl implements ValueDomain {
	/**
	 * The cached value of the '{@link #getDataelement() <em>Dataelement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataelement()
	 * @generated
	 * @ordered
	 */
	protected DataElement dataelement;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DataType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueDomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McnPackage.Literals.VALUE_DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElement getDataelement() {
		if (dataelement != null && dataelement.eIsProxy()) {
			InternalEObject oldDataelement = (InternalEObject)dataelement;
			dataelement = (DataElement)eResolveProxy(oldDataelement);
			if (dataelement != oldDataelement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McnPackage.VALUE_DOMAIN__DATAELEMENT, oldDataelement, dataelement));
			}
		}
		return dataelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElement basicGetDataelement() {
		return dataelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataelement(DataElement newDataelement, NotificationChain msgs) {
		DataElement oldDataelement = dataelement;
		dataelement = newDataelement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McnPackage.VALUE_DOMAIN__DATAELEMENT, oldDataelement, newDataelement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataelement(DataElement newDataelement) {
		if (newDataelement != dataelement) {
			NotificationChain msgs = null;
			if (dataelement != null)
				msgs = ((InternalEObject)dataelement).eInverseRemove(this, McnPackage.DATA_ELEMENT__VALUEDOMAIN, DataElement.class, msgs);
			if (newDataelement != null)
				msgs = ((InternalEObject)newDataelement).eInverseAdd(this, McnPackage.DATA_ELEMENT__VALUEDOMAIN, DataElement.class, msgs);
			msgs = basicSetDataelement(newDataelement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McnPackage.VALUE_DOMAIN__DATAELEMENT, newDataelement, newDataelement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (DataType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McnPackage.VALUE_DOMAIN__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DataType newType) {
		DataType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McnPackage.VALUE_DOMAIN__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McnPackage.VALUE_DOMAIN__DATAELEMENT:
				if (dataelement != null)
					msgs = ((InternalEObject)dataelement).eInverseRemove(this, McnPackage.DATA_ELEMENT__VALUEDOMAIN, DataElement.class, msgs);
				return basicSetDataelement((DataElement)otherEnd, msgs);
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
			case McnPackage.VALUE_DOMAIN__DATAELEMENT:
				return basicSetDataelement(null, msgs);
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
			case McnPackage.VALUE_DOMAIN__DATAELEMENT:
				if (resolve) return getDataelement();
				return basicGetDataelement();
			case McnPackage.VALUE_DOMAIN__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case McnPackage.VALUE_DOMAIN__DATAELEMENT:
				setDataelement((DataElement)newValue);
				return;
			case McnPackage.VALUE_DOMAIN__TYPE:
				setType((DataType)newValue);
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
			case McnPackage.VALUE_DOMAIN__DATAELEMENT:
				setDataelement((DataElement)null);
				return;
			case McnPackage.VALUE_DOMAIN__TYPE:
				setType((DataType)null);
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
			case McnPackage.VALUE_DOMAIN__DATAELEMENT:
				return dataelement != null;
			case McnPackage.VALUE_DOMAIN__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

} //ValueDomainImpl
