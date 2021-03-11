package com.sunwoo.s5;

import java.util.Scanner;

public class Array_review_210202 {

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
		//4. 최우수 학생 출력(평균이 제일 높은 학생 출력)
		//	
		//5. 학생정보삭제
		//		-- 삭제할 학생의 번호 입력
		//6. 학생정보추가
		//
		//7. 프로그램 종료

		String [] names = null;
		int [] nums = null;
		int [] kors = null;
		int [] engs = null;
		int [] maths = null;
		int [] totals = null;
		double [] avgs = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 입력");
		int num = sc.nextInt();

		names = new String[num];
		nums = new int[names.length];
		kors = new int[names.length];
		engs = new int[names.length];
		maths = new int[names.length];
		totals = new int[names.length];
		avgs = new double[names.length];


		boolean check = true;

		while(check) {

			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생전체정보출력");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 우수학생출력");
			System.out.println("5. 학생검색삭제");
			System.out.println("6. 학생정보추가");
			System.out.println("7. 프로그램 종료");
			num = sc.nextInt();

			switch(num) {
			case 1:
				System.out.println("학생정보입력 코드");

				for(int i=0;i<names.length;i++) {
					System.out.println(i+1+"번째 학생 이름 입력");
					names[i] = sc.next();
					System.out.println(names[i]+"의 번호 입력");
					nums[i] = sc.nextInt();
					System.out.println(names[i]+"의 국어 입력");
					kors[i] = sc.nextInt();
					System.out.println(names[i]+"의 영어 입력");
					engs[i] = sc.nextInt();
					System.out.println(names[i]+"의 수학 입력");
					maths[i] = sc.nextInt();

					totals[i] = kors[i] + engs[i] + maths[i];
					avgs[i] = totals[i] / 3.0;

				}

				break;
			case 2:
				System.out.println("학생전체정보출력 코드");
				System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균\t");
				for(int i=0; i<names.length;i++) {
					System.out.println("--------------------------------------------------------");
					System.out.print(names[i]+"\t");
					System.out.print(nums[i]+"\t");
					System.out.print(kors[i]+"\t");
					System.out.print(engs[i]+"\t");
					System.out.print(maths[i]+"\t");
					System.out.print(totals[i]+"\t");
					System.out.println(avgs[i]+"\t");
				}


				break;
			case 3:
				System.out.println("정보검색 코드");
				System.out.println("검색할 학생의 번호 입력");
				num = sc.nextInt();
				for(int i=0;i<names.length;i++) {
					if(num == nums[i]) {
						System.out.print(names[i]+"\t");
						System.out.print(nums[i]+"\t");
						System.out.print(kors[i]+"\t");
						System.out.print(engs[i]+"\t");
						System.out.print(maths[i]+"\t");
						System.out.print(totals[i]+"\t");
						System.out.println(avgs[i]+"\t");
					}
				}


				break;
			case 4:
				System.out.println("우수학생 출력 코드");
				double top = avgs[0];
				int idx = 0;
				for(int i=1;i<names.length;i++) {
					if(top<avgs[i]) {
						top = avgs[i];
						idx = i;
					}
					System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균\t");
					System.out.print(names[idx]+"\t");
					System.out.print(nums[idx]+"\t");
					System.out.print(kors[idx]+"\t");
					System.out.print(engs[idx]+"\t");
					System.out.print(maths[idx]+"\t");
					System.out.print(totals[idx]+"\t");
					System.out.println(avgs[idx]+"\t");

				}

				break;
			case 5:
				
				String [] names2 = new String[names.length-1];
				int [] nums2 = new int [names2.length];
				int [] kors2 = new int [names2.length];
				int [] engs2 = new int [names2.length];
				int [] maths2 = new int [names2.length];
				int [] totals2 = new int [names2.length];
				double [] avgs2 = new double [names2.length];
				
				System.out.println("학생정보삭제 코드");
				System.out.println("삭제할 학생의 번호 입력");
				num = sc.nextInt();
				int del = 0;
				
				for(int i=0;i<names.length;i++) {
					if(num==nums[i]) {
						continue;
					}
					names2[del] = names[i];
					nums2[del] = nums[i];
					kors2[del] = kors[i];
					engs2[del] = engs[i];
					maths2[del] = maths[i];
					totals2[del] = totals[i];
					avgs2[del] = avgs[i];

				}
				nums = nums2;
				names =names2;
				kors = kors2;
				engs = engs2;
				maths = maths2;
				totals = totals2;
				avgs = avgs2;

				break;
			case 6:
				System.out.println("학생정보추가 코드");
				
				String [] names3 = new String[names.length+1];
				int [] nums3 = new int [names3.length];
				int [] kors3 = new int [names3.length];
				int [] engs3 = new int [names3.length];
				int [] maths3 = new int [names3.length];
				int [] totals3 = new int [names3.length];
				double [] avgs3 = new double [names3.length];
				
				System.out.println("추가할 학생 이름 입력");
			
				
				
				
				
				
				

				break;
			case 7:
				System.out.println("프로그램 종료");
				check = false;
				break;
			default :
				System.out.println("잘못된 번호입니다.");
				break;

			}//switch문 끝

		}//while 끝


		System.out.println(" ---- 종료 ---- ");


	}

}
