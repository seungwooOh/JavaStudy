package com.koreait.first.obj3;

public class ClassB extends ClassA {
	public ClassB(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void print() {
		System.out.println("B: " + getName() + "/" + getAge());		// this, super 붙여도 값은 같다.
	}
	
	public void drive() {
		System.out.println("driving!");
	}
	
}
