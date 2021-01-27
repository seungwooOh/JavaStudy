package com.koreait.first.obj;

public class Car {
	
	// 맴버 필드, 명사
	String name;
	int cc;
	String color;
	
	// 맴버 메소드(움직임), 동사, 명사 + 동사
	public void drive() {
		System.out.printf("%s 색상의 %dcc의 %s 차량이 달린다.\n", color, cc, name);
	}
	
}
