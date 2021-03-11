package com.sunwoo.s4;

public class Loop_1_ex1 {

	public static void main(String[] args) {
		
		for(int i=0; i<100; i++) {
			//짝수만 출력
			if(i%2 == 0) {
				System.out.println("i " + i);
			}
		}

		for(int i=0;i<100;i=i+2) {
			System.out.println("i : " + i);
		}
		
	}

}

