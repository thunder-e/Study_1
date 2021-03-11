package com.sunwoo.s3;

import java.util.Scanner;

public class Condition_4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1-3 숫자를 하나 입력");
		int select = sc.nextInt();
		
		switch(select) {
			case 1:
				System.out.println("1이 입력");
			break;
			
			case 2: 
				System.out.println("2가 입력");
			break;
			
			default:
				System.out.println("그 외 나머지");
			break;
			//case 1:
			//	System.out.println("1이 입력");
			//break; ====이렇게 순서 바뀌어도 상관없음
		
		}
		
		
	}

}
