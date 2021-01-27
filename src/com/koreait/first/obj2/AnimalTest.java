package com.koreait.first.obj2;

public class AnimalTest {

	public static void main(String[] args) {
		
							// 기본 생성자, 객체지향은 무조건 생성자를 호출하여야 한다.
		Animal ani_1 = new Animal();
		
//		ani_1.name = "바둑이";
//		ani_1.age = 2;
		
		ani_1.crying();		// default 값 출력
		
		Animal ani_2 = new Animal("나비", 3);
		ani_2.crying();
		
		Animal ani_3 = new Animal("달미");
		ani_3.crying();
		
		Animal ani_4 = new Animal(4);
		ani_4.crying();
		
		
		
	}

}
