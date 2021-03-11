package com.sunwoo.s4;

import java.util.Scanner;

public class Loop_1_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("0 - 60미만의 초를 입력");
		int second = sc.nextInt(); //27

		for(int i=0;i<60;i++) {
			System.out.println("i : "+ i +"초");
			if(i==second) {
				i=59;
			}
			
		}
		System.out.println("프로그램 종료");
		
		
		/*
		if(i<second+1) {
			System.out.println("i : "+ i +"초");
			} else {
				break;
			}
		*/
	}

}
