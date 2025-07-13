package com.flint.ebnf.logic;

import com.flint.ebnf.RuleItem;
import com.flint.ebnf.RuleItemId;

public class Opt extends RuleItem {
	public final String name = "opt_" + RuleItemId.getNextId();
	private final RuleItem item;

	public Opt(RuleItem item){
		this.item = item;
	}

	public int getLogic() {
		return Logic.Optional;
	}
}
