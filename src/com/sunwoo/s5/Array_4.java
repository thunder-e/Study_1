package com.sunwoo.s5;

import java.util.Scanner;

public class Array_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int [] ar = new int[5];

		//5개의 숫자를 입력받아서 배열에 저장
		for(int i=0;i<5;i++) {
			System.out.println(i+1+"번 숫자 입력");
			ar[i]= sc.nextInt();
		}
		
		
		//배열에 있는 데이터 모두 출력
		for(int i=0;i<5;i++) {
			System.out.println(ar[i]);
		}




	}

}
