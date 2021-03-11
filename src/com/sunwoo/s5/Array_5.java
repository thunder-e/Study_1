package com.sunwoo.s5;

public class Array_5 {

	public static void main(String[] args) {
		int [] ar1 = new int[3];
		
		int [] ar2 = new int[3];
		
		//ar1[0] 0
		//ar2[0] 0
		
		System.out.println(ar1 == ar2);
		System.out.println(ar1);
		System.out.println(ar2);
		
		ar1 = ar2; //ar2의 번지를 ar1번지에 덮어 씌우니까 같아 
		System.out.println(ar1 == ar2);
		
	}

}
