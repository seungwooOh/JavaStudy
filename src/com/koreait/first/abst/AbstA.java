package com.koreait.first.abst;

// 기본생성자앞에 private를 붙이면 객체화를 막을수 있다.

// 추상클래스
// 1. 객체화 할 수 없다.
// 2. 부모타입 역할만 하겠다.
// 3. abstract 무조건 오버라이딩 하여라.
public abstract class AbstA {
	
	// 추상메소드
	public abstract void bark();
	
	// 선언부 구현부 -> 메소드 정의
	public void print() {
		System.out.println("HI I`m A");
	}
	
}
