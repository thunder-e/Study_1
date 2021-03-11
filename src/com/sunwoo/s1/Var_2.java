package com.sunwoo.s1;

public class Var_2 {
	
	public static void main(String [] args) {
		System.out.println("Var_2 테스트 성공");
		// 1500 데이터를 long 에 대입하고 출력
		long num = 5000000000L; // 메모리중에 8byte공간을 확보해주세요!
		
		int num2; // 메모리에 4byte공간을 확보해주세요!
//		num = num2; //4byte에 8byte를 넣으려니 오류
		num2 = 20; // 시작점에 가서 4byte 주소로 가서 20을 저장하자
		
		num = 2;
		
//		int num2 = 30; //중복선언 
		
		float f1 = 3.2F;
		double d1 = 3.2;
		
		System.out.println("Num : " + num);
		System.out.println(num2);
		
	}
}
