package com.sunwoo.s5;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {

		//5개의 숫자를 입력 받아서 합계를 출력
		Scanner sc = new Scanner(System.in);
		
//		int [] ar = new int[5];
		int total = 0;//최종합계
		
		System.out.println("생성할 배열의 수를 입력하세요");
		int num = sc.nextInt();
		int [] ar = new int[num];
		
		
		
		for(int i=0; i<ar.length; i++) {
			System.out.println(i+1+"번 숫자 입력");
			ar[i] = sc.nextInt();
			//total+=ar[i];
		}
		
		for(int i=0; i<ar.length; i++) {
			total = total+ar[i];
		}
		
		
		System.out.println("total : " + total);
	}

}
