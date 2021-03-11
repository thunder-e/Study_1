package com.sunwoo.s4;

import java.util.Scanner;

public class Loop_1_ex4 {

	public static void main(String[] args) {

		int id = 1234;
		int pw = 5678;

		//로그인 시도 최대 5번
		Scanner sc = new Scanner(System.in);

		System.out.println("ID를 입력하세요");
		int yId = sc.nextInt();
		System.out.println("PW를 입력하세요");
		int yPw = sc.nextInt();

		//			if(id==yId && pw==yPw) {
		//				System.out.println("은행 업무 시작");
		//			} else {
		//				System.out.println("은행 방문 요청");			
		//			}
		//		

		for(int i=0; i<5; i++) {
			if(id!=yId || pw!=yPw) {
				System.out.println("다시 ID를 입력하세요  " + (5-i) +"번 남음");
				yId = sc.nextInt();
				System.out.println("다시 PW를 입력하세요  ");
				yPw = sc.nextInt();
			} else if(id==yId && pw==yPw) {
				i+=5;	
			} 

		}

		if(id==yId && pw==yPw) {
			System.out.println("은행 업무 시작");
		} else {
			System.out.println("은행 방문 요청");			
		}

		//로그인이 성공했다면 은행 업무 시작 출력
		//로그인이 다 실패했다면 은행 방문을 요청 출력

	}

}



//프로그래밍 언어
//순서를 java 언어로 번역
//java 언어는 문법에 엄격
//문법, 단어 
//위에서 부터 아래로 내려가면서 한줄씩 실행




