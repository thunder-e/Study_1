package com.sunwoo.s2;

public class Example {

	public static void main(String [] args) {
		
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"'    |");
		System.out.println("||_/=\\\\__|");
		
		int A = 472;
		int B = 385;
		System.out.println(A*(B%10));
		System.out.println(A*(B%100-B%10)/10);
		System.out.println(A*(B/100));
		System.out.println(A*(B%10) + ((A*(B%100-B%10)/10)*10) + ((A*(B/100))*100));
		
		
		
		
		
	}
}
