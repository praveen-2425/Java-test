package com.into.oops;

public class RGBColorRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RGBColor color = new RGBColor(0, 255, 0);
		System.out.println(color.getRed()); // Prints: 255
		System.out.println(color.getGreen()); // Prints: 0
		System.out.println(color.getBlue()); // Prints: 0
		color.invert();
		System.out.println(color.getRed()); // Prints: 0
		System.out.println(color.getGreen()); // Prints: 255
		System.out.println(color.getBlue()); // Prints: 255
	}

}
