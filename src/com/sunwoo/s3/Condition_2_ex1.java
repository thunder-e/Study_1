package com.sunwoo.s3;

import java.util.Scanner;

public class Condition_2_ex1 {

	public static void main(String [] args) {
		
		//국어, 영어, 수학 입력
		//총점과 평균 계산
		//평균이 60점 이상이면 합격
		//아니면 불합격
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0.0;
		
		boolean check = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수 입력");
		kor = sc.nextInt();
		
		System.out.println("영어 점수 입력");
		eng = sc.nextInt();
		
		System.out.println("수학 점수 입력");
		math = sc.nextInt();
		
		total = kor + eng + math;
		avg = total / 3.0;
		
		if(avg>=60) {
			check = true;
		} else {
			check = false;
		}
		
		if(kor<40 || eng<40 || math<40) {
			check = false;
		}

		if(check) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
	}
	
	
}
