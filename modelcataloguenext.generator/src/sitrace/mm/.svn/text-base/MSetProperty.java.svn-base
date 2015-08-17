package sitrace.mm;

import org.eclipse.emf.ecore.EStructuralFeature;



public class MSetProperty{

	private EStructuralFeature structuralFeature;
	private String binaryRelationMethod;
	private String dataRelationMethod;
	private String secondDataRelationMethod;
	private MRule convertor;
	private boolean bool;

	public MSetProperty(){

	}

	public MSetProperty(boolean b){
		bool=b;
	}

	public EStructuralFeature getEStructuralFeature(){
		return structuralFeature;
	}

	public String getBinaryRelationMethod(){
		return binaryRelationMethod;
	}

	public String getDataRelationMethod(){
		return dataRelationMethod;
	}

	public MRule getConvertor(){
		return convertor;
	}

	public boolean ruleNotKnown(){
		return (convertor==null ? true : false);
	}

	public String getSecondDataRelationMethod(){
		return secondDataRelationMethod;
	}

	public void setEStructuralFeature(EStructuralFeature esf){
		structuralFeature = esf;
	}

	public void setBinaryRelationMethod(String binrel){
		binaryRelationMethod = binrel;
	}

	public void setDataRelationMethod(String type){
		dataRelationMethod = type;
	}

	public void setSecondDataRelationMethod(String type){
		secondDataRelationMethod = type;
	}
	public void setConvertor(MRule conv){
		convertor = conv;
	}

	public boolean convertsBoolean(){
		return bool;
	}

}
