package com.koreait.first.obj2;

public class Animal {
	
	// 생성자가 존재 하지 않으면 기본생성자를 컴파일러가 자동으로 생성
	
	// 필드
	String name;
	int age;
	
	// 생성자
	// 1. 클래스 명이 동일 하여야 한다.
	// 2. 리턴타입이 없어야 한다.
	public Animal() {
//		super();	// 생략가능
		this("바둑이", 2);	// 생성자 호출
		System.out.println("-- Animal 기본생성자 --");
//		this.name = "바둑이";
//		this.age = 2;
		
	}
	
	public Animal(String name, int age) {
//		super();
		this.name = name;	// 객체화가 된다면 this는 자기자신을 가르킨다. 
							// 변수명이 매개변수와 동일하기 때문에 가르키는것을 명시하여야 한다.
							// 명시하지 않으면 매개변수명과 제일 가까운 변수명을 가르킨다.
		this.age = age;
//		this.crying();		// this 생략가능, 생략하면 제일 가까운 메소드를 호출
	}	
	
	// 우클릭 생성자 생성
	public Animal(String name) {
//		super();			// 부모의 기본생성자 호출
		this(name, 2);
	}

	public Animal(int age) {
		this("바둑이", age);
	}
	
	// 메소드
	public void crying() {
//		System.out.println("메소드");
		System.out.printf("%d살의 %s가 운다\n", age, name);
	}
	
	
	
}
