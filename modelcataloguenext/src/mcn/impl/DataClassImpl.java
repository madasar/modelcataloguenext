/**
 */
package mcn.impl;

import java.util.Collection;
import mcn.DataClass;
import mcn.DataElement;
import mcn.DataModel;
import mcn.McnPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mcn.impl.DataClassImpl#getExtends <em>Extends</em>}</li>
 *   <li>{@link mcn.impl.DataClassImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link mcn.impl.DataClassImpl#getDatamodel <em>Datamodel</em>}</li>
 *   <li>{@link mcn.impl.DataClassImpl#getDataelements <em>Dataelements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataClassImpl extends AdminsteredItemImpl implements DataClass {
	/**
	 * The cached value of the '{@link #getExtends() <em>Extends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtends()
	 * @generated
	 * @ordered
	 */
	protected DataClass extends_;

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
	 * The cached value of the '{@link #getDatamodel() <em>Datamodel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatamodel()
	 * @generated
	 * @ordered
	 */
	protected DataModel datamodel;

	/**
	 * The cached value of the '{@link #getDataelements() <em>Dataelements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataelements()
	 * @generated
	 * @ordered
	 */
	protected EList<DataElement> dataelements;

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
	public DataClass getExtends() {
		if (extends_ != null && extends_.eIsProxy()) {
			InternalEObject oldExtends = (InternalEObject)extends_;
			extends_ = (DataClass)eResolveProxy(oldExtends);
			if (extends_ != oldExtends) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McnPackage.DATA_CLASS__EXTENDS, oldExtends, extends_));
			}
		}
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataClass basicGetExtends() {
		return extends_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtends(DataClass newExtends) {
		DataClass oldExtends = extends_;
		extends_ = newExtends;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McnPackage.DATA_CLASS__EXTENDS, oldExtends, extends_));
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
	public DataModel getDatamodel() {
		if (datamodel != null && datamodel.eIsProxy()) {
			InternalEObject oldDatamodel = (InternalEObject)datamodel;
			datamodel = (DataModel)eResolveProxy(oldDatamodel);
			if (datamodel != oldDatamodel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McnPackage.DATA_CLASS__DATAMODEL, oldDatamodel, datamodel));
			}
		}
		return datamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModel basicGetDatamodel() {
		return datamodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDatamodel(DataModel newDatamodel, NotificationChain msgs) {
		DataModel oldDatamodel = datamodel;
		datamodel = newDatamodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, McnPackage.DATA_CLASS__DATAMODEL, oldDatamodel, newDatamodel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatamodel(DataModel newDatamodel) {
		if (newDatamodel != datamodel) {
			NotificationChain msgs = null;
			if (datamodel != null)
				msgs = ((InternalEObject)datamodel).eInverseRemove(this, McnPackage.DATA_MODEL__DATACLASSES, DataModel.class, msgs);
			if (newDatamodel != null)
				msgs = ((InternalEObject)newDatamodel).eInverseAdd(this, McnPackage.DATA_MODEL__DATACLASSES, DataModel.class, msgs);
			msgs = basicSetDatamodel(newDatamodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McnPackage.DATA_CLASS__DATAMODEL, newDatamodel, newDatamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataElement> getDataelements() {
		if (dataelements == null) {
			dataelements = new EObjectWithInverseResolvingEList<DataElement>(DataElement.class, this, McnPackage.DATA_CLASS__DATAELEMENTS, McnPackage.DATA_ELEMENT__DATACLASS);
		}
		return dataelements;
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
			case McnPackage.DATA_CLASS__DATAMODEL:
				if (datamodel != null)
					msgs = ((InternalEObject)datamodel).eInverseRemove(this, McnPackage.DATA_MODEL__DATACLASSES, DataModel.class, msgs);
				return basicSetDatamodel((DataModel)otherEnd, msgs);
			case McnPackage.DATA_CLASS__DATAELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDataelements()).basicAdd(otherEnd, msgs);
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
			case McnPackage.DATA_CLASS__DATAMODEL:
				return basicSetDatamodel(null, msgs);
			case McnPackage.DATA_CLASS__DATAELEMENTS:
				return ((InternalEList<?>)getDataelements()).basicRemove(otherEnd, msgs);
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
			case McnPackage.DATA_CLASS__EXTENDS:
				if (resolve) return getExtends();
				return basicGetExtends();
			case McnPackage.DATA_CLASS__CONTAINS:
				return getContains();
			case McnPackage.DATA_CLASS__DATAMODEL:
				if (resolve) return getDatamodel();
				return basicGetDatamodel();
			case McnPackage.DATA_CLASS__DATAELEMENTS:
				return getDataelements();
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
			case McnPackage.DATA_CLASS__EXTENDS:
				setExtends((DataClass)newValue);
				return;
			case McnPackage.DATA_CLASS__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends DataClass>)newValue);
				return;
			case McnPackage.DATA_CLASS__DATAMODEL:
				setDatamodel((DataModel)newValue);
				return;
			case McnPackage.DATA_CLASS__DATAELEMENTS:
				getDataelements().clear();
				getDataelements().addAll((Collection<? extends DataElement>)newValue);
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
			case McnPackage.DATA_CLASS__EXTENDS:
				setExtends((DataClass)null);
				return;
			case McnPackage.DATA_CLASS__CONTAINS:
				getContains().clear();
				return;
			case McnPackage.DATA_CLASS__DATAMODEL:
				setDatamodel((DataModel)null);
				return;
			case McnPackage.DATA_CLASS__DATAELEMENTS:
				getDataelements().clear();
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
			case McnPackage.DATA_CLASS__EXTENDS:
				return extends_ != null;
			case McnPackage.DATA_CLASS__CONTAINS:
				return contains != null && !contains.isEmpty();
			case McnPackage.DATA_CLASS__DATAMODEL:
				return datamodel != null;
			case McnPackage.DATA_CLASS__DATAELEMENTS:
				return dataelements != null && !dataelements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataClassImpl
