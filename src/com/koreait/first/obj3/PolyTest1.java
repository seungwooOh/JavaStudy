package com.koreait.first.obj3;

public class PolyTest1 {

	public static void main(String[] args) {
		
		ClassB cb = new ClassB("B", 10);
		// 업캐스팅
		ClassA ca = cb;
		ca.print();
		Object obj = ca;
		
		ClassA ca2 = (ClassA) obj;
		ca2.print();
		
//		String str = (String) ca2;
		
		ClassB cb2 = (ClassB) ca2;
		cb2.print();
		cb2.drive();
	}

}
