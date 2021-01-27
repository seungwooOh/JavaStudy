package com.koreait.first.obj2;

public class CapsuleTest {

	public static void main(String[] args) {
		// 접근제한자
		// private, default, protected, public
		
		Animal2 ani2 = new Animal2();
//		ani2.name = "oooo";
//		ani2.age = 3;
		
		// private		: class
		// default		: class, package
		// protected	: class, package, 상속관계
		// public		: all
		
		ani2.setName("철철이");
		ani2.setAge(10);
		
		ani2.crying();
		
		String name = ani2.getName();
		System.out.println(name);
		
		int age = ani2.getAge();
		System.out.println(age);
		
	}

}
