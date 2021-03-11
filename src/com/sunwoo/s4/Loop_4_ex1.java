package com.sunwoo.s4;

import java.util.Scanner;

public class Loop_4_ex1 {

	public static void main(String[] args) {

		// 로그인 
		int id = 1234;
		int pw =  5678;

		int yId = 0;
		int yPw = 0;
		//횟수 무제한
		//로그인 성공시 종료
		//1. 로그인
		//2. 종료

		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		
		while(check) {
			System.out.println("1.로그인");
			System.out.println("2.종료");
			int select = sc.nextInt();
			
			if(select==1) {
				System.out.println("id 입력");
				yId=sc.nextInt();
				System.out.println("pw 입력");
				yPw = sc.nextInt();
				if(yId==id && yPw==pw) {
					System.out.println("로그인 성공");
					System.out.println("종료");
					break;
				} else {
					System.out.println("로그인 실패");
				}
				

			} else {
				System.out.println("프로그램 종료");
				break;
			}
			
		} 
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//
//		boolean check = true;
//
//		while(check) {
//			System.out.println("1. 로그인");
//			System.out.println("2. 종료");
//			int select = sc.nextInt();
//
//			if(select == 1) {
//
//				while(id!=yId || pw!=yPw) {
//					System.out.println("id 입력하세요");
//					yId = sc.nextInt();
//					System.out.println("pw 입력하세요");
//					yPw = sc.nextInt();
//
//				}
//				System.out.println("로그인 성공");
//				break;
//
//			}
//
//
//		}







		//		if(select == 1) {
		//			while(id!=yId || pw!=yPw) {
		//				
		//				System.out.println("id를 입력하세요");
		//				yId = sc.nextInt();
		//				System.out.println("pw를 입력하세요");
		//				yPw = sc.nextInt();
		//				
		//				
		//			}
		//			System.out.println("로그인 성공");
		//		} else if(select == 2){
		//			System.out.println("프로그램 종료");
		//		}





	}

}
