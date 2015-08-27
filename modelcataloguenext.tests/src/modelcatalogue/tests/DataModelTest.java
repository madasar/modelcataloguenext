/**
 */
package modelcatalogue.tests;

import junit.textui.TestRunner;

import modelcatalogue.DataModel;
import modelcatalogue.McnFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataModelTest extends CatalogueElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataModelTest.class);
	}

	/**
	 * Constructs a new Data Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Data Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DataModel getFixture() {
		return (DataModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(McnFactory.eINSTANCE.createDataModel());
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

} //DataModelTest
