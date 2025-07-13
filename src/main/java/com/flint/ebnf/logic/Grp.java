package com.flint.ebnf.logic;

import com.flint.ebnf.RuleItem;
import com.flint.ebnf.RuleItemId;

import java.util.ArrayList;
import java.util.List;

public class Grp implements RuleItem {

	public final String name = "group_" + RuleItemId.getNextId();
	private final List<RuleItem> ruleItems = new ArrayList<>();

	public Grp(RuleItem ...rhsSymbols){
		ruleItems.addAll(List.of(rhsSymbols));
	}

	public Logic getLogic() {
		return Logic.Group;
	}
}
