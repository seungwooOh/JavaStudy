package com.koreait.first.obj3;

public class ClassA {
	
	private String name;
	private int age;
	
	public ClassA() {
		
	}
	
	public ClassA(String name, int age) {
//		System.out.println("ClassA 생성자.");
		this.name = name;
		this.age = age;
//		this.print();	// this 자기자신
	}	
	
	public void print() {
		System.out.println("A: " + name + "," + age);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}

