package com.sunwoo.s3;

import java.util.Scanner;

public class Condition_1_ex1 {

	//main
	
	//키보드에서 입력(국어, 영어, 수학)
	//총점과 평균 계산
	//평균이 90점 이상이면 우수학생 출력
	//졸업 출력	
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avr = 0.0;	
		
		System.out.println("국어점수를 입력하세요");
		kor = sc.nextInt();
		
		System.out.println("영어접수를 입력하세요");
		eng = sc.nextInt();
		
		System.out.println("수학점수를 입력하세요");
		math = sc.nextInt();
		
		
		total = kor + eng + math;
		avr = total / 3.0;
		
		//System.out.println("평균 : " + avr);
		
		if(avr>=90) {
			System.out.println("우수 학생");
		}
		
		
		System.out.println("졸업");
		
	}
	
}
