package com.sunwoo.s3;

import java.util.Scanner;

public class Condition_4_ex2 {

	public static void main(String[] args) {
		//국어, 영어, 수학 총점 평균 계산
		//평균이 90점 이상이면 A
		//평균이 80점 이상이면 B
		//평균이 70점 이상이면 C
		//평균이 60점 이상이면 D
		//그 외 나머지 F
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		int avg = 0;
		//키보드 연결 준비
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수 입력");
		kor = sc.nextInt();
		System.out.println("영어점수 입력");
		eng = sc.nextInt();
		System.out.println("수학점수 입력");
		math = sc.nextInt();
		
		total = kor + eng + math;
		avg = total / 3;
		
		switch(avg/10) {
			case 10:
			case 9: 
				System.out.println("A");
			break;
			
			case 8:
				System.out.println("B");
			break;
			
			case 7:
				System.out.println("C");
			break;
			
			case 6:
				System.out.println("D");
			break;
			
			default:
				System.out.println("F");
		}
		
		

	}

}
