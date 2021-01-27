package com.koreait.first.obj3;
/* 다형성 : 상속관계에서만 나타난다.
 * 1. 부모타입은 자식 객체 참조할수 있다.(가르킬수 있다.)(자식객체의 주소값을 저장할수 있다.)
 * 2. 자식타입은 부모객체 참조 할 수 없다.(가르킬수 없다.)(부모객체 주소값을 저장할수 없다.)
 * 3. 타입은 메소드를 호출 할 수 있냐 없냐만 결정(즉, 자기가 알 고 있는 메소드만 호출할수 있다.) 실제로
 * 	    실행되는 메소드는 객체 기준이다.
 * 호출은 타입기준
 */
public class OverrideTest2 {

	public static void main(String[] args) {
		
		ClassA ca = new ClassB("B", 10);
//		ClassB cb = new ClassA("A", 10);	// 더 작아질수 없다.
		ca.print();
//		ca.drive(); // 객체타입이 모르는 메소드는 호출을 할 수 없다.
		ClassB cb = (ClassB) ca;	// 강제 형변환
//		ClassA ca2 = cb;			// 자동 형변환
//		cb.print();
		cb.drive();
		
		
		
	}

}
