package com.sunwoo.s2;

public class Operator_2 {
	
	public static void main(String [] args) {
		
		//int 4
		//long 8
		
		//float 4
		//double 8
		
		long num1 = 20; //숫자는 아무것도 없으면 int -> 자동형변환
		
		float num2 = 3.2f;
		
		// num1 = num2; 8byte 4byte -자동형변환
		num1 = (long)num2;
		// num2 = num1; 강제형변환
		num2 = num1;  // 자동형변환
		
		int point = 290;
		
		double avr = point/3.0; //int타입인 96이 double로 담기면 96.0 --> 한쪽을 double로 바꾸면 나머지는 자동형변환
		
		System.out.println(avr); 
		
		
		avr = 10.1;
		
		System.out.println(avr*3); //컴퓨터는 소숫점 근사치를 제공해주기때문에 생각과 다른 값이 나올 수 있다
		
		avr = 1.33333;
		int n = (int)avr;
		
		System.out.println(n);
		
	}

}
