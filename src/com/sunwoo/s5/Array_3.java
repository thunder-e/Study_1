package com.sunwoo.s5;

public class Array_3 {
	
	public static void main(String [] args) {
		int [] ar = new int [3];
		
		double [] ar2 = new double [2];
		
		ar[0] = 20;
		ar[1] = 30;
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		
		System.out.println(ar2[0]);
		
		//문자 4개를 담을 배열을 선언하고
		//각 칸에 a ~ d 대입
		//각 칸 출력
		
		char [] ch = new char [4];
		ch[0] = 'a';
		ch[1] = 'b';
		ch[2] = 'c';
		ch[3] = 'd';
		
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		
		for(int i=0;i<4;i++) {
		System.out.println(ch[i]);
		}
		
		
	}

}
