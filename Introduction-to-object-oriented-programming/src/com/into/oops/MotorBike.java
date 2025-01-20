package com.into.oops;

public class MotorBike {

	// state

	private int speed; // member variable
	// behaviour or methods
	// inputs - int speed
	// outputs- void
	// names - set speed

	MotorBike()
	{
		this(50); // no argument constructor
					// this keyword is used to call a constructor from other constructor
	}
	MotorBike(int speed) {
		this.speed = speed;
	}
	void start() {
		System.out.println("Bike Started");
	}

	public int getSpeed() {
		// System.out.println(speed);
		return speed;

	}

	public void setSpeed(int speed) { // local variable

		// System.out.println(speed);// 100
		// System.out.println(this.speed);// 0
		// this.speed = speed; // private speed is assigned to local variable speed
		if (speed > 0) {

		this.speed = speed; // private speed is assigned to local variable speed
		// System.out.println(speed);// 100
		// System.out.println(this.speed);// 1000
	}
	}

	void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}



}
