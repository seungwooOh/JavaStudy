package com.koreait.first.method;

public class MethodGugudan {

	public static void main(String[] args) {
		
		gugudan(3, 5);
		
	}
	
	
	public static void gugudan(int dan) {
		for(int i = 1; i < 10; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, (dan*i));
		}
	}

	public static void gugudan(int n1, int n2) {
		for(int i = n1; i <= n2; i++) {
			gugudan(i);
			System.out.println("------------");
		}
	}
	
}
