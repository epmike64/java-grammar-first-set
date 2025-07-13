package com.flint.ebnf;


import org.apache.commons.lang3.StringUtils;

public abstract class Sym extends RuleItem{

	private final String name;
	private final TerminalType type;

	public Sym(String name, TerminalType type) {
		assert StringUtils.isNoneEmpty(name);
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public TerminalType getType() {
		return type;
	}
}
