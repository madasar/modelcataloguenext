/**
 */
package mcn.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mcn.McnFactory;
import mcn.Term;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TermTest extends TestCase {

	/**
	 * The fixture for this Term test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Term fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TermTest.class);
	}

	/**
	 * Constructs a new Term test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Term test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Term fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Term test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Term getFixture() {
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
		setFixture(McnFactory.eINSTANCE.createTerm());
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

} //TermTest
