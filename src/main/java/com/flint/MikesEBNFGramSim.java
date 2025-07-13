package com.flint;

import com.flint.ebnf.*;

/**
 * Hello world!
 */
public class MikesEBNFGramSim {
	public static void main(String[] args) {
		T a = GF.getT("a");
		T b = GF.getT("b");
		T c = GF.getT("c");

		P S = GF.getP("S");
		P A = GF.getP("A");
		P B = GF.getP("B");

      P p = GF.getP("S");
      p.addR(a, GF.opt(S), b);
	}
}
