package com.into.oops.revision;

import java.math.BigDecimal;

public class Graph {
	private BigDecimal x;
	private BigDecimal y;
	public Graph(int x1, int y1) {
		// TODO Auto-generated constructor stub
		x = new BigDecimal(x1);
		y = new BigDecimal(y1);
		
	}
	public void moveGraph(int x2, int y2) {
		// TODO Auto-generated method stub
		x = x.add(new BigDecimal(x2));
		y = y.add(new BigDecimal(y2));
	    System.out.println(x+","+y);
	}
		
		
}
