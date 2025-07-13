package com.flint.ebnf.graph;

import org.jgrapht.graph.DirectedPseudograph;

public class GGraph {
	private final DirectedPseudograph<GVx, GEdg> graph = new DirectedPseudograph<>(GEdg.class);
}
