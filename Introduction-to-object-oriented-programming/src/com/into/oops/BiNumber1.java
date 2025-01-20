package com.into.oops;

public class BiNumber1 {

	private int x1;
	private int y1;

	public BiNumber1(int x, int y) {
		x1 = x;
		y1 = y;
	}

	public int add() {
		return (x1 + y1);
	}

	public int multiply() {
		return (x1*y1);
	}

	void doubleNumbers() {
		x1 = x1 * x1;
		y1 = y1 * y1;
	}
	
	public int getNUmber1() {
		return x1;
	}

	public int getNUmber2() {
		return y1;
	}

	public int sep() {
		// TODO Auto-generated method stub
		return x1 - y1;
	}
}
