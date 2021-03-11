package com.sunwoo.s2;

import java.util.Scanner;

public class Operator_8_ex2 {

	//물건의 구입 가격 입력
	//물건의 가격이 30000 이상이면 5%할인
	//아니면 3%할인
	//택배비는 2500원
	//최종출력은 물건의 최종가격과 택배비가 포함된 최종가격 출력 두가지
	
	public static void main(String [] args) {
		
		//물건의 가격을 담을 변수
		int price = 0;
		//최종 가격을 담을 변수
		int result = 0;
		//할인율을 담을 변수
		double discount = 0.0;
		
		//키보드 입력 준비
		Scanner sc = new Scanner(System.in);
		
		System.out.println("물건의 가격을 입력하세요");
		price = sc.nextInt();
		
		//result = price>=30000 ? (int)(price- price*0.05) : (int)(price- price*0.03);
		//discount = price>=30000?0.05:0.03;
		discount = price>=30000?0.95:0.97;
		//result = (int)(price - price*discount);
		result = (int)(price*discount);
		int total = result + 2500;
		
		
		
		System.out.println("최종 가격 : " + result);
		System.out.println("텍배비 포함 : " + (result + 2500));
		
		
		
		
	}
}
