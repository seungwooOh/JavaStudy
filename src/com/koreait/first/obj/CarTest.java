package com.koreait.first.obj;

public class CarTest {

	public static void main(String[] args) {
		
		Car car1 = new Car();	// Car() : 기본 생성자. , car1에 주소값 전달
								// 앞쪽이 대문자이면 무조건 주소값을 전달 받는다.
		
		car1.name = "페라리";
		car1.cc = 5000;
		car1.color = "붉은색";
		
		car1.drive();
		
		Car car2 = new Car();
		
		car2.name = "포르쉐";
		car2.cc = 3500;
		car2.color = "블랙";
		
		car2.drive();
		
		System.out.println(car1 == car2);	// 주소값 비교
		
	}

}
