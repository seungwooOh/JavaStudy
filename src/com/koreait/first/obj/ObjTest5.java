package com.koreait.first.obj;

public class ObjTest5 {	//public 생략가능

	public static void main(String[] args) {
		// 아래 NumberBox2를 객체화 하여
		// a = 10, b = 20을 넣고
		// sum() 메소드를 호출하여 리턴하는 값을 콘솔에 찍어주세요
		
		NumberBox2 nbb2 = new NumberBox2();
		
		nbb2.a = 10;
		nbb2.b = 20;
		
		NumberBox2 nbb22 = new NumberBox2();
		nbb22.a = 33;
		nbb22.b = 44;
		
		System.out.println(nbb2.sum());
		System.out.println(nbb22.sum());
		
		
	}

}

class NumberBox2 {
	
	int a;
	int b;
	
	int sum() {
		return a + b;
	}
	
}