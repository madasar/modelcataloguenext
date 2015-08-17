package sitra;

import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class SimpleTransformerImpl implements Transformer {
	public SimpleTransformerImpl(List<Class<? extends Rule>> ruleTypes) {
		this.ruleTypes = ruleTypes;
	}
	Map<Class<? extends Rule>, Map<Object, Object>> mappings = new HashMap<Class<? extends Rule>, Map<Object, Object>>();
	<S, T> Map<S, T> getRuleMappings(Class<? extends Rule<S, T>> rule) {
		Map<S, T> ruleMappings = (Map<S, T>) mappings.get(rule);
		if (ruleMappings == null) {
			ruleMappings = new HashMap<S, T>();
			mappings.put(rule, (Map<Object, Object>) ruleMappings);
		}
		return ruleMappings;
	}
	<S, T> void recordMaping(Class<? extends Rule<S, T>> rule, S source, T target) {
		getRuleMappings(rule).put(source, target);
	}
	<S, T> T getExistingTargetFor(Class<? extends Rule<S, T>> rule, S source) {
		return getRuleMappings(rule).get(source);
	}
	<S, T> T applyRule(Rule<S, T> r, S source) {
		Class<? extends Rule<S, T>> ruleType = (Class<? extends Rule<S, T>>)r.getClass();
		T target = getExistingTargetFor(ruleType, source);
		if (target == null) {
			target = r.build(source, this);
			recordMaping(ruleType, source, target);
			r.setProperties(target,source,this);
		}
		return target;
	}
	// --- Transformer ---
	List<Class<? extends Rule>> ruleTypes;
	public List<Class<? extends Rule>> getRuleTypes() {
		if (this.ruleTypes == null) {
			this.ruleTypes = new Vector<Class<? extends Rule>>();
		}
		return this.ruleTypes;
	}
	public void addRuleType(Class<? extends Rule> ruleType) {
		getRuleTypes().add(ruleType);
	}
	List<Rule> getRules(Class<? extends Rule> ruleType) {
		List<Rule> rules = new Vector<Rule>();
		for (Class<? extends Rule> rt : getRuleTypes()) {
			if (ruleType.isAssignableFrom(rt)) {
				if (!Modifier.isAbstract(rt.getModifiers())) {
					try {
						rules.add(rt.newInstance());
					} catch (InstantiationException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return rules;
	}
	public <S, T> T transform(Class<? extends Rule<S, T>> ruleType, S source) {
		try {
			List<Rule> rules = getRules(ruleType);
			//might be better to do this as an follows, but needs assertions to be switched on
			assert !rules.isEmpty() : "No rule " + ruleType + " found in transformer " + this;
			if (rules.isEmpty()) {
				System.err.println("No rule " + ruleType + " found in transformer " + this);
			} else {
				for (Rule rule : rules) {
					Boolean b = false;
					try {
						b = rule.check(source);
					} catch (ClassCastException e) {}
					if (b) {
						return applyRule((Rule<S, T>) rule, source);
					}
				}
			}
		} catch (Throwable t) {
			t.printStackTrace();
		}
		return null;
	}
	public <S, T> List<? extends T> transformAll(Class<? extends Rule<S, T>> ruleType, List<? extends S> element) {
		List<T> targets = new Vector<T>();
		for (S s : element) {
			T o = transform(ruleType, s);
			targets.add(o);
		}
		return targets;
	}
	public Object transform(Object object) {
		return transform((Class)Rule.class, object);
	}
	public List<? extends Object> transformAll(List<? extends Object> sourceObjects) {
		return transformAll((Class)Rule.class, sourceObjects);
	}
}
