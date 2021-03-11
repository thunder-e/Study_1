package com.sunwoo.s5;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		//성적관리 프로그램
		//n명의 학생 
		//학생의 이름, 번호, 국어, 영어, 수학, 총점, 평균

		//학생의 수 입력

		//1. 학생정보입력
		//		-- 학생의 수만큼 이름, 번호, 국어, 영어, 수학
		//		-- 번호는 중복 불가
		//		-- 총점, 평균(소수점 자리 포함)은 자동계산 
		//2. 학생전체정보출력
		//		-- 전체 학생의 모든 정보 출력
		//		-- 학생의 이름, 번호, 국어, 영어, 수학, 총점, 평균
		//3. 학생정보검색
		//		-- 검색할 학생 번호를 입력
		//		-- 학생의 이름, 번호, 국어, 영어, 수학, 총점, 평균
		//		-- 입력한 번호가 없으면 정보 없음을 출력
		//4. 프로그램 종료


		Scanner sc = new Scanner(System.in);

		System.out.println("학생수 입력");
		int count = sc.nextInt();

		int i = 0;
		String [] names = new String[count];
		int [] nums = new int[names.length];
		int [] kors = new int[names.length];
		int [] engs = new int[names.length];
		int [] maths = new int[names.length];
		int [] total = new int[names.length];
		double [] avg = new double[names.length];
		boolean check = true;

		while(true) {
			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생전체정보출력");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 프로그램 종료");
			int select = sc.nextInt();

			if(select==1) {
				System.out.println();
				System.out.println("학생정보입력");
				for(i=0; i<names.length; i++) {
					System.out.println(i+1 +"번 학생 이름 입력");
					names[i] = sc.next();
					System.out.println(names[i] +" 학생 번호 입력");
					nums[i] = sc.nextInt();
					System.out.println(names[i] +" 학생의 국어 성적 입력");
					kors[i] = sc.nextInt();
					System.out.println(names[i] +" 학생의 영어 성적 입력");
					engs[i] = sc.nextInt();
					System.out.println(names[i] +" 학생의 수학 성적 입력");
					maths[i] = sc.nextInt();
					total[i] = kors[i]+engs[i]+maths[i];
					avg[i] = total[i]/3.0; 
				}//정보입력 for문 끝


			} else if(select==2) {
				System.out.println("학생전체정보출력");
				for(i=0; i<names.length; i++) {
					System.out.println("이름 : " + names[i] + " | 번호 : " + nums[i] + " | 국어 : " + kors[i] + " | 영어 : "+ engs[i]+" | 수학 : " + maths[i] + " | 총점 : " + total[i]+" | 평균 : " + avg[i]);
				}
			} else if(select==3) {
				System.out.println("학생정보검색");
				System.out.println("학생 번호 입력");
				int n = sc.nextInt();

				for(i=0; i<names.length; i++) {
					if(nums[i]==n) {
						System.out.println("이름 : " + names[i] + " | 번호 : " + nums[i] + " | 국어 : " + kors[i] + " | 영어 : "+ engs[i]+" | 수학 : " + maths[i] + " | 총점 : " + total[i]+" | 평균 : " + avg[i]);
						break;
					}//입력값과 배열의 값을 비교후 인덱스값을 찾아서 

					
				}//번호가 같은 배열의 인덱스값 찾기 for문
				

			} else if(select==4) {
				System.out.println("프로그램 종료");
				break;
				//check = false;

			}//선택if문 끝

		}//1234 while문 종료		



	}

}
