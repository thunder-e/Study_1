package com.sunwoo.s4;

import java.util.Scanner;

public class Loop_6_teacher {

	public static void main(String[] args) {

		//로그인
		int id = 1234;
		int pw = 5678;

		int yId = 0;
		int yPw = 0;
		int select = 0;
		int level = 0;
		int gold = 0;

		Scanner sc = new Scanner(System.in);

		//--------------- 로그인 진행 코드 ---------------

		boolean check = true;

		while(check) {
			System.out.println("1.로그인");
			System.out.println("2.종 료");
			select = sc.nextInt();

			if(select==1) {
				System.out.println("ID 입력");
				yId = sc.nextInt();
				System.out.println("PW 입력");
				yPw = sc.nextInt();

				if(yId==id && yPw==pw) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("로그인 실패");
				}	
			} else {
				//break;
				check = false;
			}


		}//while문 끝


		//--------------- while 끝 ---------------



		//--------------- 게임 관련 ----------------
		//만약에 로그인성공했다면 게임을 시작

		//System.out.println("result : " + check); true:로그인성공 false:로그인실패

		if(check) {
			System.out.println("게임 진행");

			for(level=1;level<15;level++) {
				

				System.out.println("1. 사냥 GOGO");
				System.out.println("2. 게임  종료");
				select = sc.nextInt();

				if(select==1) {
					//System.out.println("사냥중");
					for(int mon=0;mon<level*3;mon++) {
						System.out.println("몬스터 " + (mon+1) + "마리 사냥 성공");
					}
					System.out.println("축!!레벨업" + (level+1));
					//골드지급
					if((level+1)%5==0) {
						gold = gold + (level+1) / 5 * 1000;
						System.out.println((level+1) / 5*1000 + "GOLD 지급");
					}

				} else {
					System.out.println("게임을 종료합니다");
					break;
				}

			} //레벨업 for 끝


			System.out.println("최종 레벨 : "+ level);
			System.out.println("최종 골드 : " + gold);
		}

		//----------------------------------------

		System.out.println("프로그램 종료");
	}//main 끝
}	

