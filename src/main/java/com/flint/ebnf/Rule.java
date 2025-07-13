package com.flint.ebnf;


import java.util.ArrayList;
import java.util.List;

public class Rule  {
	public final String name = "rule_" + RuleItemId.getNextId();
	private final List<RuleItem> ruleItems = new ArrayList<RuleItem>();

	public Rule(RuleItem ...rhsSymbols){
		ruleItems.addAll(List.of(rhsSymbols));
	}
}
