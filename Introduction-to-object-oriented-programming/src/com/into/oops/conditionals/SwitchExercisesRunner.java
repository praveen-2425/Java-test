package com.into.oops.conditionals;

import java.util.Scanner;

public class SwitchExercisesRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
			
			//System.out.println(determineNameOfDay(4));
			
			//System.out.println("enter number of your choice=");
			//int choice=scanner.nextInt();
			//System.out.println(determineNameOfDay1(choice));
		
			//System.out.println("enter number of your choice=");
			//int choice1=scanner.nextInt();
			//System.out.println(determineNameOfMonth(choice1));
			
			System.out.println("Enter daynumber of your choice = ");	
			int dayNumber = scanner.nextInt();	
			System.out.println(isWeekDay(dayNumber));
		
	}

	public static String determineNameOfDay(int dayNumber) {
		String result = "";
		switch (dayNumber) {// rightclick -> source -> format, to align or format the code
		case 0:
			result = "Sunday";
			break;
		case 1:
			result = "Monday";
			break;
		case 2:
			result = "Tuesday";
			break;
		case 3:
			result = "Wednesday";
			break;
		case 4:
			result = "Thursday";
			break;
		case 5:
			result = "Friday";
			break;
		case 6:
			result = "Saturday";
			break;
		}
		return result;
	}
	public static String determineNameOfDay1(int choice) {
		
		switch (choice){// source -> format, to align or format the code
		case 0:return "Sunday";	
		case 1:return "Monday";
		case 2:	return "Tuesday";
		case 3:	return "Wednesday";
		case 4:	return "THursday";
		case 5:	return "Friday";
		case 6:return "Saturday";
		default : System.out.println("Invalid");
					return "";
			
		}
	
	}
	
		public static String determineNameOfMonth(int choice1) {
		
			switch (choice1) { // format, to align or format the code
			case 0:
				return "January";
			case 1:
				return "February";
			case 2:
				return "March";
			case 3:
				return "April";
			case 4:
				return "May";
			case 5:
				return "Jume";
			case 6:
				return "July";
			case 7:
				return "August";
			case 8:
				return "September";
			case 9:
				return "October";
			case 10:
				return "November";
			case 11:
				return "December";
			default:System.out.println("Invalid");
					return "";
			}
			
		}
		public static boolean isWeekDay(int dayNumber) {
		switch (dayNumber){//format, to align or format the code
		case 0:return false;
		case 1:return true;
		case 2:	return true;
		case 3:	return true;
		case 4:	return true;
		case 5:	return true;
		case 6:return false;
		default : System.out.println("Invalid");
					return false;
		}
	
	}
}
