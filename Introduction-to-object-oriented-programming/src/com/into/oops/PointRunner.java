package com.into.oops;

public class PointRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p1 = new Point(1, 2);
		Point p2 = new Point(4, 7);

		p1.move(1, 1); // After this move, the point p1 should be at (4, 5)
		//System.out.println(p1.getX() + "," + p1.getY());
		p1.distanceTo(5, 7);
		System.out.println(p1.distanceTo(5, 7));

		// p1.distanceTo(p2);
		// System.out.println(p1.distanceTo(p2));
	}

}
