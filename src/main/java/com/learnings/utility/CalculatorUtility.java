package com.learnings.utility;

public class CalculatorUtility {

	public int add(int a, int b) {
		//2,3
		a = a*2; //a =4 
		b = b+2; //b=5
		return a+b; //9
	}
	
	public int mul(int a , int b) {
		//2,3
		a = a+1; // 3 
		b = b+2;  // 5
		return a*b; //15
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
	
	
}
