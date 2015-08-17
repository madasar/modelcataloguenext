package fur;

import kodkod.instance.Instance;
import kodkod.instance.Tuple;
import kodkod.engine.Solution;
import kodkod.ast.Relation;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

import java.lang.reflect.Method;

public class FInstance<M>{
	private M furmetamodel;
	private Solution solution;
	private Map<String, List<FTuple>> ftupleCache;
	private Map<Tuple, FTuple> tupleMap;

	public FInstance(M f, Solution s){
		furmetamodel = f;
		solution = s;
		ftupleCache = new HashMap<String, List<FTuple>>();
		tupleMap = new HashMap<Tuple, FTuple>();
	}
	
	public M getMetaModel(){
		return furmetamodel;
	}
	
	public Instance getInstance(){
		return solution.instance();
	}
	
	public Solution getSolution(){
		return solution;
	}

	public String toString(){
		if (getInstance()==null)
			return solution.toString();
		else
			return getInstance().toString();
	}
/*
	public List<FTuple> getTuples(FMetaElement type){
		return this.getTuples(type.getGetMethodName());
	}
*/
	public List<Tuple> getTTuples(Relation r){
		if (r==null||this.getInstance()==null||this.getInstance().tuples(r)==null||this.getInstance().tuples(r).size()==0)
			return new ArrayList<Tuple>();
		else
			return new ArrayList<Tuple>(this.getInstance().tuples(r));
	}

	public List<FTuple> getTuples(String methodName){
		List<FTuple> result = ftupleCache.get(methodName);
		if(result == null){
			//the result is not in the cache
			//call getUncachedTuples
			result = this.getUncachedTuples(methodName);
			//put the result in the cache for next time
			ftupleCache.put(methodName, result);
		}
		return result;
	}


	private List<FTuple> getUncachedTuples(String methodName){
		List<FTuple> ftupleResult = new ArrayList<FTuple>();

		Method method = null;
		Method methodIsSuper = null;
		Method methodAllSub = null;

		Relation relation = null;
		Boolean isSuper = false;	
		List<Relation> subs = null;

		try{
			//get the getmethod
			method = furmetamodel.getClass().getMethod(methodName, new Class[0]);
			//get the getXissuper method
			methodIsSuper = furmetamodel.getClass().getMethod(methodName+"IsSuper", new Class[0]);

		}catch (Exception e){
			System.err.println("could not get method");		
		}

		try{
		        //get the relation object that corresponds to the FMetaElement 
		        //from the model by invoking the method
			relation = (Relation) method.invoke(furmetamodel, new Object[0]);
			if (methodIsSuper!=null)
				isSuper = (Boolean) methodIsSuper.invoke(furmetamodel, new Object[0]);
			if(isSuper){			
				//get the getXAllSub method
				methodAllSub = furmetamodel.getClass().getMethod(methodName+"GetAllSubRelations", new Class[0]);
				subs = (List<Relation>) methodAllSub.invoke(furmetamodel, new Object[0]);
			}
		}catch (Exception e){
			System.err.println("could not call method");		
		}

		Relation resultRelation = relation;
		Set<Tuple> allTuples =  new HashSet<Tuple>();
		allTuples.addAll(solution.instance().tuples(relation));

		/* make sure FTuples are only an instance of the requested type this no longer works as 
		sub types classifiers are used as types for fields/references...
		if (subs!=null){
			Set<Tuple> subTuples =  new HashSet<Tuple>();
			for(Relation subrel : subs){
				subTuples.addAll(solution.instance().tuples(subrel));
			}
			allTuples.removeAll(subTuples);
		}*/			

		//iterate through the set and create the list of FTuples
		for (Tuple t : allTuples){
			//Should not create new unless nessasery#
			if (tupleMap.get(t)==null){
				FTuple ft = new FTuple(t,this);
				ftupleResult.add( ft );
				tupleMap.put(t,ft);
			}else
				ftupleResult.add( tupleMap.get(t) );
		}

		return ftupleResult;
	}
}
