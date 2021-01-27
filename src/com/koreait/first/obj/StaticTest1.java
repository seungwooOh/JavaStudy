package com.koreait.first.obj;

public class StaticTest1 {
	
	// 메소드 앞에는 가능하면 static을 붙여라.
	// 안되는 경우을 알기.
	/*
	 * 안되는 사항
	 * static 이 안붙은 맴버필드를 메소드 안에서 사용
	 */

	public static void main(String[] args) {
		
		Tv tv1 = new Tv();
		tv1.country = "Korea";
		tv1.brand = "Samsung";
		tv1.inch = 50;
		tv1.printMe();
		
		Tv tv2 = new Tv();
		tv2.country = "USA";
		tv2.brand = "Apple";
		tv2.inch = 40;
		
		Tv.country = "France";	// static 변수 사용법.(권장)
		
		tv2.printMe();
		tv1.printMe();
		
		
		
	}

}

class Tv {
	static String country;	// 하나의 값만 저장하게 된다, 클래스 변수
	String brand;			// 인스턴스 변수
	int inch;
	
	void printMe() {
		System.out.printf("%s나라의 %s회사의 %d인치 Tv입니다\n", country, brand, inch);
	}
	
	static String whereCountry() {
		return country;
	}
	
	static int sum(int n1, int n2) {
		return n1 + n2;
	}
}
