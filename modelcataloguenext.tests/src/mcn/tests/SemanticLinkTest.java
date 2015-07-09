/**
 */
package mcn.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mcn.McnFactory;
import mcn.SemanticLink;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Semantic Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SemanticLinkTest extends TestCase {

	/**
	 * The fixture for this Semantic Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticLink fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SemanticLinkTest.class);
	}

	/**
	 * Constructs a new Semantic Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticLinkTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Semantic Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SemanticLink fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Semantic Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemanticLink getFixture() {
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
		setFixture(McnFactory.eINSTANCE.createSemanticLink());
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

} //SemanticLinkTest
