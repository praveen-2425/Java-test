package com.into.oops;

public class Point {

	// x-coordinate of the point
	private int x;

	// y-coordinate of the point
	private int y;

	// Constructor for the Point class
	public Point(int x, int y) {
		this.x = x; // Assigning x-coordinate of the point
		this.y = y; // Assigning y-coordinate of the point
	}

	// Method to get the x-coordinate of the point
	public int getX() {
		return x;
	}

	// Method to get the y-coordinate of the point
	public int getY() {
		return y;
	}

	// TODO: Implement the method to move the point by dx and dy in x and y
	// direction respectively
	public void move(int dx, int dy) {
		// Your code here
		this.x = this.x + dx;
		this.y = this.y + dy;
		System.out.println(x +","+ y);
	}

	// TODO: Implement the method to calculate the distance from this point to
	// another point
	public double distanceTo(int diffx, int diffy) {
		int diffx1 = this.x - diffx;
		int diffy1 = this.y - diffy;

		return Math.sqrt((diffx1 * diffx1) + (diffy1 * diffy1));

		// Your code here

		// public double distanceTo(Point other) {
		// int diffx1 = this.x - other.x;
		// int diffy1 = this.y - other.y;

		// return Math.sqrt((diffx1 * diffx1) + (diffy1 * diffy1));
	}
}