/**
 */
package mcn.impl;

import mcn.McnPackage;
import mcn.Term;
import mcn.Terminology;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mcn.impl.TermImpl#getTakenFrom <em>Taken From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermImpl extends MinimalEObjectImpl.Container implements Term {
	/**
	 * The cached value of the '{@link #getTakenFrom() <em>Taken From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTakenFrom()
	 * @generated
	 * @ordered
	 */
	protected Terminology takenFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McnPackage.Literals.TERM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminology getTakenFrom() {
		if (takenFrom != null && takenFrom.eIsProxy()) {
			InternalEObject oldTakenFrom = (InternalEObject)takenFrom;
			takenFrom = (Terminology)eResolveProxy(oldTakenFrom);
			if (takenFrom != oldTakenFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, McnPackage.TERM__TAKEN_FROM, oldTakenFrom, takenFrom));
			}
		}
		return takenFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminology basicGetTakenFrom() {
		return takenFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTakenFrom(Terminology newTakenFrom) {
		Terminology oldTakenFrom = takenFrom;
		takenFrom = newTakenFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McnPackage.TERM__TAKEN_FROM, oldTakenFrom, takenFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case McnPackage.TERM__TAKEN_FROM:
				if (resolve) return getTakenFrom();
				return basicGetTakenFrom();
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
			case McnPackage.TERM__TAKEN_FROM:
				setTakenFrom((Terminology)newValue);
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
			case McnPackage.TERM__TAKEN_FROM:
				setTakenFrom((Terminology)null);
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
			case McnPackage.TERM__TAKEN_FROM:
				return takenFrom != null;
		}
		return super.eIsSet(featureID);
	}

} //TermImpl
