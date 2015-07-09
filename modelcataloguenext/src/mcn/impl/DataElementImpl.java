/**
 */
package mcn.impl;

import java.util.Collection;
import mcn.DataClass;
import mcn.DataElement;
import mcn.McnPackage;
import mcn.ValueDomain;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mcn.impl.DataElementImpl#getDataclass <em>Dataclass</em>}</li>
 *   <li>{@link mcn.impl.DataElementImpl#getValuedomain <em>Valuedomain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataElementImpl extends AdminsteredItemImpl implements DataElement {
	/**
	 * The cached value of the '{@link #getDataclass() <em>Dataclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataclass()
	 * @generated
	 * @ordered
	 */
	protected DataClass dataclass;

	/**
	 * The cached value of the '{@link #getValuedomain() <em>Valuedomain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuedomain()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueDomain> valuedomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McnPackage.Literals.DATA_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataClass getDataclass() {
		if (dataclass != null && dataclass.eIsProxy()) {
			InternalEObject oldDataclass = (InternalEObject)dataclass;
			dataclass = (DataClass)eResolveProxy(oldDataclass);
			if (dataclass != oldDataclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McnPackage.DATA_ELEMENT__DATACLASS, oldDataclass, dataclass));
			}
		}
		return dataclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataClass basicGetDataclass() {
		return dataclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataclass(DataClass newDataclass, NotificationChain msgs) {
		DataClass oldDataclass = dataclass;
		dataclass = newDataclass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McnPackage.DATA_ELEMENT__DATACLASS, oldDataclass, newDataclass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataclass(DataClass newDataclass) {
		if (newDataclass != dataclass) {
			NotificationChain msgs = null;
			if (dataclass != null)
				msgs = ((InternalEObject)dataclass).eInverseRemove(this, McnPackage.DATA_CLASS__DATAELEMENTS, DataClass.class, msgs);
			if (newDataclass != null)
				msgs = ((InternalEObject)newDataclass).eInverseAdd(this, McnPackage.DATA_CLASS__DATAELEMENTS, DataClass.class, msgs);
			msgs = basicSetDataclass(newDataclass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McnPackage.DATA_ELEMENT__DATACLASS, newDataclass, newDataclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueDomain> getValuedomain() {
		if (valuedomain == null) {
			valuedomain = new EObjectWithInverseResolvingEList<ValueDomain>(ValueDomain.class, this, McnPackage.DATA_ELEMENT__VALUEDOMAIN, McnPackage.VALUE_DOMAIN__DATAELEMENT);
		}
		return valuedomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McnPackage.DATA_ELEMENT__DATACLASS:
				if (dataclass != null)
					msgs = ((InternalEObject)dataclass).eInverseRemove(this, McnPackage.DATA_CLASS__DATAELEMENTS, DataClass.class, msgs);
				return basicSetDataclass((DataClass)otherEnd, msgs);
			case McnPackage.DATA_ELEMENT__VALUEDOMAIN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getValuedomain()).basicAdd(otherEnd, msgs);
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
			case McnPackage.DATA_ELEMENT__DATACLASS:
				return basicSetDataclass(null, msgs);
			case McnPackage.DATA_ELEMENT__VALUEDOMAIN:
				return ((InternalEList<?>)getValuedomain()).basicRemove(otherEnd, msgs);
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
			case McnPackage.DATA_ELEMENT__DATACLASS:
				if (resolve) return getDataclass();
				return basicGetDataclass();
			case McnPackage.DATA_ELEMENT__VALUEDOMAIN:
				return getValuedomain();
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
			case McnPackage.DATA_ELEMENT__DATACLASS:
				setDataclass((DataClass)newValue);
				return;
			case McnPackage.DATA_ELEMENT__VALUEDOMAIN:
				getValuedomain().clear();
				getValuedomain().addAll((Collection<? extends ValueDomain>)newValue);
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
			case McnPackage.DATA_ELEMENT__DATACLASS:
				setDataclass((DataClass)null);
				return;
			case McnPackage.DATA_ELEMENT__VALUEDOMAIN:
				getValuedomain().clear();
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
			case McnPackage.DATA_ELEMENT__DATACLASS:
				return dataclass != null;
			case McnPackage.DATA_ELEMENT__VALUEDOMAIN:
				return valuedomain != null && !valuedomain.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataElementImpl
