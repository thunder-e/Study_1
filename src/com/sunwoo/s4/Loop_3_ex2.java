package com.sunwoo.s4;

import java.util.Scanner;

public class Loop_3_ex2 {

	public static void main(String[] args) {
		// 0시 0분 
		// 0시 1분
		// ...
		// 0시 59분
		// 1시 0분
		//
		//23시 59분
		
		//시와 분을 입력
		//내가 입력한 시와 분이 출력되면 즉시 종료
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("시를 입력하세요");
		int yHr = sc.nextInt();
		
		System.out.println("분을 입력하세요");
		int yMin = sc.nextInt();
		
		boolean check = false; //안쪽 for문을 어떻게 빠져나왔는지 확인하기 위해
		
		for(int hour=0;hour<24;hour++) {
			
			for(int min=0;min<60;min++) {
				System.out.println(hour+"시 "+min+"분");
				if(hour==yHr && min==yMin) {
					//hour = 24;
					check = true;
					break; 
					// 내가 원하는 시간이 되었을 때 break를 하고, 바깥 for문도 멈출수 있도록
					// hour에 24를 입력하거나
					// check를 true로 바꿔서 바깥 for문안에 if
				}
			
			}

			//안쪽 for가 종료되는 조건
			//1. 60번 다 실행한 경우
			//2. break 만난 경우
			if(check) {
				//hour=24;
				break;
			}
			
		}
			
		System.out.println("프로그램 종료");
			

	}

}
