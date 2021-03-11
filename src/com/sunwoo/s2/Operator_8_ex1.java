package com.sunwoo.s2;

import java.util.Scanner;

public class Operator_8_ex1 {
	
	public static void main(String [] args) {
		
		//나이를 키보드로 부터 입력
		//10대인가 아닌가를 판별
		
		Scanner sc = new Scanner(System.in);
		
		int age = 0;
		String result = "";
		
		System.out.println("나이를 입력하세요");
		age = sc.nextInt();
		
		result = age>9 && age<20 ? "10대" : "10대가 아님";
		
		System.out.println(result);
		
	}

}
