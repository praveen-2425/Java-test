package com.into.oops;

public class Dimension {
	private int feet;
	private int inches;

	Dimension(int inches) {
		// TODO: Convert the total inches into feet and inches. One foot is 12 inches.
		// Store the feet and inches in their respective instance variables.
		if (inches < 0) {
			this.feet = -1;
			this.inches = -1;
		}
		else {
			this.feet = inches / 12;
			this.inches = inches % 12;
		}
	}



	public int getInches() {
		// TODO: Return the value of inches.
		return this.inches;
	}

	public int getFeet() {
		// TODO: Return the value of inches.
		return this.feet;
	}


}
