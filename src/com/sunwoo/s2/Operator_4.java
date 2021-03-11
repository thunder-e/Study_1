package com.sunwoo.s2;

public class Operator_4 {
	
	public static void main(String [] args) {
		// +, -, /, *, %
		//0      ->       0
		//1      ->       1
		//2      ->       2
		//3      ->       3
		//4      ->       10 6+4 
		//5      ->       11 6+5
		//6      ->       12 6+6
		//7      ->       13 6+7 
		//8      ->       20 12+8
		//9      ->       21 12+9
		//10     ->       22 12+10
		//11     ->       23 12+11
		//12     ->       30 24+12
		
		
		int input = 0;
		int output = 0;
		
		input = 9;
		output = 6*(input/4)+input; // input/4*10+input%4;
		
	
		
		System.out.println("입력값 : " + input);
		System.out.println("출력값 : " + output);
		
		
	}

}
