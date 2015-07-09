/**
 */
package mcn.tests;

import junit.textui.TestRunner;
import mcn.EnumValue;
import mcn.McnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enum Value</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumValueTest extends AdminsteredItemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnumValueTest.class);
	}

	/**
	 * Constructs a new Enum Value test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumValueTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Enum Value test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EnumValue getFixture() {
		return (EnumValue)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(McnFactory.eINSTANCE.createEnumValue());
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

} //EnumValueTest
