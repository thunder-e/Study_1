package com.sunwoo.s5;

public class Array_8 {

	public static void main(String[] args) {

		int [] ar = {1,2,3};

		int [] ar2 = {4,5,6};

		//같은 데이터타입을 묶음
		//모으려고 하는 데이터타입 [] 변수명 = new 모으려고하는 데이터타입 [?];
		//이중 배열
		//배열안에 배열, 배열을 모은 배열
		//new [전체배열을모을갯수][각배열의크기];
		int [][] ars = new int [2][3];
		ars[0]=ar;
		ars[1]=ar2;

		System.out.println(ars[0][0]);
		System.out.println(ars[1][1]);

		for(int j=0;j<ars.length;j++) {
			for(int i=0;i<ars[j].length;i++) {
				System.out.println(ars[j][i]);
			}
		}




	}

}
