package com.koreait.first.obj;

public class ObjTest6 {	//public 생략가능

	public static void main(String[] args) {
		NumberBox2 nbb = new NumberBox2();
		
		nbb.a = 11;
		nbb.b = 22;
		
		NumberBox2 nbb2 = copyObj(nbb);
		
		System.out.println(nbb.sum());	// 33
		System.out.println(nbb2.sum());	// 33
		
		nbb2.a = 15;
		nbb2.b = 34;
		
		System.out.println(nbb.sum());	// 33
		System.out.println(nbb2.sum());	// 49
		
		
	}
	
	public static NumberBox2 copyObj(NumberBox2 nbb) {
		NumberBox2 cNbb = new NumberBox2();
		
		cNbb.a = nbb.a;
		cNbb.b = nbb.b;
		
		return cNbb;
	}

}