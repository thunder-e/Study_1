package com.sunwoo.s2;

public class Operator_9 {
	
	public static void main(String [] args) {
		
		int count = 1;
		
		System.out.println(count);
		
		count = count+1;
		
		System.out.println(count);
		
		count = count+1;
		
		System.out.println(count);
		
		//증감 연산자 -- 자기자신을 1 증가 시키거나 1 감소 시키는 연산자
		int num = 1;
		System.out.println("num : " + num);
		
		++num; // num = num + 1;
		System.out.println("num : " + num);
		
		--num; // num = num - 1;
		System.out.println("num : " + num); //1
		
		num++; // num = num + 1;
		System.out.println("num : " + num); //2
		
		num--; // num = num - 1;
		System.out.println("num : " + num);
		
		num = 1;
		
		count = ++num;
		//num=num+1;
		//count=num;
		System.out.println("-----------------------");
		System.out.println("count : " + count); //2
		System.out.println("num : " + num); //2
		
		num = 1;
		count = 1;
		count = num++;
		//count = num;
		//num = num+1;
		System.out.println("-----------------------");
		System.out.println("count : " + count); //2
		System.out.println("num : " + num); //2
		
		num = 1;
		count = 1;
		count = 1+num++;
		//count = num+1; 2
		//num=num(1)+1;
		System.out.println("-----------------------");
		System.out.println("count : " + count); //2
		System.out.println("num : " + num); //3
		
		
		num = 1;
		System.out.println("-----------------------");
		System.out.println(num++); //print 먼저하고 1을 증가시기는것 /증가를 맨 나중에!!!!!
		System.out.println(num); //2
		
		
		
		
	}

}
