package com.sunwoo.s3;

import java.util.Scanner;

public class Condition_3_ex2 {
	
	public static void main(String[] args) {
		
		int menu = 0;
		//주문금액
		int result = 0;
		int price = 0;
		
		Scanner sc = new Scanner(System.in);
		//1. 짜장면  - 5000
		//2. 라면   - 3000
		//3. 햄버거  - 8000
		//4. 피자   - 10000
		System.out.println("메뉴를 골라주세요");
		System.out.println("1. 짜장면");
		System.out.println("2. 라면");
		System.out.println("3. 햄버거");
		System.out.println("4. 피자");
		
		menu = sc.nextInt();
		
		//인원수 입력
		System.out.println("인원수 입력");
		int count = sc.nextInt();
		
		if(menu == 1) {
			price = 5000;
		} else if(menu == 2) {
			price = 3000;
		} else if(menu == 3) {
			price = 8000;
		} else {
			price = 10000;
		}
		
		//최종 출력 총 주문 금액 출력	
		System.out.println("주문금액 : " + price * count + "원");
				
		
		
	}

}
