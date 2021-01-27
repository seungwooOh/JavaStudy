package com.koreait.first.obj;

public class CarTest2 {
	public static void main(String[] args) {

		Car car1 = new Car();

		car1.name = "페라리";
		car1.cc = 5000;		// 값을저장
		car1.color = "붉은색";

		Car car2 = new Car();

		car2.name = car1.name;
		car2.cc = car1.cc;	// 값을 저장
		car2.color = car1.color;

		car1 = car2;

		System.out.println(car1 == car2);

	}

}