package com.sunwoo.s4;

import java.util.Scanner;

public class Loop_1 {

	public static void main(String[] args) {
		//int i=0;
		//i<3;
		//i++;
		//독립적인 애들을 한줄에 모아둔것
		
		//원하는 수만큼 프린트 실행
		//원하는 수를 입력 받아서
		Scanner sc = new Scanner(System.in);
		System.out.println("프린트 횟수 입력");
		
		int count = sc.nextInt();
		
		for(int i=0;i<count;i++) {	
		System.out.println("Hello World");
		}
		
		for(int i=count;i<3;i++) {
			System.out.println("Second");
		}
		
		int i=0;
		for(i=0;i<3;i++) {
			
		}
		
		for(i=0;i==3;i=i+3) {
			
		}
		
		
	}

}
