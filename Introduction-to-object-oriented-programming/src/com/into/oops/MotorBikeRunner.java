package com.into.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike(200);
		
		honda.start();
		ducati.start();

		// honda.speed = 100;
		// ducati.speed = 80;
		
		// honda.speed = 70;
		// ducati.speed = 20;
		// ducati.setSpeed(200);
		System.out.println(ducati.getSpeed());
		// int ducatispeed;
		// ducatispeed = ducati.getSpeed(); // get ducati speed
		// ducatispeed = ducatispeed + 100;
		// ducati.setSpeed(ducatispeed);// increase the speedby 100
		// System.out.println(ducati.getSpeed());
		// set it to ducati
		// ducati.increaseSpeed(100);
		// System.out.println(ducati.getSpeed());
		// honda.setSpeed(80);
		// System.out.println(honda.getSpeed());
	}
}
