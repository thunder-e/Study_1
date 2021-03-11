package com.sunwoo.s2;

public class Operator_1 {
	
	public static void main(String [] args) {
		System.out.println(" ---- 프로그램 실행 ---- ");
		
		//형변환
		int num1 = 10;
		
		long num2 = 20L;
		
		// int -> long, long -> int
		// num2 = (long)num1
		num2 = num1; // 자동형변환 - 작은것에서 큰것으로 변환
		num1 = (int)num2; // 강제형변환 
		
		num1 = 10;
		num2 = 20L;
		
		long num3 = num1 + num2; // num1이 자동형변환이 일어남
		
		// (1+2)*3 = 9 
		//int num4 = (int)(num1 + num2); // num1 + num2하면 큰것 따라 long 타입이 되는데 int로 넣을 수 없지
		int num4 = num1 + (int)num2; 
		
		System.out.println(num2);
		
		
		
		System.out.println(" ---- 프로그램 종료 ---- ");
	}

}
