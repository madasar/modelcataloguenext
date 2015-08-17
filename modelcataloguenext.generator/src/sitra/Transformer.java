package sitra;

import java.util.List;

public interface Transformer {
	Object transform(Object object);
	List<? extends Object> transformAll(List<? extends Object> sourceObjects);
	<S, T> T transform(Class<? extends Rule<S, T>> ruleClass, S source);
	<S, T> List<? extends T> transformAll(Class<? extends Rule<S, T>> ruleClass, List<? extends S> element);
}
