package com.flint.ebnf;


import com.flint.ebnf.logic.Alter;


import java.util.HashMap;
import java.util.Map;

/**
 * Grammar Factory for creating symbols, productions, and rule items.
 * This class provides methods to create terminal and non-terminal symbols,
 * as well as to define optional, repeated, grouped, and alternative rule items.
 */
public class GF {

	private static final Map<String, Sym> symMap = new HashMap();

	public static RuleItem opt(Sym s){
		assert (s.getLogic() & RuleItem.Logic.Repetition) > 0;
		s.orLogic(RuleItem.Logic.Optional);
		return s;
	}

	public static RuleItem rep(Sym s){
		assert  (s.getLogic() & RuleItem.Logic.Optional) > 0;
		s.orLogic(RuleItem.Logic.Repetition);
		return s;
	}

	public static RuleItem group(Sym s){
		s.orLogic(RuleItem.Logic.Group);
		return s;
	}

	public static RuleItem alt(RuleItem left, Sym right){
		Alter a = new Alter(left, right);
		return a;
	}

	private static Sym getSymbol(String name, TerminalType type) {
		Sym s = symMap.get(name);
		if(s != null) {
			if (s.getType() != type) {
				throw new IllegalArgumentException("Symbol with name '" + name + "' already exists with type " + s.getType() + ", cannot create as " + type);
			}
			return s;
		}

		switch (type) {
			case NonTerm:
				s = new P(name);
				break;
			case Term:
				s = new T(name);
				break;
			default:
				throw new IllegalArgumentException("Unknown symbol type: " + type);
		}
		symMap.put(s.getName(), s);

		return s;
	}

	public static T getT(String name) {
		return (T) getSymbol(name, TerminalType.Term);
	}

	public static P getP(String name) {
		return (P) getSymbol(name, TerminalType.NonTerm);
	}
}
