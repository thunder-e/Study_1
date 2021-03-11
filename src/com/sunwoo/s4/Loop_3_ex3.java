package com.sunwoo.s4;

import java.util.Scanner;

public class Loop_3_ex3 {

	public static void main(String[] args) {
		// 캐릭터에 탄창을 3개 지급
		// 탄창 하나당 총알이 30개

		// 단발, 점사 결정
		// 단발 선택시 탕 출력문이 30개 출력
		// 점사 선택시 타타탕 출력문이 10개 출력
		
		Scanner sc = new Scanner(System.in);

		for(int tan=0; tan<3; tan++) {
			System.out.println("골라주세요");
			System.out.println("1.단발");
			System.out.println("2.점사");
			int select = sc.nextInt();
			
			int count = 10;
			String sound = "타타탕";
			if(select==1) {
				count = 30;
				sound = "탕";
			}
			
			for(int i=0; i<count;i++) {
				System.out.println(sound);
			}

			
//			if(select==1) {
//				for(int i=0;i<30;i++) {
//					System.out.println(i+1+"탕");
//				} 
//			} else {
//				for(int j=0; j<30; j+=3) {
//					System.out.println(j/3+1+"타타탕");	
//			   //for(int j=0;j<10;j++) {
//			   //     System.out.println("타타탕");
//				}
//			}
			

			System.out.println(2-tan+"탄창 남았습니다");
		}
		
		System.out.println("탄창이 모두 소진되었습니다");
	}



}

