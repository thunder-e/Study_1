package com.sunwoo.s3;

import java.util.Scanner;

public class Condition_2_ex2 {
	
	public static void main(String [] args) {
		//회원가입
		int id = 1234;
		int pw = 5678;
		//로그인시 입력
		int id1 = 0;
		int pw1 = 0;
		
		//id와 pw 입력받아서
		//로그인 성공과 로그인 실패 출력
		Scanner sc = new Scanner(System.in);
		

		System.out.println("id를 입력하세요");
		id1 = sc.nextInt();
		System.out.println("pw를 입력하세요");
		pw1 = sc.nextInt();
		
		if(id == id1 && pw == pw1) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
		
		
		
		
	}

}
