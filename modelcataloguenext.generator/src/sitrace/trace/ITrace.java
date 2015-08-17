package sitrace.trace;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import sitrace.Rule;

public class ITrace{
	
	//stored the sub-traces of this ITrace, each TraceInstance may also store a list of sub-trace
	private List<TraceInstance> traces;

	//used to create hierachical traces,in conjunction with ruleStarting() ruleStopping and this.last
	private Stack<TraceInstance> traceStack;

	//last is the last trace instance that was created, updated everytime a trace is created
	private TraceInstance last;

	public ITrace(){
		traces = new ArrayList<TraceInstance>();
		traceStack = new Stack<TraceInstance>();
		last = null;
	}

	public List<TraceInstance> getTraces(){
		return traces;
	}

	public TraceInstance getFirstTrace(){
		return traces.get(0);
	}

	public List<TraceInstance> getAllTraces(){
		List<TraceInstance> alltraces = new ArrayList<TraceInstance>();
		alltraces.addAll(traces);		
		for (TraceInstance t: traces){

			alltraces.addAll(t.getAllTraces());		
		}		
		
		return alltraces;
	}


	public <S,T extends Instanceable> TraceInstance recordTrace(S source, T target, Rule rule){
		TraceInstance newtrace = new TraceInstance(source, target, rule);
		newtrace.setITrace(this);

		last = newtrace;

		//traceStack.peek() has the trace of the rule that created the newtrace (if it is not null)
		if (!traceStack.empty() && traceStack.peek()!=null) 
			traceStack.peek().recordTrace(newtrace);
		else
			traces.add(newtrace); //if traceStack.empty() or traceStack.peek()==null the first rule was called

		return newtrace;
	}

	//whenever a rule starts it's set properties, this is called, traceStack.peek() therefore stores the rule that created the current trace
	public void ruleStarting(){
		traceStack.push(last);
	}

	//when a rule has finished it can no longer create a trace, so pop it off the traceStack
	public void ruleStopping(){
		traceStack.pop();

	}

	public String toString(){
		return "[ITRACE : #sub-traces: "+traces.size() + " sub-traces: "+traces+" ]";
	}
}
