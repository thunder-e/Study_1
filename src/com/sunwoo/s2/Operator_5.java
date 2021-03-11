package com.sunwoo.s2;

public class Operator_5 {

	public static void main(String [] args) {
		// +, -, /, *, %
		//물건의 총합계금액 : 34560  72360
		//현금 		  : 50000  100000
		//잔돈		  : 15440  27640  
		//만원	1장
		//천원	5장
		//백원	4개
		//십원	4개
		
		int total = 72360;
		int money = 100000;
		int change = money - total;
		
		System.out.println(change);
		
		
		int man = change / 10000; 
		int chon = change % 10000/1000;
		chon = (change - man*10000)/1000;
		int baek = change%1000/100;
		baek = (change - man*10000 - chon*1000)/100;
		int sip = change%100/10;
		
		
		System.out.println("만원 : " + man + "장");
		System.out.println("천원 : " + chon + "장");
		System.out.println("백원 : " + baek + "개");
		System.out.println("십원 : " + sip + "개");
		
		
	
	
	
	}
}
