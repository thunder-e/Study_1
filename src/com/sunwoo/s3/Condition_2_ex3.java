package com.sunwoo.s3;

import java.util.Scanner;

public class Condition_2_ex3 {
	
	public static void main(String [] args) {
		//회원가입
		int id = 1234;
		int pw = 5678;
		//로그인시 입력
		int id1 = 0;
		int pw1 = 0;
		
		boolean check = false;
		
		//id와 pw 입력받아서
		//로그인 성공과 로그인 실패 출력
		Scanner sc = new Scanner(System.in);
		

		System.out.println("id를 입력하세요");
		id1 = sc.nextInt();
		System.out.println("pw를 입력하세요");
		pw1 = sc.nextInt();
		
		if(id == id1 && pw == pw1) {
			System.out.println("로그인 성공");
			check = true;
		} else {
			System.out.println("로그인 실패");
			check = false;
		}
		
		
		//로그인 성공시에만 진행하는 코드
		if(check) {        
			//급여를 입력받음
			System.out.println("급여를 입력하세요");
			int wage = sc.nextInt();
			
			System.out.println("1. 정규직이면 1 입력");
			System.out.println("2. 계약직이면 2 입력");
			int select = sc.nextInt();
			
			//실급여
			int result = 0; //그냥 wage에 담아도 됨
			
			//정규직 실급여 계산
			//고용보험 2%, 의료보험 3%, 국민연금 1%, 산재보험 1%
			if(select == 1) {
				System.out.println("정규직");
				result = (int)(wage*0.93); // wage = wage * 93/100
			} //else { 	System.out.println("계약직"); 할수도
			
			//계약직 실급여 계산
			//원천징수 3.3%
			if(select == 2) {
				System.out.println("계약직");
				result = (int)(wage*0.967);
			}
			
			//실급여 출력
			System.out.println("실급여 : " + result + "원");
		}
		
		System.out.println("프로그램 종료");
	}

}
