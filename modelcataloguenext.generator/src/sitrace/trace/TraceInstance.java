package sitrace.trace;

import java.util.ArrayList;
import java.util.List;

import sitrace.Rule;

public class TraceInstance<S,T extends Instanceable> {

	private S source;
	private T target;
	private Rule rule;
	private List<TraceInstance> subtraces;
	private ITrace itrace;

	public TraceInstance(S source, T target, Rule rule){
		this.source = source;
		this.target = target;
		this.rule = rule;
		this.subtraces = new ArrayList<TraceInstance>();
	}

	public <S,T extends Instanceable> TraceInstance recordTrace(S source, T target, Rule rule){
		TraceInstance newtracei = new TraceInstance(source, target, rule);
		newtracei.setITrace(itrace);
		subtraces.add(newtracei);
		return newtracei;	
	}

	public void setITrace(ITrace it){
		itrace = it;	
	}

	public ITrace getITrace(){
		return itrace;	
	}

	public TraceInstance recordTrace(TraceInstance ti){
		subtraces.add(ti);
		return ti;	
	}

	public List<TraceInstance> getAllTraces(){
		List<TraceInstance> all = new ArrayList<TraceInstance>();
		all.addAll(subtraces);
		for (TraceInstance ti: subtraces)
			all.addAll(ti.getAllTraces());
		return all;
	}

	public List<TraceInstance> getSubTraces(){
		return 	subtraces;
	}

	public String toString(){
		return " < rule: "+rule+ " #sub-traces: "+subtraces.size()+" sub-traces: "+subtraces+" > ";
	}

	public Rule getRule(){
		return rule;	
	}

	public S getSource(){
		return source;	
	}

	public T getTarget(){
		return target;	
	}
}
