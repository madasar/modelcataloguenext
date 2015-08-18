package finstancemodelgenerator4mcn2resourcemcn;

//import statements
import fur.FInstance;
import org.eclipse.emf.ecore.resource.Resource;

import sitra.Rule;
import sitra.Transformer;

import modelgenerator4mcn.ModelGenerator4Mcn;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EObject;
import java.util.List;


public class FInstanceModelGenerator4Mcn2Resourcemcn0 implements Rule<FInstance,Resource>{

	public boolean check(FInstance source){
		return true;
	}

	public Resource build(FInstance source, Transformer t){
		//create the result
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		//create the model result, where instances will be stored
		Resource result = resourceSet.createResource(URI.createFileURI("instance_model_of_mcn_"+System.currentTimeMillis()+".xmi"));

		return result;
	}

	public void setProperties(Resource target, FInstance source, Transformer t){

		List<org.eclipse.emf.ecore.EObject> FTuple_Relationship2EObjectRelationship21_conv = t.transformAll(FTuple_Relationship2EObjectRelationship21.class,source.getTuples("get_Relationship"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_Relationship2EObjectRelationship21_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_DataConstraint2EObjectDataConstraint15_conv = t.transformAll(FTuple_DataConstraint2EObjectDataConstraint15.class,source.getTuples("get_DataConstraint"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_DataConstraint2EObjectDataConstraint15_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_CatalogueElement2EObjectCatalogueElement1_conv = t.transformAll(FTuple_CatalogueElement2EObjectCatalogueElement1.class,source.getTuples("get_CatalogueElement"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_CatalogueElement2EObjectCatalogueElement1_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_Tag2EObjectTag18_conv = t.transformAll(FTuple_Tag2EObjectTag18.class,source.getTuples("get_Tag"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_Tag2EObjectTag18_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_DataType2EObjectDataType6_conv = t.transformAll(FTuple_DataType2EObjectDataType6.class,source.getTuples("get_DataType"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_DataType2EObjectDataType6_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_DataClass2EObjectDataClass4_conv = t.transformAll(FTuple_DataClass2EObjectDataClass4.class,source.getTuples("get_DataClass"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_DataClass2EObjectDataClass4_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_PrimitiveType2EObjectPrimitiveType8_conv = t.transformAll(FTuple_PrimitiveType2EObjectPrimitiveType8.class,source.getTuples("get_PrimitiveType"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_PrimitiveType2EObjectPrimitiveType8_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_DataModel2EObjectDataModel2_conv = t.transformAll(FTuple_DataModel2EObjectDataModel2.class,source.getTuples("get_DataModel"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_DataModel2EObjectDataModel2_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_EnumValue2EObjectEnumValue10_conv = t.transformAll(FTuple_EnumValue2EObjectEnumValue10.class,source.getTuples("get_EnumValue"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_EnumValue2EObjectEnumValue10_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_ReferenceType2EObjectReferenceType7_conv = t.transformAll(FTuple_ReferenceType2EObjectReferenceType7.class,source.getTuples("get_ReferenceType"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_ReferenceType2EObjectReferenceType7_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_Enumeration2EObjectEnumeration9_conv = t.transformAll(FTuple_Enumeration2EObjectEnumeration9.class,source.getTuples("get_Enumeration"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_Enumeration2EObjectEnumeration9_conv)
			if(data != null)
				target.getContents().add(data);


		List<org.eclipse.emf.ecore.EObject> FTuple_DataItem2EObjectDataItem5_conv = t.transformAll(FTuple_DataItem2EObjectDataItem5.class,source.getTuples("get_DataItem"));
		for (org.eclipse.emf.ecore.EObject data:FTuple_DataItem2EObjectDataItem5_conv)
			if(data != null)
				target.getContents().add(data);


		//write model out 
		try {
			target.save(null);
		}
		catch (java.io.IOException e){
			System.err.println("could not write generated file to directory");
			e.printStackTrace();
			System.exit(-1);
		}
	}

}
