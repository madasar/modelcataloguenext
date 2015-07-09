/**
 */
package mcn.impl;

import mcn.DataClass;
import mcn.McnPackage;
import mcn.ReferenceType;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mcn.impl.ReferenceTypeImpl#getRelatedTo <em>Related To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceTypeImpl extends DataTypeImpl implements ReferenceType {
	/**
	 * The cached value of the '{@link #getRelatedTo() <em>Related To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedTo()
	 * @generated
	 * @ordered
	 */
	protected DataClass relatedTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McnPackage.Literals.REFERENCE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataClass getRelatedTo() {
		if (relatedTo != null && relatedTo.eIsProxy()) {
			InternalEObject oldRelatedTo = (InternalEObject)relatedTo;
			relatedTo = (DataClass)eResolveProxy(oldRelatedTo);
			if (relatedTo != oldRelatedTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McnPackage.REFERENCE_TYPE__RELATED_TO, oldRelatedTo, relatedTo));
			}
		}
		return relatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataClass basicGetRelatedTo() {
		return relatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelatedTo(DataClass newRelatedTo) {
		DataClass oldRelatedTo = relatedTo;
		relatedTo = newRelatedTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McnPackage.REFERENCE_TYPE__RELATED_TO, oldRelatedTo, relatedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case McnPackage.REFERENCE_TYPE__RELATED_TO:
				if (resolve) return getRelatedTo();
				return basicGetRelatedTo();
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
			case McnPackage.REFERENCE_TYPE__RELATED_TO:
				setRelatedTo((DataClass)newValue);
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
			case McnPackage.REFERENCE_TYPE__RELATED_TO:
				setRelatedTo((DataClass)null);
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
			case McnPackage.REFERENCE_TYPE__RELATED_TO:
				return relatedTo != null;
		}
		return super.eIsSet(featureID);
	}

} //ReferenceTypeImpl
