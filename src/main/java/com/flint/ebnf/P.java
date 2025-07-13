package com.flint.ebnf;

import java.util.ArrayList;
import java.util.List;

public class P  extends Sym{
	final List<Rule> rhsRules = new ArrayList<>();

	P(String name) {
		super(name, TerminalType.NonTerm);
	}

	public void addR(RuleItem ...rhsSymbols) {
		rhsRules.add(new Rule(rhsSymbols));
	}

	public void addR(Rule rhsRule) {
		rhsRules.add(rhsRule);
	}
	public void addAllR(List<Rule> rhsRules) {
		this.rhsRules.addAll(rhsRules);
	}

	public List<Rule> getR() {
		return rhsRules;
	}
}
