package com.into.oops;

public class Book {
	private int noOfCopies;

	Book(int noOfCopie) {
		noOfCopies = noOfCopie;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}

	public int setNoOfCopies(int noOfCopie) {
		if (noOfCopie > 0) {
			noOfCopies = noOfCopie;
			return noOfCopies;
		} else {
			noOfCopies = -1;
			return noOfCopies;
		}
	}

	void increaseNoOfCopies(int howMuch) {
		setNoOfCopies(noOfCopies + howMuch);
		// this.noOfCopies = this.noOfCopies + howMuch;
		// return this.noOfCopies;
	}

	void decreaseNoOfCopies(int howMuch) {
		setNoOfCopies(noOfCopies - howMuch);
		// if (this.noOfCopies >= 0) {
		// return this.noOfCopies;
	}
}
