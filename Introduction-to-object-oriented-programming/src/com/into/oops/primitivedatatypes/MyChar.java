package com.into.oops.primitivedatatypes;

public class MyChar {
	private char ch;

	public MyChar(char ch) {
		// TODO Auto-generated constructor stub
		this.ch = ch;
	}

	public boolean isVowel() {
		// a e i o u or A E I O U
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { // or symbol
			return true;
		}
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			return true;
		}

		return false;
	}

	public boolean isDigit() {
		// TODO Auto-generated method stub
		if (ch >= 48 && ch <= 57) { // (int)'0' = 48 and (int)'9' = 57
			return true;
		}

		return false;
	}

	public boolean isAlphabet() {
		// TODO Auto-generated method stub
		if (ch >= 97 && ch <= 122) { // (int)'a' = 97 and (int)'z' = 122
			return true;
		}

		if (ch >= 65 && ch <= 90) { // (int)'A' = 97 and (int)'Z' = 90
			return true;
		}
		return false;

	}

	public static void printLowerCaseAlphabets() {
		// TODO Auto-generated method stub
		for (char ch = 97; ch <= 122; ch++) { // for(char ch = 'a'; ch <= 'z'; ch++)
			System.out.print(ch);
		}

	}

	public boolean isConsonant() {
		// TODO Auto-generated method stub
		if (isAlphabet() && !isVowel()) {
			return true;
		}

		return false;
	}

	public static void printUpperCaseAlphabets() {
		// TODO Auto-generated method stub
		for (char ch = 65; ch <= 90; ch++) { // // for(char ch = 'A'; ch <= 'Z'; ch++)
			System.out.print(ch);
		}
	}

}
