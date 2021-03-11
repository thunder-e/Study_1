package com.sunwoo.s4;

import java.util.Scanner;

public class Loop_6 {

	public static void main(String[] args) {

		//로그인
		int id = 1234;
		int pw = 5678;

		int yId = 0;
		int yPw = 0;

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
					break;
				} else {
					System.out.println("로그인 실패");
				}

			} else {
				System.out.println("프로그램 종료");
				break;
			}
		}







		//게임코드 실행
		if(yId==id && yPw==pw) {

			System.out.println("게임을 시작하시겠습니까?");
			System.out.println("1. 네");
			System.out.println("2. 아니요");
			int in = sc.nextInt();
			int lv = 0;
			int gold = 0;
			int reward = 0;

			if(in == 1) { 
				for(lv=1; lv<15; lv++) {
					for(int i=1; i<3*lv+1; i++) {
						System.out.println("몬스터 "+ i + "마리 사냥");
					}
					System.out.println("Lv." + lv +  " -> Lv." + (lv+1) + "레벨업");


					if((lv+1)%5==0) {
						for(int g = 0; g<1; g++) {
							gold += 1000*(g+1);
							reward += gold;
						}
						System.out.println("레벨" + (lv+1) + " 달성 " + gold + "Gold 지급");
					}

					if(lv<14) {
						System.out.println("게임을 계속 하시겠습니까?");
						System.out.println("1. 네");
						System.out.println("2. 아니요");
					}
					int go = sc.nextInt();
					if(go==2) {
						break;
					}


				}


			}
			System.out.println("현재 Lv."+(lv+1));
			System.out.println("Gold : " + reward);
			System.out.println("게임을 종료합니다");

			//rpg 게임
			//1 Lv -> 15 Lv
			//모든 몬스터는 경험치가 같아요
			// 1 - 2 : 3
			// 2 - 3 : 6
			// 3 - 4 : 9
			// 4 - 5 : 12
			// 14 - 15 : 42

			//ex) 1 -> 2
			// 몬스터 1마리 사냥
			// 몬스터 2마리 사냥
			// 몬스터 3마리 사냥
			// 레벨업
			// 2 -> 3
			// 몬스터 1마리 사냥
			// 몬스터 2마리 사냥
			// 몬스터 3마리 사냥
			// 몬스터 4마리 사냥
			// 몬스터 5마리 사냥
			// 몬스터 6마리 사냥
			// 레벨업

			//보상으로 Gold 기본은 0
			//레벨이 5가 되면 1000 Gold 지급
			//레벨이 10이되면 2000 Gold 지급
			//레벨이 15가되면 3000 Gold 지급
			//최종 Gold 출력

			//레벨업 찍고 다음 레벨 가기전 게임계속 유무를 지정
			//종료 할 때 현재레벨과 Gold 출력


		}
	}
}	

