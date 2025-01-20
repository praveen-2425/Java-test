package com.into.oops;

public class BookRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Book artOfComputerProgramming = new Book();
		// Book effectiveJava = new Book();
		Book cleanCode = new Book(500);

		// artOfComputerProgramming.noOfCopies = 50;
		// effectiveJava.noOfCopies = 10;
		// cleanCode.noOfCopies = 30;

		// artOfComputerProgramming.setNoOfCopies(100);
		// effectiveJava.setNoOfCopies(200);

		cleanCode.setNoOfCopies(1000);
		// System.out.println(cleanCode.getNoOfCopies());

		cleanCode.increaseNoOfCopies(1000);
		System.out.println(cleanCode.getNoOfCopies());

		cleanCode.decreaseNoOfCopies(1000);
		System.out.println(cleanCode.getNoOfCopies());

		// System.out.println(cleanCode.decreaseNoOfCopies(100));
		// System.out.println(cleanCode.decreaseNoOfCopies(1100));
	}
	}
