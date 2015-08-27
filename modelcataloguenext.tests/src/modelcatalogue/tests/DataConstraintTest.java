/**
 */
package modelcatalogue.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import modelcatalogue.DataConstraint;
import modelcatalogue.McnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataConstraintTest extends TestCase {

	/**
	 * The fixture for this Data Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataConstraint fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataConstraintTest.class);
	}

	/**
	 * Constructs a new Data Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConstraintTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Data Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DataConstraint fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Data Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataConstraint getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(McnFactory.eINSTANCE.createDataConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DataConstraintTest
