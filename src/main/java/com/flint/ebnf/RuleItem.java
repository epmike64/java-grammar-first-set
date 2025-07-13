package com.flint.ebnf;
;

public abstract class RuleItem {

	public interface Logic {
		int Optional =     0b0001;
		int Repetition =  0b0010;
		int Group =         0b0100;
		int Alternative = 0b1000;
	}
	private int logic = 0;

	public int getLogic() {
		return logic;
	}

	public void orLogic(int logicType) {
		assert logicType >= 0;
		this.logic |= logicType;
	}

	public void andLogic(int logicType) {
		assert logicType >= 0;
		this.logic &= logicType;
	}
}
