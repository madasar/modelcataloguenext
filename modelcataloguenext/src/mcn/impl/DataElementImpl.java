/**
 */
package mcn.impl;

import java.util.Collection;
import mcn.DataElement;
import mcn.McnPackage;

import mcn.ValueDomain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mcn.impl.DataElementImpl#getValueDomain <em>Value Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataElementImpl extends AdminsteredItemImpl implements DataElement {
	/**
	 * The cached value of the '{@link #getValueDomain() <em>Value Domain</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueDomain> valueDomain;

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
	public EList<ValueDomain> getValueDomain() {
		if (valueDomain == null) {
			valueDomain = new EObjectResolvingEList<ValueDomain>(ValueDomain.class, this, McnPackage.DATA_ELEMENT__VALUE_DOMAIN);
		}
		return valueDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case McnPackage.DATA_ELEMENT__VALUE_DOMAIN:
				return getValueDomain();
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
			case McnPackage.DATA_ELEMENT__VALUE_DOMAIN:
				getValueDomain().clear();
				getValueDomain().addAll((Collection<? extends ValueDomain>)newValue);
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
			case McnPackage.DATA_ELEMENT__VALUE_DOMAIN:
				getValueDomain().clear();
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
			case McnPackage.DATA_ELEMENT__VALUE_DOMAIN:
				return valueDomain != null && !valueDomain.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DataElementImpl
