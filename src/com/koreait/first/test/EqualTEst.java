package com.koreait.first.test;

public class EqualTEst {

	public static void main(String[] args) {
		
		ValueBox v1 = new ValueBox(10);
		ValueBox v2 = new ValueBox(10);
		
		System.out.println(v1 == v2);
		
		System.out.println(v1.equals(v2));
		
	}

}
