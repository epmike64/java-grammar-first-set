package com.flint.ebnf.logic;

import com.flint.ebnf.RuleItem;

public class Rep extends RuleItem {

	private final RuleItem item;
	public  Rep(RuleItem item){
		this.item = item;
	}

	public int getLogic() {
		return Logic.Repetition;
	}
}
