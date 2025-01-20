package com.into.oops.conditionals;

import java.util.Scanner;

public class MenuRunner {

	public static void main (String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number1 = ");
		int number1 = scanner.nextInt();
		System.out.println("the first number is " + number1 );
		System.out.println("Enter Number2 = ");
		int number2 = scanner.nextInt();
		System.out.println("the second number is " + number2 );
		
		
		System.out.println("choices available are");
		System.out.println("1 = Add");
		System.out.println("2 = Subtract");
		System.out.println("3 = Multiply");
		System.out.println("4 = Divide");
		
		System.out.println("Enter your coice = ");
		int choice = scanner.nextInt();
		
		extractedSwitch(number1, number2, choice);// want to use extracted method change to extracted
		//extracted(number1, number2, choice);
	}

	private static void extracted(int number1, int number2, int choice) {//right click selecting all choices and select refractor
		
		if(choice==1){
		System.out.println(number1+number2);
		}
		else if (choice==2) {
		System.out.println(number1-number2);
		}
		else if(choice == 3) {
		System.out.println(number1*number2);
		}
		else if (choice==4) {
		System.out.println(number1/number2);
		}
		else
		System.out.println("invalid operation");
	}
	
private static void extractedSwitch(int number1, int number2, int choice) {  // using switch
		switch(choice) {
		case 1: System.out.println(number1+number2);
		break;
		case 2: System.out.println(number1-number2);
		break;
		case 3:	System.out.println(number1*number2);
		break;
		case 4:System.out.println(number1/number2);
		break;
		default : System.out.println("invalid operation");
	
		}
		
		
	}

}
