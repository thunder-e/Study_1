package com.sunwoo.s2;

import java.util.Scanner;

public class Operator_8_ex3 {

	//물건의 구입 가격 입력
	//물건의 가격이 30000 이상이면 5%할인
	//아니면 3%할인
	//택배비는 2500원
	//최종출력은 물건의 최종가격과 택배비가 포함된 최종가격 출력 두가지
	
	public static void main(String [] args) {
		
		//물건 가격 입력받기
		int price = 0;
		//할인된 가격
		double discount = 0;
		
		//키보드 입력준비
		Scanner sc = new Scanner(System.in);
		
		System.out.println("물건 가격을 입력하세요");
		price = sc.nextInt();
		
		discount = price>=30000 ? price*0.95 : price*0.97;
		
		
		
		System.out.println("할인가격 : " + (int)discount + "원");
		System.out.println("최종가격 : " + (int)(discount + 2500) + "원");
		
		
		
		
		
	}
}
