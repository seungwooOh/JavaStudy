package com.koreait.first.abst;

public class AbstractTest {

	public static void main(String[] args) {
		
		AbstA aa = new AbstB();
		aa.bark();
		aa.print();
		
		AbstB ab = (AbstB) aa;
		ab.shakeTail();
		
		((AbstB) aa).shakeTail();
		
		AbstC ab2 = new AbstD();
		ab2.bark();
		
		
	}

}
