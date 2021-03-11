package com.sunwoo.s3;

import java.util.Scanner;

public class Condition_4_ex1 {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner(System.in);

		//1.회원가입
		//2.로그인
		//3.공지사항
		//4.프로그램종료
		//번호를 입력받고
		System.out.println("1.회원가입");
		System.out.println("2.로그인");
		System.out.println("3.공지사항");
		System.out.println("4.프로그램종료");
		
		int select = sc.nextInt();
	
		//회원가입진행코드
		//로그인진행코드
		//공지사항진행코드
		//프로그램종료		
		switch(select) {
			case 1:
				System.out.println("회원가입진행코드");
			break;
			
			case 2:
				System.out.println("로그인진행코드");
			break;
			
			case 3:
				System.out.println("공지사항진행코드");
			break;
			
			default:
				System.out.println("프로그램종료");
		}
		
		
	}

}
