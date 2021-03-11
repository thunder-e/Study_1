package com.sunwoo.s4;

import java.util.Scanner;

public class Loop_1_ex4_teacher {

	public static void main(String[] args) {

		int id = 1234;
		int pw = 5678;
		//check 0 이면 로그인 실패
		//check 1 이면 로그인 성공
		int check = 0;
		//boolean check = false;
		
		//로그인 시도 최대 5번
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<5; i++) {
			System.out.println("ID를 입력하세요");
			int yId = sc.nextInt();
			
			System.out.println("PW를 입력하세요");
			int yPw = sc.nextInt();

			if(id==yId && pw==yPw) {
				System.out.println("로그인 성공");
				check = 1;
				//check =  true;
				break; //i=5;
				
			} else {
				System.out.println("로그인 실패");			
			}
		} // for문 끝
		
		
		//for문이 종료되는 조건 
		//1. 로그인 성공해서 종료
		//2. 로그인 5번 모두 실패해서 종료
		
		if(check==1) {
			System.out.println("은행 업무 시작");
		} else {
			System.out.println("은행 방문 요청");
		}

		//boolean일 때		
//		if(check) {
//			System.out.println("은행 업무 시작");
//		} else {
//			System.out.println("은행 방문 요청");
//		}
//		
		
		
		System.out.println("프로그램 종료");

		
		//로그인이 성공했다면 은행 업무 시작 출력
		//로그인이 다 실패했다면 은행 방문을 요청 출력

	}

}
