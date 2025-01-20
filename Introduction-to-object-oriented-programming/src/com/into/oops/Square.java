package com.into.oops;

public class Square {

	private int side;

	Square(int side) {
		// TODO: Initialize side with the passed value
		this.side = side;
	}

	public int calculateArea() {
		// TODO: Calculate and return the area of the square
		int area1;
		if (this.side <= 0) {
			return -1;
		} else {
			area1 = this.side * this.side;
			return area1;
		}

	}

	public int calculatePerimeter() {
		// TODO: Calculate and return the perimeter of the square
		int perimeter1;
		if (this.side <= 0) {
			return -1;
		} else {
			perimeter1 = 4 * this.side;
			return perimeter1;
		}

	}

}
