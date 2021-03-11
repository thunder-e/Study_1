package com.sunwoo.s1;

public class Var_1 {
	
	public static void main(String [] args) {
		System.out.println("실행 테스트 성공");
		//age 10
		//나이를 담을 변수 선언
		//데이터타입 변수명
		int age = 0; //age라는 변수에 정수형 숫자만 담을 예정
				 // = 대입연산자
				 // 우측의 연산결과를 좌측에 대입
		age = 20; // 초기화 - 최초로 값을 넣음
		//학점 4.12  데이터
		double point; // point 변수 선언
		point = 4.12; // point 변수 초기화
		
		int num = 10; // 동시에 변수 선언과 초기화
		
		int count = 0; // 우선 기본값 넣어놓고 시작하는 것이 안전 -> 오류 나지 않게
		
		////char
		char ch = '값';
		
		////논리
		boolean check = true;
		check = false;
		
		System.out.println("Count : " + count);
		
		System.out.println("나이 : " + age);
		//학점 출력
		System.out.println("성적 : " + point);
		
		System.out.println("char : " + ch);
		
		System.out.println("boolean : " + check); // 마지막이 false니까
		
	}
	
}
