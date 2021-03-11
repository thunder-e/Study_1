package com.sunwoo.s2;

import java.util.Scanner;

public class Operator_7 {

	public static void main(String [] args) {
		
		int num1 = 20;
		int num2 = 10;
				
		boolean check = num1 > num2;
		
		check = num1 != num2;
		
		check = num1 < num2; //false
		 
		boolean check1 = true;
		
		boolean result = check1 && check;
		result = check1 || check; //true
		
		result = !result; //false
		
		System.out.println(result);
		
		
		//  == primitive 타입끼리만 가능
		
		int n1 = 10;
		int n2 = 10;
		
		result = n1 == n2;
		
		double d1 = 10.0;
		
		result = n1 == d1; // 자동형변환

		char ch = '1';
		n1 = 49;
		
		result = n1 == ch; //char타입이 int타입으로 자동형변환 --> 1 != 49;
		
		String str = "49";
		String str2 = "49";
//		result =  n1 == str; // primitive 타입끼리만 가능 - String은 Reference타입
		
		result = str == str2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		str2 = sc.next(); // 문자열 입력받기
		
		result = str == str2; //Reference타입끼리는 데이터를 비교하는게 아니라 객체위치?를 비교하기때문에 false라고 생각하자
		
		System.out.println(result);
		
		
	}
}
