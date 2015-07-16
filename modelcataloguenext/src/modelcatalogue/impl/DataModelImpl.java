/**
 */
package modelcatalogue.impl;

import java.util.Collection;
import java.util.Date;

import modelcatalogue.DataClass;
import modelcatalogue.DataModel;
import modelcatalogue.DataType;
import modelcatalogue.McnPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link modelcatalogue.impl.DataModelImpl#isFinalised <em>Finalised</em>}</li>
 *   <li>{@link modelcatalogue.impl.DataModelImpl#getReleaseLabel <em>Release Label</em>}</li>
 *   <li>{@link modelcatalogue.impl.DataModelImpl#getFinalisedDate <em>Finalised Date</em>}</li>
 *   <li>{@link modelcatalogue.impl.DataModelImpl#getDeclares <em>Declares</em>}</li>
 *   <li>{@link modelcatalogue.impl.DataModelImpl#getOwns <em>Owns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataModelImpl extends CatalogueElementImpl implements DataModel {
	/**
	 * The default value of the '{@link #isFinalised() <em>Finalised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinalised()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINALISED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinalised() <em>Finalised</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinalised()
	 * @generated
	 * @ordered
	 */
	protected boolean finalised = FINALISED_EDEFAULT;

	/**
	 * The default value of the '{@link #getReleaseLabel() <em>Release Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String RELEASE_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReleaseLabel() <em>Release Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseLabel()
	 * @generated
	 * @ordered
	 */
	protected String releaseLabel = RELEASE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinalisedDate() <em>Finalised Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalisedDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FINALISED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinalisedDate() <em>Finalised Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalisedDate()
	 * @generated
	 * @ordered
	 */
	protected Date finalisedDate = FINALISED_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDeclares() <em>Declares</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclares()
	 * @generated
	 * @ordered
	 */
	protected EList<DataClass> declares;

	/**
	 * The cached value of the '{@link #getOwns() <em>Owns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwns()
	 * @generated
	 * @ordered
	 */
	protected EList<DataType> owns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return McnPackage.Literals.DATA_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinalised() {
		return finalised;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalised(boolean newFinalised) {
		boolean oldFinalised = finalised;
		finalised = newFinalised;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McnPackage.DATA_MODEL__FINALISED, oldFinalised, finalised));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReleaseLabel() {
		return releaseLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseLabel(String newReleaseLabel) {
		String oldReleaseLabel = releaseLabel;
		releaseLabel = newReleaseLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McnPackage.DATA_MODEL__RELEASE_LABEL, oldReleaseLabel, releaseLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFinalisedDate() {
		return finalisedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalisedDate(Date newFinalisedDate) {
		Date oldFinalisedDate = finalisedDate;
		finalisedDate = newFinalisedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, McnPackage.DATA_MODEL__FINALISED_DATE, oldFinalisedDate, finalisedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataClass> getDeclares() {
		if (declares == null) {
			declares = new EObjectContainmentEList<DataClass>(DataClass.class, this, McnPackage.DATA_MODEL__DECLARES);
		}
		return declares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataType> getOwns() {
		if (owns == null) {
			owns = new EObjectContainmentEList<DataType>(DataType.class, this, McnPackage.DATA_MODEL__OWNS);
		}
		return owns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case McnPackage.DATA_MODEL__DECLARES:
				return ((InternalEList<?>)getDeclares()).basicRemove(otherEnd, msgs);
			case McnPackage.DATA_MODEL__OWNS:
				return ((InternalEList<?>)getOwns()).basicRemove(otherEnd, msgs);
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
			case McnPackage.DATA_MODEL__FINALISED:
				return isFinalised();
			case McnPackage.DATA_MODEL__RELEASE_LABEL:
				return getReleaseLabel();
			case McnPackage.DATA_MODEL__FINALISED_DATE:
				return getFinalisedDate();
			case McnPackage.DATA_MODEL__DECLARES:
				return getDeclares();
			case McnPackage.DATA_MODEL__OWNS:
				return getOwns();
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
			case McnPackage.DATA_MODEL__FINALISED:
				setFinalised((Boolean)newValue);
				return;
			case McnPackage.DATA_MODEL__RELEASE_LABEL:
				setReleaseLabel((String)newValue);
				return;
			case McnPackage.DATA_MODEL__FINALISED_DATE:
				setFinalisedDate((Date)newValue);
				return;
			case McnPackage.DATA_MODEL__DECLARES:
				getDeclares().clear();
				getDeclares().addAll((Collection<? extends DataClass>)newValue);
				return;
			case McnPackage.DATA_MODEL__OWNS:
				getOwns().clear();
				getOwns().addAll((Collection<? extends DataType>)newValue);
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
			case McnPackage.DATA_MODEL__FINALISED:
				setFinalised(FINALISED_EDEFAULT);
				return;
			case McnPackage.DATA_MODEL__RELEASE_LABEL:
				setReleaseLabel(RELEASE_LABEL_EDEFAULT);
				return;
			case McnPackage.DATA_MODEL__FINALISED_DATE:
				setFinalisedDate(FINALISED_DATE_EDEFAULT);
				return;
			case McnPackage.DATA_MODEL__DECLARES:
				getDeclares().clear();
				return;
			case McnPackage.DATA_MODEL__OWNS:
				getOwns().clear();
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
			case McnPackage.DATA_MODEL__FINALISED:
				return finalised != FINALISED_EDEFAULT;
			case McnPackage.DATA_MODEL__RELEASE_LABEL:
				return RELEASE_LABEL_EDEFAULT == null ? releaseLabel != null : !RELEASE_LABEL_EDEFAULT.equals(releaseLabel);
			case McnPackage.DATA_MODEL__FINALISED_DATE:
				return FINALISED_DATE_EDEFAULT == null ? finalisedDate != null : !FINALISED_DATE_EDEFAULT.equals(finalisedDate);
			case McnPackage.DATA_MODEL__DECLARES:
				return declares != null && !declares.isEmpty();
			case McnPackage.DATA_MODEL__OWNS:
				return owns != null && !owns.isEmpty();
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
		result.append(" (finalised: ");
		result.append(finalised);
		result.append(", releaseLabel: ");
		result.append(releaseLabel);
		result.append(", finalisedDate: ");
		result.append(finalisedDate);
		result.append(')');
		return result.toString();
	}

} //DataModelImpl
