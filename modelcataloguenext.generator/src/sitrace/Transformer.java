package sitrace;

import java.util.List;

import sitrace.trace.ITrace;
import sitrace.trace.TraceInstance;
import sitrace.trace.Instanceable;

public interface Transformer {
	Object transform(Object object);
	List<? extends Object> transformAll(List<? extends Object> sourceObjects);
	<S, T> T transform(Class<? extends Rule<S, T>> ruleClass, S source);
	<S, T> List<? extends T> transformAll(Class<? extends Rule<S, T>> ruleClass, List<? extends S> element);
	ITrace getTrace();
	<S, T extends Instanceable> TraceInstance recordTrace(S source, T target, Rule rule);
}
