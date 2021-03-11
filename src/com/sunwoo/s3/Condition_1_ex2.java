package com.sunwoo.s3;

import java.util.Scanner;

public class Condition_1_ex2 {
	
	//main 생성
	//키보드 입력
	//국어, 영어, 수학 입력 받아서 총점과 평균 계산
	//평균이 90점 이상이면 A 출력
	//평균이 80점 이상이면 B 출력
	//평균이 70점 이상이면 C 출력
	//평균이 60점 이상이면 D 출력
	//평균이 60점 미만이면 F 출력
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avr = 0.0;
		String grade = "F"; //null
		
		System.out.println("국어 점수 입력");
		kor = sc.nextInt();
		
		System.out.println("영어 점수 입력");
		eng = sc.nextInt();
		
		System.out.println("수학 점수 입력");
		math = sc.nextInt();
		
		total = kor + eng + math;
		avr = total / 3.0;
		
		//System.out.println("평균 : " + avr);
		
		if(avr>=90) {
			grade = "A";
		}
		
		if(avr<90 && avr>=80) {
			grade = "B";
		}
		
		if(avr<80 && avr>=70) {
			grade = "C";
		}
		
		if(avr<70 && avr>=60) {
			grade = "D";
		} 
		
//		if(avr<60) { 
//			grade = "F"; 
//		}
		
		System.out.println(grade);
		System.out.println("프로그램 종료");
	}
	
	

}

/*
 * *****    3가지 방법    ****** 
 * 
 * 1)if단일문에 출력문 하나씩 쓰기 
 *    System.out.println("A");
 * 2)성적변수를 선언하고 출력문은 마지막에 한번만 쓰기
 *   if문에는 변수만 선언
 * 3)성적변수를 선언할때 아예 처음부터 "F"로 선언하고  
 *   조건문 하나를 안쓸 수 있음
 * 
 */
