package finstancemodelgenerator4mcn2resourcemcn;

//import statements
import fur.FInstance;
import org.eclipse.emf.ecore.resource.Resource;

import modelgenerator4mcn.ModelGenerator4Mcn;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import sitra.Rule;
import sitra.Transformer;
import sitra.SimpleTransformerImpl;

public class Main4FInstanceModelGenerator4Mcn2Resourcemcn0{

	//the entry point of the transformation
	public static void main(String[] args){
		//set up the Transformer
		Transformer transformer = new SimpleTransformerImpl(getRules());

		//create the model generator
		Iterator<FInstance> mm = new ModelGenerator4Mcn();

		//create a list to hold the results
		List<Resource> results = new ArrayList<Resource>();

		//get model instances to convert
		while(mm.hasNext()){
			FInstance next = mm.next();
			System.out.println(next);
			Resource result =  transformer.transform( FInstanceModelGenerator4Mcn2Resourcemcn0.class , next );
			System.out.println(result);
			results.add(result);
		}
	}

	//a list of the transformation rules
	static List<java.lang.Class<? extends Rule>> getRules(){
		List<java.lang.Class<? extends Rule>> rules = new ArrayList<java.lang.Class<? extends Rule>>();
		rules.add( FTuple_Relationship2EObjectRelationship21.class );
		rules.add( FTuple_DataConstraint_content2Stringcontent17.class );
		rules.add( FTuple_Tag_label2Stringlabel19.class );
		rules.add( FTuple_Relationship_type2Integertype22.class );
		rules.add( FTuple_DataConstraint2EObjectDataConstraint15.class );
		rules.add( FTuple_Tag_URI2StringURI20.class );
		rules.add( FTuple_CatalogueElement_createdByUser2IntegercreatedByUser14.class );
		rules.add( FTuple_CatalogueElement2EObjectCatalogueElement1.class );
		rules.add( FTuple_Tag2EObjectTag18.class );
		rules.add( FTuple_DataType2EObjectDataType6.class );
		rules.add( FTuple_DataClass2EObjectDataClass4.class );
		rules.add( FInstanceModelGenerator4Mcn2Resourcemcn0.class );
		rules.add( FTuple_CatalogueElement_GUID2StringGUID13.class );
		rules.add( FTuple_String2StringEString11.class );
		rules.add( FTuple_PrimitiveType2EObjectPrimitiveType8.class );
		rules.add( FTuple_DataModel2EObjectDataModel2.class );
		rules.add( FTuple_DataModel_releaseLabel2StringreleaseLabel3.class );
		rules.add( FTuple_EnumValue2EObjectEnumValue10.class );
		rules.add( FTuple_CatalogueElement_label2Stringlabel12.class );
		rules.add( FTuple_DataConstraint_language2Stringlanguage16.class );
		rules.add( FTuple_ReferenceType2EObjectReferenceType7.class );
		rules.add( FTuple_Enumeration2EObjectEnumeration9.class );
		rules.add( FTuple_DataItem2EObjectDataItem5.class );
		return rules;
	}

}

