package com.sunwoo.s5;

import java.util.Scanner;

public class Array_ex6 {

	public static void main(String[] args) {
	
		int [] ar = {1,2,3,4,5};
		int [] result = new int [ar.length-1];
		//지우고 싶은 숫자 입력		
		Scanner sc = new Scanner(System.in);
		System.out.println("지우고 싶은 숫자 입력");
		int num = sc.nextInt();
		
		
		//result에서 사용할 인덱스번호
		int idx = 0;
		for(int i=0;i<ar.length;i++) {
			if(num == ar[i]) {
				System.out.println("find!!");
				continue; // 찾았을때 result배열에 안넣고 위로 올라가서 증감식
			}
			result[idx] = ar[i];
			idx++;
		}
		
		
		ar = result;
		
	
		//최종결과
		System.out.println(ar.length);//4
		for(int i=0; i<ar.length;i++) {
		System.out.println("ar[" + i +"] = "+ar[i]);//1,2,4,5
		}

		
	}

}
