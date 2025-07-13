package com.flint.ebnf.logic;

import com.flint.ebnf.RuleItem;
import com.flint.ebnf.RuleItemId;

public class Alter extends RuleItem {
	public final String name = "alter_" + RuleItemId.getNextId();
	private final RuleItem left, right;

	public Alter(RuleItem left, RuleItem right) {
		this.left = left;
		this.right = right;
	}

	public Logic getLogic() {
		return Logic.Alternative;
	}
}
