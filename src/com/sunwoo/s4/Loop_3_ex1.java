package com.sunwoo.s4;

public class Loop_3_ex1 {

	public static void main(String[] args) {
		
		for(int i=2; i<4; i++) {
			System.out.println("*****"+i+"단*****");
			
			for(int j=1;j<10;j++) {	
				System.out.println(i+" * "+j+" = "+i*j);
			}
			
			System.out.println();
		}

	}

}
