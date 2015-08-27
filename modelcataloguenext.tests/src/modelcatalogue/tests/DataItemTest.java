/**
 */
package modelcatalogue.tests;

import junit.textui.TestRunner;

import modelcatalogue.DataItem;
import modelcatalogue.McnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Item</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataItemTest extends CatalogueElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataItemTest.class);
	}

	/**
	 * Constructs a new Data Item test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataItemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Item test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataItem getFixture() {
		return (DataItem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(McnFactory.eINSTANCE.createDataItem());
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

} //DataItemTest
