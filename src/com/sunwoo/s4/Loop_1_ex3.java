package com.sunwoo.s4;

import java.util.Scanner;

public class Loop_1_ex3 {

	public static void main(String[] args) {
		
		//입력받는 코드를 반복문안에 구성
		//누적이용해서 총점구하기
		//반복문 종료 후 총점 출력
		
		
		//점수를 누적할 총점
		int total = 0; 

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("과목수를 입력하세요");
		int count = sc.nextInt();
		
		for(int i=0; i<count; i++) {
			System.out.println(i+1 + "번 점수를 입력");
			int point = sc.nextInt();
			total += point; //total = total + point;
		}

		System.out.println("총점 : " + total);
	}

}
