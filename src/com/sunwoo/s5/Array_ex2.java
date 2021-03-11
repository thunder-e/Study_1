package com.sunwoo.s5;

import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {
		//학생수 입력
		//학생수 만큼 이름을 입력
		//1. 입력이 끝나면 학생이름 출력
		//2. 학생의 수만큼 학생의 번호를 입력
		//sw, lj
		//sw 학생의 번호를 입력
		//lj 학생의 번호를 입력
		// 이름 : sw 번호 : 1
		//3. 국어, 영어, 수학 점수 입력
		//이름: 번호: 국어: 영어: 수학:

		Scanner sc = new Scanner(System.in);
		System.out.println("학생수 입력");
		int count = sc.nextInt();

		String [] names = new String[count];
		int [] nums = new int[names.length];
		int [] kors = new int[names.length];
		int [] engs = new int[names.length];
		int [] maths = new int[names.length];


		for(int i=0; i<names.length; i++) {
			System.out.println(i+1+"번 이름 입력");
			names[i] = sc.next();
		}

		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]+" 학생의 번호를 입력");
			nums[i] = sc.nextInt();	

			
			System.out.println(names[i] + "학생의 국어점수 입력");
			kors[i] = sc.nextInt();
			System.out.println(names[i] + "학생의 영어점수 입력");
			engs[i] = sc.nextInt();
			System.out.println(names[i] + "학생의 수학점수 입력");
			engs[i] = sc.nextInt();

		}

		for(int i=0; i<names.length; i++) {
			System.out.println("이름 : "+names[i]+" | 번호 : "+nums[i]);
			System.out.println("국어 : " + kors[i]);
			System.out.println("영어 : " + engs[i]);
			System.out.println("수학 : "+ maths[i]);
		}



	}

}
