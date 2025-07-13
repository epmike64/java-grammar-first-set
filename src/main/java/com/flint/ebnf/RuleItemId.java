package com.flint.ebnf;

public class RuleItemId {
	private static int nextId = 0;
	public static int getNextId() {
		return nextId++;
	}
}
