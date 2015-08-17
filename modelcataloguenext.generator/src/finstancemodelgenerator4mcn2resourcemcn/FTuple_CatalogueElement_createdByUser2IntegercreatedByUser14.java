package finstancemodelgenerator4mcn2resourcemcn;

//import statements
import fur.FTuple;
import java.lang.Integer;

import sitra.Rule;
import sitra.Transformer;

import modelgenerator4mcn.ModelGenerator4Mcn;

public class FTuple_CatalogueElement_createdByUser2IntegercreatedByUser14 implements Rule<FTuple,Integer>{

	public boolean check(FTuple source){
		//check that there are no sub rules that convert the element
		//check the FTuple is a tuple of the get_CatalogueElement_createdByUser relation 
		return source.instanceOf( ((ModelGenerator4Mcn)source.getInstance().getMetaModel()).get_CatalogueElement_createdByUser() );
	}

	public Integer build(FTuple source, Transformer t){
		//create the result
		//create an Object (Integer) based on the given FTuple
		return new Integer(source.toInteger());
	}

	public void setProperties(Integer target, FTuple source, Transformer t){
	}

}
