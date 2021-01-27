package com.koreait.first.obj2;

public class ClassA {
	
	private String name;
	
	public ClassA() {
		super();
		System.out.println("ClassA 기본생성자");
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
}

class ClassB extends ClassA {
	
	private int age;
	
	public ClassB() {
		super();
		System.out.println("ClassB 기본생성자");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}

class ClassC extends ClassB {
	
	public ClassC() {
		super();
		System.out.println("ClassC 기본생성자");
	}
	
	public ClassC(String name, int age) {
		super();
		System.out.println("ClassC 생성자");
		setName(name);
		setAge(age);
	}
	
	public void print() {
		System.out.printf("저는 %s이고, 나이는 %d살입니다.\n", getName(), getAge());
	}
	
}

class ClassD extends ClassC {
	
	public ClassD() {
		super();
	}
	
	public ClassD(String name, int age) {
		super();
		setName(name);
		setAge(age);
	}
	
	@Override
	public void print() {
		System.out.printf("I`m %s, My age is %d\n", getName(), getAge());
	}
	
	public void ddd() {
		System.out.println(":ddd");
	}
	
}