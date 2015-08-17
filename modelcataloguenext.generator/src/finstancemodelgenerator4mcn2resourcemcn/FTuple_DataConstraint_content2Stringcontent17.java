package finstancemodelgenerator4mcn2resourcemcn;

//import statements
import fur.FTuple;
import java.lang.String;

import sitra.Rule;
import sitra.Transformer;

import modelgenerator4mcn.ModelGenerator4Mcn;

public class FTuple_DataConstraint_content2Stringcontent17 implements Rule<FTuple,String>{

	public boolean check(FTuple source){
		//check that there are no sub rules that convert the element
		//check the FTuple is a tuple of the get_DataConstraint_content relation 
		return source.instanceOf( ((ModelGenerator4Mcn)source.getInstance().getMetaModel()).get_DataConstraint_content() );
	}

	public String build(FTuple source, Transformer t){
		//create the result
		//create an Object (String) based on the given FTuple
		return source.toString();
	}

	public void setProperties(String target, FTuple source, Transformer t){
	}

}
