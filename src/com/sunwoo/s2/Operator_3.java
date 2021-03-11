package com.sunwoo.s2;

public class Operator_3 {
	
	public static void main(String [] args) {
		//총점을 담을 변수
		int total = 290;
		
		//평균을 담을 변수
		double avr = 0.0;
		
		//과목수는 3과목
		avr = (double)total / 3; //96.6666...
		
		avr = avr * 100; //9666.6666...
		
		int result = (int)avr; //9666
		
		avr = result / 100.0; //96.66
		
		//최종결과물 소숫점 2자리 까지만 출력
		System.out.println(avr);
	
		
	}
 
}
