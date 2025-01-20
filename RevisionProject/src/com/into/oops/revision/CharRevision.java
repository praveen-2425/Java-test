package com.into.oops.revision;

public class CharRevision {
	private char c;


	public CharRevision(char c) {
		// TODO Auto-generated constructor stub
		this.c = c;
	}


	public boolean isVowel() {
		// TODO Auto-generated method stub
		
		if( c == 'a' || c== 'e' || c=='i' ||c=='o' || c=='u')
			return true;
		else if( c == 'A' || c== 'E' || c=='I' ||c=='O' || c=='U')
			return true;
		else
		return false;
	}


	
	
}
