package com.sunwoo.s5;

import java.util.Scanner;

public class Array_ex3_teacher {

	public static void main(String[] args) {

		//변수 선언 공식
		//데이터타입 변수명;




		//성적관리 프로그램
		//n명의 학생 
		//학생의 이름, 번호, 국어, 영어, 수학, 총점, 평균

		//학생의 수 입력
		Scanner sc = new Scanner(System.in);
		// 학생수를 아직 모르니까 초기화만
		String [] names = null; 
		int [] nums = null;
		int [] kors = null;
		int [] engs = null;
		int [] maths = null;
		int [] totals = null;
		double [] avgs = null;

		System.out.println("학생수를 입력하세요");
		int num = sc.nextInt();

		names = new String [num];
		nums = new int [names.length];
		kors = new int [names.length];
		engs = new int [names.length];
		maths = new int [names.length];
		totals = new int [names.length];
		avgs =  new double [names.length];

		boolean check = true;

		while(check) {
			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생전체정보출력");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 우수학생출력");
			System.out.println("5. 학생검색삭제");
			System.out.println("6. 학생정보추가");
			System.out.println("7. 성적순 출력"); //내림차순
			System.out.println("8. 프로그램 종료");
			num = sc.nextInt();//위에서 할일 다하고 이제 안쓰니까 재활용

			switch(num) {
			case 1:
				System.out.println("정보입력 코드 작성");
				for(int i=0;i<names.length;i++) {
					System.out.println(i+1+"번째 이름 입력");
					names[i] = sc.next();
					System.out.println(names[i]+" 번호 입력");
					nums[i] = sc.nextInt();
					System.out.println(names[i]+" 국어 입력");
					kors[i] = sc.nextInt();
					System.out.println(names[i]+" 영어 입력");
					engs[i] = sc.nextInt();
					System.out.println(names[i]+" 수학 입력");
					maths[i] = sc.nextInt();

					totals[i] = kors[i]+engs[i]+maths[i];
					avgs[i] = totals[i]/3.0;		
				}

				break;
			case 2:
				System.out.println("전체정보출력 코드 작성");

				System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균\t");

				for(int i=0; i<names.length; i++) {
					System.out.print(names[i]+"\t");
					System.out.print(nums[i]+"\t");
					System.out.print(kors[i]+"\t");
					System.out.print(engs[i]+"\t");
					System.out.print(maths[i]+"\t");
					System.out.print(totals[i]+"\t");
					System.out.println(avgs[i]+"\t");
					System.out.println("----------------------------------------------------------");
				}

				break;
			case 3:
				System.out.println("검색할 학생 번호 입력");
				num = sc.nextInt(); // 재활용~~

				for(int i=0;i<names.length;i++) {
					if(num==nums[i]) {
						System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균\t");
						System.out.print(names[i]+"\t");
						System.out.print(nums[i]+"\t");
						System.out.print(kors[i]+"\t");
						System.out.print(engs[i]+"\t");
						System.out.print(maths[i]+"\t");
						System.out.print(totals[i]+"\t");
						System.out.println(avgs[i]+"\t");
						System.out.println("----------------------------------------------------------");
						check = false;//학생 정보를 찾았으면
						break;
					} //else를 쓰면 system.out.println("해당 번호의 학생정보는 없습니다."); 가 for문 안에 있어서 여러번 반복됨 /
				} //for 끝

				if(check) {
					System.out.println("해당 번호의 학생정보는 없습니다");
				}

				check = true;//while문이 계속 돌아가도록

				break;
			case 4:
				//제일 높은 평균을 담을 임시변수
				double top = avgs[0];
				//제일 높은 평균을 가지는 학생의 index번호를 담을 변수
				int idx = 0;
				//비교하고 그 값을 저장해놔야함

				for(int i=1;i<names.length;i++) {
					if(top<avgs[i]) {
						top = avgs[i];
						idx = i;
					}
				}//for문

				System.out.println("이름\t번호\t국어\t영어\t수학\t총점\t평균\t");
				System.out.print(names[idx]+"\t");
				System.out.print(nums[idx]+"\t");
				System.out.print(kors[idx]+"\t");
				System.out.print(engs[idx]+"\t");
				System.out.print(maths[idx]+"\t");
				System.out.print(totals[idx]+"\t");
				System.out.println(avgs[idx]+"\t");
				System.out.println("----------------------------------------------------------");

				break;


			case 5:	
				if(names.length==0) {
					System.out.println("학생이 0명입니다");
					continue;
				} 

				String [] names2 = new String [names.length-1];
				int [] nums2 = new int [names2.length];
				int [] kors2 = new int [names2.length];
				int [] engs2 = new int [names2.length];
				int [] maths2 = new int [names2.length];
				int [] totals2 = new int [names2.length];
				double [] avgs2 = new double [names2.length];

				System.out.println("삭제할 학생의 번호 입력");
				num = sc.nextInt();
				int idx2 = 0;

				for(int i=0;i<nums.length;i++) {
					if(num==nums[i]) {
						continue;
					}
					nums2[idx2] = nums[i];
					names2[idx2] = names[i];
					kors2[idx2] = kors[i];
					engs2[idx2] = engs[i];
					maths2[idx2] = maths[i];
					totals2[idx2] = totals[i];
					avgs2[idx2] = avgs[i];
					idx2++;
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
				System.out.println("학생정보 추가");
				
				String [] names3 = new String [names.length+1];
				int [] nums3 = new int [names3.length];
				int [] kors3 = new int [names3.length];
				int [] engs3 = new int [names3.length];
				int [] maths3 = new int [names3.length];
				int [] totals3 = new int [names3.length];
				double [] avgs3 = new double [names3.length];
				int i;
				
				//기존 데이터 복사
				for(i=0;i<names.length;i++) {
					names3[i] = names[i];
					nums3[i] = nums[i];
					kors3[i] = kors[i];
					engs3[i] = engs[i];
					maths3[i] = maths[i];
					totals3[i] = totals[i];
					avgs3[i] = avgs[i];
				}
				
				
				int n= names3.length-1; //names.length;
				System.out.println("추가할 학생의 이름 입력");
				names3[n] = sc.next();
				System.out.println(names3[n]+" 번호 입력");
				nums3[n] = sc.nextInt();
				System.out.println(names3[n]+" 국어 입력");
				kors3[n] = sc.nextInt();
				System.out.println(names3[n]+" 영어 입력");
				engs3[n] = sc.nextInt();
				System.out.println(names3[n]+" 수학 입력");
				maths3[n] = sc.nextInt();

				totals3[n] = kors3[n]+engs3[n]+maths3[n];
				avgs3[n] = totals3[n]/3.0;		
				
				nums = nums3;
				names =names3;
				kors = kors3;
				engs = engs3;
				maths = maths3;
				totals = totals3;
				avgs = avgs3;


				break;
			case 7:
				System.out.println("프로그램 종료");
				//check = false;
				check = !check;
				break;
			default:
				System.out.println("잘못된 번호 입니다.");
			}//switch 끝





		}//while 끝

		System.out.println("---- 종료 ----");

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
		//		--
		//5. 프로그램 종료




	}

}
