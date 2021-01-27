package com.koreait.first.test;

public class Test {

	public static void main(String[] args) {
		
		sum(1, 2);	// 디테일 한것이 우선순위가 더 높다.
		sum(1, 2, 3);
		sum(1, 2, 3, 4);
		sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
	}
	
	public static void sum(int n1, int n2) {
		System.out.println("sumsum : " + (n1 + n2));
	}
	
	public static void sum(int ...num) {
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("sum : " + sum);
	}
	

}
