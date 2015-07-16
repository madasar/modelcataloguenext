/**
 */
package modelcatalogue.impl;

import java.util.Collection;

import modelcatalogue.DataClass;
import modelcatalogue.DataItem;
import modelcatalogue.McnPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link modelcatalogue.impl.DataClassImpl#getXtends <em>Xtends</em>}</li>
 *   <li>{@link modelcatalogue.impl.DataClassImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link modelcatalogue.impl.DataClassImpl#getDefines <em>Defines</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataClassImpl extends CatalogueElementImpl implements DataClass {
	/**
	 * The cached value of the '{@link #getXtends() <em>Xtends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXtends()
	 * @generated
	 * @ordered
	 */
	protected DataClass xtends;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<DataClass> contains;

	/**
	 * The cached value of the '{@link #getDefines() <em>Defines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefines()
	 * @generated
	 * @ordered
	 */
	protected EList<DataItem> defines;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McnPackage.Literals.DATA_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataClass getXtends() {
		if (xtends != null && xtends.eIsProxy()) {
			InternalEObject oldXtends = (InternalEObject)xtends;
			xtends = (DataClass)eResolveProxy(oldXtends);
			if (xtends != oldXtends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McnPackage.DATA_CLASS__XTENDS, oldXtends, xtends));
			}
		}
		return xtends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataClass basicGetXtends() {
		return xtends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXtends(DataClass newXtends) {
		DataClass oldXtends = xtends;
		xtends = newXtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McnPackage.DATA_CLASS__XTENDS, oldXtends, xtends));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataClass> getContains() {
		if (contains == null) {
			contains = new EObjectResolvingEList<DataClass>(DataClass.class, this, McnPackage.DATA_CLASS__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataItem> getDefines() {
		if (defines == null) {
			defines = new EObjectContainmentEList<DataItem>(DataItem.class, this, McnPackage.DATA_CLASS__DEFINES);
		}
		return defines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McnPackage.DATA_CLASS__DEFINES:
				return ((InternalEList<?>)getDefines()).basicRemove(otherEnd, msgs);
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
			case McnPackage.DATA_CLASS__XTENDS:
				if (resolve) return getXtends();
				return basicGetXtends();
			case McnPackage.DATA_CLASS__CONTAINS:
				return getContains();
			case McnPackage.DATA_CLASS__DEFINES:
				return getDefines();
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
			case McnPackage.DATA_CLASS__XTENDS:
				setXtends((DataClass)newValue);
				return;
			case McnPackage.DATA_CLASS__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends DataClass>)newValue);
				return;
			case McnPackage.DATA_CLASS__DEFINES:
				getDefines().clear();
				getDefines().addAll((Collection<? extends DataItem>)newValue);
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
			case McnPackage.DATA_CLASS__XTENDS:
				setXtends((DataClass)null);
				return;
			case McnPackage.DATA_CLASS__CONTAINS:
				getContains().clear();
				return;
			case McnPackage.DATA_CLASS__DEFINES:
				getDefines().clear();
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
			case McnPackage.DATA_CLASS__XTENDS:
				return xtends != null;
			case McnPackage.DATA_CLASS__CONTAINS:
				return contains != null && !contains.isEmpty();
			case McnPackage.DATA_CLASS__DEFINES:
				return defines != null && !defines.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataClassImpl
