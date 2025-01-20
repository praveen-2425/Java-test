package com.firstjavaproject;

public class ExamResult {
	public boolean isPass(int marks) {

		if (marks <= 50) {
			return false;
		} else {
			return true;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamResult res = new ExamResult();
		res.isPass(60);
		System.out.println(res.isPass(60));
	}

}
