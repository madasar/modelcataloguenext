package sitra;

public interface Rule<S,T> {
	boolean check(S source);
	T build(S source, Transformer t);
	void setProperties(T target, S source, Transformer t);
}
