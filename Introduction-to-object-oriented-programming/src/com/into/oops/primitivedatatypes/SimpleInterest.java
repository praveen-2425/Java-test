package com.into.oops.primitivedatatypes;

import java.math.BigDecimal;

public class SimpleInterest {

	BigDecimal principal;
	BigDecimal interest;

	public SimpleInterest(String principal, String interest) {
		// TODO Auto-generated constructor stub

		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest).divide(new BigDecimal(100)); // interest/100
	}

	BigDecimal calculateTotalValue(int noOfYears) {
		// Total Value = principal + principal * interest/100 * noOfYears;
		BigDecimal total = principal.add(principal.multiply(interest).multiply(new BigDecimal(noOfYears)));
		System.out.println(total);
		return total;
	}

}
