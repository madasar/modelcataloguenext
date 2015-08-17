package fur;

import kodkod.instance.Tuple;
import kodkod.ast.Relation;

public class FTuple{

	private Tuple tuple;
	private FInstance instance;

	FTuple(Tuple t, FInstance inst){
		tuple=t;
		instance=inst;
	}

	public Tuple getTuple(){
		return tuple;
	}

	public FInstance getInstance(){
		return instance;
	}

	public Object getAtom(int index){
		if (index < tuple.arity())
			return tuple.atom(index);
		else
			return null;
	}

	public boolean instanceOf(Relation r){
		for (Tuple t: (java.util.List<Tuple>)instance.getTTuples(r) )
			if (this.tuple.equals(t))
				return true;
			
		return false;
	}

	public String toString(){
		if (tuple.arity()==1) return tuple.atom(0).toString();
		return tuple.toString();
	}


	public int toInteger(){
		if (tuple.arity()==1) return tuple.index();
		return 0;
	}
/*
public int hashCode(){
	return tuple.hashCode();
}
	
public boolean equals(Object obj){
	return this.hashCode()==obj.hashCode();
}
*/
}
