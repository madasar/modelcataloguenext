/**
 */
package mcn.tests;

import junit.textui.TestRunner;
import mcn.DataElement;
import mcn.McnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Element</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataElementTest extends AdminsteredItemTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataElementTest.class);
	}

	/**
	 * Constructs a new Data Element test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Element test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataElement getFixture() {
		return (DataElement)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(McnFactory.eINSTANCE.createDataElement());
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

} //DataElementTest
